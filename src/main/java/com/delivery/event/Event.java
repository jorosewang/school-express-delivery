package com.delivery.event;

/**
 * Created by finderlo on 15/04/2017.
 * 事件，系统内所有事件都需要在此枚举中
 *
 * @author finderlo
 */
public enum Event {

    ManualHandleComplainSuccessEvent,
    ManualHandleComplainFailEvent,
    ManualHandleUserUpgradeSuccessEvent,
    ManualHandleUserUpgradeFailEvent,

    OrderPublishedEvent,
    OrderAcceptedEvent,
    OrderCompleteSuccessEvent,
    OrderCancelEvent,
    OrderOutExpireEvent,

    UserRegisterEvent,
    UserAutoUpgradeSuccessEvent,

    FundsDepositEvent,
    FundsFetchEvent,
    FundsWithDrawEvent;

}