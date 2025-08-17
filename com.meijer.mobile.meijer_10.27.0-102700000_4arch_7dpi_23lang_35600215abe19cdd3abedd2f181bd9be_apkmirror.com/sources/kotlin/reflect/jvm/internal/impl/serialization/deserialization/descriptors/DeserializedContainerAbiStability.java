package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class DeserializedContainerAbiStability {

    /* renamed from: a, reason: collision with root package name */
    public static final DeserializedContainerAbiStability f146502a = new DeserializedContainerAbiStability("STABLE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final DeserializedContainerAbiStability f146503b = new DeserializedContainerAbiStability("UNSTABLE", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ DeserializedContainerAbiStability[] f146504c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146505d;

    private static final /* synthetic */ DeserializedContainerAbiStability[] a() {
        return new DeserializedContainerAbiStability[]{f146502a, f146503b};
    }

    static {
        DeserializedContainerAbiStability[] deserializedContainerAbiStabilityArrA = a();
        f146504c = deserializedContainerAbiStabilityArrA;
        f146505d = EnumEntriesKt.a(deserializedContainerAbiStabilityArrA);
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) f146504c.clone();
    }

    private DeserializedContainerAbiStability(String str, int i10) {
    }
}
