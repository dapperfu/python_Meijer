package Ik;

import Hk.Validation;
import Hk.c;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;
import sk.C16981a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0010*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0012B%\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LIk/m;", "", "T", "LIk/k;", "Lkotlin/reflect/KProperty0;", "LHk/b;", "field", "fieldName", "<init>", "(Lkotlin/reflect/KProperty0;Ljava/lang/String;)V", "", "LHk/c;", "d", "()Ljava/util/List;", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "a", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class m<T extends String> extends k<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final List<Pattern> f14101h = CollectionsKt.p(C16981a.CANADIAN_POSTAL_CODE_RAW_REGEX, C16981a.US_ZIP_CODE_BASIC_RAW_REGEX, C16981a.f160555a.e());

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fieldName;

    public /* synthetic */ m(KProperty0 kProperty0, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kProperty0, (i10 & 2) != 0 ? kProperty0.getName() : str);
    }

    @Override // Ik.k
    public List<Hk.c> d() {
        List<Pattern> list = f14101h;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Pattern pattern : list) {
                T tI = i();
                if (tI == null) {
                    tI = "";
                }
                if (pattern.matcher(tI).matches()) {
                    return CollectionsKt.m();
                }
            }
        }
        return CollectionsKt.e(new c.Invalid(getFieldName(), null, "format not supported", 2, null));
    }

    @Override // Ik.k
    /* renamed from: g, reason: from getter */
    public String getFieldName() {
        return this.fieldName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(KProperty0<Validation<T>> field, String fieldName) {
        super(field, null, 2, 0 == true ? 1 : 0);
        Intrinsics.j(field, "field");
        Intrinsics.j(fieldName, "fieldName");
        this.fieldName = fieldName;
    }
}
