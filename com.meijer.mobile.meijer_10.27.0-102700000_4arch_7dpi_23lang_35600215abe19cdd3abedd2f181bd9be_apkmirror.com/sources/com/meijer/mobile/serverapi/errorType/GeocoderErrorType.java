package com.meijer.mobile.serverapi.errorType;

import Vq.c;
import android.content.Context;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import rk.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/serverapi/errorType/GeocoderErrorType;", "Lrk/b;", "", "", "errorResourceId", "<init>", "(Ljava/lang/String;II)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "I", "getErrorResourceId", "()I", "getResultCode", "resultCode", "", "isUnknown", "()Z", "NO_RESULTS_FOUND", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GeocoderErrorType implements b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GeocoderErrorType[] $VALUES;
    public static final GeocoderErrorType NO_RESULTS_FOUND = new GeocoderErrorType("NO_RESULTS_FOUND", 0, c.f37764x);
    private final int errorResourceId;

    private static final /* synthetic */ GeocoderErrorType[] $values() {
        return new GeocoderErrorType[]{NO_RESULTS_FOUND};
    }

    public static EnumEntries<GeocoderErrorType> getEntries() {
        return $ENTRIES;
    }

    @Override // rk.b
    public int getResultCode() {
        return -1;
    }

    public boolean isUnknown() {
        return false;
    }

    static {
        GeocoderErrorType[] geocoderErrorTypeArr$values = $values();
        $VALUES = geocoderErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(geocoderErrorTypeArr$values);
    }

    public static GeocoderErrorType valueOf(String str) {
        return (GeocoderErrorType) Enum.valueOf(GeocoderErrorType.class, str);
    }

    public static GeocoderErrorType[] values() {
        return (GeocoderErrorType[]) $VALUES.clone();
    }

    @Override // rk.b
    public int getErrorResourceId() {
        return this.errorResourceId;
    }

    @Override // rk.b
    public String getErrorString(Context context) {
        Intrinsics.j(context, "context");
        String string = context.getString(getErrorResourceId());
        Intrinsics.i(string, "getString(...)");
        return string;
    }

    private GeocoderErrorType(String str, int i10, int i11) {
        this.errorResourceId = i11;
    }
}
