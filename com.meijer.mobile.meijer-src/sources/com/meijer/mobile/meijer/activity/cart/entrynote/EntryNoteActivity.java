package com.meijer.mobile.meijer.activity.cart.entrynote;

import Nn.K;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.activity.cart.entrynote.i;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import tr.C17284b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/EntryNoteActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LBj/b;", "<init>", "()V", "", "M1", "", "note", "T1", "(Ljava/lang/String;)V", "S1", "initialEntryNote", "noteType", "V1", "(Ljava/lang/String;Ljava/lang/String;)V", "", "currentCount", "K1", "(ILjava/lang/String;)V", "count", "R1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i;", "s", "Lkotlin/Lazy;", "L1", "()Lcom/meijer/mobile/meijer/activity/cart/entrynote/i;", "entryNoteViewModel", "Landroidx/appcompat/widget/Toolbar;", "t", "y", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "LNn/K;", "u", "LNn/K;", "binding", "v", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class EntryNoteActivity extends Hilt_EntryNoteActivity implements Bj.b {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f102620w = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy entryNoteViewModel = new e0(Reflection.b(i.class), new f(this), new e(this), new g(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy toolbar = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.entrynote.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EntryNoteActivity.U1(this.f102645a);
        }
    });

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private K binding;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/EntryNoteActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "entryNumberToAddNote", "", "entryNote", "noteType", "Landroid/content/Intent;", "a", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "ENTRY_NOTE_MAX_COUNT", "I", "DELIVERY_NOTE_MAX_COUNT", "FIRST_ENTRY_ANNOUNCEMENT_VALUE", "SECOND_ENTRY_ANNOUNCEMENT_VALUE", "FIRST_DELIVERY_ANNOUNCEMENT_VALUE", "SECOND_DELIVERY_ANNOUNCEMENT_VALUE", "EXTRA_ENTRY_NUMBER_TO_ADD_NOTE", "Ljava/lang/String;", "EXTRA_ENTRY_NOTE", "EXTRA_NOTE_TYPE", "EXTRA_ENTRY_NOTE_TYPE", "EXTRA_DELIVERY_NOTE_TYPE", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Intent b(Companion companion, Context context, int i10, String str, String str2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return companion.a(context, i10, str, str2);
        }

        @JvmStatic
        public final Intent a(Context context, int entryNumberToAddNote, String entryNote, String noteType) {
            Intrinsics.j(context, "context");
            Intrinsics.j(entryNote, "entryNote");
            Intrinsics.j(noteType, "noteType");
            Intent intent = new Intent(context, (Class<?>) EntryNoteActivity.class);
            if (noteType.contentEquals("com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE")) {
                intent.putExtra("com.meijer.intent.extra.EXTRA_ENTRY_NUMBER_TO_ADD_NOTE", entryNumberToAddNote);
                intent.putExtra("com.meijer.intent.extra.EXTRA_ENTRY_NOTE", entryNote);
                intent.putExtra("com.meijer.intent.extra.EXTRA_NOTE_TYPE", "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE");
                return intent;
            }
            if (noteType.contentEquals("com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE")) {
                intent.putExtra("com.meijer.intent.extra.EXTRA_ENTRY_NOTE", entryNote);
                intent.putExtra("com.meijer.intent.extra.EXTRA_NOTE_TYPE", "com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE");
            }
            return intent;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"com/meijer/mobile/meijer/activity/cart/entrynote/EntryNoteActivity$b", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f102625b;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public b(String str) {
            this.f102625b = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            EntryNoteActivity.this.L1().E(String.valueOf(s10));
            if (s10 != null) {
                EntryNoteActivity entryNoteActivity = EntryNoteActivity.this;
                int length = s10.length();
                String str = this.f102625b;
                Intrinsics.g(str);
                entryNoteActivity.K1(length, str);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102632f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f102632f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f102632f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102633f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f102633f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f102633f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f102634f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102635g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f102634f = function0;
            this.f102635g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f102634f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f102635g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteActivity$onCreate$2", f = "EntryNoteActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<i.EntryNoteViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102626a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f102627b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = EntryNoteActivity.this.new c(continuation);
            cVar.f102627b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i.EntryNoteViewState entryNoteViewState, Continuation<? super Unit> continuation) {
            return ((c) create(entryNoteViewState, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            IntrinsicsKt.f();
            if (this.f102626a == 0) {
                ResultKt.b(obj);
                i.EntryNoteViewState entryNoteViewState = (i.EntryNoteViewState) this.f102627b;
                K k10 = EntryNoteActivity.this.binding;
                K k11 = null;
                if (k10 == null) {
                    Intrinsics.x("binding");
                    k10 = null;
                }
                MaterialButton materialButton = k10.f21495I;
                boolean z11 = false;
                if (entryNoteViewState.getIsEntryNoteValid() && !entryNoteViewState.getLoadingState().getIsLoading()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                materialButton.setEnabled(z10);
                K k12 = EntryNoteActivity.this.binding;
                if (k12 == null) {
                    Intrinsics.x("binding");
                    k12 = null;
                }
                MaterialButton materialButton2 = k12.f21497z;
                if (entryNoteViewState.getIsEntryNoteValid() && !entryNoteViewState.getLoadingState().getIsLoading()) {
                    z11 = true;
                }
                materialButton2.setEnabled(z11);
                K k13 = EntryNoteActivity.this.binding;
                if (k13 == null) {
                    Intrinsics.x("binding");
                } else {
                    k11 = k13;
                }
                k11.f21491E.W(entryNoteViewState.getLoadingState().getIsLoading());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteActivity$onCreate$4", f = "EntryNoteActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<i.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102629a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f102630b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = EntryNoteActivity.this.new d(continuation);
            dVar.f102630b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i.c cVar, Continuation<? super Unit> continuation) {
            return ((d) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f102629a == 0) {
                ResultKt.b(obj);
                i.c cVar = (i.c) this.f102630b;
                if (cVar instanceof i.c.FailEvent) {
                    K k10 = EntryNoteActivity.this.binding;
                    if (k10 == null) {
                        Intrinsics.x("binding");
                        k10 = null;
                    }
                    Snackbar.q0(k10.getRoot(), ((i.c.FailEvent) cVar).getMessageResId(), 0).c0();
                } else if (cVar instanceof i.c.b) {
                    EntryNoteActivity.this.setResult(59343);
                    EntryNoteActivity.this.finish();
                } else if (cVar instanceof i.c.a) {
                    EntryNoteActivity.this.finish();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(int currentCount, String noteType) {
        if (Intrinsics.e(noteType, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE")) {
            if (currentCount == 50) {
                R1(currentCount, noteType);
                return;
            } else if (currentCount == 90) {
                R1(currentCount, noteType);
                return;
            } else {
                if (currentCount != 99) {
                    return;
                }
                R1(currentCount, noteType);
                return;
            }
        }
        if (Intrinsics.e(noteType, "com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE")) {
            if (currentCount == 100) {
                R1(currentCount, noteType);
            } else if (currentCount == 200) {
                R1(currentCount, noteType);
            } else {
                if (currentCount != 250) {
                    return;
                }
                R1(currentCount, noteType);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i L1() {
        return (i) this.entryNoteViewModel.getValue();
    }

    private final void R1(int count, String noteType) {
        K k10 = null;
        if (Intrinsics.e(noteType, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE")) {
            K k11 = this.binding;
            if (k11 == null) {
                Intrinsics.x("binding");
            } else {
                k10 = k11;
            }
            k10.f21489C.announceForAccessibility(getString(C17284b.f163304V, Integer.valueOf(count), 99));
            return;
        }
        if (Intrinsics.e(noteType, "com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE")) {
            K k12 = this.binding;
            if (k12 == null) {
                Intrinsics.x("binding");
            } else {
                k10 = k12;
            }
            k10.f21489C.announceForAccessibility(getString(C17284b.f163304V, Integer.valueOf(count), 250));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialToolbar U1(EntryNoteActivity entryNoteActivity) {
        K k10 = entryNoteActivity.binding;
        if (k10 == null) {
            Intrinsics.x("binding");
            k10 = null;
        }
        return k10.f21494H;
    }

    @Override // Bj.b
    public Toolbar y() {
        Object value = this.toolbar.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (Toolbar) value;
    }

    private final void M1() {
        getWindow().addFlags(16);
        Object systemService = getSystemService("input_method");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N1(EntryNoteActivity entryNoteActivity) {
        if (!entryNoteActivity.onNavigateUp()) {
            entryNoteActivity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O1(EntryNoteActivity entryNoteActivity, String str, View view) {
        entryNoteActivity.M1();
        K k10 = null;
        if (Intrinsics.e(str, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE")) {
            K k11 = entryNoteActivity.binding;
            if (k11 == null) {
                Intrinsics.x("binding");
            } else {
                k10 = k11;
            }
            entryNoteActivity.T1(String.valueOf(k10.f21489C.getText()));
            return;
        }
        if (Intrinsics.e(str, "com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE")) {
            K k12 = entryNoteActivity.binding;
            if (k12 == null) {
                Intrinsics.x("binding");
            } else {
                k10 = k12;
            }
            entryNoteActivity.S1(String.valueOf(k10.f21489C.getText()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P1(EntryNoteActivity entryNoteActivity, String str, View view) {
        entryNoteActivity.M1();
        K k10 = null;
        if (Intrinsics.e(str, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE")) {
            K k11 = entryNoteActivity.binding;
            if (k11 == null) {
                Intrinsics.x("binding");
            } else {
                k10 = k11;
            }
            entryNoteActivity.T1(String.valueOf(k10.f21489C.getText()));
            return;
        }
        if (Intrinsics.e(str, "com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE")) {
            K k12 = entryNoteActivity.binding;
            if (k12 == null) {
                Intrinsics.x("binding");
            } else {
                k10 = k12;
            }
            entryNoteActivity.S1(String.valueOf(k10.f21489C.getText()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q1(EntryNoteActivity entryNoteActivity, String str, View view) {
        entryNoteActivity.M1();
        if (Intrinsics.e(str, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE")) {
            entryNoteActivity.T1(null);
        } else if (Intrinsics.e(str, "com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE")) {
            entryNoteActivity.S1(null);
        }
    }

    private final void S1(String note) {
        L1().A(new i.b.SetDeliveryNote(note));
    }

    private final void T1(String note) {
        L1().A(new i.b.SetEntryNote(getIntent().getIntExtra("com.meijer.intent.extra.EXTRA_ENTRY_NUMBER_TO_ADD_NOTE", 0), note));
    }

    private final void V1(String initialEntryNote, String noteType) {
        L1().D(initialEntryNote, noteType);
        K k10 = null;
        if (initialEntryNote.length() > 0) {
            y().setTitle(getString(C17284b.f163280J));
            K k11 = this.binding;
            if (k11 == null) {
                Intrinsics.x("binding");
                k11 = null;
            }
            MaterialButton addNoteButton = k11.f21497z;
            Intrinsics.i(addNoteButton, "addNoteButton");
            addNoteButton.setVisibility(8);
            K k12 = this.binding;
            if (k12 == null) {
                Intrinsics.x("binding");
                k12 = null;
            }
            ConstraintLayout noteEditionSection = k12.f21490D;
            Intrinsics.i(noteEditionSection, "noteEditionSection");
            noteEditionSection.setVisibility(0);
            K k13 = this.binding;
            if (k13 == null) {
                Intrinsics.x("binding");
                k13 = null;
            }
            k13.f21489C.setText(initialEntryNote);
        }
        K k14 = this.binding;
        if (k14 == null) {
            Intrinsics.x("binding");
        } else {
            k10 = k14;
        }
        MaterialToolbar toolbar = k10.f21494H;
        Intrinsics.i(toolbar, "toolbar");
        Aj.c.a(toolbar, true);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.i(layoutInflater, "getLayoutInflater(...)");
        K k10 = null;
        K k11 = (K) Fs.a.a(layoutInflater, V.f100273s, null, false);
        this.binding = k11;
        if (k11 == null) {
            Intrinsics.x("binding");
            k11 = null;
        }
        setContentView(Zr.a.j(k11.getRoot(), false, 1, null));
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.entrynote.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EntryNoteActivity.N1(this.f102638a);
            }
        }, 3, null);
        getLifecycle().a(L1());
        String stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_ENTRY_NOTE");
        final String stringExtra2 = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_NOTE_TYPE");
        if (Intrinsics.e(stringExtra2, "com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE")) {
            K k12 = this.binding;
            if (k12 == null) {
                Intrinsics.x("binding");
                k12 = null;
            }
            k12.f21493G.setCounterMaxLength(99);
        } else if (Intrinsics.e(stringExtra2, "com.meijer.intent.extra.EXTRA_DELIVERY_NOTE_TYPE")) {
            y().setTitle(getString(C17284b.f163313c));
            K k13 = this.binding;
            if (k13 == null) {
                Intrinsics.x("binding");
                k13 = null;
            }
            k13.f21493G.setCounterMaxLength(250);
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        V1(stringExtra, str);
        C16563h.J(C16563h.O(L1().x(), new c(null)), C6173t.a(this));
        K k14 = this.binding;
        if (k14 == null) {
            Intrinsics.x("binding");
            k14 = null;
        }
        TextInputEditText note = k14.f21489C;
        Intrinsics.i(note, "note");
        note.addTextChangedListener(new b(stringExtra2));
        C16563h.J(C16563h.O(L1().getEvents(), new d(null)), C6173t.a(this));
        K k15 = this.binding;
        if (k15 == null) {
            Intrinsics.x("binding");
            k15 = null;
        }
        k15.f21497z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.entrynote.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EntryNoteActivity.O1(this.f102639a, stringExtra2, view);
            }
        });
        K k16 = this.binding;
        if (k16 == null) {
            Intrinsics.x("binding");
            k16 = null;
        }
        k16.f21495I.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.entrynote.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EntryNoteActivity.P1(this.f102641a, stringExtra2, view);
            }
        });
        K k17 = this.binding;
        if (k17 == null) {
            Intrinsics.x("binding");
        } else {
            k10 = k17;
        }
        k10.f21488B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.entrynote.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EntryNoteActivity.Q1(this.f102643a, stringExtra2, view);
            }
        });
    }
}
