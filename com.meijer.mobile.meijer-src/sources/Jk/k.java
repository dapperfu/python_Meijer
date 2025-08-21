package Jk;

import Ik.Validation;
import Ik.c;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001b\u0010\u001f\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LJk/k;", "T", "", "Lkotlin/reflect/KProperty0;", "LIk/b;", "field", "", "fieldName", "<init>", "(Lkotlin/reflect/KProperty0;Ljava/lang/String;)V", "j", "()LIk/b;", "", "LIk/c;", "d", "()Ljava/util/List;", "a", "Lkotlin/reflect/KProperty0;", "b", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "c", "Lkotlin/Lazy;", "h", "validation", "f", "errors", "e", "i", "()Ljava/lang/Object;", "value", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class k<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KProperty0<Validation<T>> field;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String fieldName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy validation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy errors;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy value;

    public k(KProperty0<Validation<T>> field, String fieldName) {
        Intrinsics.j(field, "field");
        Intrinsics.j(fieldName, "fieldName");
        this.field = field;
        this.fieldName = fieldName;
        this.validation = LazyKt.b(new Function0() { // from class: Jk.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.k(this.f15923a);
            }
        });
        this.errors = LazyKt.b(new Function0() { // from class: Jk.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.e(this.f15924a);
            }
        });
        this.value = LazyKt.b(new Function0() { // from class: Jk.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.l(this.f15925a);
            }
        });
    }

    public abstract List<Ik.c> d();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Validation k(k kVar) {
        return kVar.field.get();
    }

    public final List<Ik.c> f() {
        return (List) this.errors.getValue();
    }

    /* renamed from: g, reason: from getter */
    public String getFieldName() {
        return this.fieldName;
    }

    public final Validation<T> h() {
        return (Validation) this.validation.getValue();
    }

    public final T i() {
        return (T) this.value.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(k kVar) {
        return kVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(k kVar) {
        return kVar.h().e();
    }

    public final Validation<T> j() {
        if (f().isEmpty()) {
            return h().h();
        }
        List<Ik.c> listF = f();
        if (!(listF instanceof Collection) || !listF.isEmpty()) {
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                if (((Ik.c) it.next()) instanceof c.Pending) {
                    return h().g();
                }
            }
        }
        Validation<T> bVarH = h();
        Ik.c[] cVarArr = (Ik.c[]) f().toArray(new Ik.c[0]);
        return bVarH.l((Ik.c[]) Arrays.copyOf(cVarArr, cVarArr.length));
    }

    public /* synthetic */ k(KProperty0 kProperty0, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kProperty0, (i10 & 2) != 0 ? kProperty0.getName() : str);
    }
}
