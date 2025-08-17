package com.meijer.mobile.meijer.activity.digitalreceipts;

import Ji.C;
import Ji.LocalThemeScope;
import Lm.b;
import Nm.C4376g;
import Nm.E0;
import Nm.Q0;
import Nm.W0;
import Oj.a;
import Rm.A;
import V0.C5346q0;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13588d;
import e.C13589e;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import j0.InterfaceC14794C;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.AbstractC14653B;
import kotlin.C14675s;
import kotlin.C14677u;
import kotlin.C14680x;
import kotlin.C17921a1;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import r1.C16705m;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17144F;
import yl.AbstractC18227f;
import yr.c0;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 P2\u00020\u0001:\u0002QRB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\u0003R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006U²\u0006\f\u0010T\u001a\u00020S8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lg/a;", "result", "", "O1", "(Lg/a;)V", "LNm/Q0;", "screen", "h2", "(LNm/Q0;)V", "K1", "", "page", "T1", "(Ljava/lang/String;)V", "c2", "Z1", "", "exception", "W1", "(Ljava/lang/Throwable;)V", "S1", "Q1", "f2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lgi/a;", "v", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "LCl/e;", "w", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "Lyl/k;", "x", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "Ltv/A;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b;", "y", "Ltv/A;", "modalFlow", "Lg/c;", "Landroid/content/Intent;", "z", "Lg/c;", "scannerResultLauncher", "LRm/A;", "A", "Lkotlin/Lazy;", "N1", "()LRm/A;", "viewModel", "", "P1", "()Z", "isFromMperks4", "", "J1", "()I", "mperks4Points", "B", "b", "a", "LRm/A$c;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SelfRemediationHostActivity extends Hilt_SelfRemediationHostActivity {

    /* renamed from: C, reason: collision with root package name */
    public static final int f105566C = 8;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<b> modalFlow = C17146H.b(0, 0, null, 7, null);

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> scannerResultLauncher = registerForActivityResult(new h.i(), new g());

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Rm.A.class), new i(this), new h(this), new j(null, this));

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b;", "", "<init>", "()V", "c", "b", "a", "e", "d", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$a;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$b;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$c;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$d;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class b {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$a;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$b$a, reason: from toString */
        public static final /* data */ class NetworkFailureErrorMessage extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String message;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NetworkFailureErrorMessage) && Intrinsics.e(this.message, ((NetworkFailureErrorMessage) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "NetworkFailureErrorMessage(message=" + this.message + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkFailureErrorMessage(String message) {
                super(null);
                Intrinsics.j(message, "message");
                this.message = message;
            }

            /* renamed from: a, reason: from getter */
            public final String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$b;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1560b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1560b f105574a = new C1560b();

            private C1560b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1560b);
            }

            public int hashCode() {
                return -1733778203;
            }

            public String toString() {
                return "NetworkFailureNoErrorMessage";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$c;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f105575a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1131908798;
            }

            public String toString() {
                return "NetworkSuccess";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$d;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f105576a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1433557183;
            }

            public String toString() {
                return "None";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b$e;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/SelfRemediationHostActivity$b;", "", "title", "message", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$b$e, reason: from toString */
        public static final /* data */ class ValidationError extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            public ValidationError(int i10, int i11) {
                super(null);
                this.title = i10;
                this.message = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidationError)) {
                    return false;
                }
                ValidationError validationError = (ValidationError) other;
                return this.title == validationError.title && this.message == validationError.message;
            }

            public int hashCode() {
                return (Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message);
            }

            public String toString() {
                return "ValidationError(title=" + this.title + ", message=" + this.message + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getTitle() {
                return this.title;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SelfRemediationHostActivity f105580a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14677u f105581b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<A.ViewState> f105582c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$a, reason: collision with other inner class name */
            static final class C1561a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105583a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SelfRemediationHostActivity f105584b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$a$a, reason: collision with other inner class name */
                static final class C1562a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105585a;

                    C1562a(LocalThemeScope localThemeScope) {
                        this.f105585a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(2107555011, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationHostActivity.kt:139)");
                        }
                        Dr.g.g(this.f105585a, C16193g.c(com.meijer.mobile.meijer.Y.f100201md, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        a(composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2111637117, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SelfRemediationHostActivity.kt:134)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    C.f.d dVar = C.f.d.f15507e;
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Bj.o.f3035p, new Object[0]);
                    LocalThemeScope localThemeScope = this.f105583a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(2107555011, true, new C1562a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f105584b);
                    final SelfRemediationHostActivity selfRemediationHostActivity = this.f105584b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.L
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SelfRemediationHostActivity.c.a.C1561a.c(selfRemediationHostActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, modifierH, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24624 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 198);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1561a(LocalThemeScope localThemeScope, SelfRemediationHostActivity selfRemediationHostActivity) {
                    this.f105583a = localThemeScope;
                    this.f105584b = selfRemediationHostActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(SelfRemediationHostActivity selfRemediationHostActivity) {
                    selfRemediationHostActivity.finish();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SelfRemediationHostActivity f105586a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105587b;

                b(SelfRemediationHostActivity selfRemediationHostActivity, LocalThemeScope localThemeScope) {
                    this.f105586a = selfRemediationHostActivity;
                    this.f105587b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(227183266, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SelfRemediationHostActivity.kt:143)");
                    }
                    Integer pageIndicator = b(o1.a(this.f105586a.N1().t(), Q0.f.f22353c, null, composer, 48, 2)).getPageIndicator();
                    if (pageIndicator != null) {
                        C4376g.c(this.f105587b, pageIndicator.intValue(), null, composer, LocalThemeScope.f15770g, 2);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }

                private static final Q0 b(z1<? extends Q0> z1Var) {
                    return z1Var.getValue();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$c, reason: collision with other inner class name */
            static final class C1563c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C14677u f105588a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SelfRemediationHostActivity f105589b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105590c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<A.ViewState> f105591d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1564a extends FunctionReferenceImpl implements Function1<Q0, Unit> {
                    C1564a(Object obj) {
                        super(1, obj, SelfRemediationHostActivity.class, "trackAnalytics", "trackAnalytics(Lcom/meijer/mobile/meijer/activity/digitalreceipts/compose/selfremediation/SelfRemediationScreen;)V", 0);
                    }

                    public final void a(Q0 p02) {
                        Intrinsics.j(p02, "p0");
                        ((SelfRemediationHostActivity) this.receiver).h2(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Q0 q02) {
                        a(q02);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$c$b */
                static final class b implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105592a;

                    b(LocalThemeScope localThemeScope) {
                        this.f105592a = localThemeScope;
                    }

                    public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1405303974, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelfRemediationHostActivity.kt:170)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Bi.o oVar = Bi.o.f2584a;
                        Bi.m.d(this.f105592a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 56);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                        a(interfaceC14920X, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$1$4$3$1$1", f = "SelfRemediationHostActivity.kt", l = {186}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$c$c, reason: collision with other inner class name */
                static final class C1565c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f105593a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SelfRemediationHostActivity f105594b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1565c(SelfRemediationHostActivity selfRemediationHostActivity, Continuation<? super C1565c> continuation) {
                        super(2, continuation);
                        this.f105594b = selfRemediationHostActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1565c(this.f105594b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1565c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f105593a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC17139A interfaceC17139A = this.f105594b.modalFlow;
                            b.d dVar = b.d.f105576a;
                            this.f105593a = 1;
                            if (interfaceC17139A.emit(dVar, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$1$4$4$1$1", f = "SelfRemediationHostActivity.kt", l = {192}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$c$d */
                static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f105595a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SelfRemediationHostActivity f105596b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    d(SelfRemediationHostActivity selfRemediationHostActivity, Continuation<? super d> continuation) {
                        super(2, continuation);
                        this.f105596b = selfRemediationHostActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new d(this.f105596b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f105595a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC17139A interfaceC17139A = this.f105596b.modalFlow;
                            b.d dVar = b.d.f105576a;
                            this.f105595a = 1;
                            if (interfaceC17139A.emit(dVar, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$1$4$5$1$1", f = "SelfRemediationHostActivity.kt", l = {196}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$c$e */
                static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f105597a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SelfRemediationHostActivity f105598b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    e(SelfRemediationHostActivity selfRemediationHostActivity, Continuation<? super e> continuation) {
                        super(2, continuation);
                        this.f105598b = selfRemediationHostActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new e(this.f105598b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f105597a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC17139A interfaceC17139A = this.f105598b.modalFlow;
                            b.d dVar = b.d.f105576a;
                            this.f105597a = 1;
                            if (interfaceC17139A.emit(dVar, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$1$4$6$1$1", f = "SelfRemediationHostActivity.kt", l = {HttpResponseStatus.SUCCESS_OK}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$c$f */
                static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f105599a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SelfRemediationHostActivity f105600b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    f(SelfRemediationHostActivity selfRemediationHostActivity, Continuation<? super f> continuation) {
                        super(2, continuation);
                        this.f105600b = selfRemediationHostActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new f(this.f105600b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f105599a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC17139A interfaceC17139A = this.f105600b.modalFlow;
                            b.d dVar = b.d.f105576a;
                            this.f105599a = 1;
                            if (interfaceC17139A.emit(dVar, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$1$4$8$1$1", f = "SelfRemediationHostActivity.kt", l = {212}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$c$g */
                static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f105601a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SelfRemediationHostActivity f105602b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    g(SelfRemediationHostActivity selfRemediationHostActivity, Continuation<? super g> continuation) {
                        super(2, continuation);
                        this.f105602b = selfRemediationHostActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new g(this.f105602b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f105601a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC17139A interfaceC17139A = this.f105602b.modalFlow;
                            b.d dVar = b.d.f105576a;
                            this.f105601a = 1;
                            if (interfaceC17139A.emit(dVar, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$1$4$9$1$1", f = "SelfRemediationHostActivity.kt", l = {223}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$a$c$h */
                static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f105603a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SelfRemediationHostActivity f105604b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    h(SelfRemediationHostActivity selfRemediationHostActivity, Continuation<? super h> continuation) {
                        super(2, continuation);
                        this.f105604b = selfRemediationHostActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new h(this.f105604b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f105603a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC17139A interfaceC17139A = this.f105604b.modalFlow;
                            b.d dVar = b.d.f105576a;
                            this.f105603a = 1;
                            if (interfaceC17139A.emit(dVar, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                C1563c(C14677u c14677u, SelfRemediationHostActivity selfRemediationHostActivity, LocalThemeScope localThemeScope, z1<A.ViewState> z1Var) {
                    this.f105588a = c14677u;
                    this.f105589b = selfRemediationHostActivity;
                    this.f105590c = localThemeScope;
                    this.f105591d = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(SelfRemediationHostActivity selfRemediationHostActivity, LocalThemeScope localThemeScope, C14675s NavHost) {
                    Intrinsics.j(NavHost, "$this$NavHost");
                    E0.C(NavHost, localThemeScope, selfRemediationHostActivity.N1(), selfRemediationHostActivity.J1(), new C1564a(selfRemediationHostActivity));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r() {
                    return Unit.f142422a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    o(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }

                public final void o(InterfaceC14794C contentPadding, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(contentPadding) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(44199338, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SelfRemediationHostActivity.kt:149)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(companion, contentPadding);
                    C14677u c14677u = this.f105588a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f105589b) | composer.D(this.f105590c);
                    final SelfRemediationHostActivity selfRemediationHostActivity = this.f105589b;
                    final LocalThemeScope localThemeScope = this.f105590c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.M
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SelfRemediationHostActivity.c.a.C1563c.p(selfRemediationHostActivity, localThemeScope, (C14675s) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    j4.k.b(c14677u, "SelfRemediationRoute", modifierH, null, null, null, null, null, null, (Function1) objB, composer, 48, HttpResponseStatus.ERROR_GATEWAY_TIMEOUT);
                    composer.startReplaceGroup(-474089194);
                    if (c.d(this.f105591d).getLoadingState() instanceof a.Loading) {
                        Modifier modifierD = androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null)), C5346q0.q(this.f105590c.getAdsColors().getAdsColorUIBackground01().getColor(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        LocalThemeScope localThemeScope2 = this.f105590c;
                        MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
                        InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion2.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyG, companion2.e());
                        D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C5664j c5664j = C5664j.f48612a;
                        Ji.Q.e(localThemeScope2, Q0.b.f139711a, ComposableLambdaKt.c(-1405303974, true, new b(localThemeScope2), composer, 54), composer, LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
                        composer.v();
                    }
                    composer.P();
                    InterfaceC17139A interfaceC17139A = this.f105589b.modalFlow;
                    b.d dVar = b.d.f105576a;
                    b bVar = (b) S2.a.b(interfaceC17139A, dVar, null, null, null, composer, 48, 14).getValue();
                    if (Intrinsics.e(bVar, b.C1560b.f105574a)) {
                        composer.startReplaceGroup(-1810895583);
                        LocalThemeScope localThemeScope3 = this.f105590c;
                        String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100022dd, composer, 0);
                        String strC2 = C16193g.c(Ap.a.f1450a, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f105589b);
                        final SelfRemediationHostActivity selfRemediationHostActivity2 = this.f105589b;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.N
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelfRemediationHostActivity.c.a.C1563c.v(selfRemediationHostActivity2);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Nm.M.b(localThemeScope3, strC, strC2, (Function0) objB2, composer, LocalThemeScope.f15770g);
                        composer.P();
                    } else if (Intrinsics.e(bVar, b.c.f105575a)) {
                        composer.startReplaceGroup(-474042701);
                        LocalThemeScope localThemeScope4 = this.f105590c;
                        composer.startReplaceGroup(5004770);
                        boolean zD3 = composer.D(this.f105589b);
                        final SelfRemediationHostActivity selfRemediationHostActivity3 = this.f105589b;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.O
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelfRemediationHostActivity.c.a.C1563c.w(selfRemediationHostActivity3);
                                }
                            };
                            composer.t(objB3);
                        }
                        Function0 function0 = (Function0) objB3;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD4 = composer.D(this.f105589b);
                        final SelfRemediationHostActivity selfRemediationHostActivity4 = this.f105589b;
                        Object objB4 = composer.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.P
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelfRemediationHostActivity.c.a.C1563c.x(selfRemediationHostActivity4);
                                }
                            };
                            composer.t(objB4);
                        }
                        Function0 function02 = (Function0) objB4;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD5 = composer.D(this.f105589b);
                        final SelfRemediationHostActivity selfRemediationHostActivity5 = this.f105589b;
                        Object objB5 = composer.B();
                        if (zD5 || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.Q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelfRemediationHostActivity.c.a.C1563c.q(selfRemediationHostActivity5);
                                }
                            };
                            composer.t(objB5);
                        }
                        Function0 function03 = (Function0) objB5;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB6 = composer.B();
                        if (objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.S
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelfRemediationHostActivity.c.a.C1563c.r();
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        W0.b(localThemeScope4, null, function0, function02, function03, (Function0) objB6, composer, LocalThemeScope.f15770g | 196608, 1);
                        composer.P();
                    } else if (bVar instanceof b.ValidationError) {
                        composer.startReplaceGroup(-1809479503);
                        LocalThemeScope localThemeScope5 = this.f105590c;
                        b.ValidationError validationError = (b.ValidationError) bVar;
                        String strC3 = C16193g.c(validationError.getTitle(), composer, 0);
                        String strC4 = C16193g.c(validationError.getMessage(), composer, 0);
                        String strC5 = C16193g.c(yr.Q.f170986b, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zD6 = composer.D(this.f105589b);
                        final SelfRemediationHostActivity selfRemediationHostActivity6 = this.f105589b;
                        Object objB7 = composer.B();
                        if (zD6 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.T
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelfRemediationHostActivity.c.a.C1563c.s(selfRemediationHostActivity6);
                                }
                            };
                            composer.t(objB7);
                        }
                        composer.P();
                        c0.b(localThemeScope5, strC3, strC4, strC5, null, (Function0) objB7, composer, LocalThemeScope.f15770g, 8);
                        composer.P();
                    } else if (Intrinsics.e(bVar, dVar)) {
                        composer.startReplaceGroup(-1808995531);
                        composer.P();
                    } else {
                        if (!(bVar instanceof b.NetworkFailureErrorMessage)) {
                            composer.startReplaceGroup(-474058641);
                            composer.P();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(-1808850513);
                        LocalThemeScope localThemeScope6 = this.f105590c;
                        String message = ((b.NetworkFailureErrorMessage) bVar).getMessage();
                        composer.startReplaceGroup(5004770);
                        boolean zD7 = composer.D(this.f105589b);
                        final SelfRemediationHostActivity selfRemediationHostActivity7 = this.f105589b;
                        Object objB8 = composer.B();
                        if (zD7 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.U
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelfRemediationHostActivity.c.a.C1563c.t(selfRemediationHostActivity7);
                                }
                            };
                            composer.t(objB8);
                        }
                        Function0 function04 = (Function0) objB8;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD8 = composer.D(this.f105589b);
                        final SelfRemediationHostActivity selfRemediationHostActivity8 = this.f105589b;
                        Object objB9 = composer.B();
                        if (zD8 || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.V
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SelfRemediationHostActivity.c.a.C1563c.u(selfRemediationHostActivity8);
                                }
                            };
                            composer.t(objB9);
                        }
                        composer.P();
                        Nm.K.b(localThemeScope6, message, null, function04, (Function0) objB9, composer, LocalThemeScope.f15770g, 2);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(SelfRemediationHostActivity selfRemediationHostActivity) {
                    selfRemediationHostActivity.Q1();
                    C16648k.d(C6031t.a(selfRemediationHostActivity), null, null, new f(selfRemediationHostActivity, null), 3, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit s(SelfRemediationHostActivity selfRemediationHostActivity) {
                    C16648k.d(C6031t.a(selfRemediationHostActivity), null, null, new g(selfRemediationHostActivity, null), 3, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t(SelfRemediationHostActivity selfRemediationHostActivity) {
                    C16648k.d(C6031t.a(selfRemediationHostActivity), null, null, new h(selfRemediationHostActivity, null), 3, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(SelfRemediationHostActivity selfRemediationHostActivity) {
                    selfRemediationHostActivity.S1();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v(SelfRemediationHostActivity selfRemediationHostActivity) {
                    C16648k.d(C6031t.a(selfRemediationHostActivity), null, null, new C1565c(selfRemediationHostActivity, null), 3, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit w(SelfRemediationHostActivity selfRemediationHostActivity) {
                    selfRemediationHostActivity.f2();
                    C16648k.d(C6031t.a(selfRemediationHostActivity), null, null, new d(selfRemediationHostActivity, null), 3, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit x(SelfRemediationHostActivity selfRemediationHostActivity) {
                    selfRemediationHostActivity.finish();
                    C16648k.d(C6031t.a(selfRemediationHostActivity), null, null, new e(selfRemediationHostActivity, null), 3, null);
                    return Unit.f142422a;
                }
            }

            a(SelfRemediationHostActivity selfRemediationHostActivity, C14677u c14677u, z1<A.ViewState> z1Var) {
                this.f105580a = selfRemediationHostActivity;
                this.f105581b = c14677u;
                this.f105582c = z1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.t.a(semantics, true);
                return Unit.f142422a;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1083873112, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity.onCreate.<anonymous>.<anonymous> (SelfRemediationHostActivity.kt:128)");
                }
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null));
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.K
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SelfRemediationHostActivity.c.a.c((r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C17921a1.a(C16705m.d(modifierFsUnmask, false, (Function1) objB, 1, null), null, ComposableLambdaKt.c(-2111637117, true, new C1561a(AdsTheme, this.f105580a), composer, 54), ComposableLambdaKt.c(227183266, true, new b(this.f105580a, AdsTheme), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(44199338, true, new C1563c(this.f105581b, this.f105580a, AdsTheme, this.f105582c), composer, 54), composer, 3456, 12582912, 131058);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$3$1", f = "SelfRemediationHostActivity.kt", l = {238}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f105605a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SelfRemediationHostActivity f105606b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SelfRemediationHostActivity selfRemediationHostActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f105606b = selfRemediationHostActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f105606b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRm/A$b;", "effect", "", "<anonymous>", "(LRm/A$b;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$3$1$1", f = "SelfRemediationHostActivity.kt", l = {}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<A.b, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f105607a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f105608b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SelfRemediationHostActivity f105609c;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$3$1$1$1", f = "SelfRemediationHostActivity.kt", l = {242}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$b$a$a, reason: collision with other inner class name */
                static final class C1566a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f105610a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SelfRemediationHostActivity f105611b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ A.b f105612c;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1566a(this.f105611b, this.f105612c, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1566a(SelfRemediationHostActivity selfRemediationHostActivity, A.b bVar, Continuation<? super C1566a> continuation) {
                        super(2, continuation);
                        this.f105611b = selfRemediationHostActivity;
                        this.f105612c = bVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1566a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f105610a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC17139A interfaceC17139A = this.f105611b.modalFlow;
                            b.ValidationError validationError = new b.ValidationError(((A.b.DisplayValidationError) this.f105612c).getTitle(), ((A.b.DisplayValidationError) this.f105612c).getMessage());
                            this.f105610a = 1;
                            if (interfaceC17139A.emit(validationError, this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelfRemediationHostActivity selfRemediationHostActivity, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f105609c = selfRemediationHostActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f105609c, continuation);
                    aVar.f105608b = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(A.b bVar, Continuation<? super Unit> continuation) {
                    return ((a) create(bVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f105607a == 0) {
                        ResultKt.b(obj);
                        A.b bVar = (A.b) this.f105608b;
                        if (bVar instanceof A.b.DisplayValidationError) {
                            C16648k.d(C6031t.a(this.f105609c), null, null, new C1566a(this.f105609c, bVar, null), 3, null);
                        } else if (bVar instanceof A.b.NavigateToReceiptScan) {
                            AbstractC14147c abstractC14147c = this.f105609c.scannerResultLauncher;
                            SelfRemediationHostActivity selfRemediationHostActivity = this.f105609c;
                            abstractC14147c.a(Al.h.j(selfRemediationHostActivity, selfRemediationHostActivity.getFeatureManager().e(AbstractC18227f.L.f170551h)));
                            this.f105609c.getAnalyticsEngine().e(((A.b.NavigateToReceiptScan) bVar).getTrackingData());
                        } else if (bVar instanceof A.b.SubmitReceiptFailure) {
                            this.f105609c.W1(((A.b.SubmitReceiptFailure) bVar).getThrowable());
                        } else if (Intrinsics.e(bVar, A.b.d.f32413a)) {
                            this.f105609c.Z1();
                        } else if (Intrinsics.e(bVar, A.b.e.f32414a)) {
                            this.f105609c.c2();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f105605a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<A.b> interfaceC17144FS = this.f105606b.N1().s();
                    a aVar = new a(this.f105606b, null);
                    this.f105605a = 1;
                    if (C17154h.k(interfaceC17144FS, aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$4$1", f = "SelfRemediationHostActivity.kt", l = {277}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$c, reason: collision with other inner class name */
        static final class C1567c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f105613a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SelfRemediationHostActivity f105614b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C14677u f105615c;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNm/Q0;", "screen", "", "<anonymous>", "(LNm/Q0;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onCreate$1$4$1$1", f = "SelfRemediationHostActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$c$c$a */
            static final class a extends SuspendLambda implements Function2<Nm.Q0, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f105616a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f105617b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C14677u f105618c;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(Nm.Q0 q02, C14680x c14680x) {
                    c14680x.f(true);
                    C14680x.e(c14680x, q02.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, 2, null);
                    return Unit.f142422a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f105618c, continuation);
                    aVar.f105617b = obj;
                    return aVar;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C14677u c14677u, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f105618c = c14677u;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Nm.Q0 q02, Continuation<? super Unit> continuation) {
                    return ((a) create(q02, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                    IntrinsicsKt.f();
                    if (this.f105616a == 0) {
                        ResultKt.b(obj);
                        final Nm.Q0 q02 = (Nm.Q0) this.f105617b;
                        this.f105618c.S(q02.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.W
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SelfRemediationHostActivity.c.C1567c.a.k(q02, (C14680x) obj2);
                            }
                        });
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1567c(this.f105614b, this.f105615c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1567c(SelfRemediationHostActivity selfRemediationHostActivity, C14677u c14677u, Continuation<? super C1567c> continuation) {
                super(2, continuation);
                this.f105614b = selfRemediationHostActivity;
                this.f105615c = c14677u;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1567c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f105613a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<Nm.Q0> interfaceC17144FT = this.f105614b.N1().t();
                    a aVar = new a(this.f105615c, null);
                    this.f105613a = 1;
                    if (C17154h.k(interfaceC17144FT, aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        c() {
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1583788201, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity.onCreate.<anonymous> (SelfRemediationHostActivity.kt:124)");
            }
            final z1 z1VarC = S2.a.c(SelfRemediationHostActivity.this.N1().u(), null, null, null, composer, 0, 7);
            final C14677u c14677uE = j4.j.e(new AbstractC14653B[0], composer, 0);
            Ji.K.b(null, ComposableLambdaKt.c(-1083873112, true, new a(SelfRemediationHostActivity.this, c14677uE, z1VarC), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(z1VarC) | composer.D(c14677uE) | composer.D(SelfRemediationHostActivity.this);
            final SelfRemediationHostActivity selfRemediationHostActivity = SelfRemediationHostActivity.this;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfRemediationHostActivity.c.e(c14677uE, selfRemediationHostActivity, z1VarC);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13588d.a(true, (Function0) objB, composer, 6, 0);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(SelfRemediationHostActivity.this);
            SelfRemediationHostActivity selfRemediationHostActivity2 = SelfRemediationHostActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(selfRemediationHostActivity2, null);
                composer.t(objB2);
            }
            composer.P();
            androidx.compose.runtime.J.g("SelfRemediationEffectsFlow", (Function2) objB2, composer, 6);
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(SelfRemediationHostActivity.this) | composer.D(c14677uE);
            SelfRemediationHostActivity selfRemediationHostActivity3 = SelfRemediationHostActivity.this;
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new C1567c(selfRemediationHostActivity3, c14677uE, null);
                composer.t(objB3);
            }
            composer.P();
            androidx.compose.runtime.J.g("SelfRemediationScreenFlow", (Function2) objB3, composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A.ViewState d(z1<A.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(C14677u c14677u, SelfRemediationHostActivity selfRemediationHostActivity, z1 z1Var) {
            if (!Intrinsics.e(d(z1Var).getLoadingState(), new a.Loading(null, null, 3, null)) && !c14677u.V()) {
                selfRemediationHostActivity.finish();
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onResubmitTransactionFailure$3", f = "SelfRemediationHostActivity.kt", l = {425}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105619a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelfRemediationHostActivity.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105619a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = SelfRemediationHostActivity.this.modalFlow;
                b.C1560b c1560b = b.C1560b.f105574a;
                this.f105619a = 1;
                if (interfaceC17139A.emit(c1560b, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onResubmitTransactionFailure$4", f = "SelfRemediationHostActivity.kt", l = {429}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105621a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f105623c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f105623c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelfRemediationHostActivity.this.new e(this.f105623c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105621a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = SelfRemediationHostActivity.this.modalFlow;
                b.NetworkFailureErrorMessage networkFailureErrorMessage = new b.NetworkFailureErrorMessage(this.f105623c);
                this.f105621a = 1;
                if (interfaceC17139A.emit(networkFailureErrorMessage, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity$onResubmitTransactionSuccess$1", f = "SelfRemediationHostActivity.kt", l = {375}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f105624a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelfRemediationHostActivity.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f105624a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = SelfRemediationHostActivity.this.modalFlow;
                b.c cVar = b.c.f105575a;
                this.f105624a = 1;
                if (interfaceC17139A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g implements InterfaceC14146b, FunctionAdapter {
        g() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, SelfRemediationHostActivity.this, SelfRemediationHostActivity.class, "handleScannerResult", "handleScannerResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            SelfRemediationHostActivity.this.O1(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105627f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f105627f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105627f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105628f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f105628f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f105628f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105629f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105630g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105629f = function0;
            this.f105630g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105629f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105630g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(Throwable exception) {
        setResult(0);
        if (P1()) {
            getAnalyticsEngine().h(C14476c.h("mperks: rewards: enter receipt: submit unsuccessful"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfRemediationHostActivity.Y1(this.f105460a, (TrackingData) obj);
                }
            });
        } else {
            getAnalyticsEngine().h(C14476c.h("mperks: rewards: enter receipt: submit unsuccessful"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.B
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfRemediationHostActivity.X1((TrackingData) obj);
                }
            });
        }
        RetrofitException retrofitException = exception instanceof RetrofitException ? (RetrofitException) exception : null;
        String strC = retrofitException != null ? retrofitException.c(this) : null;
        if (strC == null || StringsKt.r0(strC)) {
            C16648k.d(C6031t.a(this), null, null, new d(null), 3, null);
        } else {
            C16648k.d(C6031t.a(this), null, null, new e(strC, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1() {
        setResult(-1);
        C16648k.d(C6031t.a(this), null, null, new f(null), 3, null);
        if (P1()) {
            getAnalyticsEngine().h(C14476c.h("mperks: rewards: enter receipt: submit successful"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.A
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfRemediationHostActivity.b2(this.f105443a, (TrackingData) obj);
                }
            });
        } else {
            getAnalyticsEngine().h(C14476c.h("mperks: rewards: enter receipt: submit successful"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfRemediationHostActivity.a2((TrackingData) obj);
                }
            });
        }
    }

    private final void K1() {
        T1("mperks: rewards: enter receipt: get started");
        if (P1()) {
            getAnalyticsEngine().h(C14476c.h("mperks: rewards: enter receipt: get started"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.H
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfRemediationHostActivity.M1(this.f105462a, (TrackingData) obj);
                }
            });
        } else {
            getAnalyticsEngine().h(C14476c.h("mperks: rewards: enter receipt: get started"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.G
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfRemediationHostActivity.L1((TrackingData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mperks");
        track.h("siteparentcategory", "mperks rewards help");
        track.h("hier1", "mperks: rewards: help: enter receipt info");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(SelfRemediationHostActivity selfRemediationHostActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.h("siteparentcategory", "mperks rewards help");
        track.h("mperksPoints", String.valueOf(selfRemediationHostActivity.J1()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("receipts and savings confirmation");
        track.v("receipt and savings");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mperks");
        track.h("siteparentcategory", "mperks rewards help");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(SelfRemediationHostActivity selfRemediationHostActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.h("siteparentcategory", "mperks rewards help");
        track.h("mperksPoints", String.valueOf(selfRemediationHostActivity.J1()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mperks");
        track.h("siteparentcategory", HomeViewModel.MperksLoadingKey);
        track.h("hier1", "mperks: rewards: enter receipt info: unsuccessful");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(SelfRemediationHostActivity selfRemediationHostActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.h("siteparentcategory", "mperks rewards help");
        track.h("mperksPoints", String.valueOf(selfRemediationHostActivity.J1()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mperks");
        track.h("siteparentcategory", HomeViewModel.MperksLoadingKey);
        track.h("hier1", "mperks: rewards: enter receipt info: successful");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(SelfRemediationHostActivity selfRemediationHostActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.h("siteparentcategory", "mperks rewards help");
        track.h("mperksPoints", String.valueOf(selfRemediationHostActivity.J1()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: rewards: enter receipt");
        track.v("mperks");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e2(SelfRemediationHostActivity selfRemediationHostActivity, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: rewards: enter receipt");
        track.v("mPerks 4.0");
        track.h("mperksPoints", String.valueOf(selfRemediationHostActivity.J1()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2() {
        startActivity(Al.d.f664a.d(this));
        getAnalyticsEngine().h(C14476c.a("event: receipts and savings: self remediation: confirmation: view status"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfRemediationHostActivity.g2((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("receipts and savings confirmation");
        track.v("receipt and savings");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(Nm.Q0 screen) {
        if (Intrinsics.e(screen, Q0.a.f22348c)) {
            T1("mperks: rewards: enter receipt: enter date");
            return;
        }
        if (Intrinsics.e(screen, Q0.b.f22349c)) {
            T1("mperks: rewards: enter receipt: st number");
            return;
        }
        if (Intrinsics.e(screen, Q0.c.f22350c)) {
            T1("mperks: rewards: enter receipt: time");
            return;
        }
        if (Intrinsics.e(screen, Q0.d.f22351c)) {
            T1("mperks: rewards: enter receipt: tm number");
            return;
        }
        if (Intrinsics.e(screen, Q0.e.f22352c)) {
            T1("mperks: rewards: enter receipt: tx number");
        } else if (Intrinsics.e(screen, Q0.f.f22353c)) {
            K1();
        } else {
            if (!Intrinsics.e(screen, Q0.g.f22354c)) {
                throw new NoWhenBranchMatchedException();
            }
            T1("mperks: rewards: enter receipt: review");
        }
    }

    public final Rm.A N1() {
        return (Rm.A) this.viewModel.getValue();
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final Cl.e getMeijerIntent() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int J1() {
        return getIntent().getIntExtra("com.meijer.intent.extra.EXTRA_POINTS_BALANCE_MPERKS4", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(C14145a result) {
        String stringExtra;
        if (result.getResultCode() == -1) {
            Rm.A aN1 = N1();
            Intent data = result.getData();
            if (data != null) {
                stringExtra = data.getStringExtra("barcode");
            } else {
                stringExtra = null;
            }
            aN1.w(new b.SubmitReceiptBarcode(stringExtra));
        }
    }

    private final boolean P1() {
        return getIntent().getBooleanExtra("com.meijer.intent.extra.EXTRA_IS_FROM_MPERKS4", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1() {
        N1().w(b.h.f18560a);
        getAnalyticsEngine().h(C14476c.a("event: receipts and savings: self remediation: confirmation: add another"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfRemediationHostActivity.R1((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1() {
        Intent intentZ = getMeijerIntent().z(this, com.meijer.mobile.meijer.Y.f100284qg);
        if (getPackageManager().resolveActivity(intentZ, 65536) != null) {
            startActivity(intentZ);
        } else {
            Ds.m.c(this, getString(com.meijer.mobile.meijer.Y.f100293r5), new Object[0]);
        }
    }

    private final void T1(String page) {
        if (!P1()) {
            if (getIntent().getBooleanExtra("com.meijer.intent.extra.EXTRA_FROM_REWARDS", false)) {
                getAnalyticsEngine().h(C14476c.h(page), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.I
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelfRemediationHostActivity.U1((TrackingData) obj);
                    }
                });
                return;
            }
            return;
        }
        getAnalyticsEngine().h(C14476c.h(page), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfRemediationHostActivity.V1(this.f105865a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2() {
        if (!P1()) {
            getAnalyticsEngine().h(C14476c.a("event: mperks: rewards: enter receipt: submit"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.D
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfRemediationHostActivity.d2((TrackingData) obj);
                }
            });
        } else {
            getAnalyticsEngine().h(C14476c.a("event: mperks: rewards: enter receipt: submit"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.E
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfRemediationHostActivity.e2(this.f105461a, (TrackingData) obj);
                }
            });
        }
    }

    @Override // com.meijer.mobile.meijer.activity.digitalreceipts.Hilt_SelfRemediationHostActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1583788201, true, new c()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("mPerks | Add Receipt").start();
    }
}
