package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class CaptureStatus {

    /* renamed from: a, reason: collision with root package name */
    public static final CaptureStatus f147915a = new CaptureStatus("FOR_SUBTYPING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final CaptureStatus f147916b = new CaptureStatus("FOR_INCORPORATION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final CaptureStatus f147917c = new CaptureStatus("FROM_EXPRESSION", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ CaptureStatus[] f147918d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147919e;

    private static final /* synthetic */ CaptureStatus[] a() {
        return new CaptureStatus[]{f147915a, f147916b, f147917c};
    }

    static {
        CaptureStatus[] captureStatusArrA = a();
        f147918d = captureStatusArrA;
        f147919e = EnumEntriesKt.a(captureStatusArrA);
    }

    public static CaptureStatus valueOf(String str) {
        return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
    }

    public static CaptureStatus[] values() {
        return (CaptureStatus[]) f147918d.clone();
    }

    private CaptureStatus(String str, int i10) {
    }
}
