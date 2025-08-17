package R0;

import H1.v;
import R0.b;
import Z.AbstractC5519q;
import Z.K;
import Z.W;
import Z.r;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.A1;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.B1;
import androidx.compose.ui.platform.C5911z1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import io.constructor.data.local.PreferencesHelper;
import j1.C14832a;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.AccessibilityAction;
import r1.C16706n;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003X\\bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\rJ\u001d\u0010#\u001a\u0004\u0018\u00010\"*\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J-\u0010'\u001a\u00020\u000b*\u00020\u000e2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0%H\u0002¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u0010\rJ\u001f\u00101\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u0010\rJ\u000f\u00107\u001a\u00020\u000bH\u0002¢\u0006\u0004\b7\u0010\rJ\u000f\u00108\u001a\u00020\u000bH\u0002¢\u0006\u0004\b8\u0010\rJ\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bB\u0010AJ\u0010\u0010C\u001a\u00020\u000bH\u0080@¢\u0006\u0004\bC\u0010DJ\u000f\u0010:\u001a\u00020\u000bH\u0000¢\u0006\u0004\b:\u0010\rJ\u000f\u0010E\u001a\u00020\u000bH\u0000¢\u0006\u0004\bE\u0010\rJ\u000f\u0010F\u001a\u00020\u000bH\u0000¢\u0006\u0004\bF\u0010\rJ\u000f\u0010G\u001a\u00020\u000bH\u0000¢\u0006\u0004\bG\u0010\rJ\u000f\u0010H\u001a\u00020\u000bH\u0000¢\u0006\u0004\bH\u0010\rJ/\u0010P\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u000e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0MH\u0001¢\u0006\u0004\bP\u0010QJ'\u0010V\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u00002\u000e\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0SH\u0001¢\u0006\u0004\bV\u0010WR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R*\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR*\u0010i\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bb\u0010c\u0012\u0004\bh\u0010\r\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020k0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010lR\u0016\u0010p\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010oR\u0016\u0010s\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010rR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010uR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u000b0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010xR\u001a\u0010\u007f\u001a\u00020z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R-\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148@@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b'\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0005\b\u0083\u0001\u0010\u0018R\u0018\u0010\u0085\u0001\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010oR \u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bZ\u0010\u008a\u0001R\u0017\u0010\u008c\u0001\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010uR\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0092\u0001\u001a\u00020t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"LR0/b;", "LR0/o;", "Landroidx/lifecycle/f;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Ln1/d;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function0;)V", "", "A", "()V", "Lr1/n;", "newNode", "Landroidx/compose/ui/platform/z1;", "oldNode", "y", "(Lr1/n;Landroidx/compose/ui/platform/z1;)V", "LZ/q;", "Landroidx/compose/ui/platform/A1;", "newSemanticsNodes", "g", "(LZ/q;)V", "", PreferencesHelper.PREF_ID, "", "newText", "B", "(ILjava/lang/String;)V", "G", "q", "index", "Ln1/f;", "D", "(Lr1/n;I)Ln1/f;", "Lkotlin/Function2;", "action", "j", "(Lr1/n;Lkotlin/jvm/functions/Function2;)V", "virtualId", "viewStructure", "e", "(ILn1/f;)V", "f", "(I)V", "p", "node", "E", "(ILr1/n;)V", "F", "(Lr1/n;)V", "H", "C", "n", "h", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/s;", "owner", "onStart", "(Landroidx/lifecycle/s;)V", "onStop", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "w", "t", "r", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "s", "([J[ILjava/util/function/Consumer;)V", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "x", "(LR0/b;Landroid/util/LongSparseArray;)V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "m", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Lkotlin/jvm/functions/Function0;", "getOnContentCaptureSession", "()Lkotlin/jvm/functions/Function0;", "setOnContentCaptureSession", "(Lkotlin/jvm/functions/Function0;)V", "c", "Ln1/d;", "getContentCaptureSession$ui_release", "()Ln1/d;", "setContentCaptureSession$ui_release", "(Ln1/d;)V", "getContentCaptureSession$ui_release$annotations", "contentCaptureSession", "", "LR0/m;", "Ljava/util/List;", "bufferedEvents", "", "J", "SendRecurringContentCaptureEventsIntervalMillis", "LR0/b$b;", "LR0/b$b;", "translateStatus", "", "Z", "currentSemanticsNodesInvalidated", "Lsv/g;", "Lsv/g;", "boundsUpdateChannel", "Landroid/os/Handler;", "i", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "handler", "LZ/q;", "k", "()LZ/q;", "setCurrentSemanticsNodes$ui_release", "currentSemanticsNodes", "currentSemanticsNodesSnapshotTimestampMillis", "LZ/K;", "l", "LZ/K;", "previousSemanticsNodes", "Landroidx/compose/ui/platform/z1;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "o", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "()Z", "isEnabled", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b implements o, InterfaceC6015f, View.OnAttachStateChangeListener {

    /* renamed from: q, reason: collision with root package name */
    public static final int f31511q = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Function0<? extends n1.d> onContentCaptureSession;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private n1.d contentCaptureSession;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long currentSemanticsNodesSnapshotTimestampMillis;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private C5911z1 previousSemanticsRoot;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private EnumC0713b translateStatus = EnumC0713b.f31527a;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated = true;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final sv.g<Unit> boundsUpdateChannel = sv.j.b(1, null, null, 6, null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private AbstractC5519q<A1> currentSemanticsNodes = r.b();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private K<C5911z1> previousSemanticsNodes = r.c();

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Runnable contentCaptureChangeChecker = new Runnable() { // from class: R0.a
        @Override // java.lang.Runnable
        public final void run() {
            b.i(this.f31509a);
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LR0/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: R0.b$b, reason: collision with other inner class name */
    private static final class EnumC0713b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0713b f31527a = new EnumC0713b("SHOW_ORIGINAL", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0713b f31528b = new EnumC0713b("SHOW_TRANSLATED", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0713b[] f31529c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f31530d;

        static {
            EnumC0713b[] enumC0713bArrA = a();
            f31529c = enumC0713bArrA;
            f31530d = EnumEntriesKt.a(enumC0713bArrA);
        }

        private static final /* synthetic */ EnumC0713b[] a() {
            return new EnumC0713b[]{f31527a, f31528b};
        }

        public static EnumC0713b valueOf(String str) {
            return (EnumC0713b) Enum.valueOf(EnumC0713b.class, str);
        }

        public static EnumC0713b[] values() {
            return (EnumC0713b[]) f31529c.clone();
        }

        private EnumC0713b(String str, int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"LR0/b$c;", "", "<init>", "()V", "LR0/b;", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "", "b", "(LR0/b;Landroid/util/LongSparseArray;)V", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "c", "(LR0/b;[J[ILjava/util/function/Consumer;)V", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f31531a = new c();

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(b bVar, LongSparseArray longSparseArray) {
            f31531a.b(bVar, longSparseArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(R0.b r15, long[] r16, int[] r17, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r18) {
            /*
                r14 = this;
                r0 = r16
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L72
                r3 = r0[r2]
                Z.q r5 = r15.k()
                int r3 = (int) r3
                java.lang.Object r3 = r5.b(r3)
                androidx.compose.ui.platform.A1 r3 = (androidx.compose.ui.platform.A1) r3
                if (r3 == 0) goto L6d
                r1.n r3 = r3.getSemanticsNode()
                if (r3 != 0) goto L1c
                goto L6d
            L1c:
                R0.d.a()
                androidx.compose.ui.platform.AndroidComposeView r4 = r15.getView()
                android.view.autofill.AutofillId r4 = R0.e.a(r4)
                int r5 = r3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = R0.c.a(r4, r5)
                androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getUnmergedConfig()
                androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.getText()
                java.lang.Object r3 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L6d
                r12 = 62
                r13 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r3 = J1.a.e(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r3 == 0) goto L6d
                androidx.compose.ui.text.AnnotatedString r5 = new androidx.compose.ui.text.AnnotatedString
                r6 = 0
                r7 = 2
                r5.<init>(r3, r6, r7, r6)
                java.lang.String r3 = "android:text"
                android.view.translation.TranslationRequestValue r5 = R0.f.a(r5)
                R0.g.a(r4, r3, r5)
                android.view.translation.ViewTranslationRequest r3 = R0.h.a(r4)
                r4 = r18
                r4.accept(r3)
                goto L6f
            L6d:
                r4 = r18
            L6f:
                int r2 = r2 + 1
                goto L4
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: R0.b.c.c(R0.b, long[], int[], java.util.function.Consumer):void");
        }

        public final void d(final b contentCaptureManager, final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: R0.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c.e(contentCaptureManager, response);
                    }
                });
            }
        }

        private c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void b(b contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
            TranslationResponseValue value;
            CharSequence text;
            A1 a1B;
            C16706n c16706nB;
            AccessibilityAction accessibilityAction;
            Function1 function1;
            int size = response.size();
            for (int i10 = 0; i10 < size; i10++) {
                long jKeyAt = response.keyAt(i10);
                ViewTranslationResponse viewTranslationResponseA = i.a(response.get(jKeyAt));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (a1B = contentCaptureManager.k().b((int) jKeyAt)) != null && (c16706nB = a1B.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(c16706nB.getUnmergedConfig(), SemanticsActions.INSTANCE.z())) != null && (function1 = (Function1) accessibilityAction.a()) != null) {
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {177, 186}, m = "boundsUpdatesEventLoop$ui_release")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f31532a;

        /* renamed from: b, reason: collision with root package name */
        Object f31533b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31534c;

        /* renamed from: e, reason: collision with root package name */
        int f31536e;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f31534c = obj;
            this.f31536e |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Lr1/n;", "child", "", "a", "(ILr1/n;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function2<Integer, C16706n, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5911z1 f31537f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f31538g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C5911z1 c5911z1, b bVar) {
            super(2);
            this.f31537f = c5911z1;
            this.f31538g = bVar;
        }

        public final void a(int i10, C16706n c16706n) {
            if (this.f31537f.getChildren().a(c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String())) {
                return;
            }
            this.f31538g.E(i10, c16706n);
            this.f31538g.q();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, C16706n c16706n) {
            a(num.intValue(), c16706n);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "i", "Lr1/n;", "child", "", "a", "(ILr1/n;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function2<Integer, C16706n, Unit> {
        g() {
            super(2);
        }

        public final void a(int i10, C16706n c16706n) {
            b.this.E(i10, c16706n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, C16706n c16706n) {
            a(num.intValue(), c16706n);
            return Unit.f142422a;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v10) {
    }

    public final void u() {
        this.currentSemanticsNodesInvalidated = true;
        if (o()) {
            q();
        }
    }

    public final void v() {
        this.currentSemanticsNodesInvalidated = true;
        if (!o() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.f31546a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.f31547b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void A() {
        K<C5911z1> k10 = this.previousSemanticsNodes;
        int[] iArr = k10.keys;
        long[] jArr = k10.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = iArr[(i10 << 3) + i12];
                        if (!k().a(i13)) {
                            f(i13);
                            q();
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void B(int id2, String newText) {
        n1.d dVar;
        if (Build.VERSION.SDK_INT >= 29 && (dVar = this.contentCaptureSession) != null) {
            AutofillId autofillIdB = dVar.b(id2);
            if (autofillIdB != null) {
                dVar.f(autofillIdB, newText);
            } else {
                C14832a.c("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    private final n1.f D(C16706n c16706n, int i10) {
        n1.b bVarA;
        AutofillId autofillIdA;
        String strI;
        n1.d dVar = this.contentCaptureSession;
        if (dVar == null || Build.VERSION.SDK_INT < 29 || (bVarA = n1.e.a(this.view)) == null) {
            return null;
        }
        if (c16706n.r() != null) {
            autofillIdA = dVar.b(r4.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = bVarA.a();
        }
        n1.f fVarC = dVar.c(autofillIdA, c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        if (fVarC == null) {
            return null;
        }
        SemanticsConfiguration semanticsConfigurationW = c16706n.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfigurationW.contains(semanticsProperties.getPassword())) {
            return null;
        }
        Bundle bundleA = fVarC.a();
        if (bundleA != null) {
            bundleA.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
            bundleA.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i10);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, semanticsProperties.getTestTag());
        if (str != null) {
            fVarC.e(c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, null, str);
        }
        if (((Boolean) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, semanticsProperties.r())) != null) {
            fVarC.b("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, semanticsProperties.getText());
        if (list != null) {
            fVarC.b("android.widget.TextView");
            fVarC.f(J1.a.e(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, semanticsProperties.getEditableText());
        if (annotatedString != null) {
            fVarC.b("android.widget.EditText");
            fVarC.f(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, semanticsProperties.getContentDescription());
        if (list2 != null) {
            fVarC.c(J1.a.e(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, semanticsProperties.getRole());
        if (role != null && (strI = B1.i(role.getValue())) != null) {
            fVarC.b(strI);
        }
        TextLayoutResult textLayoutResultE = B1.e(semanticsConfigurationW);
        if (textLayoutResultE != null) {
            TextLayoutInput layoutInput = textLayoutResultE.getLayoutInput();
            fVarC.g(v.h(layoutInput.getStyle().l()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
        }
        Rect rectH = c16706n.h();
        fVarC.d((int) rectH.getLeft(), (int) rectH.getTop(), 0, 0, (int) (rectH.l() - rectH.getLeft()), (int) (rectH.i() - rectH.getTop()));
        return fVarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G() {
        /*
            r16 = this;
            r0 = r16
            Z.K<androidx.compose.ui.platform.z1> r1 = r0.previousSemanticsNodes
            r1.g()
            Z.q r1 = r0.k()
            int[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            androidx.compose.ui.platform.A1 r12 = (androidx.compose.ui.platform.A1) r12
            Z.K<androidx.compose.ui.platform.z1> r14 = r0.previousSemanticsNodes
            androidx.compose.ui.platform.z1 r15 = new androidx.compose.ui.platform.z1
            r1.n r12 = r12.getSemanticsNode()
            Z.q r5 = r0.k()
            r15.<init>(r12, r5)
            r14.r(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            androidx.compose.ui.platform.z1 r1 = new androidx.compose.ui.platform.z1
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.view
            r1.p r2 = r2.getSemanticsOwner()
            r1.n r2 = r2.d()
            Z.q r3 = r0.k()
            r1.<init>(r2, r3)
            r0.previousSemanticsRoot = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.b.G():void");
    }

    private final void e(int virtualId, n1.f viewStructure) {
        if (viewStructure == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, n.f31546a, viewStructure));
    }

    private final void f(int virtualId) {
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, n.f31547b, null));
    }

    private final void g(AbstractC5519q<A1> newSemanticsNodes) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        C16706n c16706n;
        int i11;
        C16706n c16706n2;
        long j12;
        int i12;
        long[] jArr3;
        AbstractC5519q<A1> abstractC5519q = newSemanticsNodes;
        int[] iArr3 = abstractC5519q.keys;
        long[] jArr4 = abstractC5519q.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr4[i13];
            char c11 = 7;
            long j14 = -9187201950435737472L;
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j13 & 255) < 128) {
                        int i17 = iArr3[(i13 << 3) + i16];
                        c10 = c11;
                        C5911z1 c5911z1B = this.previousSemanticsNodes.b(i17);
                        A1 a1B = abstractC5519q.b(i17);
                        C16706n c16706nB = a1B != null ? a1B.getSemanticsNode() : null;
                        if (c16706nB == null) {
                            C14832a.c("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                        if (c5911z1B == null) {
                            W<SemanticsPropertyKey<?>, Object> wQ = c16706nB.getUnmergedConfig().q();
                            j11 = j14;
                            Object[] objArr = wQ.keys;
                            long[] jArr5 = wQ.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i18 = 0;
                                int i19 = i14;
                                while (true) {
                                    long j15 = jArr5[i18];
                                    iArr2 = iArr3;
                                    if ((((~j15) << c10) & j15 & j11) != j11) {
                                        int i20 = 8 - ((~(i18 - length2)) >>> 31);
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            if ((j15 & 255) < 128) {
                                                i12 = i21;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i18 << 3) + i21];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                                jArr3 = jArr4;
                                                if (Intrinsics.e(semanticsPropertyKey, semanticsProperties.getText())) {
                                                    List list = (List) SemanticsConfigurationKt.getOrNull(c16706nB.getUnmergedConfig(), semanticsProperties.getText());
                                                    B(c16706nB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), String.valueOf(list != null ? (AnnotatedString) CollectionsKt.u0(list) : null));
                                                }
                                            } else {
                                                i12 = i21;
                                                jArr3 = jArr4;
                                            }
                                            j15 >>= i19;
                                            i21 = i12 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i20 != i19) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i19 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j11 = j14;
                            W<SemanticsPropertyKey<?>, Object> wQ2 = c16706nB.getUnmergedConfig().q();
                            Object[] objArr2 = wQ2.keys;
                            long[] jArr6 = wQ2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j16 = jArr6[i22];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j16) << c10) & j16 & j11) != j11) {
                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            if ((j16 & 255) < 128) {
                                                i11 = i24;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr3[(i22 << 3) + i24];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                                c16706n2 = c16706nB;
                                                if (Intrinsics.e(semanticsPropertyKey2, semanticsProperties2.getText())) {
                                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(c5911z1B.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) CollectionsKt.u0(list2) : null;
                                                    j12 = j13;
                                                    List list3 = (List) SemanticsConfigurationKt.getOrNull(c16706n2.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) CollectionsKt.u0(list3) : null;
                                                    if (!Intrinsics.e(annotatedString, annotatedString2)) {
                                                        B(c16706n2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), String.valueOf(annotatedString2));
                                                    }
                                                }
                                                j16 >>= 8;
                                                i24 = i11 + 1;
                                                c16706nB = c16706n2;
                                                j13 = j12;
                                            } else {
                                                i11 = i24;
                                                c16706n2 = c16706nB;
                                            }
                                            j12 = j13;
                                            j16 >>= 8;
                                            i24 = i11 + 1;
                                            c16706nB = c16706n2;
                                            j13 = j12;
                                        }
                                        c16706n = c16706nB;
                                        j10 = j13;
                                        if (i23 != 8) {
                                            break;
                                        }
                                    } else {
                                        c16706n = c16706nB;
                                        j10 = j13;
                                    }
                                    if (i22 == length3) {
                                        break;
                                    }
                                    i22++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    c16706nB = c16706n;
                                    j13 = j10;
                                }
                            }
                            i10 = 8;
                        }
                        j10 = j13;
                        i10 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j10 = j13;
                        c10 = c11;
                        j11 = j14;
                        i10 = i14;
                    }
                    j13 = j10 >> i10;
                    i16++;
                    abstractC5519q = newSemanticsNodes;
                    i14 = i10;
                    c11 = c10;
                    j14 = j11;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i15 != i14) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            abstractC5519q = newSemanticsNodes;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void p() {
        AutofillId autofillIdB;
        n1.d dVar = this.contentCaptureSession;
        if (dVar == null || Build.VERSION.SDK_INT < 29 || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i10);
            int i11 = d.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i11 == 1) {
                n1.f structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    dVar.d(structureCompat.h());
                }
            } else if (i11 == 2 && (autofillIdB = dVar.b(contentCaptureEvent.getId())) != null) {
                dVar.e(autofillIdB);
            }
        }
        dVar.a();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        this.boundsUpdateChannel.k(Unit.f142422a);
    }

    private final void y(C16706n newNode, C5911z1 oldNode) {
        j(newNode, new f(oldNode, this));
        List<C16706n> listT = newNode.t();
        int size = listT.size();
        for (int i10 = 0; i10 < size; i10++) {
            C16706n c16706n = listT.get(i10);
            if (k().a(c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) && this.previousSemanticsNodes.a(c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String())) {
                C5911z1 c5911z1B = this.previousSemanticsNodes.b(c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
                if (c5911z1B == null) {
                    C14832a.c("node not present in pruned tree before this change");
                    throw new KotlinNothingValueException();
                }
                y(c16706n, c5911z1B);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (qv.Z.b(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof R0.b.e
            if (r0 == 0) goto L13
            r0 = r10
            R0.b$e r0 = (R0.b.e) r0
            int r1 = r0.f31536e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31536e = r1
            goto L18
        L13:
            R0.b$e r0 = new R0.b$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f31534c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f31536e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r2 = r0.f31533b
            sv.i r2 = (sv.i) r2
            java.lang.Object r5 = r0.f31532a
            R0.b r5 = (R0.b) r5
            kotlin.ResultKt.b(r10)
        L33:
            r10 = r2
            r2 = r5
            goto L54
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3e:
            java.lang.Object r2 = r0.f31533b
            sv.i r2 = (sv.i) r2
            java.lang.Object r5 = r0.f31532a
            R0.b r5 = (R0.b) r5
            kotlin.ResultKt.b(r10)
            goto L65
        L4a:
            kotlin.ResultKt.b(r10)
            sv.g<kotlin.Unit> r10 = r9.boundsUpdateChannel
            sv.i r10 = r10.iterator()
            r2 = r9
        L54:
            r0.f31532a = r2
            r0.f31533b = r10
            r0.f31536e = r4
            java.lang.Object r5 = r10.a(r0)
            if (r5 != r1) goto L61
            goto L94
        L61:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L95
            r2.next()
            boolean r10 = r5.o()
            if (r10 == 0) goto L79
            r5.p()
        L79:
            boolean r10 = r5.checkingForSemanticsChanges
            if (r10 != 0) goto L86
            r5.checkingForSemanticsChanges = r4
            android.os.Handler r10 = r5.handler
            java.lang.Runnable r6 = r5.contentCaptureChangeChecker
            r10.post(r6)
        L86:
            long r6 = r5.SendRecurringContentCaptureEventsIntervalMillis
            r0.f31532a = r5
            r0.f31533b = r2
            r0.f31536e = r3
            java.lang.Object r10 = qv.Z.b(r6, r0)
            if (r10 != r1) goto L33
        L94:
            return r1
        L95:
            kotlin.Unit r10 = kotlin.Unit.f142422a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.b.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final AbstractC5519q<A1> k() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = B1.b(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    /* renamed from: m, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean o() {
        return o.INSTANCE.a() && this.contentCaptureSession != null;
    }

    @Override // androidx.view.InterfaceC6015f
    public void onStart(InterfaceC6030s owner) {
        this.contentCaptureSession = this.onContentCaptureSession.invoke();
        E(-1, this.view.getSemanticsOwner().d());
        p();
    }

    @Override // androidx.view.InterfaceC6015f
    public void onStop(InterfaceC6030s owner) {
        F(this.view.getSemanticsOwner().d());
        p();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void r() {
        this.translateStatus = EnumC0713b.f31527a;
        h();
    }

    public final void s(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        c.f31531a.c(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void t() {
        this.translateStatus = EnumC0713b.f31527a;
        n();
    }

    public final void w() {
        this.translateStatus = EnumC0713b.f31528b;
        C();
    }

    public final void x(b contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
        c.f31531a.d(contentCaptureManager, response);
    }

    public b(AndroidComposeView androidComposeView, Function0<? extends n1.d> function0) {
        this.view = androidComposeView;
        this.onContentCaptureSession = function0;
        this.previousSemanticsRoot = new C5911z1(androidComposeView.getSemanticsOwner().d(), r.b());
    }

    private final void C() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        AbstractC5519q<A1> abstractC5519qK = k();
        Object[] objArr = abstractC5519qK.values;
        long[] jArr = abstractC5519qK.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            SemanticsConfiguration semanticsConfigurationW = ((A1) objArr[(i10 << 3) + i12]).getSemanticsNode().getUnmergedConfig();
                            if (Intrinsics.e(SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, SemanticsProperties.INSTANCE.q()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, SemanticsActions.INSTANCE.A())) != null && (function1 = (Function1) accessibilityAction.a()) != null) {
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(int index, C16706n node) {
        if (!o()) {
            return;
        }
        H(node);
        e(node.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), D(node, index));
        j(node, new g());
    }

    private final void F(C16706n node) {
        if (o()) {
            f(node.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
            List<C16706n> listT = node.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                F(listT.get(i10));
            }
        }
    }

    private final void H(C16706n node) {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Function1 function12;
        SemanticsConfiguration semanticsConfigurationW = node.getUnmergedConfig();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, SemanticsProperties.INSTANCE.q());
        if (this.translateStatus == EnumC0713b.f31527a && Intrinsics.e(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, SemanticsActions.INSTANCE.A());
            if (accessibilityAction2 != null && (function12 = (Function1) accessibilityAction2.a()) != null) {
                return;
            }
            return;
        }
        if (this.translateStatus == EnumC0713b.f31528b && Intrinsics.e(bool, Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, SemanticsActions.INSTANCE.A())) != null && (function1 = (Function1) accessibilityAction.a()) != null) {
        }
    }

    private final void h() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        AbstractC5519q<A1> abstractC5519qK = k();
        Object[] objArr = abstractC5519qK.values;
        long[] jArr = abstractC5519qK.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            SemanticsConfiguration semanticsConfigurationW = ((A1) objArr[(i10 << 3) + i12]).getSemanticsNode().getUnmergedConfig();
                            if (SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, SemanticsProperties.INSTANCE.q()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, SemanticsActions.INSTANCE.a())) != null && (function0 = (Function0) accessibilityAction.a()) != null) {
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(b bVar) {
        if (!bVar.o()) {
            return;
        }
        Owner.b(bVar.view, false, 1, null);
        bVar.A();
        bVar.y(bVar.view.getSemanticsOwner().d(), bVar.previousSemanticsRoot);
        bVar.g(bVar.k());
        bVar.G();
        bVar.checkingForSemanticsChanges = false;
    }

    private final void j(C16706n c16706n, Function2<? super Integer, ? super C16706n, Unit> function2) {
        List<C16706n> listT = c16706n.t();
        int size = listT.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C16706n c16706n2 = listT.get(i11);
            if (k().a(c16706n2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String())) {
                function2.invoke(Integer.valueOf(i10), c16706n2);
                i10++;
            }
        }
    }

    private final void n() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        AbstractC5519q<A1> abstractC5519qK = k();
        Object[] objArr = abstractC5519qK.values;
        long[] jArr = abstractC5519qK.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            SemanticsConfiguration semanticsConfigurationW = ((A1) objArr[(i10 << 3) + i12]).getSemanticsNode().getUnmergedConfig();
                            if (Intrinsics.e(SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, SemanticsProperties.INSTANCE.q()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationW, SemanticsActions.INSTANCE.A())) != null && (function1 = (Function1) accessibilityAction.a()) != null) {
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }
}
