package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.y;
import com.fullstory.FS;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.C18431n;
import z1.C18437u;
import z1.CommitTextCommand;
import z1.DeleteSurroundingTextCommand;
import z1.DeleteSurroundingTextInCodePointsCommand;
import z1.InterfaceC18426i;
import z1.InterfaceC18435s;
import z1.N;
import z1.SetComposingRegionCommand;
import z1.SetComposingTextCommand;
import z1.SetSelectionCommand;
import z1.TextFieldValue;
import z1.r;

@Deprecated
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010#J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010'J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010'J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0010J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b7\u00106J\u0019\u00108\u001a\u0004\u0018\u00010\u001f2\u0006\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u0010<J!\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0012H\u0016¢\u0006\u0004\bC\u0010<J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u0012H\u0016¢\u0006\u0004\bE\u0010<J\u0019\u0010G\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010K\u001a\u00020\u00062\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ\u0011\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u0012H\u0016¢\u0006\u0004\bQ\u0010<J\u0017\u0010S\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u0006H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u0012H\u0016¢\u0006\u0004\bV\u0010WJ#\u0010\\\u001a\u00020\u00062\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0004\b\\\u0010]J)\u0010a\u001a\u00020\u00062\u0006\u0010_\u001a\u00020^2\u0006\u00104\u001a\u00020\u00122\b\u0010`\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0004\ba\u0010bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010g\u001a\u0004\bh\u0010\u0010R\u0016\u0010j\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010iR*\u0010q\u001a\u00020\u00022\u0006\u0010k\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0016\u0010r\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010iR\u0016\u0010s\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010gR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\n0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010uR\u0016\u0010x\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010g¨\u0006y"}, d2 = {"Landroidx/compose/ui/text/input/c;", "Landroid/view/inputmethod/InputConnection;", "Lz1/M;", "initState", "Lz1/r;", "eventCallback", "", "autoCorrect", "<init>", "(Lz1/M;Lz1/r;Z)V", "Lz1/i;", "editCommand", "", "b", "(Lz1/i;)V", "c", "()Z", "d", "", "code", "e", "(I)V", "state", "Lz1/s;", "inputMethodManager", "g", "(Lz1/M;Lz1/s;)V", "beginBatchEdit", "endBatchEdit", "closeConnection", "()V", "", "text", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", PreferencesHelper.PREF_ID, "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "a", "Lz1/r;", "getEventCallback", "()Lz1/r;", "Z", "getAutoCorrect", "I", "batchDepth", "value", "Lz1/M;", "getMTextFieldValue$ui_release", "()Lz1/M;", "f", "(Lz1/M;)V", "mTextFieldValue", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "Ljava/util/List;", "editCommands", "h", "isActive", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c implements InputConnection {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r eventCallback;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean autoCorrect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int batchDepth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue mTextFieldValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentExtractedTextRequestToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean extractedTextMonitorMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC18426i> editCommands = new ArrayList();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isActive = true;

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        boolean z10 = (flags & 1) != 0;
        this.extractedTextMonitorMode = z10;
        if (z10) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return C18437u.a(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    private final boolean c() {
        this.batchDepth++;
        return true;
    }

    private final boolean d() {
        int i10 = this.batchDepth - 1;
        this.batchDepth = i10;
        if (i10 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.d(CollectionsKt.m1(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final void e(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.isActive;
        return z10 ? c() : z10;
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
            b(new CommitTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        b(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        b(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    public final void f(TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        b(new C18431n());
        return true;
    }

    public final void g(TextFieldValue state, InterfaceC18435s inputMethodManager) {
        if (this.isActive) {
            f(state);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.b(this.currentExtractedTextRequestToken, C18437u.a(state));
            }
            y composition = state.getComposition();
            int iL = composition != null ? y.l(composition.getPackedValue()) : -1;
            y composition2 = state.getComposition();
            inputMethodManager.c(y.l(state.getSelection()), y.k(state.getSelection()), iL, composition2 != null ? y.k(composition2.getPackedValue()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.mTextFieldValue.h(), y.l(this.mTextFieldValue.getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        if (y.h(this.mTextFieldValue.getSelection())) {
            return null;
        }
        return N.a(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return N.b(this.mTextFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return N.c(this.mTextFieldValue, maxChars).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id2) {
        boolean z10 = this.isActive;
        if (z10) {
            z10 = false;
            switch (id2) {
                case R.id.selectAll:
                    b(new SetSelectionCommand(0, this.mTextFieldValue.h().length()));
                    break;
                case R.id.cut:
                    e(277);
                    break;
                case R.id.copy:
                    e(278);
                    break;
                case R.id.paste:
                    e(279);
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
                    iA = a.INSTANCE.c();
                    break;
                case 3:
                    iA = a.INSTANCE.g();
                    break;
                case 4:
                    iA = a.INSTANCE.h();
                    break;
                case 5:
                    iA = a.INSTANCE.d();
                    break;
                case 6:
                    iA = a.INSTANCE.b();
                    break;
                case 7:
                    iA = a.INSTANCE.f();
                    break;
                default:
                    FS.log_w("RecordingIC", "IME sends unsupported Editor Action: " + editorAction);
                    iA = a.INSTANCE.a();
                    break;
            }
        } else {
            iA = a.INSTANCE.a();
        }
        this.eventCallback.c(iA);
        return true;
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
            b(new SetComposingRegionCommand(start, end));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        boolean z10 = this.isActive;
        if (z10) {
            b(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z10 = this.isActive;
        if (!z10) {
            return z10;
        }
        b(new SetSelectionCommand(start, end));
        return true;
    }

    public c(TextFieldValue textFieldValue, r rVar, boolean z10) {
        this.eventCallback = rVar;
        this.autoCorrect = z10;
        this.mTextFieldValue = textFieldValue;
    }

    private final void b(InterfaceC18426i editCommand) {
        c();
        try {
            this.editCommands.add(editCommand);
        } finally {
            d();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return d();
    }
}
