package Ik;

import Hk.Validation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012#\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "Lkotlin/reflect/KProperty0;", "LHk/b;", "field", "Lkotlin/Function1;", "LIk/k;", "", "LHk/c;", "Lkotlin/ExtensionFunctionType;", "errorProvider", "b", "(Lkotlin/reflect/KProperty0;Lkotlin/jvm/functions/Function1;)LIk/k;", "original", "a", "(Ljava/util/List;LHk/b;)LHk/b;", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ik/l$a", "LIk/k;", "", "LHk/c;", "d", "()Ljava/util/List;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends k<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<k<T>, List<Hk.c>> f14099f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(KProperty0<Validation<T>> kProperty0, Function1<? super k<T>, ? extends List<? extends Hk.c>> function1) {
            super(kProperty0, null, 2, 0 == true ? 1 : 0);
            this.f14099f = function1;
        }

        @Override // Ik.k
        public List<Hk.c> d() {
            return this.f14099f.invoke(this);
        }
    }

    public static final <T> Validation<T> a(List<? extends k<T>> list, Validation<T> original) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(original, "original");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            k kVar = (k) it.next();
            Validation<T> validationJ = kVar != null ? kVar.j() : null;
            if (validationJ != null) {
                arrayList.add(validationJ);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator<T> it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            T next = it2.next();
            while (it2.hasNext()) {
                next = (T) next.i((Validation) it2.next());
            }
            Validation<T> validation = next;
            if (validation != null) {
                return validation;
            }
        }
        return original.h();
    }

    public static final <T> k<T> b(KProperty0<Validation<T>> field, Function1<? super k<T>, ? extends List<? extends Hk.c>> errorProvider) {
        Intrinsics.j(field, "field");
        Intrinsics.j(errorProvider, "errorProvider");
        return new a(field, errorProvider);
    }
}
