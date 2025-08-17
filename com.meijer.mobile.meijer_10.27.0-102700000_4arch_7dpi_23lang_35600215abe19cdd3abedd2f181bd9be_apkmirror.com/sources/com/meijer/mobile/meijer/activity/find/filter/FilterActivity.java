package com.meijer.mobile.meijer.activity.find.filter;

import Qo.FilterSortOption;
import Qo.l;
import V2.CreationExtras;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.find.filter.i;
import com.meijer.mobile.meijer.activity.find.filter.j;
import d0.C13448o;
import e.C13589e;
import java.io.Serializable;
import je.C14886b;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0003R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/FilterActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/find/filter/i$c;", "event", "", "O1", "(Lcom/meijer/mobile/meijer/activity/find/filter/i$c;)V", "Lcom/meijer/mobile/meijer/activity/find/filter/i$a;", "finishEvent", "J1", "(Lcom/meijer/mobile/meijer/activity/find/filter/i$a;)V", "K1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lcom/meijer/mobile/meijer/activity/find/filter/o;", "s", "Lkotlin/Lazy;", "L1", "()Lcom/meijer/mobile/meijer/activity/find/filter/o;", "filterViewModel", "Lcom/meijer/mobile/meijer/activity/find/filter/h;", "t", "M1", "()Lcom/meijer/mobile/meijer/activity/find/filter/h;", "key", "u", "a", "Lcom/meijer/mobile/meijer/activity/find/filter/k;", "state", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class FilterActivity extends Hilt_FilterActivity {

    /* renamed from: v, reason: collision with root package name */
    public static final int f106692v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy filterViewModel = new e0(Reflection.b(o.class), new f(this), new e(this), new g(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy key = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.filter.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilterActivity.N1(this.f106705a);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.f106709b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.f106708a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.f106710c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.filter.FilterActivity$onCreate$2", f = "FilterActivity.kt", l = {78}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106695a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FilterActivity f106697a;

            a(FilterActivity filterActivity) {
                this.f106697a = filterActivity;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i iVar, Continuation<? super Unit> continuation) {
                if (iVar instanceof i.FinishWithResult) {
                    this.f106697a.J1((i.FinishWithResult) iVar);
                } else if (iVar instanceof i.b) {
                    this.f106697a.K1();
                } else {
                    if (!(iVar instanceof i.ShowSaveChangesDialogEvent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f106697a.O1((i.ShowSaveChangesDialogEvent) iVar);
                }
                return Unit.f142422a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FilterActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106695a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f<i> interfaceC17152fP = FilterActivity.this.L1().p();
                a aVar = new a(FilterActivity.this);
                this.f106695a = 1;
                if (interfaceC17152fP.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {
        d() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-222552715, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.FilterActivity.onCreate.<anonymous> (FilterActivity.kt:87)");
            }
            z1 z1VarB = o1.b(FilterActivity.this.L1().r(), null, composer, 0, 1);
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            o oVarL1 = FilterActivity.this.L1();
            k kVarB = b(z1VarB);
            composer.startReplaceGroup(875214168);
            boolean z10 = FilterActivity.this.getFeatureManager().e(AbstractC18227f.C18243q.f170596h) && C13448o.a(composer, 0);
            composer.P();
            Um.c.c(oVarL1, kVarB, z10, modifierFsUnmask, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        private static final k b(z1<? extends k> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106699f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f106699f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106699f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106700f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f106700f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f106700f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106701f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106702g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106701f = function0;
            this.f106702g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106701f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106702g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1() {
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o L1() {
        return (o) this.filterViewModel.getValue();
    }

    private final h M1() {
        return (h) this.key.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(i.ShowSaveChangesDialogEvent event) {
        new C14886b(this).setTitle(event.getTitle()).setMessage(event.getMessage()).setPositiveButton(event.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.filter.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                FilterActivity.P1(this.f106706a, dialogInterface, i10);
            }
        }).setNegativeButton(event.getNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.filter.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                FilterActivity.Q1(this.f106707a, dialogInterface, i10);
            }
        }).setCancelable(false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(i.FinishWithResult finishEvent) {
        Object obj;
        Intent intentPutExtra;
        Object obj2;
        Object obj3;
        int i10 = b.$EnumSwitchMapping$0[M1().ordinal()];
        Parcelable parcelable = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    Intent intent = new Intent();
                    String strName = M1().name();
                    Intent intent2 = getIntent();
                    Intrinsics.i(intent2, "getIntent(...)");
                    String strName2 = M1().name();
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj3 = (Parcelable) intent2.getParcelableExtra(strName2, l.BrowseCollection.class);
                    } else {
                        Parcelable parcelableExtra = intent2.getParcelableExtra(strName2);
                        if (parcelableExtra instanceof l.BrowseCollection) {
                            parcelable = parcelableExtra;
                        }
                        obj3 = (l.BrowseCollection) parcelable;
                    }
                    Intrinsics.g(obj3);
                    intentPutExtra = intent.putExtra(strName, l.BrowseCollection.v((l.BrowseCollection) obj3, null, 0, 0, null, null, 0, null, false, null, null, null, finishEvent.getQuery().G3(), finishEvent.getQuery().getSelectedSort(), null, null, 26623, null));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                Intent intent3 = new Intent();
                String strName3 = M1().name();
                Intent intent4 = getIntent();
                Intrinsics.i(intent4, "getIntent(...)");
                String strName4 = M1().name();
                if (Build.VERSION.SDK_INT >= 33) {
                    obj2 = (Parcelable) intent4.getParcelableExtra(strName4, l.Search.class);
                } else {
                    Parcelable parcelableExtra2 = intent4.getParcelableExtra(strName4);
                    if (parcelableExtra2 instanceof l.Search) {
                        parcelable = parcelableExtra2;
                    }
                    obj2 = (l.Search) parcelable;
                }
                Intrinsics.g(obj2);
                intentPutExtra = intent3.putExtra(strName3, l.Search.v((l.Search) obj2, null, null, null, 0, 0, null, null, 0, null, false, null, null, finishEvent.getQuery().G3(), finishEvent.getQuery().getSelectedSort(), null, null, null, null, null, 511999, null));
            }
        } else {
            Intent intent5 = new Intent();
            String strName5 = M1().name();
            Intent intent6 = getIntent();
            Intrinsics.i(intent6, "getIntent(...)");
            String strName6 = M1().name();
            if (Build.VERSION.SDK_INT >= 33) {
                obj = (Parcelable) intent6.getParcelableExtra(strName6, l.Department.class);
            } else {
                Parcelable parcelableExtra3 = intent6.getParcelableExtra(strName6);
                if (parcelableExtra3 instanceof l.Department) {
                    parcelable = parcelableExtra3;
                }
                obj = (l.Department) parcelable;
            }
            Intrinsics.g(obj);
            intentPutExtra = intent5.putExtra(strName5, l.Department.v((l.Department) obj, null, 0, 0, null, null, 0, null, false, null, null, null, null, finishEvent.getQuery().G3(), finishEvent.getQuery().getSelectedSort(), null, 20479, null));
        }
        setResult(-1, intentPutExtra);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h N1(FilterActivity filterActivity) {
        Object serializableExtra;
        Intent intent = filterActivity.getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("FILTER_AND_SORT_ACTIVITY_LAUNCH_KEY", h.class);
        } else {
            Serializable serializableExtra2 = intent.getSerializableExtra("FILTER_AND_SORT_ACTIVITY_LAUNCH_KEY");
            if (!(serializableExtra2 instanceof h)) {
                serializableExtra2 = null;
            }
            serializableExtra = (h) serializableExtra2;
        }
        Intrinsics.g(serializableExtra);
        return (h) serializableExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P1(FilterActivity filterActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        filterActivity.L1().u(j.e.f106724a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q1(FilterActivity filterActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        filterActivity.L1().u(j.d.f106723a);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        L1().u(j.c.f106722a);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        int i10 = b.$EnumSwitchMapping$0[M1().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    Intent intent = getIntent();
                    Intrinsics.i(intent, "getIntent(...)");
                    String strName = M1().name();
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) intent.getParcelableExtra(strName, l.BrowseCollection.class);
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra(strName);
                        if (!(parcelableExtra instanceof l.BrowseCollection)) {
                            parcelableExtra = null;
                        }
                        parcelable = (l.BrowseCollection) parcelableExtra;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                Intent intent2 = getIntent();
                Intrinsics.i(intent2, "getIntent(...)");
                String strName2 = M1().name();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) intent2.getParcelableExtra(strName2, l.Search.class);
                } else {
                    Parcelable parcelableExtra2 = intent2.getParcelableExtra(strName2);
                    if (!(parcelableExtra2 instanceof l.Search)) {
                        parcelableExtra2 = null;
                    }
                    parcelable = (l.Search) parcelableExtra2;
                }
            }
        } else {
            Intent intent3 = getIntent();
            Intrinsics.i(intent3, "getIntent(...)");
            String strName3 = M1().name();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent3.getParcelableExtra(strName3, l.Department.class);
            } else {
                Parcelable parcelableExtra3 = intent3.getParcelableExtra(strName3);
                if (!(parcelableExtra3 instanceof l.Department)) {
                    parcelableExtra3 = null;
                }
                parcelable = (l.Department) parcelableExtra3;
            }
        }
        if (parcelable != null) {
            o oVarL1 = L1();
            l.k kVar = (l.k) parcelable;
            j.LoadItems loadItems = new j.LoadItems(kVar);
            if (kVar.getSelectedSort() == null) {
                kVar.o1((FilterSortOption) CollectionsKt.u0(kVar.u3()));
            }
            oVarL1.u(loadItems);
            L1().u(new j.SetQuery((Qo.l) parcelable));
        }
        C16648k.d(C6031t.a(this), null, null, new c(null), 3, null);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-222552715, true, new d()), 1, null);
    }
}
