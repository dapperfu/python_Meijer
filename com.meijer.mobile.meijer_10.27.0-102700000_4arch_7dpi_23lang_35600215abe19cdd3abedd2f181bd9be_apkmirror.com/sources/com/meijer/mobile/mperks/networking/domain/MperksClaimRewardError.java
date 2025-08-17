package com.meijer.mobile.mperks.networking.domain;

import android.content.Context;
import co.C6417a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0012\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/a;", "", "Lcom/meijer/mobile/mperks/networking/domain/a$a;", "code", "", "error", "message", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/a$a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/mperks/networking/domain/a$a;", "getCode", "()Lcom/meijer/mobile/mperks/networking/domain/a$a;", "b", "Ljava/lang/String;", "getError", "c", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.mperks.networking.domain.a, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class MperksClaimRewardError {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC1799a code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/a$a;", "Lrk/b;", "", "", "resultCode", "messageResourceId", "<init>", "(Ljava/lang/String;III)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "a", "I", "getResultCode", "()I", "b", "getErrorResourceId", "errorResourceId", "c", "d", "e", "f", "g", "h", "i", "j", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.networking.domain.a$a, reason: collision with other inner class name */
    public static final class EnumC1799a implements rk.b {

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC1799a f113575c = new EnumC1799a("ALREADY_CLIPPED", 0, 30, C6417a.f61962a);

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC1799a f113576d = new EnumC1799a("NOT_AVAILABLE", 1, 40, C6417a.f61963b);

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC1799a f113577e = new EnumC1799a("NOT_FOUND", 2, 41, C6417a.f61964c);

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC1799a f113578f = new EnumC1799a("COUPON_EXPIRED", 3, 43, C6417a.f61967f);

        /* renamed from: g, reason: collision with root package name */
        public static final EnumC1799a f113579g = new EnumC1799a("SERVER_ERROR", 4, 99, C6417a.f61969h);

        /* renamed from: h, reason: collision with root package name */
        public static final EnumC1799a f113580h = new EnumC1799a("INSUFFICIENT_POINTS", 5, 52, C6417a.f61968g);

        /* renamed from: i, reason: collision with root package name */
        public static final EnumC1799a f113581i = new EnumC1799a("UNAUTH_ERROR", 6, 10, C6417a.f61966e);

        /* renamed from: j, reason: collision with root package name */
        public static final EnumC1799a f113582j = new EnumC1799a("UNKNOWN_ERROR", 7, -1, C6417a.f61965d);

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumC1799a[] f113583k;

        /* renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f113584l;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int resultCode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int messageResourceId;

        private static final /* synthetic */ EnumC1799a[] a() {
            return new EnumC1799a[]{f113575c, f113576d, f113577e, f113578f, f113579g, f113580h, f113581i, f113582j};
        }

        static {
            EnumC1799a[] enumC1799aArrA = a();
            f113583k = enumC1799aArrA;
            f113584l = EnumEntriesKt.a(enumC1799aArrA);
        }

        public static EnumC1799a valueOf(String str) {
            return (EnumC1799a) Enum.valueOf(EnumC1799a.class, str);
        }

        public static EnumC1799a[] values() {
            return (EnumC1799a[]) f113583k.clone();
        }

        @Override // rk.b
        /* renamed from: getErrorResourceId, reason: from getter */
        public int getMessageResourceId() {
            return this.messageResourceId;
        }

        @Override // rk.b
        public String getErrorString(Context context) {
            Intrinsics.j(context, "context");
            String string = context.getString(this.messageResourceId);
            Intrinsics.i(string, "getString(...)");
            return string;
        }

        @Override // rk.b
        public int getResultCode() {
            return this.resultCode;
        }

        private EnumC1799a(String str, int i10, int i11, int i12) {
            this.resultCode = i11;
            this.messageResourceId = i12;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksClaimRewardError)) {
            return false;
        }
        MperksClaimRewardError mperksClaimRewardError = (MperksClaimRewardError) other;
        return this.code == mperksClaimRewardError.code && Intrinsics.e(this.error, mperksClaimRewardError.error) && Intrinsics.e(this.message, mperksClaimRewardError.message);
    }

    public int hashCode() {
        EnumC1799a enumC1799a = this.code;
        return ((((enumC1799a == null ? 0 : enumC1799a.hashCode()) * 31) + this.error.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "MperksClaimRewardError(code=" + this.code + ", error=" + this.error + ", message=" + this.message + ')';
    }

    public MperksClaimRewardError(EnumC1799a enumC1799a, String error, String message) {
        Intrinsics.j(error, "error");
        Intrinsics.j(message, "message");
        this.code = enumC1799a;
        this.error = error;
        this.message = message;
    }

    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }
}
