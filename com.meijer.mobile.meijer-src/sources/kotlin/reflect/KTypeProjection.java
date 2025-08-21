package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/KVariance;", "variance", "Lkotlin/reflect/KType;", "type", "<init>", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "", "toString", "()Ljava/lang/String;", "a", "()Lkotlin/reflect/KVariance;", "b", "()Lkotlin/reflect/KType;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/reflect/KVariance;", "d", "Lkotlin/reflect/KType;", "c", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class KTypeProjection {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final KTypeProjection f143855d = new KTypeProjection(null, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KVariance variance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final KType type;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "<init>", "()V", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/KTypeProjection;", "d", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;", "a", "b", "c", "()Lkotlin/reflect/KTypeProjection;", "STAR", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final KTypeProjection a(KType type) {
            Intrinsics.j(type, "type");
            return new KTypeProjection(KVariance.f143859b, type);
        }

        @JvmStatic
        public final KTypeProjection b(KType type) {
            Intrinsics.j(type, "type");
            return new KTypeProjection(KVariance.f143860c, type);
        }

        public final KTypeProjection c() {
            return KTypeProjection.f143855d;
        }

        @JvmStatic
        public final KTypeProjection d(KType type) {
            Intrinsics.j(type, "type");
            return new KTypeProjection(KVariance.f143858a, type);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.f143858a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.f143859b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.f143860c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a, reason: from getter */
    public final KVariance getVariance() {
        return this.variance;
    }

    /* renamed from: b, reason: from getter */
    public final KType getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) other;
        return this.variance == kTypeProjection.variance && Intrinsics.e(this.type, kTypeProjection.type);
    }

    public int hashCode() {
        KVariance kVariance = this.variance;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.type;
        return iHashCode + (kType != null ? kType.hashCode() : 0);
    }

    public final KType c() {
        return this.type;
    }

    public final KVariance d() {
        return this.variance;
    }

    public String toString() {
        KVariance kVariance = this.variance;
        int i10 = kVariance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.type);
        }
        if (i10 == 2) {
            return "in " + this.type;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.type;
    }

    public KTypeProjection(KVariance kVariance, KType kType) {
        boolean z10;
        String str;
        this.variance = kVariance;
        this.type = kType;
        if (kVariance == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }
}
