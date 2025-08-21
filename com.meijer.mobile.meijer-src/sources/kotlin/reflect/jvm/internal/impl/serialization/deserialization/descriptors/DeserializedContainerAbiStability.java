package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class DeserializedContainerAbiStability {

    /* renamed from: a, reason: collision with root package name */
    public static final DeserializedContainerAbiStability f147409a = new DeserializedContainerAbiStability("STABLE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final DeserializedContainerAbiStability f147410b = new DeserializedContainerAbiStability("UNSTABLE", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ DeserializedContainerAbiStability[] f147411c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147412d;

    private static final /* synthetic */ DeserializedContainerAbiStability[] a() {
        return new DeserializedContainerAbiStability[]{f147409a, f147410b};
    }

    static {
        DeserializedContainerAbiStability[] deserializedContainerAbiStabilityArrA = a();
        f147411c = deserializedContainerAbiStabilityArrA;
        f147412d = EnumEntriesKt.a(deserializedContainerAbiStabilityArrA);
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) f147411c.clone();
    }

    private DeserializedContainerAbiStability(String str, int i10) {
    }
}
