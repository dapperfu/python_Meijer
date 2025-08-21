package ai;

import Gh.h;
import Ik.Validation;
import Ik.c;
import Jk.g;
import Jk.m;
import ak.InterfaceC5697a;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0007\u000b\t\u0007\f\r\u000e\u000fB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lai/c;", "T", "Lak/a;", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "a", "LIk/b;", "c", "()LIk/b;", "b", "e", "f", "d", "g", "Lai/c$a;", "Lai/c$b;", "Lai/c$c;", "Lai/c$d;", "Lai/c$e;", "Lai/c$f;", "Lai/c$g;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ai.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5693c<T> implements InterfaceC5697a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Validation<T> validation;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lai/c$a;", "Lai/c;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()Lai/c$a;", "e", "(LIk/b;)Lai/c$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.c$a, reason: from toString */
    public static final /* data */ class Email extends AbstractC5693c<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public Email() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Email) && Intrinsics.e(this.validation, ((Email) other).validation);
        }

        public /* synthetic */ Email(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ai.AbstractC5693c, ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final Email e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new Email(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "Email(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            Ik.c cVar = (Ik.c) CollectionsKt.u0(d());
            if (!(cVar instanceof c.Blank) && !(cVar instanceof c.Invalid)) {
                return super.b();
            }
            return AbstractC6392a.INSTANCE.d(h.f13006w5, new Object[0]);
        }

        public Email f() {
            return e(c().j(new Jk.d(new PropertyReference0Impl(this) { // from class: ai.c.a.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Email) this.receiver).c();
                }
            }, "email"), new Jk.b(new PropertyReference0Impl(this) { // from class: ai.c.a.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Email) this.receiver).c();
                }
            }, "email")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lai/c$b;", "Lai/c;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()Lai/c$b;", "e", "(LIk/b;)Lai/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.c$b, reason: from toString */
    public static final /* data */ class FirstName extends AbstractC5693c<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public FirstName() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FirstName) && Intrinsics.e(this.validation, ((FirstName) other).validation);
        }

        public /* synthetic */ FirstName(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ai.AbstractC5693c, ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final FirstName e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new FirstName(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "FirstName(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            if (((Ik.c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f12925l1, new Object[0]);
            }
            return super.b();
        }

        public FirstName f() {
            return e(c().j(new Jk.d(new PropertyReference0Impl(this) { // from class: ai.c.b.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((FirstName) this.receiver).c();
                }
            }, "firstName")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FirstName(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lai/c$c;", "Lai/c;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()Lai/c$c;", "e", "(LIk/b;)Lai/c$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.c$c, reason: collision with other inner class name and from toString */
    public static final /* data */ class LastName extends AbstractC5693c<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public LastName() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LastName) && Intrinsics.e(this.validation, ((LastName) other).validation);
        }

        public /* synthetic */ LastName(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ai.AbstractC5693c, ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final LastName e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new LastName(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "LastName(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            if (((Ik.c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f12785R1, new Object[0]);
            }
            return super.b();
        }

        public LastName f() {
            return e(c().j(new Jk.d(new PropertyReference0Impl(this) { // from class: ai.c.c.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((LastName) this.receiver).c();
                }
            }, "lastName")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LastName(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lai/c$d;", "Lai/c;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()Lai/c$d;", "e", "(LIk/b;)Lai/c$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.c$d, reason: from toString */
    public static final /* data */ class MPerksPin extends AbstractC5693c<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public MPerksPin() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MPerksPin) && Intrinsics.e(this.validation, ((MPerksPin) other).validation);
        }

        public /* synthetic */ MPerksPin(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ai.AbstractC5693c, ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final MPerksPin e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new MPerksPin(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "MPerksPin(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            Ik.c cVar = (Ik.c) CollectionsKt.u0(d());
            if (!(cVar instanceof c.Blank) && !(cVar instanceof c.Invalid)) {
                return super.b();
            }
            return AbstractC6392a.INSTANCE.d(h.f13013x5, new Object[0]);
        }

        public MPerksPin f() {
            return e(c().j(new Jk.d(new PropertyReference0Impl(this) { // from class: ai.c.d.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MPerksPin) this.receiver).c();
                }
            }, "mPerksPin"), new Jk.c(new PropertyReference0Impl(this) { // from class: ai.c.d.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MPerksPin) this.receiver).c();
                }
            }, "mPerksPin")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MPerksPin(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lai/c$e;", "Lai/c;", "", "LIk/b;", "validation", "password", "<init>", "(LIk/b;Ljava/lang/String;)V", "f", "()Lai/c$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Ljava/lang/String;", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.c$e, reason: from toString */
    public static final /* data */ class Password extends AbstractC5693c<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String password;

        /* JADX WARN: Multi-variable type inference failed */
        public Password() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Password)) {
                return false;
            }
            Password password = (Password) other;
            return Intrinsics.e(this.validation, password.validation) && Intrinsics.e(this.password, password.password);
        }

        public Password f() {
            return this;
        }

        public /* synthetic */ Password(Validation validation, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation, (i10 & 2) != 0 ? "" : str);
        }

        @Override // ai.AbstractC5693c, ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        /* renamed from: e, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public int hashCode() {
            return (this.validation.hashCode() * 31) + this.password.hashCode();
        }

        public String toString() {
            return "Password(validation=" + this.validation + ", password=" + this.password + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Password(Validation<String> validation, String password) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            Intrinsics.j(password, "password");
            this.validation = validation;
            this.password = password;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lai/c$f;", "Lai/c;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()Lai/c$f;", "e", "(LIk/b;)Lai/c$f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.c$f, reason: from toString */
    public static final /* data */ class PhoneNumber extends AbstractC5693c<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public PhoneNumber() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PhoneNumber) && Intrinsics.e(this.validation, ((PhoneNumber) other).validation);
        }

        public /* synthetic */ PhoneNumber(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ai.AbstractC5693c, ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final PhoneNumber e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new PhoneNumber(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "PhoneNumber(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            Ik.c cVar = (Ik.c) CollectionsKt.u0(d());
            if (cVar instanceof c.Blank) {
                return AbstractC6392a.INSTANCE.d(h.f13020y5, new Object[0]);
            }
            if (cVar instanceof c.Invalid) {
                return AbstractC6392a.INSTANCE.d(h.f13020y5, new Object[0]);
            }
            return super.b();
        }

        public PhoneNumber f() {
            return e(c().j(new Jk.d(new PropertyReference0Impl(this) { // from class: ai.c.f.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((PhoneNumber) this.receiver).c();
                }
            }, "phoneNumber"), new g(new PropertyReference0Impl(this) { // from class: ai.c.f.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((PhoneNumber) this.receiver).c();
                }
            }, "phoneNumber")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoneNumber(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lai/c$g;", "Lai/c;", "", "LIk/b;", "validation", "<init>", "(LIk/b;)V", "f", "()Lai/c$g;", "e", "(LIk/b;)Lai/c$g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LIk/b;", "c", "()LIk/b;", "Lbk/a;", "()Lbk/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ai.c$g, reason: from toString */
    public static final /* data */ class ZipCode extends AbstractC5693c<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public ZipCode() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ZipCode) && Intrinsics.e(this.validation, ((ZipCode) other).validation);
        }

        public /* synthetic */ ZipCode(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // ai.AbstractC5693c, ak.InterfaceC5697a
        public Validation<String> c() {
            return this.validation;
        }

        public final ZipCode e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new ZipCode(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "ZipCode(validation=" + this.validation + ')';
        }

        @Override // ak.InterfaceC5697a
        public AbstractC6392a b() {
            Ik.c cVar = (Ik.c) CollectionsKt.u0(d());
            if (!(cVar instanceof c.Blank) && !(cVar instanceof c.Invalid)) {
                return super.b();
            }
            return AbstractC6392a.INSTANCE.d(h.f12677B5, new Object[0]);
        }

        public ZipCode f() {
            return e(c().j(new Jk.d(new PropertyReference0Impl(this) { // from class: ai.c.g.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ZipCode) this.receiver).c();
                }
            }, "zipCode"), new m(new PropertyReference0Impl(this) { // from class: ai.c.g.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ZipCode) this.receiver).c();
                }
            }, "zipCode")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ZipCode(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    public /* synthetic */ AbstractC5693c(Validation validation, DefaultConstructorMarker defaultConstructorMarker) {
        this(validation);
    }

    private AbstractC5693c(Validation<T> validation) {
        this.validation = validation;
    }

    @Override // ak.InterfaceC5697a
    public Validation<T> c() {
        return this.validation;
    }
}
