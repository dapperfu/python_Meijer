package mq;

import Xp.ShopAndScanTrip;
import android.content.Context;
import android.content.Intent;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import dq.C13709b;
import eq.Asset;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mq.y;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import rq.C16935a;
import wj.C17896a;
import xq.C18213d;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0003)'%B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R#\u00106\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lmq/y;", "Landroidx/lifecycle/c0;", "Lxq/d;", "navigationManager", "LWp/a;", "repository", "Lrq/a;", "meijerFeedback", "LDl/e;", "meijerIntent", "Ldq/b;", "cancelTripUseCase", "<init>", "(Lxq/d;LWp/a;Lrq/a;LDl/e;Ldq/b;)V", "", "B", "()V", "F", "C", "H", "J", "v", "u", "Lmv/C0;", "E", "()Lmv/C0;", "I", "L", "Lmq/y$b;", "event", "A", "(Lmq/y$b;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "x", "(Landroid/content/Context;)Landroid/content/Intent;", "a", "Lxq/d;", "b", "LWp/a;", "c", "Lrq/a;", "d", "LDl/e;", "e", "Ldq/b;", "Lwj/a;", "Lmq/y$c;", "Lmq/y$a;", "f", "Lwj/a;", "y", "()Lwj/a;", "modelStore", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18213d navigationManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Wp.a repository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C16935a meijerFeedback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Dl.e meijerIntent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C13709b cancelTripUseCase;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C17896a<ViewState, a> modelStore;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lmq/y$a;", "", "<init>", "()V", "a", "Lmq/y$a$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$a$a;", "Lmq/y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mq.y$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2332a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2332a f151434a = new C2332a();

            private C2332a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2332a);
            }

            public String toString() {
                return "NavigateToMMA";
            }

            public int hashCode() {
                return 285497799;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lmq/y$b;", "", "<init>", "()V", "c", "e", "d", "f", "g", "i", "h", "b", "a", "Lmq/y$b$a;", "Lmq/y$b$b;", "Lmq/y$b$c;", "Lmq/y$b$d;", "Lmq/y$b$e;", "Lmq/y$b$f;", "Lmq/y$b$g;", "Lmq/y$b$h;", "Lmq/y$b$i;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$b$a;", "Lmq/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f151435a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "CancelTrip";
            }

            public int hashCode() {
                return -1705659038;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$b$b;", "Lmq/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mq.y$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2333b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C2333b f151436a = new C2333b();

            private C2333b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2333b);
            }

            public String toString() {
                return "DismissCancelTripDialog";
            }

            public int hashCode() {
                return -2052317234;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$b$c;", "Lmq/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f151437a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "NavigateBack";
            }

            public int hashCode() {
                return -1946817317;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$b$d;", "Lmq/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f151438a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "NavigateToFAQ";
            }

            public int hashCode() {
                return -204783321;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$b$e;", "Lmq/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f151439a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "NavigateToOptionsMenu";
            }

            public int hashCode() {
                return -1750750674;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$b$f;", "Lmq/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final f f151440a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "NavigateToStoreSelection";
            }

            public int hashCode() {
                return 965543674;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$b$g;", "Lmq/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final g f151441a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public String toString() {
                return "NavigateToSupport";
            }

            public int hashCode() {
                return -1229010592;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$b$h;", "Lmq/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final h f151442a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public String toString() {
                return "OpenCancelTripDialog";
            }

            public int hashCode() {
                return -1206207948;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmq/y$b$i;", "Lmq/y$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final i f151443a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public String toString() {
                return "OpenProvideFeedbackForm";
            }

            public int hashCode() {
                return -1479341635;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"Lmq/y$c;", "", "Lbk/a;", "appBarTitle", "Leq/f;", "navigationIcon", "", "showDeveloperOptions", "displayCancelTripDialog", "displayCancelTripLoading", "<init>", "(Lbk/a;Leq/f;ZZZ)V", "a", "(Lbk/a;Leq/f;ZZZ)Lmq/y$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lbk/a;", "c", "()Lbk/a;", "b", "Leq/f;", "f", "()Leq/f;", "Z", "g", "()Z", "d", "e", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mq.y$c, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: f, reason: collision with root package name */
        public static final int f151444f = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a appBarTitle;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Asset navigationIcon;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showDeveloperOptions;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean displayCancelTripDialog;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean displayCancelTripLoading;

        public ViewState() {
            this(null, null, false, false, false, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.appBarTitle, viewState.appBarTitle) && Intrinsics.e(this.navigationIcon, viewState.navigationIcon) && this.showDeveloperOptions == viewState.showDeveloperOptions && this.displayCancelTripDialog == viewState.displayCancelTripDialog && this.displayCancelTripLoading == viewState.displayCancelTripLoading;
        }

        public ViewState(AbstractC6392a appBarTitle, Asset navigationIcon, boolean z10, boolean z11, boolean z12) {
            Intrinsics.j(appBarTitle, "appBarTitle");
            Intrinsics.j(navigationIcon, "navigationIcon");
            this.appBarTitle = appBarTitle;
            this.navigationIcon = navigationIcon;
            this.showDeveloperOptions = z10;
            this.displayCancelTripDialog = z11;
            this.displayCancelTripLoading = z12;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, AbstractC6392a abstractC6392a, Asset asset, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                abstractC6392a = viewState.appBarTitle;
            }
            if ((i10 & 2) != 0) {
                asset = viewState.navigationIcon;
            }
            if ((i10 & 4) != 0) {
                z10 = viewState.showDeveloperOptions;
            }
            if ((i10 & 8) != 0) {
                z11 = viewState.displayCancelTripDialog;
            }
            if ((i10 & 16) != 0) {
                z12 = viewState.displayCancelTripLoading;
            }
            boolean z13 = z12;
            boolean z14 = z10;
            return viewState.a(abstractC6392a, asset, z14, z11, z13);
        }

        public final ViewState a(AbstractC6392a appBarTitle, Asset navigationIcon, boolean showDeveloperOptions, boolean displayCancelTripDialog, boolean displayCancelTripLoading) {
            Intrinsics.j(appBarTitle, "appBarTitle");
            Intrinsics.j(navigationIcon, "navigationIcon");
            return new ViewState(appBarTitle, navigationIcon, showDeveloperOptions, displayCancelTripDialog, displayCancelTripLoading);
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC6392a getAppBarTitle() {
            return this.appBarTitle;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getDisplayCancelTripDialog() {
            return this.displayCancelTripDialog;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getDisplayCancelTripLoading() {
            return this.displayCancelTripLoading;
        }

        /* renamed from: f, reason: from getter */
        public final Asset getNavigationIcon() {
            return this.navigationIcon;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getShowDeveloperOptions() {
            return this.showDeveloperOptions;
        }

        public int hashCode() {
            return (((((((this.appBarTitle.hashCode() * 31) + this.navigationIcon.hashCode()) * 31) + Boolean.hashCode(this.showDeveloperOptions)) * 31) + Boolean.hashCode(this.displayCancelTripDialog)) * 31) + Boolean.hashCode(this.displayCancelTripLoading);
        }

        public String toString() {
            return "ViewState(appBarTitle=" + this.appBarTitle + ", navigationIcon=" + this.navigationIcon + ", showDeveloperOptions=" + this.showDeveloperOptions + ", displayCancelTripDialog=" + this.displayCancelTripDialog + ", displayCancelTripLoading=" + this.displayCancelTripLoading + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ViewState(bk.AbstractC6392a r3, eq.Asset r4, boolean r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r2 = this;
                r9 = r8 & 1
                r0 = 0
                if (r9 == 0) goto Lf
                bk.a$a r3 = bk.AbstractC6392a.INSTANCE
                int r9 = com.meijer.mobile.shopandscan.e.f117931k1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                bk.a r3 = r3.d(r9, r1)
            Lf:
                r9 = r8 & 2
                if (r9 == 0) goto L1c
                eq.f r4 = new eq.f
                int r9 = Cj.i.f4810n0
                int r1 = com.meijer.mobile.shopandscan.e.f117937m1
                r4.<init>(r9, r1)
            L1c:
                r9 = r8 & 4
                if (r9 == 0) goto L21
                r5 = r0
            L21:
                r9 = r8 & 8
                if (r9 == 0) goto L26
                r6 = r0
            L26:
                r8 = r8 & 16
                if (r8 == 0) goto L31
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L37
            L31:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L37:
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mq.y.ViewState.<init>(bk.a, eq.f, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.options.ShopAndScanOptionsMenuViewModel$cancelTrip$1", f = "ShopAndScanOptionsMenuViewModel.kt", l = {130}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151450a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.options.ShopAndScanOptionsMenuViewModel$cancelTrip$1$1", f = "ShopAndScanOptionsMenuViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super Result<? extends Unit>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f151452a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f151453b;

            /* JADX INFO: Access modifiers changed from: private */
            public static final ViewState k(ViewState viewState) {
                return ViewState.b(viewState, null, null, false, false, true, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f151453b = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f151453b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<Unit>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f151452a == 0) {
                    ResultKt.b(obj);
                    this.f151453b.y().d(new Function1() { // from class: mq.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return y.d.a.k((y.ViewState) obj2);
                        }
                    });
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lkotlin/Result;", "", "", "it", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.options.ShopAndScanOptionsMenuViewModel$cancelTrip$1$2", f = "ShopAndScanOptionsMenuViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function3<InterfaceC16562g<? super Result<? extends Unit>>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f151454a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f151455b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y yVar, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f151455b = yVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ViewState k(ViewState viewState) {
                return ViewState.b(viewState, null, null, false, false, false, 15, null);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super Result<Unit>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
                return new b(this.f151455b, continuation).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f151454a == 0) {
                    ResultKt.b(obj);
                    this.f151455b.y().d(new Function1() { // from class: mq.A
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return y.d.b.k((y.ViewState) obj2);
                        }
                    });
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f151456a;

            c(y yVar) {
                this.f151456a = yVar;
            }

            @Override // pv.InterfaceC16562g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                this.f151456a.E();
                return Unit.f143329a;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f151450a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fN = C16563h.N(C16563h.P(y.this.cancelTripUseCase.b(), new a(y.this, null)), new b(y.this, null));
                c cVar = new c(y.this);
                this.f151450a = 1;
                if (interfaceC16561fN.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.options.ShopAndScanOptionsMenuViewModel$navigateToMMA$1", f = "ShopAndScanOptionsMenuViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151457a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f151457a == 0) {
                ResultKt.b(obj);
                y.this.y().c(a.C2332a.f151434a);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.options.ShopAndScanOptionsMenuViewModel$openProvideFeedbackForm$1", f = "ShopAndScanOptionsMenuViewModel.kt", l = {145}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151459a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f151461a;

            a(y yVar) {
                this.f151461a = yVar;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ShopAndScanTrip shopAndScanTrip, Continuation<? super Unit> continuation) {
                ShopAndScanTrip.StoreDetails storeDetails;
                String storeName;
                if (shopAndScanTrip != null && (storeDetails = shopAndScanTrip.getStoreDetails()) != null && (storeName = storeDetails.getStoreName()) != null) {
                    this.f151461a.meijerFeedback.a(storeName);
                }
                return Unit.f143329a;
            }
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f151459a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16553F<ShopAndScanTrip> interfaceC16553FA = y.this.repository.a();
                a aVar = new a(y.this);
                this.f151459a = 1;
                if (interfaceC16553FA.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    public y(C18213d navigationManager, Wp.a repository, C16935a meijerFeedback, Dl.e meijerIntent, C13709b cancelTripUseCase) {
        Intrinsics.j(navigationManager, "navigationManager");
        Intrinsics.j(repository, "repository");
        Intrinsics.j(meijerFeedback, "meijerFeedback");
        Intrinsics.j(meijerIntent, "meijerIntent");
        Intrinsics.j(cancelTripUseCase, "cancelTripUseCase");
        this.navigationManager = navigationManager;
        this.repository = repository;
        this.meijerFeedback = meijerFeedback;
        this.meijerIntent = meijerIntent;
        this.cancelTripUseCase = cancelTripUseCase;
        this.modelStore = new C17896a<>(new ViewState(null, null, false, false, false, 31, null));
    }

    private final void B() {
        this.navigationManager.b(C18213d.a.i.f170950b);
    }

    private final void C() {
        this.modelStore.d(new Function1() { // from class: mq.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.D((y.ViewState) obj);
            }
        });
        this.navigationManager.b(C18213d.a.C2749d.f170945b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState D(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117879Q, new Object[0]), null, false, false, false, 30, null);
    }

    private final void F() {
        this.modelStore.d(new Function1() { // from class: mq.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.G((y.ViewState) obj);
            }
        });
        this.navigationManager.b(C18213d.a.h.f170949b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState G(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117931k1, new Object[0]), null, false, false, false, 30, null);
    }

    private final void H() {
        this.navigationManager.b(C18213d.a.k.f170952b);
    }

    private final void I() {
        this.navigationManager.b(C18213d.a.l.f170953b);
    }

    private final void J() {
        this.modelStore.d(new Function1() { // from class: mq.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.K((y.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState K(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, null, null, false, true, false, 23, null);
    }

    private final void v() {
        this.modelStore.d(new Function1() { // from class: mq.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.w((y.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState w(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, null, null, false, false, false, 23, null);
    }

    public final void A(b event) {
        Intrinsics.j(event, "event");
        if (event instanceof b.c) {
            B();
            return;
        }
        if (event instanceof b.e) {
            F();
            return;
        }
        if (event instanceof b.d) {
            C();
            return;
        }
        if (event instanceof b.f) {
            H();
            return;
        }
        if (event instanceof b.g) {
            I();
            return;
        }
        if (event instanceof b.i) {
            L();
            return;
        }
        if (event instanceof b.h) {
            J();
        } else if (event instanceof b.C2333b) {
            v();
        } else {
            if (!(event instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            u();
        }
    }

    public final Intent x(Context context) {
        Intrinsics.j(context, "context");
        return this.meijerIntent.p(context, false);
    }

    public final C17896a<ViewState, a> y() {
        return this.modelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 E() {
        return C15809k.d(d0.a(this), null, null, new e(null), 3, null);
    }

    private final C0 L() {
        return C15809k.d(d0.a(this), null, null, new f(null), 3, null);
    }

    private final void u() {
        C15809k.d(d0.a(this), null, null, new d(null), 3, null);
    }
}
