package com.scandit.datacapture.core.license;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/license/Expiration;", "", "Available", "NotAvailable", "Perpetual", "Lcom/scandit/datacapture/core/license/Expiration$Available;", "Lcom/scandit/datacapture/core/license/Expiration$NotAvailable;", "Lcom/scandit/datacapture/core/license/Expiration$Perpetual;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public abstract class Expiration {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/license/Expiration$Available;", "Lcom/scandit/datacapture/core/license/Expiration;", "Ljava/util/Date;", "date", "<init>", "(Ljava/util/Date;)V", "a", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Available extends Expiration {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Date date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(Date date) {
            super(null);
            Intrinsics.j(date, "date");
            this.date = date;
        }

        public final Date getDate() {
            return this.date;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/scandit/datacapture/core/license/Expiration$NotAvailable;", "Lcom/scandit/datacapture/core/license/Expiration;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class NotAvailable extends Expiration {
        public static final NotAvailable INSTANCE = new NotAvailable();

        private NotAvailable() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/scandit/datacapture/core/license/Expiration$Perpetual;", "Lcom/scandit/datacapture/core/license/Expiration;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Perpetual extends Expiration {
        public static final Perpetual INSTANCE = new Perpetual();

        private Perpetual() {
            super(null);
        }
    }

    public Expiration(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
