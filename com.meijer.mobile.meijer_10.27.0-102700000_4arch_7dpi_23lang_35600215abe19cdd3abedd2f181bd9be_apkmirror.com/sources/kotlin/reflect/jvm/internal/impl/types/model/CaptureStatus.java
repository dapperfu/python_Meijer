package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class CaptureStatus {

    /* renamed from: a, reason: collision with root package name */
    public static final CaptureStatus f147008a = new CaptureStatus("FOR_SUBTYPING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final CaptureStatus f147009b = new CaptureStatus("FOR_INCORPORATION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final CaptureStatus f147010c = new CaptureStatus("FROM_EXPRESSION", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ CaptureStatus[] f147011d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147012e;

    private static final /* synthetic */ CaptureStatus[] a() {
        return new CaptureStatus[]{f147008a, f147009b, f147010c};
    }

    static {
        CaptureStatus[] captureStatusArrA = a();
        f147011d = captureStatusArrA;
        f147012e = EnumEntriesKt.a(captureStatusArrA);
    }

    public static CaptureStatus valueOf(String str) {
        return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
    }

    public static CaptureStatus[] values() {
        return (CaptureStatus[]) f147011d.clone();
    }

    private CaptureStatus(String str, int i10) {
    }
}
