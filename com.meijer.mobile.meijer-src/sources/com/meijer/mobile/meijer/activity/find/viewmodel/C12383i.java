package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.Department;
import androidx.view.InterfaceC6157f;
import bk.AbstractC6392a;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentItemDecorator;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import ev.C13889a;
import ik.CartPreviewDecorator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import qw.a;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0004OMIEB;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\u0011j\u0002`\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\u0011j\u0002`\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ#\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010$2\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010)J)\u00102\u001a\u0004\u0018\u00010$2\f\u00100\u001a\b\u0012\u0004\u0012\u00020$0/2\b\u00101\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b2\u00103J\u0018\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0013H\u0014¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0013¢\u0006\u0004\b>\u00109R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020V0Z8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020a0e8F¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006i"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LRo/c;", "productsRepository", "Lyo/k;", "userManager", "Lzl/k;", "featureManager", "Lil/m;", "cartRepository", "LTq/j;", "storeProvider", "Lmv/K;", "ioDispatcher", "<init>", "(LRo/c;Lyo/k;Lzl/k;Lil/m;LTq/j;Lmv/K;)V", "", "itemCount", "", "D", "(I)V", "", "departmentId", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "v", "(Ljava/lang/String;I)V", "rawLink", "w", "", "isLoading", "Lbk/a;", "message", "I", "(ZLbk/a;)V", "LCo/b;", "department", "H", "(LCo/b;)V", "B", "(LCo/b;Ljava/lang/String;)V", "G", "(LCo/b;Ljava/lang/String;)LCo/b;", "resource", "rawDepartmentNameDeeplink", "F", "", "categories", "deepLinkUri", "x", "(Ljava/util/List;Ljava/lang/String;)LCo/b;", "", "throwable", "E", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "()V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c;", "action", "A", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c;)V", "C", "a", "LRo/c;", "b", "Lyo/k;", "getUserManager", "()Lyo/k;", "c", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "d", "Lil/m;", "getCartRepository", "()Lil/m;", "e", "LTq/j;", "f", "Lmv/K;", "LJu/a;", "g", "LJu/a;", "disposables", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$f;", "h", "Lpv/B;", "_viewState", "Lpv/P;", "i", "Lpv/P;", "y", "()Lpv/P;", "viewState", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$d;", "j", "Lpv/A;", "_events", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12383i extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ViewState> viewState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<d> _events;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        a(Object obj) {
            super(1, obj, C12383i.class, "onCartCount", "onCartCount(I)V", 0);
        }

        public final void a(int i10) {
            ((C12383i) this.receiver).D(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c;", "", "<init>", "()V", "a", "b", "c", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$c */
    public static abstract class c {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c;", "", "departmentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$c$a, reason: from toString */
        public static final /* data */ class FetchDepartmentByDepartmentId extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String departmentId;

            /* JADX WARN: Multi-variable type inference failed */
            public FetchDepartmentByDepartmentId() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FetchDepartmentByDepartmentId) && Intrinsics.e(this.departmentId, ((FetchDepartmentByDepartmentId) other).departmentId);
            }

            public int hashCode() {
                return this.departmentId.hashCode();
            }

            public String toString() {
                return "FetchDepartmentByDepartmentId(departmentId=" + this.departmentId + ')';
            }

            public /* synthetic */ FetchDepartmentByDepartmentId(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str);
            }

            /* renamed from: a, reason: from getter */
            public final String getDepartmentId() {
                return this.departmentId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchDepartmentByDepartmentId(String departmentId) {
                super(null);
                Intrinsics.j(departmentId, "departmentId");
                this.departmentId = departmentId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c;", "", "marketingURL", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$c$b, reason: from toString */
        public static final /* data */ class FindDepartmentByName extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String marketingURL;

            /* JADX WARN: Multi-variable type inference failed */
            public FindDepartmentByName() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FindDepartmentByName) && Intrinsics.e(this.marketingURL, ((FindDepartmentByName) other).marketingURL);
            }

            public int hashCode() {
                return this.marketingURL.hashCode();
            }

            public String toString() {
                return "FindDepartmentByName(marketingURL=" + this.marketingURL + ')';
            }

            public /* synthetic */ FindDepartmentByName(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str);
            }

            /* renamed from: a, reason: from getter */
            public final String getMarketingURL() {
                return this.marketingURL;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FindDepartmentByName(String marketingURL) {
                super(null);
                Intrinsics.j(marketingURL, "marketingURL");
                this.marketingURL = marketingURL;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$c;", "LCo/b;", "department", "<init>", "(LCo/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/b;", "()LCo/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class PopulateSubDepartmentsAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Department department;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PopulateSubDepartmentsAction) && Intrinsics.e(this.department, ((PopulateSubDepartmentsAction) other).department);
            }

            public int hashCode() {
                return this.department.hashCode();
            }

            public String toString() {
                return "PopulateSubDepartmentsAction(department=" + this.department + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PopulateSubDepartmentsAction(Department department) {
                super(null);
                Intrinsics.j(department, "department");
                this.department = department;
            }

            /* renamed from: a, reason: from getter */
            public final Department getDepartment() {
                return this.department;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$d;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$d$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$d */
    public static abstract class d {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$d$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$d;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "<init>", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$d$a, reason: from toString */
        public static final /* data */ class DepartmentErrorEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final RetrofitException retrofitException;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DepartmentErrorEvent) && Intrinsics.e(this.retrofitException, ((DepartmentErrorEvent) other).retrofitException);
            }

            public int hashCode() {
                return this.retrofitException.hashCode();
            }

            public String toString() {
                return "DepartmentErrorEvent(retrofitException=" + this.retrofitException + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DepartmentErrorEvent(RetrofitException retrofitException) {
                super(null);
                Intrinsics.j(retrofitException, "retrofitException");
                this.retrofitException = retrofitException;
            }

            /* renamed from: a, reason: from getter */
            public final RetrofitException getRetrofitException() {
                return this.retrofitException;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$e;", "", "", "isLoading", "Lbk/a;", "message", "<init>", "(ZLbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lbk/a;", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$e, reason: from toString */
    public static final /* data */ class LoadingState {

        /* renamed from: c, reason: collision with root package name */
        public static final int f109730c = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a message;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingState)) {
                return false;
            }
            LoadingState loadingState = (LoadingState) other;
            return this.isLoading == loadingState.isLoading && Intrinsics.e(this.message, loadingState.message);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isLoading) * 31;
            AbstractC6392a abstractC6392a = this.message;
            return iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode());
        }

        public String toString() {
            return "LoadingState(isLoading=" + this.isLoading + ", message=" + this.message + ')';
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC6392a getMessage() {
            return this.message;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public LoadingState(boolean z10, AbstractC6392a abstractC6392a) {
            this.isLoading = z10;
            this.message = abstractC6392a;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$f;", "", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e;", "activeDepartments", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$e;", "networkCallInProgress", "Lik/a;", "cartDecorator", "<init>", "(Ljava/util/List;Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$e;Lik/a;)V", "a", "(Ljava/util/List;Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$e;Lik/a;)Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$e;", "e", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/i$e;", "Lik/a;", "d", "()Lik/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$f, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DepartmentItemDecorator> activeDepartments;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LoadingState networkCallInProgress;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CartPreviewDecorator cartDecorator;

        public ViewState() {
            this(null, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.activeDepartments, viewState.activeDepartments) && Intrinsics.e(this.networkCallInProgress, viewState.networkCallInProgress) && Intrinsics.e(this.cartDecorator, viewState.cartDecorator);
        }

        public int hashCode() {
            return (((this.activeDepartments.hashCode() * 31) + this.networkCallInProgress.hashCode()) * 31) + this.cartDecorator.hashCode();
        }

        public String toString() {
            return "ViewState(activeDepartments=" + this.activeDepartments + ", networkCallInProgress=" + this.networkCallInProgress + ", cartDecorator=" + this.cartDecorator + ')';
        }

        public ViewState(List<DepartmentItemDecorator> activeDepartments, LoadingState networkCallInProgress, CartPreviewDecorator cartDecorator) {
            Intrinsics.j(activeDepartments, "activeDepartments");
            Intrinsics.j(networkCallInProgress, "networkCallInProgress");
            Intrinsics.j(cartDecorator, "cartDecorator");
            this.activeDepartments = activeDepartments;
            this.networkCallInProgress = networkCallInProgress;
            this.cartDecorator = cartDecorator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, List list, LoadingState loadingState, CartPreviewDecorator cartPreviewDecorator, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = viewState.activeDepartments;
            }
            if ((i10 & 2) != 0) {
                loadingState = viewState.networkCallInProgress;
            }
            if ((i10 & 4) != 0) {
                cartPreviewDecorator = viewState.cartDecorator;
            }
            return viewState.a(list, loadingState, cartPreviewDecorator);
        }

        public final ViewState a(List<DepartmentItemDecorator> activeDepartments, LoadingState networkCallInProgress, CartPreviewDecorator cartDecorator) {
            Intrinsics.j(activeDepartments, "activeDepartments");
            Intrinsics.j(networkCallInProgress, "networkCallInProgress");
            Intrinsics.j(cartDecorator, "cartDecorator");
            return new ViewState(activeDepartments, networkCallInProgress, cartDecorator);
        }

        public final List<DepartmentItemDecorator> c() {
            return this.activeDepartments;
        }

        /* renamed from: d, reason: from getter */
        public final CartPreviewDecorator getCartDecorator() {
            return this.cartDecorator;
        }

        /* renamed from: e, reason: from getter */
        public final LoadingState getNetworkCallInProgress() {
            return this.networkCallInProgress;
        }

        public /* synthetic */ ViewState(List list, LoadingState loadingState, CartPreviewDecorator cartPreviewDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? new LoadingState(false, null) : loadingState, (i10 & 4) != 0 ? new CartPreviewDecorator(false, 0, 3, null) : cartPreviewDecorator);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentTierViewModel$fetchDepartmentByDepartmentId$1", f = "DepartmentTierViewModel.kt", l = {124, 130}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109736a;

        /* renamed from: b, reason: collision with root package name */
        Object f109737b;

        /* renamed from: c, reason: collision with root package name */
        int f109738c;

        /* renamed from: d, reason: collision with root package name */
        int f109739d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f109740e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f109742g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f109743h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f109742g = i10;
            this.f109743h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = C12383i.this.new g(this.f109742g, this.f109743h, continuation);
            gVar.f109740e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        
            if (r3.E(r6, r8) == r0) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v9, types: [mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f109739d
                r2 = 0
                r3 = 1
                r4 = 0
                r5 = 2
                if (r1 == 0) goto L33
                if (r1 == r3) goto L25
                if (r1 != r5) goto L1d
                java.lang.Object r0 = r8.f109737b
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.Object r0 = r8.f109740e
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r9)
                goto L99
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f109736a
                mv.O r1 = (mv.InterfaceC15783O) r1
                java.lang.Object r1 = r8.f109740e
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L31
                goto L57
            L31:
                r9 = move-exception
                goto L5e
            L33:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f109740e
                r1 = r9
                mv.O r1 = (mv.InterfaceC15783O) r1
                com.meijer.mobile.meijer.activity.find.viewmodel.i r9 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.this
                int r6 = r8.f109742g
                kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L31
                com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.J(r9, r3, r4, r5, r4)     // Catch: java.lang.Throwable -> L31
                Ro.c r9 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.q(r9)     // Catch: java.lang.Throwable -> L31
                r8.f109740e = r1     // Catch: java.lang.Throwable -> L31
                r8.f109736a = r1     // Catch: java.lang.Throwable -> L31
                r8.f109738c = r2     // Catch: java.lang.Throwable -> L31
                r8.f109739d = r3     // Catch: java.lang.Throwable -> L31
                java.lang.Object r9 = r9.i(r6, r8)     // Catch: java.lang.Throwable -> L31
                if (r9 != r0) goto L57
                goto L97
            L57:
                Co.b r9 = (Co.Department) r9     // Catch: java.lang.Throwable -> L31
                java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L31
                goto L68
            L5e:
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            L68:
                com.meijer.mobile.meijer.activity.find.viewmodel.i r3 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.this
                java.lang.String r6 = r8.f109743h
                boolean r7 = kotlin.Result.h(r9)
                if (r7 == 0) goto L78
                r7 = r9
                Co.b r7 = (Co.Department) r7
                com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.r(r3, r7, r6)
            L78:
                com.meijer.mobile.meijer.activity.find.viewmodel.i r3 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.this
                java.lang.Throwable r6 = kotlin.Result.e(r9)
                if (r6 == 0) goto L99
                mv.C15784P.h(r1)
                boolean r7 = r6 instanceof java.lang.Error
                if (r7 != 0) goto L98
                r8.f109740e = r1
                r8.f109736a = r9
                r8.f109737b = r6
                r8.f109738c = r2
                r8.f109739d = r5
                java.lang.Object r9 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.t(r3, r6, r8)
                if (r9 != r0) goto L99
            L97:
                return r0
            L98:
                throw r6
            L99:
                com.meijer.mobile.meijer.activity.find.viewmodel.i r9 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.this
                com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.J(r9, r2, r4, r5, r4)
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentTierViewModel$fetchDepartmentByName$1", f = "DepartmentTierViewModel.kt", l = {144, BinsView.TOTE_WIDTH_DP}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109744a;

        /* renamed from: b, reason: collision with root package name */
        Object f109745b;

        /* renamed from: c, reason: collision with root package name */
        int f109746c;

        /* renamed from: d, reason: collision with root package name */
        int f109747d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f109748e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f109750g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f109751h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f109750g = i10;
            this.f109751h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = C12383i.this.new h(this.f109750g, this.f109751h, continuation);
            hVar.f109748e = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        
            if (r3.E(r6, r8) == r0) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v9, types: [mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f109747d
                r2 = 0
                r3 = 1
                r4 = 0
                r5 = 2
                if (r1 == 0) goto L33
                if (r1 == r3) goto L25
                if (r1 != r5) goto L1d
                java.lang.Object r0 = r8.f109745b
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.Object r0 = r8.f109748e
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r9)
                goto L99
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f109744a
                mv.O r1 = (mv.InterfaceC15783O) r1
                java.lang.Object r1 = r8.f109748e
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L31
                goto L57
            L31:
                r9 = move-exception
                goto L5e
            L33:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f109748e
                r1 = r9
                mv.O r1 = (mv.InterfaceC15783O) r1
                com.meijer.mobile.meijer.activity.find.viewmodel.i r9 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.this
                int r6 = r8.f109750g
                kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L31
                com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.J(r9, r3, r4, r5, r4)     // Catch: java.lang.Throwable -> L31
                Ro.c r9 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.q(r9)     // Catch: java.lang.Throwable -> L31
                r8.f109748e = r1     // Catch: java.lang.Throwable -> L31
                r8.f109744a = r1     // Catch: java.lang.Throwable -> L31
                r8.f109746c = r2     // Catch: java.lang.Throwable -> L31
                r8.f109747d = r3     // Catch: java.lang.Throwable -> L31
                java.lang.Object r9 = r9.i(r6, r8)     // Catch: java.lang.Throwable -> L31
                if (r9 != r0) goto L57
                goto L97
            L57:
                Co.b r9 = (Co.Department) r9     // Catch: java.lang.Throwable -> L31
                java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L31
                goto L68
            L5e:
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            L68:
                com.meijer.mobile.meijer.activity.find.viewmodel.i r3 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.this
                java.lang.String r6 = r8.f109751h
                boolean r7 = kotlin.Result.h(r9)
                if (r7 == 0) goto L78
                r7 = r9
                Co.b r7 = (Co.Department) r7
                com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.u(r3, r7, r6)
            L78:
                com.meijer.mobile.meijer.activity.find.viewmodel.i r3 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.this
                java.lang.Throwable r6 = kotlin.Result.e(r9)
                if (r6 == 0) goto L99
                mv.C15784P.h(r1)
                boolean r7 = r6 instanceof java.lang.Error
                if (r7 != 0) goto L98
                r8.f109748e = r1
                r8.f109744a = r9
                r8.f109745b = r6
                r8.f109746c = r2
                r8.f109747d = r5
                java.lang.Object r9 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.t(r3, r6, r8)
                if (r9 != r0) goto L99
            L97:
                return r0
            L98:
                throw r6
            L99:
                com.meijer.mobile.meijer.activity.find.viewmodel.i r9 = com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.this
                com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.J(r9, r2, r4, r5, r4)
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12383i.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentTierViewModel$onAllDepartmentsResult$2", f = "DepartmentTierViewModel.kt", l = {199}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$i, reason: collision with other inner class name */
    static final class C1657i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109752a;

        C1657i(Continuation<? super C1657i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12383i.this.new C1657i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C1657i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109752a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12383i c12383i = C12383i.this;
                NullPointerException nullPointerException = new NullPointerException("No departments returned");
                this.f109752a = 1;
                if (c12383i.E(nullPointerException, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.DepartmentTierViewModel$searchForMarketingUriInAllDepartmentsResult$2", f = "DepartmentTierViewModel.kt", l = {244}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.i$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109754a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12383i.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109754a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12383i c12383i = C12383i.this;
                NullPointerException nullPointerException = new NullPointerException("No departments returned");
                this.f109754a = 1;
                if (c12383i.E(nullPointerException, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    private final Department x(List<Department> categories, String deepLinkUri) {
        if (deepLinkUri != null && deepLinkUri.length() != 0) {
            for (Department department : categories) {
                Department departmentX = x(department.f(), deepLinkUri);
                if (departmentX != null) {
                    return departmentX;
                }
                String url = department.getUrl();
                if (url != null && StringsKt.d0(url, deepLinkUri, false, 2, null)) {
                    return department;
                }
            }
        }
        return null;
    }

    public C12383i(Ro.c productsRepository, yo.k userManager, zl.k featureManager, il.m cartRepository, Tq.j storeProvider, AbstractC15779K ioDispatcher) {
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.productsRepository = productsRepository;
        this.userManager = userManager;
        this.featureManager = featureManager;
        this.cartRepository = cartRepository;
        this.storeProvider = storeProvider;
        this.ioDispatcher = ioDispatcher;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        InterfaceC16549B<ViewState> interfaceC16549BA = pv.S.a(new ViewState(null, null, new CartPreviewDecorator(userManager.b(), 0, 2, null), 3, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        this._events = C16555H.b(0, 0, null, 7, null);
        if (userManager.b()) {
            io.reactivex.l<Integer> lVarSubscribeOn = cartRepository.Q().distinctUntilChanged().subscribeOn(C13889a.b());
            final a aVar2 = new a(this);
            Lu.g<? super Integer> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.g
                @Override // Lu.g
                public final void accept(Object obj) {
                    C12383i.o(aVar2, obj);
                }
            };
            final b bVar = new b(qw.a.INSTANCE);
            Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.h
                @Override // Lu.g
                public final void accept(Object obj) {
                    C12383i.p(bVar, obj);
                }
            }), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Department department, String departmentId) {
        if (department == null) {
            C15809k.d(androidx.view.d0.a(this), null, null, new C1657i(null), 3, null);
            return;
        }
        Department departmentG = G(department, departmentId);
        if (departmentG != null) {
            H(departmentG);
        } else {
            H(department);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int itemCount) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, CartPreviewDecorator.b(viewState.getCartDecorator(), false, itemCount, 1, null), 3, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Department resource, String rawDepartmentNameDeeplink) {
        if (resource == null) {
            C15809k.d(androidx.view.d0.a(this), null, null, new j(null), 3, null);
            return;
        }
        if (rawDepartmentNameDeeplink.length() > 0) {
            Department departmentX = x(resource.f(), C12386j.a(rawDepartmentNameDeeplink));
            if (departmentX != null) {
                H(departmentX);
                return;
            }
            qw.a.INSTANCE.s("Department was not found for deeplink " + rawDepartmentNameDeeplink, new Object[0]);
        }
    }

    private final void H(Department department) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        DepartmentItemDecorator.Companion companion;
        DepartmentItemDecorator departmentItemDecoratorA;
        DepartmentItemDecorator departmentItemDecoratorE;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            List<DepartmentItemDecorator> listC = viewState.c();
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.f143735a = true;
            arrayList = new ArrayList();
            for (Object obj : listC) {
                boolean z10 = booleanRef.f143735a;
                booleanRef.f143735a = !Intrinsics.e(((DepartmentItemDecorator) obj).getDepartment().getId(), department.getParentId());
                if (!z10) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            DepartmentItemDecorator departmentItemDecorator = (DepartmentItemDecorator) CollectionsKt.F0(arrayList);
            Department department2 = (departmentItemDecorator == null || (departmentItemDecoratorE = departmentItemDecorator.e()) == null) ? null : departmentItemDecoratorE.getDepartment();
            companion = DepartmentItemDecorator.INSTANCE;
            departmentItemDecoratorA = companion.a(department, department2);
        } while (!interfaceC16549B.e(value, departmentItemDecoratorA != null ? ViewState.b(viewState, CollectionsKt.Q0(arrayList, departmentItemDecoratorA), null, null, 6, null) : ViewState.b(viewState, CollectionsKt.Q0(CollectionsKt.b1(arrayList, 1), DepartmentItemDecorator.Companion.b(companion, department, null, 2, null)), null, null, 6, null)));
    }

    private final void I(boolean isLoading, AbstractC6392a message) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, new LoadingState(isLoading, message), null, 5, null)));
    }

    static /* synthetic */ void J(C12383i c12383i, boolean z10, AbstractC6392a abstractC6392a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC6392a = null;
        }
        c12383i.I(z10, abstractC6392a);
    }

    public final void A(c action) {
        Intrinsics.j(action, "action");
        if (action instanceof c.FetchDepartmentByDepartmentId) {
            v(((c.FetchDepartmentByDepartmentId) action).getDepartmentId(), this.storeProvider.g());
        } else if (action instanceof c.FindDepartmentByName) {
            w(((c.FindDepartmentByName) action).getMarketingURL(), this.storeProvider.g());
        } else {
            if (!(action instanceof c.PopulateSubDepartmentsAction)) {
                throw new NoWhenBranchMatchedException();
            }
            H(((c.PopulateSubDepartmentsAction) action).getDepartment());
        }
    }

    public final void C() {
        ViewState value;
        ViewState viewState;
        List<DepartmentItemDecorator> listC;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            listC = viewState.c();
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, !listC.isEmpty() ? CollectionsKt.M0(listC, CollectionsKt.D0(listC)) : CollectionsKt.m(), null, null, 6, null)));
    }

    public final InterfaceC16553F<d> getEvents() {
        return C16563h.b(this._events);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    public final pv.P<ViewState> y() {
        return this.viewState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(Throwable th2, Continuation<? super Unit> continuation) throws Throwable {
        RetrofitException retrofitExceptionA = com.meijer.mobile.core.networking.exceptions.a.a(th2);
        qw.a.INSTANCE.e(retrofitExceptionA);
        Object objEmit = this._events.emit(new d.DepartmentErrorEvent(retrofitExceptionA), continuation);
        if (objEmit == IntrinsicsKt.f()) {
            return objEmit;
        }
        return Unit.f143329a;
    }

    private final Department G(Department department, String departmentId) {
        Object next;
        if (departmentId.length() > 0) {
            Iterator<T> it = department.f().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.e(((Department) next).getId(), departmentId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Department department2 = (Department) next;
            if (department2 != null) {
                return department2;
            }
            Iterator<Department> it2 = department.f().iterator();
            while (it2.hasNext()) {
                Department departmentG = G(it2.next(), departmentId);
                if (departmentG != null) {
                    return departmentG;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void v(String departmentId, int storeId) {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new g(storeId, departmentId, null), 2, null);
    }

    private final void w(String rawLink, int storeId) {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new h(storeId, rawLink, null), 2, null);
    }
}
