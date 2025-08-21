package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class MetadataVersion extends BinaryVersion {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f146449h = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final MetadataVersion f146450i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final MetadataVersion f146451j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final MetadataVersion f146452k;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f146453g;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.j(versionArray, "versionArray");
        this.f146453g = z10;
    }

    static {
        MetadataVersion metadataVersion = new MetadataVersion(2, 1, 0);
        f146450i = metadataVersion;
        f146451j = metadataVersion.m();
        f146452k = new MetadataVersion(new int[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(int... numbers) {
        this(numbers, false);
        Intrinsics.j(numbers, "numbers");
    }

    public final boolean h(MetadataVersion metadataVersionFromLanguageVersion) {
        Intrinsics.j(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        return i(metadataVersionFromLanguageVersion.k(this.f146453g));
    }

    public final boolean j() {
        return this.f146453g;
    }

    public final MetadataVersion k(boolean z10) {
        MetadataVersion metadataVersion = z10 ? f146450i : f146451j;
        return metadataVersion.l(this) ? metadataVersion : this;
    }

    private final boolean i(MetadataVersion metadataVersion) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(metadataVersion);
    }

    private final boolean l(MetadataVersion metadataVersion) {
        if (a() > metadataVersion.a()) {
            return true;
        }
        if (a() >= metadataVersion.a() && b() > metadataVersion.b()) {
            return true;
        }
        return false;
    }

    public final MetadataVersion m() {
        if (a() == 1 && b() == 9) {
            return new MetadataVersion(2, 0, 0);
        }
        return new MetadataVersion(a(), b() + 1, 0);
    }
}
