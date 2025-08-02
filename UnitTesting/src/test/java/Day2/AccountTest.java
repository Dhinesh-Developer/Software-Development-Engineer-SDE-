package Day2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AccountTest {

	private Account account;

	private Account sender;
	private Account recipient;


	@BeforeEach
	void setUp() {
		account = new Account("A001","Dhinesh", 1000);
	}

	@ParameterizedTest
	@CsvSource({
		"A003,kumar,3000",
		"A004,siva,4000",
		"A005,karthi,1000",
		"A006,meena,5000"
	})
	public void testParameterizedconstructorAccountDetails(String id,String name,int balance) {
		account = new Account(id,name,balance);
		assertEquals(id,account.getId());
		assertEquals(name,account.getName());
		assertEquals(balance,account.getBalance());
	}

	@Test
	public void testConstructorWithBalance() {
		assertEquals("A001",account.getId());
		assertEquals("Dhinesh",account.getName());
		assertEquals(1000,account.getBalance());
	}

	@Test
	public void testCreditInvalidAmount() {
		int newBalance = account.credit(500);
		assertEquals(1500,newBalance);
	}

	@Test
	public void testDebitValidAmount() {
		int newBalance = account.debit(400);
		assertEquals(600,newBalance);
	}

	@Test
	void testToString() {
		String expected = "Account [id=A001, name=Dhinesh, balance=1000]";
		assertEquals(expected, account.toString());
	}   

	@BeforeEach
	void setUpAccountDetails() {
		sender = new Account("A101","Sender",5000);
		recipient = new Account("A102","Recipient",2000);
	}

	@Test
	void testSuccessfulTransfer() {
		boolean result = sender.transferTo(recipient, 1000);
		assertTrue(result, "Transfer should succeed");
		assertEquals(4000, sender.getBalance());
		assertEquals(3000, recipient.getBalance());
	}
	

	@Test
	void testTransferInsufficientBalance() {
		boolean result = sender.transferTo(recipient, 6000);
		assertFalse(result, "Transfer should fail due to insufficient money");
		assertEquals(5000, sender.getBalance());
		assertEquals(2000, recipient.getBalance());
	}

}
