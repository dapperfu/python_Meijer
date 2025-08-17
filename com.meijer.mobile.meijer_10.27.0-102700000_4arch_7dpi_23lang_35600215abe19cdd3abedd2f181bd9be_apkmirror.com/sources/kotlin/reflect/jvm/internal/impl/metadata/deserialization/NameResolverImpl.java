package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.medallia.digital.mobilesdk.q2;
import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes13.dex */
public final class NameResolverImpl implements NameResolver {

    /* renamed from: a, reason: collision with root package name */
    private final ProtoBuf.StringTable f145547a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.QualifiedNameTable f145548b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameResolverImpl(ProtoBuf.StringTable strings, ProtoBuf.QualifiedNameTable qualifiedNames) {
        Intrinsics.j(strings, "strings");
        Intrinsics.j(qualifiedNames, "qualifiedNames");
        this.f145547a = strings;
        this.f145548b = qualifiedNames;
    }

    private final Triple<List<String>, List<String>, Boolean> c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedNameV = this.f145548b.v(i10);
            String strV = this.f145547a.v(qualifiedNameV.A());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kindY = qualifiedNameV.y();
            Intrinsics.g(kindY);
            int i11 = WhenMappings.$EnumSwitchMapping$0[kindY.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(strV);
            } else if (i11 == 2) {
                linkedList.addFirst(strV);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(strV);
                z10 = true;
            }
            i10 = qualifiedNameV.z();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i10) {
        String strV = this.f145547a.v(i10);
        Intrinsics.i(strV, "getString(...)");
        return strV;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean a(int i10) {
        return c(i10).f().booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String b(int i10) {
        Triple<List<String>, List<String>, Boolean> tripleC = c(i10);
        List<String> listA = tripleC.a();
        String strB0 = CollectionsKt.B0(tripleC.b(), ".", null, null, 0, null, null, 62, null);
        if (listA.isEmpty()) {
            return strB0;
        }
        return CollectionsKt.B0(listA, q2.f92724c, null, null, 0, null, null, 62, null) + '/' + strB0;
    }
}
