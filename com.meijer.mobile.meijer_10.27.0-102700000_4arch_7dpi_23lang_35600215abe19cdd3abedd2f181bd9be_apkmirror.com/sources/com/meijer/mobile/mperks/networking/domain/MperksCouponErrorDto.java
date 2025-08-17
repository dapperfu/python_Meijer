package com.meijer.mobile.mperks.networking.domain;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB'\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto;", "", "Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto$MperksErrorCode;", "code", "", "error", "message", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto$MperksErrorCode;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto$MperksErrorCode;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto$MperksErrorCode;", "()Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto$MperksErrorCode;", "b", "Ljava/lang/String;", "c", "MperksErrorCode", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksCouponErrorDto {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MperksErrorCode code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/MperksCouponErrorDto$MperksErrorCode;", "", "resultCode", "", "<init>", "(Ljava/lang/String;II)V", "UNAUTH_ERROR", "INSUFFICIENT_POINTS", "ALREADY_CLIPPED", "NOT_AVAILABLE", "NOT_FOUND", "COUPON_EXPIRED", "INTERNAL_SERVER_ERROR", "UNKNOWN_ERROR", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MperksErrorCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MperksErrorCode[] $VALUES;
        private final int resultCode;

        @g(name = "10")
        public static final MperksErrorCode UNAUTH_ERROR = new MperksErrorCode("UNAUTH_ERROR", 0, 10);

        @g(name = "52")
        public static final MperksErrorCode INSUFFICIENT_POINTS = new MperksErrorCode("INSUFFICIENT_POINTS", 1, 52);

        @g(name = "30")
        public static final MperksErrorCode ALREADY_CLIPPED = new MperksErrorCode("ALREADY_CLIPPED", 2, 30);

        @g(name = "40")
        public static final MperksErrorCode NOT_AVAILABLE = new MperksErrorCode("NOT_AVAILABLE", 3, 40);

        @g(name = "41")
        public static final MperksErrorCode NOT_FOUND = new MperksErrorCode("NOT_FOUND", 4, 41);

        @g(name = "43")
        public static final MperksErrorCode COUPON_EXPIRED = new MperksErrorCode("COUPON_EXPIRED", 5, 43);

        @g(name = "99")
        public static final MperksErrorCode INTERNAL_SERVER_ERROR = new MperksErrorCode("INTERNAL_SERVER_ERROR", 6, 99);
        public static final MperksErrorCode UNKNOWN_ERROR = new MperksErrorCode("UNKNOWN_ERROR", 7, -1);

        private static final /* synthetic */ MperksErrorCode[] a() {
            return new MperksErrorCode[]{UNAUTH_ERROR, INSUFFICIENT_POINTS, ALREADY_CLIPPED, NOT_AVAILABLE, NOT_FOUND, COUPON_EXPIRED, INTERNAL_SERVER_ERROR, UNKNOWN_ERROR};
        }

        static {
            MperksErrorCode[] mperksErrorCodeArrA = a();
            $VALUES = mperksErrorCodeArrA;
            $ENTRIES = EnumEntriesKt.a(mperksErrorCodeArrA);
        }

        public static MperksErrorCode valueOf(String str) {
            return (MperksErrorCode) Enum.valueOf(MperksErrorCode.class, str);
        }

        public static MperksErrorCode[] values() {
            return (MperksErrorCode[]) $VALUES.clone();
        }

        private MperksErrorCode(String str, int i10, int i11) {
            this.resultCode = i11;
        }
    }

    public MperksCouponErrorDto(@g(name = "code") MperksErrorCode mperksErrorCode, @g(name = "error") String error, @g(name = "message") String message) {
        Intrinsics.j(error, "error");
        Intrinsics.j(message, "message");
        this.code = mperksErrorCode;
        this.error = error;
        this.message = message;
    }

    public final MperksCouponErrorDto copy(@g(name = "code") MperksErrorCode code, @g(name = "error") String error, @g(name = "message") String message) {
        Intrinsics.j(error, "error");
        Intrinsics.j(message, "message");
        return new MperksCouponErrorDto(code, error, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksCouponErrorDto)) {
            return false;
        }
        MperksCouponErrorDto mperksCouponErrorDto = (MperksCouponErrorDto) other;
        return this.code == mperksCouponErrorDto.code && Intrinsics.e(this.error, mperksCouponErrorDto.error) && Intrinsics.e(this.message, mperksCouponErrorDto.message);
    }

    public int hashCode() {
        MperksErrorCode mperksErrorCode = this.code;
        return ((((mperksErrorCode == null ? 0 : mperksErrorCode.hashCode()) * 31) + this.error.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "MperksCouponErrorDto(code=" + this.code + ", error=" + this.error + ", message=" + this.message + ')';
    }

    /* renamed from: a, reason: from getter */
    public final MperksErrorCode getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ MperksCouponErrorDto(MperksErrorCode mperksErrorCode, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : mperksErrorCode, str, str2);
    }
}
