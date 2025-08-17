package com.meijer.mobile.accounts.ux.payments;

import Hk.Validation;
import Hk.c;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\b\u000b\f\u0007\r\u000e\u000f\u0010\u0011B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/j;", "T", "LZj/a;", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "a", "LHk/b;", "getValidation", "()LHk/b;", "e", "g", "b", "f", "h", "c", "d", "Lcom/meijer/mobile/accounts/ux/payments/j$a;", "Lcom/meijer/mobile/accounts/ux/payments/j$b;", "Lcom/meijer/mobile/accounts/ux/payments/j$c;", "Lcom/meijer/mobile/accounts/ux/payments/j$d;", "Lcom/meijer/mobile/accounts/ux/payments/j$e;", "Lcom/meijer/mobile/accounts/ux/payments/j$f;", "Lcom/meijer/mobile/accounts/ux/payments/j$g;", "Lcom/meijer/mobile/accounts/ux/payments/j$h;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class j<T> implements Zj.a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Validation<T> validation;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/j$a;", "Lcom/meijer/mobile/accounts/ux/payments/j;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "e", "()Lcom/meijer/mobile/accounts/ux/payments/j$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.j$a, reason: from toString */
    public static final /* data */ class Apartment extends j<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public Apartment() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Apartment e() {
            return this;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Apartment) && Intrinsics.e(this.validation, ((Apartment) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "Apartment(validation=" + this.validation + ')';
        }

        public /* synthetic */ Apartment(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Apartment(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/j$b;", "Lcom/meijer/mobile/accounts/ux/payments/j;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/accounts/ux/payments/j$b;", "e", "(LHk/b;)Lcom/meijer/mobile/accounts/ux/payments/j$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.j$b, reason: from toString */
    public static final /* data */ class City extends j<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public City() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof City) && Intrinsics.e(this.validation, ((City) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "City(validation=" + this.validation + ')';
        }

        public /* synthetic */ City(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final City e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new City(validation);
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            if (((Hk.c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(Fh.h.f10808v5, new Object[0]);
            }
            return super.b();
        }

        public City f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.accounts.ux.payments.j.b.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((City) this.receiver).c();
                }
            }, "city")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public City(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/j$c;", "Lcom/meijer/mobile/accounts/ux/payments/j;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/accounts/ux/payments/j$c;", "e", "(LHk/b;)Lcom/meijer/mobile/accounts/ux/payments/j$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.j$c, reason: from toString */
    public static final /* data */ class ExpirationMonth extends j<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public ExpirationMonth() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExpirationMonth) && Intrinsics.e(this.validation, ((ExpirationMonth) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "ExpirationMonth(validation=" + this.validation + ')';
        }

        public /* synthetic */ ExpirationMonth(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final ExpirationMonth e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new ExpirationMonth(validation);
        }

        public ExpirationMonth f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.accounts.ux.payments.j.c.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ExpirationMonth) this.receiver).c();
                }
            }, "expirationMonth")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpirationMonth(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/j$d;", "Lcom/meijer/mobile/accounts/ux/payments/j;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/accounts/ux/payments/j$d;", "e", "(LHk/b;)Lcom/meijer/mobile/accounts/ux/payments/j$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.j$d, reason: from toString */
    public static final /* data */ class ExpirationYear extends j<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public ExpirationYear() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExpirationYear) && Intrinsics.e(this.validation, ((ExpirationYear) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "ExpirationYear(validation=" + this.validation + ')';
        }

        public /* synthetic */ ExpirationYear(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final ExpirationYear e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new ExpirationYear(validation);
        }

        public ExpirationYear f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.accounts.ux.payments.j.d.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ExpirationYear) this.receiver).c();
                }
            }, "expirationYear")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpirationYear(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/j$e;", "Lcom/meijer/mobile/accounts/ux/payments/j;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/accounts/ux/payments/j$e;", "e", "(LHk/b;)Lcom/meijer/mobile/accounts/ux/payments/j$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.j$e, reason: from toString */
    public static final /* data */ class FullName extends j<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public FullName() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FullName) && Intrinsics.e(this.validation, ((FullName) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "FullName(validation=" + this.validation + ')';
        }

        public /* synthetic */ FullName(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final FullName e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new FullName(validation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FullName(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            if (((Hk.c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(Fh.h.f10816x, new Object[0]);
            }
            return super.b();
        }

        public FullName f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.accounts.ux.payments.j.e.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((FullName) this.receiver).c();
                }
            }, "fullName")));
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/j$f;", "Lcom/meijer/mobile/accounts/ux/payments/j;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/accounts/ux/payments/j$f;", "e", "(LHk/b;)Lcom/meijer/mobile/accounts/ux/payments/j$f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.j$f, reason: from toString */
    public static final /* data */ class State extends j<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof State) && Intrinsics.e(this.validation, ((State) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "State(validation=" + this.validation + ')';
        }

        public /* synthetic */ State(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final State e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new State(validation);
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            if (((Hk.c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(Fh.h.f10836z5, new Object[0]);
            }
            return super.b();
        }

        public State f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.accounts.ux.payments.j.f.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).c();
                }
            }, "state")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public State(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/j$g;", "Lcom/meijer/mobile/accounts/ux/payments/j;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/accounts/ux/payments/j$g;", "e", "(LHk/b;)Lcom/meijer/mobile/accounts/ux/payments/j$g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.j$g, reason: from toString */
    public static final /* data */ class StreetAddress extends j<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public StreetAddress() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StreetAddress) && Intrinsics.e(this.validation, ((StreetAddress) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "StreetAddress(validation=" + this.validation + ')';
        }

        public /* synthetic */ StreetAddress(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final StreetAddress e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new StreetAddress(validation);
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            if (((Hk.c) CollectionsKt.u0(d())) instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(Fh.h.f10479A5, new Object[0]);
            }
            return super.b();
        }

        public StreetAddress f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.accounts.ux.payments.j.g.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((StreetAddress) this.receiver).c();
                }
            }, "streetAddress")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StreetAddress(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/j$h;", "Lcom/meijer/mobile/accounts/ux/payments/j;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/accounts/ux/payments/j$h;", "e", "(LHk/b;)Lcom/meijer/mobile/accounts/ux/payments/j$h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.j$h, reason: from toString */
    public static final /* data */ class ZipCode extends j<String> {

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

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "ZipCode(validation=" + this.validation + ')';
        }

        public /* synthetic */ ZipCode(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final ZipCode e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new ZipCode(validation);
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            Hk.c cVar = (Hk.c) CollectionsKt.u0(d());
            if (cVar instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(Fh.h.f10486B5, new Object[0]);
            }
            if (cVar instanceof c.Invalid) {
                return AbstractC5607a.INSTANCE.d(Fh.h.f10486B5, new Object[0]);
            }
            return super.b();
        }

        public ZipCode f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.accounts.ux.payments.j.h.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ZipCode) this.receiver).c();
                }
            }, "zipCode"), new Ik.m(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.accounts.ux.payments.j.h.b
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

    public /* synthetic */ j(Validation validation, DefaultConstructorMarker defaultConstructorMarker) {
        this(validation);
    }

    private j(Validation<T> validation) {
        this.validation = validation;
    }
}
