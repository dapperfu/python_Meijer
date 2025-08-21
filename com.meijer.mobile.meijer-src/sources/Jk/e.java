package Jk;

import Ik.Validation;
import Ik.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LJk/e;", "T", "LJk/k;", "Lkotlin/reflect/KProperty0;", "LIk/b;", "field", "", "fieldName", "<init>", "(Lkotlin/reflect/KProperty0;Ljava/lang/String;)V", "", "LIk/c;", "d", "()Ljava/util/List;", "f", "Lkotlin/reflect/KProperty0;", "g", "Ljava/lang/String;", "()Ljava/lang/String;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e<T> extends k<T> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final KProperty0<Validation<T>> field;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String fieldName;

    public /* synthetic */ e(KProperty0 kProperty0, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kProperty0, (i10 & 2) != 0 ? kProperty0.getName() : str);
    }

    @Override // Jk.k
    /* renamed from: g, reason: from getter */
    public String getFieldName() {
        return this.fieldName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(KProperty0<Validation<T>> field, String fieldName) {
        super(field, null, 2, null);
        Intrinsics.j(field, "field");
        Intrinsics.j(fieldName, "fieldName");
        this.field = field;
        this.fieldName = fieldName;
    }

    @Override // Jk.k
    public List<Ik.c> d() {
        List<Ik.c> listM;
        T tI = i();
        if (tI == null) {
            tI = null;
        }
        if (tI != null && (listM = CollectionsKt.m()) != null) {
            return listM;
        }
        return CollectionsKt.e(new c.Null(this.field.getName(), null, 2, null));
    }
}
