package Om;

import Hk.Validation;
import Hk.c;
import Ik.k;
import java.lang.String;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty0;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0010*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0012B%\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LOm/b;", "", "T", "LIk/k;", "Lkotlin/reflect/KProperty0;", "LHk/b;", "field", "fieldName", "<init>", "(Lkotlin/reflect/KProperty0;Ljava/lang/String;)V", "", "LHk/c;", "d", "()Ljava/util/List;", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b<T extends String> extends k<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f24085h = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fieldName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(KProperty0<Validation<T>> field, String fieldName) {
        super(field, null, 2, 0 == true ? 1 : 0);
        Intrinsics.j(field, "field");
        Intrinsics.j(fieldName, "fieldName");
        this.fieldName = fieldName;
    }

    @Override // Ik.k
    /* renamed from: g, reason: from getter */
    public String getFieldName() {
        return this.fieldName;
    }

    @Override // Ik.k
    public List<Hk.c> d() {
        T tI;
        T tI2;
        Integer numV;
        T tI3 = i();
        if ((tI3 != null && tI3.length() == 2) || (((tI = i()) != null && tI.length() == 3) || ((tI2 = i()) != null && tI2.length() == 5))) {
            IntRange intRange = new IntRange(1, 99999);
            T tI4 = i();
            if (tI4 != null) {
                numV = StringsKt.v(tI4);
            } else {
                numV = null;
            }
            if (numV != null && intRange.p(numV.intValue())) {
                return CollectionsKt.m();
            }
        }
        return CollectionsKt.e(new c.Invalid(getFieldName(), null, "format not supported", 2, null));
    }
}
