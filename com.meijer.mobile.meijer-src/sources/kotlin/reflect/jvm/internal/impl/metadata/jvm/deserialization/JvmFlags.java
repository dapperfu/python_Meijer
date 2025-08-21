package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* loaded from: classes14.dex */
public final class JvmFlags {

    /* renamed from: a, reason: collision with root package name */
    public static final JvmFlags f146555a = new JvmFlags();

    /* renamed from: b, reason: collision with root package name */
    private static final Flags.BooleanFlagField f146556b = Flags.FlagField.c();

    /* renamed from: c, reason: collision with root package name */
    private static final Flags.BooleanFlagField f146557c;

    /* renamed from: d, reason: collision with root package name */
    private static final Flags.BooleanFlagField f146558d;

    static {
        Flags.BooleanFlagField booleanFlagFieldC = Flags.FlagField.c();
        f146557c = booleanFlagFieldC;
        f146558d = Flags.FlagField.b(booleanFlagFieldC);
    }

    public final Flags.BooleanFlagField a() {
        return f146556b;
    }

    private JvmFlags() {
    }
}
