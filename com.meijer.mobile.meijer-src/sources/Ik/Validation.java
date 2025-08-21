package Ik;

import Ik.d;
import Jk.k;
import Jk.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\r\"\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\u0017\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00160\r\"\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\"2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u00103\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"LIk/b;", "T", "", "value", "LIk/d;", "result", "<init>", "(Ljava/lang/Object;LIk/d;)V", "", "LIk/c;", "validationErrors", "k", "(Ljava/util/List;)LIk/b;", "", "l", "([LIk/c;)LIk/b;", "h", "()LIk/b;", "g", "other", "i", "(LIk/b;)LIk/b;", "LJk/k;", "validators", "j", "([LJk/k;)LIk/b;", "a", "(Ljava/lang/Object;LIk/d;)LIk/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "b", "LIk/d;", "d", "()LIk/d;", "c", "Ljava/util/List;", "()Ljava/util/List;", "errors", "Z", "f", "()Z", "isValid", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ik.b, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class Validation<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d result;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<c> errors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isValid;

    public Validation(T t10, d result) {
        Intrinsics.j(result, "result");
        this.value = t10;
        this.result = result;
        this.errors = result.a();
        this.isValid = result.a().isEmpty();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Validation)) {
            return false;
        }
        Validation validation = (Validation) other;
        return Intrinsics.e(this.value, validation.value) && Intrinsics.e(this.result, validation.result);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Validation b(Validation validation, Object obj, d dVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = validation.value;
        }
        if ((i10 & 2) != 0) {
            dVar = validation.result;
        }
        return validation.a(obj, dVar);
    }

    public final Validation<T> a(T value, d result) {
        Intrinsics.j(result, "result");
        return new Validation<>(value, result);
    }

    public final List<c> c() {
        return this.errors;
    }

    /* renamed from: d, reason: from getter */
    public final d getResult() {
        return this.result;
    }

    public final T e() {
        return this.value;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public final Validation<T> g() {
        return b(this, null, d.b.f14846b, 1, null);
    }

    public final Validation<T> h() {
        return b(this, null, d.c.f14847b, 1, null);
    }

    public int hashCode() {
        T t10 = this.value;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.result.hashCode();
    }

    public final Validation<T> i(Validation<T> other) {
        Intrinsics.j(other, "other");
        return b(this, null, this.result.b(other.result), 1, null);
    }

    public final Validation<T> j(k<T>... validators) {
        Intrinsics.j(validators, "validators");
        return l.a(ArraysKt.h1(validators), this);
    }

    public final Validation<T> k(List<? extends c> validationErrors) {
        Intrinsics.j(validationErrors, "validationErrors");
        if (validationErrors.isEmpty()) {
            return this;
        }
        d dVar = this.result;
        return dVar instanceof d.Failures ? b(this, null, ((d.Failures) dVar).c(CollectionsKt.i0(CollectionsKt.P0(((d.Failures) dVar).a(), validationErrors))), 1, null) : b(this, null, new d.Failures(validationErrors), 1, null);
    }

    public final Validation<T> l(c... validationErrors) {
        Intrinsics.j(validationErrors, "validationErrors");
        return k(ArraysKt.h1(validationErrors));
    }

    public String toString() {
        return "Validation(value=" + this.value + ", result=" + this.result + ')';
    }

    public /* synthetic */ Validation(Object obj, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? d.b.f14846b : dVar);
    }
}
