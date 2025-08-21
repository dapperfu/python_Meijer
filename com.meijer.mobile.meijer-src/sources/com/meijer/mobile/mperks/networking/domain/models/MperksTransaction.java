package com.meijer.mobile.mperks.networking.domain.models;

import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u00013BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b.\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001d¨\u00064"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "", "", "transactionId", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "transactionType", "", "points", "j$/time/ZonedDateTime", "postedAt", "label", "", "rewardId", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails;", "reasonDetails", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;ILj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/Long;Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "component3", "()I", "component4", "()Lj$/time/ZonedDateTime;", "component5", "component6", "()Ljava/lang/Long;", "component7", "()Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails;", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;ILj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/Long;Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTransactionId", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "getTransactionType", "I", "getPoints", "Lj$/time/ZonedDateTime;", "getPostedAt", "getLabel", "Ljava/lang/Long;", "getRewardId", "Lcom/meijer/mobile/mperks/networking/domain/models/ReasonDetails;", "getReasonDetails", "TransactionType", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksTransaction {
    private final String label;
    private final int points;
    private final ZonedDateTime postedAt;
    private final ReasonDetails reasonDetails;
    private final Long rewardId;
    private final String transactionId;
    private final TransactionType transactionType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction$TransactionType;", "", "<init>", "(Ljava/lang/String;I)V", "DEBIT", "CREDIT", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransactionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransactionType[] $VALUES;
        public static final TransactionType DEBIT = new TransactionType("DEBIT", 0);
        public static final TransactionType CREDIT = new TransactionType("CREDIT", 1);

        private static final /* synthetic */ TransactionType[] $values() {
            return new TransactionType[]{DEBIT, CREDIT};
        }

        public static EnumEntries<TransactionType> getEntries() {
            return $ENTRIES;
        }

        static {
            TransactionType[] transactionTypeArr$values = $values();
            $VALUES = transactionTypeArr$values;
            $ENTRIES = EnumEntriesKt.a(transactionTypeArr$values);
        }

        public static TransactionType valueOf(String str) {
            return (TransactionType) Enum.valueOf(TransactionType.class, str);
        }

        public static TransactionType[] values() {
            return (TransactionType[]) $VALUES.clone();
        }

        private TransactionType(String str, int i10) {
        }
    }

    public MperksTransaction(String transactionId, TransactionType transactionType, int i10, ZonedDateTime zonedDateTime, String str, Long l10, ReasonDetails reasonDetails) {
        Intrinsics.j(transactionId, "transactionId");
        Intrinsics.j(transactionType, "transactionType");
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.points = i10;
        this.postedAt = zonedDateTime;
        this.label = str;
        this.rewardId = l10;
        this.reasonDetails = reasonDetails;
    }

    public static /* synthetic */ MperksTransaction copy$default(MperksTransaction mperksTransaction, String str, TransactionType transactionType, int i10, ZonedDateTime zonedDateTime, String str2, Long l10, ReasonDetails reasonDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mperksTransaction.transactionId;
        }
        if ((i11 & 2) != 0) {
            transactionType = mperksTransaction.transactionType;
        }
        if ((i11 & 4) != 0) {
            i10 = mperksTransaction.points;
        }
        if ((i11 & 8) != 0) {
            zonedDateTime = mperksTransaction.postedAt;
        }
        if ((i11 & 16) != 0) {
            str2 = mperksTransaction.label;
        }
        if ((i11 & 32) != 0) {
            l10 = mperksTransaction.rewardId;
        }
        if ((i11 & 64) != 0) {
            reasonDetails = mperksTransaction.reasonDetails;
        }
        Long l11 = l10;
        ReasonDetails reasonDetails2 = reasonDetails;
        String str3 = str2;
        int i12 = i10;
        return mperksTransaction.copy(str, transactionType, i12, zonedDateTime, str3, l11, reasonDetails2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component2, reason: from getter */
    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: component4, reason: from getter */
    public final ZonedDateTime getPostedAt() {
        return this.postedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getRewardId() {
        return this.rewardId;
    }

    /* renamed from: component7, reason: from getter */
    public final ReasonDetails getReasonDetails() {
        return this.reasonDetails;
    }

    public final MperksTransaction copy(String transactionId, TransactionType transactionType, int points, ZonedDateTime postedAt, String label, Long rewardId, ReasonDetails reasonDetails) {
        Intrinsics.j(transactionId, "transactionId");
        Intrinsics.j(transactionType, "transactionType");
        return new MperksTransaction(transactionId, transactionType, points, postedAt, label, rewardId, reasonDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksTransaction)) {
            return false;
        }
        MperksTransaction mperksTransaction = (MperksTransaction) other;
        return Intrinsics.e(this.transactionId, mperksTransaction.transactionId) && this.transactionType == mperksTransaction.transactionType && this.points == mperksTransaction.points && Intrinsics.e(this.postedAt, mperksTransaction.postedAt) && Intrinsics.e(this.label, mperksTransaction.label) && Intrinsics.e(this.rewardId, mperksTransaction.rewardId) && Intrinsics.e(this.reasonDetails, mperksTransaction.reasonDetails);
    }

    public int hashCode() {
        int iHashCode = ((((this.transactionId.hashCode() * 31) + this.transactionType.hashCode()) * 31) + Integer.hashCode(this.points)) * 31;
        ZonedDateTime zonedDateTime = this.postedAt;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str = this.label;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.rewardId;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        ReasonDetails reasonDetails = this.reasonDetails;
        return iHashCode4 + (reasonDetails != null ? reasonDetails.hashCode() : 0);
    }

    public String toString() {
        return "MperksTransaction(transactionId=" + this.transactionId + ", transactionType=" + this.transactionType + ", points=" + this.points + ", postedAt=" + this.postedAt + ", label=" + this.label + ", rewardId=" + this.rewardId + ", reasonDetails=" + this.reasonDetails + ')';
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getPoints() {
        return this.points;
    }

    public final ZonedDateTime getPostedAt() {
        return this.postedAt;
    }

    public final ReasonDetails getReasonDetails() {
        return this.reasonDetails;
    }

    public final Long getRewardId() {
        return this.rewardId;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MperksTransaction(java.lang.String r9, com.meijer.mobile.mperks.networking.domain.models.MperksTransaction.TransactionType r10, int r11, j$.time.ZonedDateTime r12, java.lang.String r13, java.lang.Long r14, com.meijer.mobile.mperks.networking.domain.models.ReasonDetails r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L5
            r11 = 0
        L5:
            r3 = r11
            r11 = r16 & 8
            r0 = 0
            if (r11 == 0) goto Ld
            r4 = r0
            goto Le
        Ld:
            r4 = r12
        Le:
            r11 = r16 & 16
            if (r11 == 0) goto L14
            r5 = r0
            goto L15
        L14:
            r5 = r13
        L15:
            r11 = r16 & 32
            if (r11 == 0) goto L1b
            r6 = r0
            goto L1c
        L1b:
            r6 = r14
        L1c:
            r11 = r16 & 64
            if (r11 == 0) goto L25
            r7 = r0
            r1 = r9
            r2 = r10
            r0 = r8
            goto L29
        L25:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
        L29:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.networking.domain.models.MperksTransaction.<init>(java.lang.String, com.meijer.mobile.mperks.networking.domain.models.MperksTransaction$TransactionType, int, j$.time.ZonedDateTime, java.lang.String, java.lang.Long, com.meijer.mobile.mperks.networking.domain.models.ReasonDetails, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
