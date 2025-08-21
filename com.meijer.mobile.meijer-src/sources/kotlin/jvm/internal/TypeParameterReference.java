package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;

@SinceKotlin
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "container", "b", "Ljava/lang/String;", "getName", "name", "Lkotlin/reflect/KVariance;", "c", "Lkotlin/reflect/KVariance;", "k", "()Lkotlin/reflect/KVariance;", "variance", "", "Lkotlin/reflect/KType;", "d", "Ljava/util/List;", "bounds", "getUpperBounds", "()Ljava/util/List;", "getUpperBounds$annotations", "()V", "upperBounds", "e", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TypeParameterReference implements KTypeParameter {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object container;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final KVariance variance;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile List<? extends KType> bounds;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "<init>", "()V", "Lkotlin/reflect/KTypeParameter;", "typeParameter", "", "a", "(Lkotlin/reflect/KTypeParameter;)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

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

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(KTypeParameter typeParameter) {
            Intrinsics.j(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = WhenMappings.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()];
            if (i10 == 1) {
                Unit unit = Unit.f143329a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            return sb2.toString();
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof TypeParameterReference)) {
            return false;
        }
        TypeParameterReference typeParameterReference = (TypeParameterReference) other;
        return Intrinsics.e(this.container, typeParameterReference.container) && Intrinsics.e(getName(), typeParameterReference.getName());
    }

    @Override // kotlin.reflect.KTypeParameter
    public String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.KTypeParameter
    public List<KType> getUpperBounds() {
        List list = this.bounds;
        if (list != null) {
            return list;
        }
        List<KType> listE = CollectionsKt.e(Reflection.h(Object.class));
        this.bounds = listE;
        return listE;
    }

    public int hashCode() {
        Object obj = this.container;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.KTypeParameter
    /* renamed from: k, reason: from getter */
    public KVariance getVariance() {
        return this.variance;
    }

    public String toString() {
        return INSTANCE.a(this);
    }
}
