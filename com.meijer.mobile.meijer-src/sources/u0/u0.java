package u0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.Q1;
import com.fullstory.FS;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.C17778Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.C18431n;
import z1.CommitTextCommand;
import z1.DeleteSurroundingTextCommand;
import z1.DeleteSurroundingTextInCodePointsCommand;
import z1.InterfaceC18426i;
import z1.SetComposingRegionCommand;
import z1.SetComposingTextCommand;
import z1.SetSelectionCommand;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010)J\u001f\u00101\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u0010-J\u001f\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u0010-J\u001f\u00103\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u0010-J\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u0016J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020%2\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020%2\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b=\u0010<J\u0019\u0010>\u001a\u0004\u0018\u00010%2\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0018H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010F\u001a\u00020E2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0018H\u0016¢\u0006\u0004\bI\u0010BJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0018H\u0016¢\u0006\u0004\bK\u0010BJ+\u0010R\u001a\u00020\u00122\u0006\u0010M\u001a\u00020L2\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bR\u0010SJ!\u0010W\u001a\u00020\u00062\u0006\u0010M\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\bZ\u0010[J\u0019\u0010^\u001a\u00020\u00062\b\u0010]\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b^\u0010_J\u0011\u0010a\u001a\u0004\u0018\u00010`H\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0018H\u0016¢\u0006\u0004\bd\u0010BJ\u0017\u0010f\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u00182\u0006\u0010h\u001a\u00020\u0018H\u0016¢\u0006\u0004\bi\u0010jJ#\u0010o\u001a\u00020\u00062\b\u0010l\u001a\u0004\u0018\u00010k2\b\u0010n\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0004\bo\u0010pJ)\u0010t\u001a\u00020\u00062\u0006\u0010r\u001a\u00020q2\u0006\u0010:\u001a\u00020\u00182\b\u0010s\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0004\bt\u0010uR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010}\u001a\u0004\b~\u0010\u007fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000f\n\u0005\b\u0015\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000f\n\u0005\b\u0017\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010\u0086\u0001R2\u0010\u008e\u0001\u001a\u00020\u00022\u0007\u0010\u0088\u0001\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u0089\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u0086\u0001R\u0018\u0010\u0091\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010{R\u001e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010{¨\u0006\u0098\u0001"}, d2 = {"Lu0/u0;", "Landroid/view/inputmethod/InputConnection;", "Lz1/M;", "initState", "Lu0/k0;", "eventCallback", "", "autoCorrect", "Landroidx/compose/foundation/text/B;", "legacyTextFieldState", "Lw0/Q;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "<init>", "(Lz1/M;Lu0/k0;ZLandroidx/compose/foundation/text/B;Lw0/Q;Landroidx/compose/ui/platform/Q1;)V", "Lz1/i;", "editCommand", "", "c", "(Lz1/i;)V", "d", "()Z", "e", "", "code", "f", "(I)V", "state", "Lu0/l0;", "inputMethodManager", "h", "(Lz1/M;Lu0/l0;)V", "beginBatchEdit", "endBatchEdit", "closeConnection", "()V", "", "text", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", PreferencesHelper.PREF_ID, "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "a", "Lu0/k0;", "getEventCallback", "()Lu0/k0;", "b", "Z", "getAutoCorrect", "Landroidx/compose/foundation/text/B;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/B;", "Lw0/Q;", "getTextFieldSelectionManager", "()Lw0/Q;", "Landroidx/compose/ui/platform/Q1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/Q1;", "I", "batchDepth", "value", "g", "Lz1/M;", "getTextFieldValue$foundation_release", "()Lz1/M;", "(Lz1/M;)V", "textFieldValue", "currentExtractedTextRequestToken", "i", "extractedTextMonitorMode", "", "j", "Ljava/util/List;", "editCommands", "k", "isActive", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class u0 implements InputConnection {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0 eventCallback;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean autoCorrect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.text.B legacyTextFieldState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C17778Q textFieldSelectionManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Q1 viewConfiguration;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int batchDepth;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue textFieldValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int currentExtractedTextRequestToken;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean extractedTextMonitorMode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC18426i> editCommands = new ArrayList();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isActive = true;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/i;", "it", "", "a", "(Lz1/i;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<InterfaceC18426i, Unit> {
        a() {
            super(1);
        }

        public final void a(InterfaceC18426i interfaceC18426i) {
            u0.this.c(interfaceC18426i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC18426i interfaceC18426i) {
            a(interfaceC18426i);
            return Unit.f143329a;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        boolean z10 = (flags & 1) != 0;
        this.extractedTextMonitorMode = z10;
        if (z10) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return v0.b(this.textFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    private final boolean d() {
        this.batchDepth++;
        return true;
    }

    private final boolean e() {
        int i10 = this.batchDepth - 1;
        this.batchDepth = i10;
        if (i10 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.d(CollectionsKt.m1(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final void f(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.isActive;
        return z10 ? d() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo text) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        boolean z10 = this.isActive;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.isActive;
        return z10 ? this.autoCorrect : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        boolean z10 = this.isActive;
        if (z10) {
            c(new CommitTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        c(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        c(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        c(new C18431n());
        return true;
    }

    public final void g(TextFieldValue textFieldValue) {
        this.textFieldValue = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.textFieldValue.h(), androidx.compose.ui.text.y.l(this.textFieldValue.getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        if (androidx.compose.ui.text.y.h(this.textFieldValue.getSelection())) {
            return null;
        }
        return z1.N.a(this.textFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return z1.N.b(this.textFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return z1.N.c(this.textFieldValue, maxChars).toString();
    }

    public final void h(TextFieldValue state, l0 inputMethodManager) {
        if (this.isActive) {
            g(state);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.b(this.currentExtractedTextRequestToken, v0.b(state));
            }
            androidx.compose.ui.text.y composition = state.getComposition();
            int iL = composition != null ? androidx.compose.ui.text.y.l(composition.getPackedValue()) : -1;
            androidx.compose.ui.text.y composition2 = state.getComposition();
            inputMethodManager.c(androidx.compose.ui.text.y.l(state.getSelection()), androidx.compose.ui.text.y.k(state.getSelection()), iL, composition2 != null ? androidx.compose.ui.text.y.k(composition2.getPackedValue()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id2) {
        boolean z10 = this.isActive;
        if (z10) {
            z10 = false;
            switch (id2) {
                case R.id.selectAll:
                    c(new SetSelectionCommand(0, this.textFieldValue.h().length()));
                    break;
                case R.id.cut:
                    f(277);
                    break;
                case R.id.copy:
                    f(278);
                    break;
                case R.id.paste:
                    f(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int iA;
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    iA = androidx.compose.ui.text.input.a.INSTANCE.c();
                    break;
                case 3:
                    iA = androidx.compose.ui.text.input.a.INSTANCE.g();
                    break;
                case 4:
                    iA = androidx.compose.ui.text.input.a.INSTANCE.h();
                    break;
                case 5:
                    iA = androidx.compose.ui.text.input.a.INSTANCE.d();
                    break;
                case 6:
                    iA = androidx.compose.ui.text.input.a.INSTANCE.b();
                    break;
                case 7:
                    iA = androidx.compose.ui.text.input.a.INSTANCE.f();
                    break;
                default:
                    FS.log_w("RecordingIC", "IME sends unsupported Editor Action: " + editorAction);
                    iA = androidx.compose.ui.text.input.a.INSTANCE.a();
                    break;
            }
        } else {
            iA = androidx.compose.ui.text.input.a.INSTANCE.a();
        }
        this.eventCallback.c(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture gesture, Executor executor, IntConsumer consumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C17311c.f163526a.b(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, this.viewConfiguration, executor, consumer, new a());
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String action, Bundle data) {
        boolean z10 = this.isActive;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C17311c.f163526a.d(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.isActive;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (cursorUpdateMode & 1) != 0;
        boolean z17 = (cursorUpdateMode & 2) != 0;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            boolean z18 = (cursorUpdateMode & 16) != 0;
            boolean z19 = (cursorUpdateMode & 8) != 0;
            boolean z20 = (cursorUpdateMode & 4) != 0;
            if (i10 >= 34 && (cursorUpdateMode & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i10 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.eventCallback.b(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        this.eventCallback.a(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z10 = this.isActive;
        if (z10) {
            c(new SetComposingRegionCommand(start, end));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        boolean z10 = this.isActive;
        if (z10) {
            c(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        c(new SetSelectionCommand(start, end));
        return true;
    }

    public u0(TextFieldValue textFieldValue, k0 k0Var, boolean z10, androidx.compose.foundation.text.B b10, C17778Q c17778q, Q1 q12) {
        this.eventCallback = k0Var;
        this.autoCorrect = z10;
        this.legacyTextFieldState = b10;
        this.textFieldSelectionManager = c17778q;
        this.viewConfiguration = q12;
        this.textFieldValue = textFieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC18426i editCommand) {
        d();
        try {
            this.editCommands.add(editCommand);
        } finally {
            e();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return e();
    }
}
