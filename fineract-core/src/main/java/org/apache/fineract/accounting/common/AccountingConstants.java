/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.accounting.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.fineract.accounting.financialactivityaccount.data.FinancialActivityData;
import org.apache.fineract.accounting.glaccount.domain.GLAccountType;

public final class AccountingConstants {

    private AccountingConstants() {

    }

    /***
     * Accounting placeholders for cash based accounting for loan products
     ***/
    public enum CashAccountsForLoan {

        FUND_SOURCE(1), //
        LOAN_PORTFOLIO(2), //
        INTEREST_ON_LOANS(3), //
        INCOME_FROM_FEES(4), //
        INCOME_FROM_PENALTIES(5), //
        LOSSES_WRITTEN_OFF(6), //
        TRANSFERS_SUSPENSE(10), //
        OVERPAYMENT(11), //
        INCOME_FROM_RECOVERY(12), //
        GOODWILL_CREDIT(13), //
        INCOME_FROM_CHARGE_OFF_INTEREST(14), //
        INCOME_FROM_CHARGE_OFF_FEES(15), //
        CHARGE_OFF_EXPENSE(16), //
        CHARGE_OFF_FRAUD_EXPENSE(17), //
        INCOME_FROM_CHARGE_OFF_PENALTY(18), //
        INCOME_FROM_GOODWILL_CREDIT_INTEREST(19), //
        INCOME_FROM_GOODWILL_CREDIT_FEES(20), //
        INCOME_FROM_GOODWILL_CREDIT_PENALTY(21); //

        private final Integer value;

        CashAccountsForLoan(final Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public Integer getValue() {
            return this.value;
        }

        private static final Map<Integer, CashAccountsForLoan> intToEnumMap = new HashMap<>();

        static {
            for (final CashAccountsForLoan type : CashAccountsForLoan.values()) {
                intToEnumMap.put(type.value, type);
            }
        }

        public static CashAccountsForLoan fromInt(final int i) {
            final CashAccountsForLoan type = intToEnumMap.get(Integer.valueOf(i));
            return type;
        }
    }

    /***
     * Accounting placeholders for accrual based accounting for loan products
     ***/
    public enum AccrualAccountsForLoan {

        FUND_SOURCE(1), //
        LOAN_PORTFOLIO(2), //
        INTEREST_ON_LOANS(3), //
        INCOME_FROM_FEES(4), //
        INCOME_FROM_PENALTIES(5), //
        LOSSES_WRITTEN_OFF(6), //
        INTEREST_RECEIVABLE(7), //
        FEES_RECEIVABLE(8), //
        PENALTIES_RECEIVABLE(9), //
        TRANSFERS_SUSPENSE(10), //
        OVERPAYMENT(11), //
        INCOME_FROM_RECOVERY(12), //
        GOODWILL_CREDIT(13), //
        INCOME_FROM_CHARGE_OFF_INTEREST(14), //
        INCOME_FROM_CHARGE_OFF_FEES(15), //
        CHARGE_OFF_EXPENSE(16), //
        CHARGE_OFF_FRAUD_EXPENSE(17), //
        INCOME_FROM_CHARGE_OFF_PENALTY(18), //
        INCOME_FROM_GOODWILL_CREDIT_INTEREST(19), //
        INCOME_FROM_GOODWILL_CREDIT_FEES(20), //
        INCOME_FROM_GOODWILL_CREDIT_PENALTY(21); //

        private final Integer value;

        AccrualAccountsForLoan(final Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public Integer getValue() {
            return this.value;
        }

        private static final Map<Integer, AccrualAccountsForLoan> intToEnumMap = new HashMap<>();

        static {
            for (final AccrualAccountsForLoan type : AccrualAccountsForLoan.values()) {
                intToEnumMap.put(type.value, type);
            }
        }

        public static AccrualAccountsForLoan fromInt(final int i) {
            final AccrualAccountsForLoan type = intToEnumMap.get(Integer.valueOf(i));
            return type;
        }

    }

    /***
     * Enum of all accounting related input parameter names used while creating/updating a loan product
     ***/
    public enum LoanProductAccountingParams {

        FUND_SOURCE("fundSourceAccountId"), //
        LOAN_PORTFOLIO("loanPortfolioAccountId"), //
        INTEREST_ON_LOANS("interestOnLoanAccountId"), //
        INCOME_FROM_FEES("incomeFromFeeAccountId"), //
        INCOME_FROM_PENALTIES("incomeFromPenaltyAccountId"), //
        LOSSES_WRITTEN_OFF("writeOffAccountId"), //
        GOODWILL_CREDIT("goodwillCreditAccountId"), //
        OVERPAYMENT("overpaymentLiabilityAccountId"), //
        INTEREST_RECEIVABLE("receivableInterestAccountId"), //
        FEES_RECEIVABLE("receivableFeeAccountId"), //
        PENALTIES_RECEIVABLE("receivablePenaltyAccountId"), //
        TRANSFERS_SUSPENSE("transfersInSuspenseAccountId"), //
        PAYMENT_CHANNEL_FUND_SOURCE_MAPPING("paymentChannelToFundSourceMappings"), //
        PAYMENT_TYPE("paymentTypeId"), //
        FEE_INCOME_ACCOUNT_MAPPING("feeToIncomeAccountMappings"), //
        PENALTY_INCOME_ACCOUNT_MAPPING("penaltyToIncomeAccountMappings"), //
        CHARGE_ID("chargeId"), //
        INCOME_ACCOUNT_ID("incomeAccountId"), //
        INCOME_FROM_RECOVERY("incomeFromRecoveryAccountId"), //
        INCOME_FROM_CHARGE_OFF_INTEREST("incomeFromChargeOffInterestAccountId"), //
        INCOME_FROM_CHARGE_OFF_FEES("incomeFromChargeOffFeesAccountId"), //
        CHARGE_OFF_EXPENSE("chargeOffExpenseAccountId"), //
        CHARGE_OFF_FRAUD_EXPENSE("chargeOffFraudExpenseAccountId"), //
        INCOME_FROM_CHARGE_OFF_PENALTY("incomeFromChargeOffPenaltyAccountId"), //
        INCOME_FROM_GOODWILL_CREDIT_INTEREST("incomeFromGoodwillCreditInterestAccountId"), //
        INCOME_FROM_GOODWILL_CREDIT_FEES("incomeFromGoodwillCreditFeesAccountId"), //
        INCOME_FROM_GOODWILL_CREDIT_PENALTY("incomeFromGoodwillCreditPenaltyAccountId"); //

        private final String value;

        LoanProductAccountingParams(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum LoanProductAccountingDataParams {

        FUND_SOURCE("fundSourceAccount"), //
        LOAN_PORTFOLIO("loanPortfolioAccount"), //
        INTEREST_ON_LOANS("interestOnLoanAccount"), //
        INCOME_FROM_FEES("incomeFromFeeAccount"), //
        INCOME_FROM_PENALTIES("incomeFromPenaltyAccount"), //
        LOSSES_WRITTEN_OFF("writeOffAccount"), //
        GOODWILL_CREDIT("goodwillCreditAccount"), //
        OVERPAYMENT("overpaymentLiabilityAccount"), //
        INTEREST_RECEIVABLE("receivableInterestAccount"), //
        FEES_RECEIVABLE("receivableFeeAccount"), //
        PENALTIES_RECEIVABLE("receivablePenaltyAccount"), //
        TRANSFERS_SUSPENSE("transfersInSuspenseAccount"), //
        INCOME_ACCOUNT_ID("incomeAccount"), //
        INCOME_FROM_RECOVERY("incomeFromRecoveryAccount"), //
        LIABILITY_TRANSFER_SUSPENSE("liabilityTransferInSuspenseAccount"), //
        INCOME_FROM_CHARGE_OFF_INTEREST("incomeFromChargeOffInterestAccount"), //
        INCOME_FROM_CHARGE_OFF_FEES("incomeFromChargeOffFeesAccount"), //
        CHARGE_OFF_EXPENSE("chargeOffExpenseAccount"), //
        CHARGE_OFF_FRAUD_EXPENSE("chargeOffFraudExpenseAccount"), //
        INCOME_FROM_CHARGE_OFF_PENALTY("incomeFromChargeOffPenaltyAccount"), //
        INCOME_FROM_GOODWILL_CREDIT_INTEREST("incomeFromGoodwillCreditInterestAccount"), //
        INCOME_FROM_GOODWILL_CREDIT_FEES("incomeFromGoodwillCreditFeesAccount"), //
        INCOME_FROM_GOODWILL_CREDIT_PENALTY("incomeFromGoodwillCreditPenaltyAccount"); //

        private final String value;

        LoanProductAccountingDataParams(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public String getValue() {
            return this.value;
        }
    }

    /***
     * Accounting placeholders for cash based accounting for Share products
     ***/
    public enum CashAccountsForShares {

        SHARES_REFERENCE(1), SHARES_SUSPENSE(2), INCOME_FROM_FEES(3), SHARES_EQUITY(4);

        private final Integer value;

        CashAccountsForShares(final Integer value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return name().toString().replaceAll("_", " ");
        }

        public Integer getValue() {
            return this.value;
        }

        private static final Map<Integer, CashAccountsForShares> intToEnumMap = new HashMap<>();

        static {
            for (final CashAccountsForShares type : CashAccountsForShares.values()) {
                intToEnumMap.put(type.value, type);
            }
        }

        public static CashAccountsForShares fromInt(final int i) {
            final CashAccountsForShares type = intToEnumMap.get(Integer.valueOf(i));
            return type;
        }
    }


    public static final String ASSESTS_TAG_OPTION_CODE_NAME = "AssetAccountTags";
    public static final String LIABILITIES_TAG_OPTION_CODE_NAME = "LiabilityAccountTags";
    public static final String EQUITY_TAG_OPTION_CODE_NAME = "EquityAccountTags";
    public static final String INCOME_TAG_OPTION_CODE_NAME = "IncomeAccountTags";
    public static final String EXPENSES_TAG_OPTION_CODE_NAME = "ExpenseAccountTags";

}
