package ai;

import Gh.h;
import Ik.Validation;
import Ik.c;
import ak.InterfaceC5697a;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0007\u000bB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lai/d;", "T", "Lak/a;", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "a", "LIk/b;", "c", "()LIk/b;", "b", "Lai/d$a;", "Lai/d$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ai.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5694d<T> implements InterfaceC5697a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Validation<T> validation;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lai/d$a;", "Lai/d;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()Lai/d$a;", "e", "(LIk/b;)Lai/d$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.d$a, reason: from toString */
    public static final /* data */ class CurrentPin extends AbstractC5694d<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public CurrentPin() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CurrentPin) && Intrinsics.e(this.validation, ((CurrentPin) other).validation);
        }

        public /* synthetic */ CurrentPin(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ai.AbstractC5694d, ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final CurrentPin e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new CurrentPin(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "CurrentPin(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            Ik.c cVar = (Ik.c) CollectionsKt.u0(d());
            if (cVar instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f13013x5, new Object[0]);
            }
            if (cVar instanceof c.Invalid) {
                return AbstractC6392a.INSTANCE.d(h.f13013x5, new Object[0]);
            }
            return super.b();
        }

        public CurrentPin f() {
            return e(c().j(new Jk.d(new PropertyReference0Impl(this) { // from class: ai.d.a.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((CurrentPin) this.receiver).c();
                }
            }, "currentPin"), new Jk.c(new PropertyReference0Impl(this) { // from class: ai.d.a.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((CurrentPin) this.receiver).c();
                }
            }, "currentPin")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrentPin(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lai/d$b;", "Lai/d;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()Lai/d$b;", "e", "(LIk/b;)Lai/d$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.d$b, reason: from toString */
    public static final /* data */ class NewPin extends AbstractC5694d<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public NewPin() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewPin) && Intrinsics.e(this.validation, ((NewPin) other).validation);
        }

        public /* synthetic */ NewPin(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ai.AbstractC5694d, ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final NewPin e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new NewPin(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "NewPin(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            Ik.c cVar = (Ik.c) CollectionsKt.u0(d());
            if (cVar instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f13013x5, new Object[0]);
            }
            if (cVar instanceof c.Invalid) {
                return AbstractC6392a.INSTANCE.d(h.f13013x5, new Object[0]);
            }
            return super.b();
        }

        public NewPin f() {
            return e(c().j(new Jk.d(new PropertyReference0Impl(this) { // from class: ai.d.b.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((NewPin) this.receiver).c();
                }
            }, "newPin"), new Jk.c(new PropertyReference0Impl(this) { // from class: ai.d.b.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((NewPin) this.receiver).c();
                }
            }, "newPin")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewPin(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    public /* synthetic */ AbstractC5694d(Validation validation, DefaultConstructorMarker defaultConstructorMarker) {
        this(validation);
    }

    private AbstractC5694d(Validation<T> validation) {
        this.validation = validation;
    }

    @Override // ak.InterfaceC5697a
    public Validation<T> c() {
        return this.validation;
    }
}
