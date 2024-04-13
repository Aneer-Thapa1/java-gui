import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankGUI {
    private JFrame welcomeFrame, debitFrame, creditFrame;
    private JPanel p1, p2, p3, p4, dbtCard1, dbtCard2, cdtCard1, cdtCard2;
    private JLabel wtitle, wtitle3, dName, dCardId, dbankAccount, dbankName, dBalanceAmt, dPinNum,
            withdrawAmt, wDate,
            pinN, wCardID, cName, cCardId, cbankName, cBankAcc, cBalanceAmt, CVCNumber, intRate, expDate,
            cLimit, gPeriod;
    private JButton DebitCard, CreditCard, addDebitCard, addCreditCard, withdraw, dClear, dDisplay, debitToCredit,
            debitToBack, cancleCredit, creditTOBank, creditToBack,
            wClear, creditLimit, crdeitClear, setClear, cDisplay;
    private JTextField clientName, issuerBank, cardID, bankAccount, balanceAmount, pinNumber, withdrawAmount, pinNo,
            withdraawCardID, cClientName, cIssuerBank, cCardID, cBankAccount, cBalanceAmount, cvcNumber, interestRate,
            setCLimit, setCardID, gracePeriod, cardIdfield;
    private JComboBox<String> wYear, wDay, wMonth, eMonth, eYear, eDay;
    private final static int INVALID = -1;
    private ArrayList<BankCard> cards = new ArrayList<BankCard>();
    String[] day = { "DAY", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
    String[] month = { "MONTH", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
    String[] year = { "YEAR", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032",
            "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045",
            "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058",
            "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071",
            "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080" };

    public BankGUI() {
        // Creating object of JFrame and managing its location,size,layout
        welcomeFrame = new JFrame("Welcome");
        welcomeFrame.setSize(500, 400);
        welcomeFrame.setLocation(500, 100);
        welcomeFrame.setResizable(false);

        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setLayout(null);

        // Creating object of JPanel and managing its location,size,layout
        p1 = new JPanel();
        p1.setSize(475, 350);
        p1.setLocation(5, 5);
        p1.setBackground(new Color(39, 60, 117));
        p1.setLayout(null);
        welcomeFrame.add(p1);

        // Creating object of JLabel and managing its location,size,layout
        Font titleFont = new Font("Montserrat", Font.BOLD, 28);
        wtitle = new JLabel("WELCOME");
        wtitle.setBounds(160, 60, 380, 35);
        wtitle.setFont(titleFont);
        wtitle.setForeground(Color.WHITE);
        p1.add(wtitle);

        JLabel wtitle2 = new JLabel("TO");
        wtitle2.setBounds(210, 95, 50, 30);
        wtitle2.setFont(titleFont);
        wtitle2.setForeground(Color.WHITE);
        p1.add(wtitle2);

        Font subtitleFont = new Font("Open Sans", Font.PLAIN, 20);
        wtitle3 = new JLabel("Your Trusted Financial Partner");
        wtitle3.setBounds(110, 150, 340, 20);
        wtitle3.setFont(subtitleFont);
        wtitle3.setForeground(Color.WHITE);
        p1.add(wtitle3);

        // Use a custom font for the buttons
        Font buttonFont = new Font("Roboto", Font.BOLD, 16);
        DebitCard = new JButton("Debit Card");
        DebitCard.setBounds(100, 200, 130, 40); // Adjust button size and position
        DebitCard.setBackground(new Color(252, 186, 3)); // Set custom background color
        DebitCard.setForeground(Color.WHITE); // Set text color to white
        DebitCard.setFocusPainted(false);
        DebitCard.setFont(buttonFont);
        p1.add(DebitCard);

        CreditCard = new JButton("Credit Card");
        CreditCard.setBounds(260, 200, 130, 40); // Adjust button size and position
        CreditCard.setBackground(new Color(246, 81, 29)); // Set custom background color
        CreditCard.setForeground(Color.WHITE);
        CreditCard.setFocusPainted(false);
        CreditCard.setFont(buttonFont);
        p1.add(CreditCard);

        // adding action listener in the buttons
        DebitCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                welcomeFrame.setVisible(false);
                debitFrame.setVisible(true);
                creditFrame.setVisible(false);
            }
        });

        CreditCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                welcomeFrame.setVisible(false);
                debitFrame.setVisible(false);
                creditFrame.setVisible(true);
            }
        });

        welcomeFrame.setVisible(true);

        debitFrame = new JFrame("Debit Card");
        debitFrame.setSize(630, 560);
        debitFrame.setLocation(500, 100);
        debitFrame.setResizable(false);
        debitFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        debitFrame.setLayout(null);

        p2 = new JPanel();
        p2.setSize(605, 515);
        p2.setLocation(5, 5);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setLayout(null);
        debitFrame.add(p2);

        // creating panel where textfields and labels required for creating object of
        // debitCard are added
        dbtCard1 = new JPanel();
        dbtCard1.setSize(290, 495);
        dbtCard1.setLocation(10, 10);
        dbtCard1.setBackground(Color.WHITE);
        p2.add(dbtCard1);
        dbtCard1.setLayout(null);

        dName = new JLabel("Client Name:");
        dName.setBounds(40, 30, 90, 25);
        dbtCard1.add(dName);

        clientName = new JTextField();
        clientName.setBounds(40, 60, 200, 25);
        dbtCard1.add(clientName);

        dCardId = new JLabel("Card ID:");
        dCardId.setBounds(40, 100, 90, 25);
        dbtCard1.add(dCardId);

        cardID = new JTextField();
        cardID.setBounds(40, 130, 200, 25);
        dbtCard1.add(cardID);

        dbankName = new JLabel("Issuer Bank:");
        dbankName.setBounds(40, 170, 90, 25);
        dbtCard1.add(dbankName);

        issuerBank = new JTextField();
        issuerBank.setBounds(40, 200, 200, 25);
        dbtCard1.add(issuerBank);

        dbankAccount = new JLabel("Bank Account:");
        dbankAccount.setBounds(40, 240, 120, 25);
        dbtCard1.add(dbankAccount);

        bankAccount = new JTextField();
        bankAccount.setBounds(40, 270, 200, 25);
        dbtCard1.add(bankAccount);

        dBalanceAmt = new JLabel("Balance Amount:");
        dBalanceAmt.setBounds(40, 310, 120, 25);
        dbtCard1.add(dBalanceAmt);

        balanceAmount = new JTextField();
        balanceAmount.setBounds(40, 340, 200, 25);
        dbtCard1.add(balanceAmount);

        dPinNum = new JLabel("Pin Number:");
        dPinNum.setBounds(40, 380, 90, 25);
        dbtCard1.add(dPinNum);

        pinNumber = new JTextField();
        pinNumber.setBounds(40, 410, 200, 25);
        dbtCard1.add(pinNumber);

        addDebitCard = new JButton("Add Debit Card");
        addDebitCard.setBounds(60, 450, 120, 30);
        addDebitCard.setFocusPainted(false);
        dbtCard1.add(addDebitCard);

        dbtCard2 = new JPanel();
        dbtCard2.setSize(285, 390);
        dbtCard2.setLocation(310, 10);
        dbtCard2.setBackground(Color.WHITE);
        dbtCard2.setLayout(null);
        p2.add(dbtCard2);

        wCardID = new JLabel("Card Id");
        wCardID.setBounds(40, 30, 200, 25);
        dbtCard2.add(wCardID);

        withdraawCardID = new JTextField();
        withdraawCardID.setBounds(40, 60, 200, 25);
        dbtCard2.add(withdraawCardID);

        withdrawAmt = new JLabel("Withdraw Amount");
        withdrawAmt.setBounds(40, 100, 120, 25);
        dbtCard2.add(withdrawAmt);

        withdrawAmount = new JTextField();
        withdrawAmount.setBounds(40, 130, 200, 25);
        dbtCard2.add(withdrawAmount);

        wDate = new JLabel("Date of withdrawal");
        wDate.setBounds(40, 170, 120, 25);
        dbtCard2.add(wDate);

        wYear = new JComboBox<>(year);
        wYear.setBounds(40, 200, 60, 25);
        dbtCard2.add(wYear);

        wMonth = new JComboBox<>(month);
        wMonth.setBounds(110, 200, 75, 25);
        dbtCard2.add(wMonth);

        wDay = new JComboBox<>(day);
        wDay.setBounds(195, 200, 50, 25);
        dbtCard2.add(wDay);

        pinN = new JLabel("Pin Number");
        pinN.setBounds(40, 240, 120, 25);
        dbtCard2.add(pinN);

        pinNo = new JTextField();
        pinNo.setBounds(40, 270, 200, 25);
        dbtCard2.add(pinNo);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(70, 310, 120, 30);
        withdraw.setFocusPainted(false);
        dbtCard2.add(withdraw);

        dClear = new JButton("Clear");
        dClear.setBounds(205, 460, 70, 20);
        dClear.setFocusPainted(false);
        dbtCard1.add(dClear);

        wClear = new JButton("Clear");
        wClear.setBounds(200, 350, 70, 20);
        wClear.setFocusPainted(false);
        dbtCard2.add(wClear);

        dDisplay = new JButton("Display");
        dDisplay.setBounds(385, 430, 120, 25);
        dDisplay.setFocusPainted(false);
        p2.add(dDisplay);

        debitToCredit = new JButton("Credit Card");
        debitToCredit.setBounds(490, 480, 100, 20);
        debitToCredit.setFocusPainted(false);
        p2.add(debitToCredit);

        debitToBack = new JButton("Back");
        debitToBack.setBounds(370, 480, 100, 20);
        debitToBack.setFocusPainted(false);
        p2.add(debitToBack);

        debitFrame.setVisible(false);

        dDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayDebit();
            }
        });

        withdraw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Withdraw();
            }
        });

        dClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                clientName.setText("");
                cardID.setText("");
                issuerBank.setText("");
                bankAccount.setText("");
                balanceAmount.setText("");
                pinNumber.setText("");

            }
        });

        wClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                withdraawCardID.setText("");
                withdrawAmount.setText("");
                pinNo.setText("");
                wDay.setSelectedIndex(0);
                wMonth.setSelectedIndex(0);
                wYear.setSelectedIndex(0);
            }
        });

        addDebitCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                addDebit();
            }
        });

        debitToBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                welcomeFrame.setVisible(true);
                debitFrame.setVisible(false);
                creditFrame.setVisible(false);
            }
        });

        debitToCredit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                welcomeFrame.setVisible(false);
                debitFrame.setVisible(false);
                creditFrame.setVisible(true);
            }
        });

        creditFrame = new JFrame("Credit Card");
        creditFrame.setSize(630, 700);
        creditFrame.setLocation(500, 50);
        creditFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        creditFrame.setLayout(null);
        creditFrame.setResizable(false);

        p3 = new JPanel();
        p3.setSize(605, 650);
        p3.setLocation(5, 5);
        p3.setBackground(Color.LIGHT_GRAY);
        p3.setLayout(null);
        creditFrame.add(p3);

        cdtCard1 = new JPanel();
        cdtCard1.setSize(290, 635);
        cdtCard1.setLocation(10, 10);
        cdtCard1.setBackground(Color.WHITE);
        cdtCard1.setLayout(null);
        p3.add(cdtCard1);

        cName = new JLabel("Client Name:");
        cName.setBounds(40, 30, 90, 25);
        cdtCard1.add(cName);

        cClientName = new JTextField();
        cClientName.setBounds(40, 60, 200, 25);
        cdtCard1.add(cClientName);

        cCardId = new JLabel("Card ID:");
        cCardId.setBounds(40, 100, 90, 25);
        cdtCard1.add(cCardId);

        cCardID = new JTextField();
        cCardID.setBounds(40, 130, 200, 25);
        cdtCard1.add(cCardID);

        cbankName = new JLabel("Issuer Bank:");
        cbankName.setBounds(40, 170, 90, 25);
        cdtCard1.add(cbankName);

        cIssuerBank = new JTextField();
        cIssuerBank.setBounds(40, 200, 200, 25);
        cdtCard1.add(cIssuerBank);

        cBankAcc = new JLabel("Bank Account:");
        cBankAcc.setBounds(40, 240, 90, 25);
        cdtCard1.add(cBankAcc);

        cBankAccount = new JTextField();
        cBankAccount.setBounds(40, 270, 200, 25);
        cdtCard1.add(cBankAccount);

        cBalanceAmt = new JLabel("Balance Amount:");
        cBalanceAmt.setBounds(40, 310, 120, 25);
        cdtCard1.add(cBalanceAmt);

        cBalanceAmount = new JTextField();
        cBalanceAmount.setBounds(40, 340, 200, 25);
        cdtCard1.add(cBalanceAmount);

        CVCNumber = new JLabel("CVC Number:");
        CVCNumber.setBounds(40, 380, 120, 25);
        cdtCard1.add(CVCNumber);

        cvcNumber = new JTextField();
        cvcNumber.setBounds(40, 410, 200, 25);
        cdtCard1.add(cvcNumber);

        intRate = new JLabel("Interest Rate:");
        intRate.setBounds(40, 450, 120, 25);
        cdtCard1.add(intRate);

        interestRate = new JTextField();
        interestRate.setBounds(40, 480, 200, 25);
        cdtCard1.add(interestRate);

        expDate = new JLabel("Expiration Date");
        expDate.setBounds(40, 520, 120, 25);
        cdtCard1.add(expDate);

        eYear = new JComboBox<>(year);
        eYear.setBounds(40, 550, 60, 25);
        cdtCard1.add(eYear);

        eMonth = new JComboBox<>(month);
        eMonth.setBounds(110, 550, 75, 25);
        cdtCard1.add(eMonth);

        eDay = new JComboBox<>(day);
        eDay.setBounds(195, 550, 50, 25);
        cdtCard1.add(eDay);

        crdeitClear = new JButton("Clear");
        crdeitClear.setBounds(200, 610, 70, 20);
        crdeitClear.setFocusPainted(false);
        cdtCard1.add(crdeitClear);

        addCreditCard = new JButton("Add Credit");
        addCreditCard.setBounds(60, 600, 120, 25);
        addCreditCard.setFocusPainted(false);
        cdtCard1.add(addCreditCard);

        cdtCard2 = new JPanel();
        cdtCard2.setSize(290, 330);
        cdtCard2.setLocation(310, 10);
        cdtCard2.setLayout(null);
        cdtCard2.setBackground(Color.WHITE);
        p3.add(cdtCard2);

        dCardId = new JLabel("Card ID:");
        dCardId.setBounds(40, 30, 120, 25);
        cdtCard2.add(dCardId);

        setCardID = new JTextField();
        setCardID.setBounds(40, 60, 200, 25);
        cdtCard2.add(setCardID);

        cLimit = new JLabel("Credit Limit:");
        cLimit.setBounds(40, 100, 120, 25);
        cdtCard2.add(cLimit);

        setCLimit = new JTextField();
        setCLimit.setBounds(40, 130, 200, 25);
        cdtCard2.add(setCLimit);

        gPeriod = new JLabel("Grace Period");
        gPeriod.setBounds(40, 170, 150, 25);
        cdtCard2.add(gPeriod);

        gracePeriod = new JTextField();
        gracePeriod.setBounds(40, 200, 200, 25);
        cdtCard2.add(gracePeriod);

        creditLimit = new JButton("Set Credit Limit");
        creditLimit.setBounds(60, 250, 140, 25);
        creditLimit.setFocusPainted(false);
        cdtCard2.add(creditLimit);

        setClear = new JButton("Clear");
        setClear.setBounds(200, 290, 70, 20);
        setClear.setFocusPainted(false);
        cdtCard2.add(setClear);

        cancleCredit = new JButton("Cancle Credit");
        cancleCredit.setBounds(400, 510, 120, 25);
        cancleCredit.setFocusPainted(false);
        p3.add(cancleCredit);

        p4 = new JPanel();
        p4.setSize(270, 120);
        p4.setLocation(320, 370);
        p4.setBackground(Color.WHITE);
        p4.setLayout(null);
        p3.add(p4);

        dCardId = new JLabel("Card ID");
        dCardId.setBounds(30, 30, 120, 25);
        p4.add(dCardId);

        cardIdfield = new JTextField();
        cardIdfield.setBounds(30, 60, 200, 25);
        p4.add(cardIdfield);

        addCreditCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                addCredit();
            }
        });

        cancleCredit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cancelCredit();
            }
        });

        cDisplay = new JButton("Display");
        cDisplay.setBounds(400, 560, 120, 25);
        cDisplay.setFocusPainted(false);
        p3.add(cDisplay);

        creditToBack = new JButton("Back");
        creditToBack.setBounds(390, 620, 100, 20);
        creditToBack.setFocusPainted(false);
        p3.add(creditToBack);

        creditTOBank = new JButton("Debit Card");
        creditTOBank.setBounds(500, 620, 100, 20);
        creditTOBank.setFocusPainted(false);
        p3.add(creditTOBank);

        creditToBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                welcomeFrame.setVisible(true);
                debitFrame.setVisible(false);
                creditFrame.setVisible(false);
            }
        });
        creditTOBank.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                welcomeFrame.setVisible(false);
                debitFrame.setVisible(true);
                creditFrame.setVisible(false);
            }
        });

        cDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                CreditDisplay();
            }
        });

        crdeitClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cClientName.setText("");
                cCardID.setText("");
                cIssuerBank.setText("");
                cBankAccount.setText("");
                cBalanceAmount.setText("");
                cvcNumber.setText("");
                interestRate.setText("");
                eDay.setSelectedIndex(0);
                eMonth.setSelectedIndex(0);
                eYear.setSelectedIndex(0);

            }
        });

        setClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setCLimit.setText("");
                setCardID.setText("");
                gracePeriod.setText("");

            }
        });
        creditLimit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                creditLimit();
            }
        });

        creditFrame.setVisible(false);
    }

    // Getter method for setDebitCard
    public String getClientName() {
        String Name = clientName.getText();
        return Name;
    }

    public int getCardID() {
        int Cardid = INVALID;
        try {
            Cardid = Integer.parseInt(cardID.getText().trim());
            if (Cardid <= 0) {
                Cardid = INVALID;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(debitFrame, "INVALID ERROR" + "\n" + "Please enter valid CardId",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return Cardid;
    }

    public String getIssuerBank() {
        return issuerBank.getText().trim();
    }

    public String getBankAccount() {
        return bankAccount.getText().trim();
    }

    public int getBalanceAmount() {
        int balanceamount = INVALID;
        try {
            balanceamount = Integer.parseInt(balanceAmount.getText().trim());
            if (balanceamount < 0) {
                balanceamount = INVALID;

            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid Balance Amount.",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);

        }
        return balanceamount;
    }

    public int getPinNumber() {
        int pin = INVALID;
        try {
            pin = Integer.parseInt(pinNumber.getText().trim());
            if (pin <= 0) {
                pin = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid Pin Number",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return pin;
    }

    // Method which add object of debitCard if all details are entered correctly
    public void addDebit() {
        String clientName = getClientName();
        String issuerBank = getIssuerBank();
        String bankAccount = getBankAccount();
        int card = getCardID();
        int balance = getBalanceAmount();
        int pin = getPinNumber();

        if (clientName.isEmpty() || issuerBank.isEmpty() || bankAccount.isEmpty()) {
            JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "Fields cannot be empty",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);

            return;
        }
        if (balance < 0) {
            JOptionPane.showMessageDialog(debitFrame,
                    "INVALID INPUT" + "\n" + "Balance Amount cannot be less than 0", "ERROR MESSAGE",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (card == INVALID) {
            JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "CardId cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (pin == INVALID) {
            JOptionPane.showMessageDialog(debitFrame,
                    "INVALID INPUT" + "\n" + "Pin Number cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (checkCardIdUniqueforDebit(card)) {
            cards.add(new DebitCard(balance, card, bankAccount, issuerBank, clientName, pin));
            JOptionPane.showMessageDialog(debitFrame,
                    "DEBIT CARD ADDED!" + "\n" + "Client Name: " + clientName + "\n" + "Card Id: " + card + "\n"
                            + "Issuer Bank: " + issuerBank + "\n" + "Bank Account: " + bankAccount + "\n"
                            + "Balance Amount: "
                            + balance + "\n" + "Pin Number: " + pin,
                    "Card Added",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(debitFrame, "card id should be unique",
                    "Error box", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Getter Method for Withdraw
    public int getWCardId() {
        int cardId = INVALID;
        try {
            cardId = Integer.parseInt(withdraawCardID.getText().trim());
            if (cardId <= 0) {
                cardId = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid Card Id",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return cardId;
    }

    public int getWithdrawAmount() {
        int withdrawamount = INVALID;
        try {
            withdrawamount = Integer.parseInt(withdrawAmount.getText().trim());
            if (withdrawamount <= 0) {
                withdrawamount = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid Withdrawal Amount",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return withdrawamount;
    }

    public int getPinnumber() {
        int pinNumber = INVALID;
        try {
            pinNumber = Integer.parseInt(pinNo.getText().trim());
            if (pinNumber <= 0) {
                pinNumber = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid Pin Number",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return pinNumber;
    }

    public String getWithdrawalDate() {
        String date = "";
        String year = wYear.getSelectedItem().toString();
        String month = wMonth.getSelectedItem().toString();
        String day = wDay.getSelectedItem().toString();

        if (year.equals("YEAR") || month.equals("MONTH") || day.equals("DAY")) {
            date = null;
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }

    // Method to withdraw
    public void Withdraw() {
        int pinNo = getPinnumber();
        int withdrawAmount = getWithdrawAmount();
        String withdrawalDate = getWithdrawalDate();
        int cardId = getWCardId();

        if (withdrawAmount < 0) {
            JOptionPane.showMessageDialog(debitFrame,
                    "INVALID INPUT" + "\n" + "Withdraw Amount cannot be less than 1", "ERROR MESSAGE",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (pinNo <= 0) {
            JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "Pin Number cannot be less than 0",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (withdrawalDate == null) {
            JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "Enter Valid Withdrawal Date",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cardId == INVALID) {
            JOptionPane.showMessageDialog(debitFrame, "INVALID INPUT" + "\n" + "Enter Valid Card ID",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (BankCard obj : cards) {
            if (obj instanceof DebitCard) {
                DebitCard debitCard = (DebitCard) obj;
                if (debitCard.getCardID() == cardId) {
                    debitCard.withdraw(withdrawAmount, withdrawalDate, pinNo);
                } else {
                    JOptionPane.showMessageDialog(creditFrame, "CARD ID NOT FOUND" + "\n" + "Enter correct Card ID",
                            "NOT FOUND", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

    }

    // Method for display button of DebitCard
    public void displayDebit() {
        for (BankCard obj : cards) {
            if (obj instanceof DebitCard) {
                DebitCard debitCard = (DebitCard) obj;
                debitCard.display();
            }
        }
    }

    // Getter Method for Adding Credit Card
    public String getCreditClientName() {
        return cClientName.getText().trim();
    }

    public int getCreditCardID() {
        int cardid = INVALID;
        try {
            cardid = Integer.parseInt(cCardID.getText().trim());
            if (cardid <= 0) {
                cardid = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(creditFrame, "INVALID ERROR" + "\n" + "Please
            // enter valid CardId",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return cardid;
    }

    public String getCreditIssuerBank() {
        return cIssuerBank.getText().trim();
    }

    public String getCreditBankAccount() {
        return cBankAccount.getText().trim();

    }

    public int getCreditBalanceAmount() {
        int balanceAmount = INVALID;
        try {
            balanceAmount = Integer.parseInt(cBalanceAmount.getText().trim());
            if (balanceAmount < 0) {
                balanceAmount = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid Balance Amount.",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return balanceAmount;
    }

    public int getCVCNumber() {
        int CVCNumber = INVALID;
        try {
            CVCNumber = Integer.parseInt(cvcNumber.getText());
            if (CVCNumber < 0) {
                CVCNumber = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid CVC Number",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return CVCNumber;
    }

    public double getInterestRate() {
        double rate = INVALID;
        try {
            rate = Double.parseDouble(interestRate.getText());
            if (rate <= 0) {
                rate = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid Interest Rate",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return rate;
    }

    public String getExpirationDate() {
        String date = "";
        String year = eYear.getSelectedItem().toString();
        String month = eMonth.getSelectedItem().toString();
        String day = eDay.getSelectedItem().toString();

        if (year.equals("YEAR") || month.equals("MONTH") || day.equals("DAY")) {
            date = null;
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }

    // Method to add object of CreditCard
    public void addCredit() {
        String clientName = getCreditClientName();
        String issuerBank = getCreditIssuerBank();
        String Account = getCreditBankAccount();
        int card = getCreditCardID();
        int balance = getCreditBalanceAmount();
        double rate = getInterestRate();
        int CVCNumber = getCVCNumber();
        String expirationDate = getExpirationDate();

        if (clientName.isEmpty() || issuerBank.isEmpty() || Account.isEmpty()) {
            JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Fields cannot be empty",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (CVCNumber <= 0) {
            JOptionPane.showMessageDialog(creditFrame,
                    "INVALID INPUT" + "\n" + "CVC Number cannot be less than 1", "ERROR MESSAGE",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (balance < 0) {
            JOptionPane.showMessageDialog(creditFrame,
                    "INVALID INPUT" + "\n" + "Balance Amount cannot be less than 0", "ERROR MESSAGE",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (expirationDate == null) {
            JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Enter Valid Expiration Date",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (card <= 0) {
            JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "CardId cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (rate <= 0) {
            JOptionPane.showMessageDialog(creditFrame,
                    "INVALID INPUT" + "\n" + "Rate cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (checkCardIdUniqueforCredit(card) == true) {
            cards.add(new CreditCard(card, clientName, issuerBank, Account, balance, CVCNumber, rate, expirationDate));
            JOptionPane.showMessageDialog(creditFrame,
                    "CREDITCARD ADDED" + "\n" + "Client Name: " + clientName + "\n" + "Card ID: " + card + "\n"
                            + "Issuer Bank: "
                            + issuerBank + "\n" + "Bank Account: " + Account + "\n" + "BalanceAmount: " + balance + "\n"
                            + "CVC Number: " + CVCNumber + "\n" + "Interest Rate: " + rate + "\n" + "Expiration Date: "
                            + expirationDate,
                    "DETAILS OF CARD", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(creditFrame, "card id should be unique",
                    "Error box", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to display for creditcard
    public void CreditDisplay() {
        for (BankCard obj : cards) {
            if (obj instanceof CreditCard) {
                CreditCard creditCard = (CreditCard) obj;
                creditCard.display();
            }
        }
    }

    // Getter Method for credit limit
    public int getCardid() {
        int cardid = INVALID;
        try {
            cardid = Integer.parseInt(setCardID.getText());
            if (cardid <= 0) {
                JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "CardId cannot be less than 1",
                        "ERROR MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid Card ID",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return cardid;
    }

    public double getCreditLimit() {
        double creditLimit = INVALID;
        try {
            creditLimit = Double.parseDouble(setCLimit.getText());
            if (creditLimit <= 0) {
                creditLimit = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid CreditLimit",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return creditLimit;
    }

    public int getGracePeriod() {
        int graceperiod = INVALID;
        try {
            graceperiod = Integer.parseInt(gracePeriod.getText());
            if (graceperiod <= 0) {
                graceperiod = INVALID;
            }
        } catch (Exception ae) {
            // JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid GracePeriod",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return graceperiod;
    }

    // Method for CreditLimit
    public void creditLimit() {
        int cardid = getCardid();
        double creditlimit = getCreditLimit();
        int gracePeriod = getGracePeriod();
        if (cardid == INVALID) {
            JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Credit Limit cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (creditlimit == INVALID) {

            JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Credit Limit cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (gracePeriod == INVALID) {

            JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Grace Period cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (BankCard obj : cards) {
            if (obj instanceof CreditCard) {
                CreditCard creditCard = (CreditCard) obj;
                if (creditCard.getCardID() == cardid) {
                    creditCard.creditLimit(creditlimit, gracePeriod);
                } else {
                    JOptionPane.showMessageDialog(creditFrame, "CARD ID NOT FOUND" + "\n" + "Enter correct Card ID",
                            "NOT FOUND", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }

    // Getter method for CancleCreditCard
    public int getCancelCardId() {
        int cardId = INVALID;
        try {
            cardId = Integer.parseInt(cardIdfield.getText());
            if (cardId <= 0) {
                cardId = INVALID;
            }
        } catch (Exception e) {
            // JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "Please
            // enter valid card Id",
            // "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return cardId;
    }

    // Method for cancle Credit card
    public void cancelCredit() {
        int cardId = getCancelCardId();
        if (cardId == INVALID) {
            JOptionPane.showMessageDialog(creditFrame, "INVALID INPUT" + "\n" + "CardId cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (BankCard obj : cards) {
            if (obj instanceof CreditCard) {
                CreditCard creditCard = (CreditCard) obj;
                if (creditCard.getCardID() == cardId) {
                    creditCard.cancelCreditCard();
                } else {
                    JOptionPane.showMessageDialog(creditFrame, "CARD ID NOT FOUND" + "\n" + "Enter correct Card ID",
                            "NOT FOUND", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }

    // Method to check if card id entered while making obj is unique or not
    public boolean checkCardIdUniqueforDebit(int cardId) {
        boolean result = true;
        for (BankCard obj : cards) {
            if (obj instanceof DebitCard) {
                DebitCard cards = (DebitCard) obj;
                if (cards.getCardID() == cardId) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean checkCardIdUniqueforCredit(int cardId) {
        boolean result = true;
        for (BankCard obj : cards) {
            if (obj instanceof CreditCard) {
                CreditCard cards = (CreditCard) obj;
                if (cards.getCardID() == cardId) {
                    result = false;
                }
            }
        }
        return result;
    }

    // Main Method
    public static void main(String[] arg) {
        new BankGUI();
    }
}