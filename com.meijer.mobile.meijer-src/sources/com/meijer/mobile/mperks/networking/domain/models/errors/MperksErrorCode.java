package com.meijer.mobile.mperks.networking.domain.models.errors;

import android.content.Context;
import eo.C13828a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import sk.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksErrorCode;", "Lsk/b;", "", "", "resultCode", "errorResourceId", "<init>", "(Ljava/lang/String;III)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "I", "getResultCode", "()I", "getErrorResourceId", "", "isUnknown", "()Z", "ALREADY_CLIPPED", "NOT_AVAILABLE", "NOT_FOUND", "COUPON_EXPIRED", "SERVER_ERROR", "INSUFFICIENT_POINTS", "UNAUTH_ERROR", "UNKNOWN_ERROR", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MperksErrorCode implements b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MperksErrorCode[] $VALUES;
    private final int errorResourceId;
    private final int resultCode;
    public static final MperksErrorCode ALREADY_CLIPPED = new MperksErrorCode("ALREADY_CLIPPED", 0, 30, C13828a.f130254a);
    public static final MperksErrorCode NOT_AVAILABLE = new MperksErrorCode("NOT_AVAILABLE", 1, 40, C13828a.f130255b);
    public static final MperksErrorCode NOT_FOUND = new MperksErrorCode("NOT_FOUND", 2, 41, C13828a.f130256c);
    public static final MperksErrorCode COUPON_EXPIRED = new MperksErrorCode("COUPON_EXPIRED", 3, 43, C13828a.f130259f);
    public static final MperksErrorCode SERVER_ERROR = new MperksErrorCode("SERVER_ERROR", 4, 99, C13828a.f130261h);
    public static final MperksErrorCode INSUFFICIENT_POINTS = new MperksErrorCode("INSUFFICIENT_POINTS", 5, 52, C13828a.f130260g);
    public static final MperksErrorCode UNAUTH_ERROR = new MperksErrorCode("UNAUTH_ERROR", 6, 10, C13828a.f130258e);
    public static final MperksErrorCode UNKNOWN_ERROR = new MperksErrorCode("UNKNOWN_ERROR", 7, -1, C13828a.f130257d);

    private static final /* synthetic */ MperksErrorCode[] $values() {
        return new MperksErrorCode[]{ALREADY_CLIPPED, NOT_AVAILABLE, NOT_FOUND, COUPON_EXPIRED, SERVER_ERROR, INSUFFICIENT_POINTS, UNAUTH_ERROR, UNKNOWN_ERROR};
    }

    public static EnumEntries<MperksErrorCode> getEntries() {
        return $ENTRIES;
    }

    static {
        MperksErrorCode[] mperksErrorCodeArr$values = $values();
        $VALUES = mperksErrorCodeArr$values;
        $ENTRIES = EnumEntriesKt.a(mperksErrorCodeArr$values);
    }

    public static MperksErrorCode valueOf(String str) {
        return (MperksErrorCode) Enum.valueOf(MperksErrorCode.class, str);
    }

    public static MperksErrorCode[] values() {
        return (MperksErrorCode[]) $VALUES.clone();
    }

    @Override // sk.b
    public int getErrorResourceId() {
        return this.errorResourceId;
    }

    @Override // sk.b
    public String getErrorString(Context context) {
        Intrinsics.j(context, "context");
        String string = context.getString(getErrorResourceId());
        Intrinsics.i(string, "getString(...)");
        return string;
    }

    @Override // sk.b
    public int getResultCode() {
        return this.resultCode;
    }

    public boolean isUnknown() {
        return this == UNKNOWN_ERROR;
    }

    private MperksErrorCode(String str, int i10, int i11, int i12) {
        this.resultCode = i11;
        this.errorResourceId = i12;
    }
}
