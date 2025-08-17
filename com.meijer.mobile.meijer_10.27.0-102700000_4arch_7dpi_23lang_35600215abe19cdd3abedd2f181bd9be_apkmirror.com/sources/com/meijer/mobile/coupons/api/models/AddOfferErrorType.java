package com.meijer.mobile.coupons.api.models;

import Yk.a;
import android.content.Context;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pk.f;
import rk.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/AddOfferErrorType;", "Lrk/b;", "", "", "resultCode", "errorResourceId", "<init>", "(Ljava/lang/String;III)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "I", "getResultCode", "()I", "getErrorResourceId", "Companion", "a", "SUCCESS", "INVALID_ARGUMENTS", "ALREADY_ENROLLED_ERROR", "CLIPPED_COUPONS_LIMIT_ERROR", "ALREADY_CLIPPED_ERROR", "OFFER_NOT_FOUND", "OFFER_EXPIRED_ERROR", "OFFER_NO_LONGER_AVAILABLE_ERROR", "INSUFFICIENT_POINTS_ERROR", "ALREADY_CLIPPED_REWARD_ERROR", "UNKNOWN_ERROR", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AddOfferErrorType implements b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AddOfferErrorType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int errorResourceId;
    private final int resultCode;

    @g(name = "0")
    public static final AddOfferErrorType SUCCESS = new AddOfferErrorType("SUCCESS", 0, 0, f.f155798l);

    @g(name = "8")
    public static final AddOfferErrorType INVALID_ARGUMENTS = new AddOfferErrorType("INVALID_ARGUMENTS", 1, 8, a.f40282a);

    @g(name = "15")
    public static final AddOfferErrorType ALREADY_ENROLLED_ERROR = new AddOfferErrorType("ALREADY_ENROLLED_ERROR", 2, 15, f.f155803q);

    @g(name = "20")
    public static final AddOfferErrorType CLIPPED_COUPONS_LIMIT_ERROR = new AddOfferErrorType("CLIPPED_COUPONS_LIMIT_ERROR", 3, 20, a.f40291j);

    @g(name = "30")
    public static final AddOfferErrorType ALREADY_CLIPPED_ERROR = new AddOfferErrorType("ALREADY_CLIPPED_ERROR", 4, 30, a.f40301t);

    @g(name = "42")
    public static final AddOfferErrorType OFFER_NOT_FOUND = new AddOfferErrorType("OFFER_NOT_FOUND", 5, 42, a.f40304w);

    @g(name = "43")
    public static final AddOfferErrorType OFFER_EXPIRED_ERROR = new AddOfferErrorType("OFFER_EXPIRED_ERROR", 6, 43, a.f40302u);

    @g(name = "44")
    public static final AddOfferErrorType OFFER_NO_LONGER_AVAILABLE_ERROR = new AddOfferErrorType("OFFER_NO_LONGER_AVAILABLE_ERROR", 7, 44, a.f40303v);

    @g(name = "52")
    public static final AddOfferErrorType INSUFFICIENT_POINTS_ERROR = new AddOfferErrorType("INSUFFICIENT_POINTS_ERROR", 8, 52, a.f40306y);

    @g(name = "53")
    public static final AddOfferErrorType ALREADY_CLIPPED_REWARD_ERROR = new AddOfferErrorType("ALREADY_CLIPPED_REWARD_ERROR", 9, 53, a.f40305x);
    public static final AddOfferErrorType UNKNOWN_ERROR = new AddOfferErrorType("UNKNOWN_ERROR", 10, -1, a.f40282a);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/AddOfferErrorType$a;", "", "<init>", "()V", "", "value", "Lcom/meijer/mobile/coupons/api/models/AddOfferErrorType;", "a", "(I)Lcom/meijer/mobile/coupons/api/models/AddOfferErrorType;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.coupons.api.models.AddOfferErrorType$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AddOfferErrorType a(int value) {
            AddOfferErrorType next;
            Iterator<AddOfferErrorType> it = AddOfferErrorType.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.getResultCode() == value) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AddOfferErrorType addOfferErrorType = next;
            if (addOfferErrorType == null) {
                return AddOfferErrorType.UNKNOWN_ERROR;
            }
            return addOfferErrorType;
        }
    }

    private static final /* synthetic */ AddOfferErrorType[] a() {
        return new AddOfferErrorType[]{SUCCESS, INVALID_ARGUMENTS, ALREADY_ENROLLED_ERROR, CLIPPED_COUPONS_LIMIT_ERROR, ALREADY_CLIPPED_ERROR, OFFER_NOT_FOUND, OFFER_EXPIRED_ERROR, OFFER_NO_LONGER_AVAILABLE_ERROR, INSUFFICIENT_POINTS_ERROR, ALREADY_CLIPPED_REWARD_ERROR, UNKNOWN_ERROR};
    }

    public static EnumEntries<AddOfferErrorType> b() {
        return $ENTRIES;
    }

    static {
        AddOfferErrorType[] addOfferErrorTypeArrA = a();
        $VALUES = addOfferErrorTypeArrA;
        $ENTRIES = EnumEntriesKt.a(addOfferErrorTypeArrA);
        INSTANCE = new Companion(null);
    }

    public static AddOfferErrorType valueOf(String str) {
        return (AddOfferErrorType) Enum.valueOf(AddOfferErrorType.class, str);
    }

    public static AddOfferErrorType[] values() {
        return (AddOfferErrorType[]) $VALUES.clone();
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

    @Override // rk.b
    public int getResultCode() {
        return this.resultCode;
    }

    private AddOfferErrorType(String str, int i10, int i11, int i12) {
        this.resultCode = i11;
        this.errorResourceId = i12;
    }
}
