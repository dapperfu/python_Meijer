package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import Hk.Validation;
import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0005\u0007\u000b\f\r\u000eB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;", "T", "LZj/a;", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "a", "LHk/b;", "getValidation", "()LHk/b;", "e", "d", "b", "c", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$a;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$b;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$c;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$d;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class M<T> implements Zj.a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Validation<T> validation;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$a;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$a;", "e", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M$a, reason: from toString */
    public static final /* data */ class Date extends M<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public Date() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Date) && Intrinsics.e(this.validation, ((Date) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "Date(validation=" + this.validation + ')';
        }

        public /* synthetic */ Date(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f100134j6, new Object[0]);
            if (d().isEmpty()) {
                return null;
            }
            return abstractC5607aD;
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final Date e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new Date(validation);
        }

        public Date f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.a.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Date) this.receiver).c();
                }
            }, "date"), new Om.a(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.a.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Date) this.receiver).c();
                }
            }, "date")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Date(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$b;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$b;", "e", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M$b, reason: from toString */
    public static final /* data */ class StNumber extends M<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public StNumber() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StNumber) && Intrinsics.e(this.validation, ((StNumber) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "StNumber(validation=" + this.validation + ')';
        }

        public /* synthetic */ StNumber(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f100122id, new Object[0]);
            if (d().isEmpty()) {
                return null;
            }
            return abstractC5607aD;
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final StNumber e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new StNumber(validation);
        }

        public StNumber f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.b.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((StNumber) this.receiver).c();
                }
            }, "stNumber"), new Om.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.b.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((StNumber) this.receiver).c();
                }
            }, "stNumber")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StNumber(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$c;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$c;", "e", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M$c, reason: from toString */
    public static final /* data */ class Time extends M<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public Time() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Time) && Intrinsics.e(this.validation, ((Time) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "Time(validation=" + this.validation + ')';
        }

        public /* synthetic */ Time(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f100154k6, new Object[0]);
            if (d().isEmpty()) {
                return null;
            }
            return abstractC5607aD;
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final Time e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new Time(validation);
        }

        public Time f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.c.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Time) this.receiver).c();
                }
            }, "time"), new Om.c(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.c.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Time) this.receiver).c();
                }
            }, "time")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Time(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$d;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$d;", "e", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M$d, reason: from toString */
    public static final /* data */ class TmNumber extends M<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public TmNumber() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TmNumber) && Intrinsics.e(this.validation, ((TmNumber) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "TmNumber(validation=" + this.validation + ')';
        }

        public /* synthetic */ TmNumber(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f100161kd, new Object[0]);
            if (d().isEmpty()) {
                return null;
            }
            return abstractC5607aD;
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final TmNumber e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new TmNumber(validation);
        }

        public TmNumber f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.d.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((TmNumber) this.receiver).c();
                }
            }, "tmNumber"), new Om.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.d.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((TmNumber) this.receiver).c();
                }
            }, "tmNumber")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TmNumber(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$e;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$e;", "e", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M$e, reason: from toString */
    public static final /* data */ class TxNumber extends M<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public TxNumber() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TxNumber) && Intrinsics.e(this.validation, ((TxNumber) other).validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "TxNumber(validation=" + this.validation + ')';
        }

        public /* synthetic */ TxNumber(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Y.f100181ld, new Object[0]);
            if (d().isEmpty()) {
                return null;
            }
            return abstractC5607aD;
        }

        @Override // Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final TxNumber e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new TxNumber(validation);
        }

        public TxNumber f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.e.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((TxNumber) this.receiver).c();
                }
            }, "txNumber"), new Om.e(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M.e.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((TxNumber) this.receiver).c();
                }
            }, "txNumber")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TxNumber(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    public /* synthetic */ M(Validation validation, DefaultConstructorMarker defaultConstructorMarker) {
        this(validation);
    }

    private M(Validation<T> validation) {
        this.validation = validation;
    }
}
