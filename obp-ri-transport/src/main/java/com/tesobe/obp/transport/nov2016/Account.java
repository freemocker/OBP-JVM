/*
 * Copyright (c) TESOBE Ltd.  2016. All rights reserved.
 *
 * Use of this source code is governed by a GNU AFFERO license that can be found in the LICENSE file.
 *
 */

package com.tesobe.obp.transport.nov2016;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @since 2016.11
 */
public interface Account extends Id
{
  default String accountId()
  {
    return id();
  }

  String balanceAmount();

  String bankId();

  String balanceCurrency();

  String iban();

  String label();

  String number();

  String type();

  String userId();

  default List<String> fields()
  {
    return FIELDS;
  }

  String accountId = "accountId";
  String balanceAmount = "balanceAmount";
  String bankId = "bankId";
  String balanceCurrency = "balanceCurrency";
  String iban = "iban";
  String label = "label";
  String number = "number";
  String type = "type";
  String userId = "userId";

  List<String> FIELDS = asList(accountId, balanceAmount, balanceCurrency,
    bankId, iban, label, number, type, userId);
}
