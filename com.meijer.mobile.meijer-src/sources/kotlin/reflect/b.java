package kotlin.reflect;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lkotlin/reflect/b;", "Ljava/lang/reflect/ParameterizedType;", "", "Ljava/lang/Class;", "rawType", "Ljava/lang/reflect/Type;", "ownerType", "", "typeArguments", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "getRawType", "()Ljava/lang/reflect/Type;", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "Ljava/lang/Class;", "b", "Ljava/lang/reflect/Type;", "c", "[Ljava/lang/reflect/Type;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalStdlibApi
@SourceDebugExtension
/* loaded from: classes14.dex */
final class b implements ParameterizedType, Type {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> rawType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Type ownerType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Type[] typeArguments;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Type, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f143878b = new a();

        a() {
            super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p02) {
            Intrinsics.j(p02, "p0");
            return TypesJVMKt.h(p02);
        }
    }

    public b(Class<?> rawType, Type type, List<? extends Type> typeArguments) {
        Intrinsics.j(rawType, "rawType");
        Intrinsics.j(typeArguments, "typeArguments");
        this.rawType = rawType;
        this.ownerType = type;
        this.typeArguments = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object other) {
        if (!(other instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) other;
        return Intrinsics.e(this.rawType, parameterizedType.getRawType()) && Intrinsics.e(this.ownerType, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.typeArguments;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.rawType;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Type type = this.ownerType;
        if (type != null) {
            sb2.append(TypesJVMKt.h(type));
            sb2.append("$");
            sb2.append(this.rawType.getSimpleName());
        } else {
            sb2.append(TypesJVMKt.h(this.rawType));
        }
        Type[] typeArr = this.typeArguments;
        if (!(typeArr.length == 0)) {
            ArraysKt___ArraysKt.x0(typeArr, sb2, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.f143878b);
        }
        return sb2.toString();
    }

    public int hashCode() {
        int iHashCode = this.rawType.hashCode();
        Type type = this.ownerType;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
