package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* loaded from: classes13.dex */
public final class JvmFlags {

    /* renamed from: a, reason: collision with root package name */
    public static final JvmFlags f145648a = new JvmFlags();

    /* renamed from: b, reason: collision with root package name */
    private static final Flags.BooleanFlagField f145649b = Flags.FlagField.c();

    /* renamed from: c, reason: collision with root package name */
    private static final Flags.BooleanFlagField f145650c;

    /* renamed from: d, reason: collision with root package name */
    private static final Flags.BooleanFlagField f145651d;

    static {
        Flags.BooleanFlagField booleanFlagFieldC = Flags.FlagField.c();
        f145650c = booleanFlagFieldC;
        f145651d = Flags.FlagField.b(booleanFlagFieldC);
    }

    public final Flags.BooleanFlagField a() {
        return f145649b;
    }

    private JvmFlags() {
    }
}
