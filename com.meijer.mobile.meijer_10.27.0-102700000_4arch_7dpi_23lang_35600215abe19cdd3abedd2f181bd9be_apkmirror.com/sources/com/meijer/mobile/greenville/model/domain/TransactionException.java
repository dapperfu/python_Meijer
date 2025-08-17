package com.meijer.mobile.greenville.model.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\t\nB\u001d\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/greenville/model/domain/TransactionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "TripException", "ItemException", "Lcom/meijer/mobile/greenville/model/domain/TransactionException$ItemException;", "Lcom/meijer/mobile/greenville/model/domain/TransactionException$TripException;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class TransactionException extends Exception {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/greenville/model/domain/TransactionException$ItemException;", "Lcom/meijer/mobile/greenville/model/domain/TransactionException;", "correlationId", "", "message", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemException extends TransactionException {
        public ItemException(String str, String str2, Throwable th2) {
            super(str2, th2, null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/meijer/mobile/greenville/model/domain/TransactionException$TripException;", "Lcom/meijer/mobile/greenville/model/domain/TransactionException;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TripException extends TransactionException {
    }

    public /* synthetic */ TransactionException(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2);
    }

    private TransactionException(String str, Throwable th2) {
        super(str, th2);
    }
}
