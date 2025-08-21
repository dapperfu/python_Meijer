package z1;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.C6055b;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17334A;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R$\u0010!\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lz1/k;", "", "<init>", "()V", "", "Lz1/i;", "editCommands", "failedCommand", "", "c", "(Ljava/util/List;Lz1/i;)Ljava/lang/String;", "e", "(Lz1/i;)Ljava/lang/String;", "Lz1/M;", "value", "Lz1/T;", "textInputSession", "", "d", "(Lz1/M;Lz1/T;)V", "b", "(Ljava/util/List;)Lz1/M;", "f", "()Lz1/M;", "<set-?>", "a", "Lz1/M;", "getMBufferState$ui_text_release", "mBufferState", "Lz1/l;", "Lz1/l;", "getMBuffer$ui_text_release", "()Lz1/l;", "mBuffer", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: z1.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18428k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue mBufferState = new TextFieldValue(C6055b.e(), androidx.compose.ui.text.y.INSTANCE.a(), (androidx.compose.ui.text.y) null, (DefaultConstructorMarker) null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C18429l mBuffer = new C18429l(this.mBufferState.getText(), this.mBufferState.getSelection(), null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/i;", "it", "", "a", "(Lz1/i;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z1.k$a */
    static final class a extends Lambda implements Function1<InterfaceC18426i, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC18426i f172272f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C18428k f172273g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC18426i interfaceC18426i, C18428k c18428k) {
            super(1);
            this.f172272f = interfaceC18426i;
            this.f172273g = c18428k;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC18426i interfaceC18426i) {
            return (this.f172272f == interfaceC18426i ? " > " : "   ") + this.f172273g.e(interfaceC18426i);
        }
    }

    public final TextFieldValue b(List<? extends InterfaceC18426i> editCommands) {
        InterfaceC18426i interfaceC18426i;
        InterfaceC18426i interfaceC18426i2 = null;
        try {
            int size = editCommands.size();
            int i10 = 0;
            InterfaceC18426i interfaceC18426i3 = null;
            while (i10 < size) {
                try {
                    interfaceC18426i = editCommands.get(i10);
                } catch (Exception e10) {
                    e = e10;
                    interfaceC18426i2 = interfaceC18426i3;
                }
                try {
                    interfaceC18426i.a(this.mBuffer);
                    i10++;
                    interfaceC18426i3 = interfaceC18426i;
                } catch (Exception e11) {
                    e = e11;
                    interfaceC18426i2 = interfaceC18426i;
                    throw new RuntimeException(c(editCommands, interfaceC18426i2), e);
                }
            }
            AnnotatedString annotatedStringS = this.mBuffer.s();
            long jI = this.mBuffer.i();
            androidx.compose.ui.text.y yVarB = androidx.compose.ui.text.y.b(jI);
            yVarB.getPackedValue();
            androidx.compose.ui.text.y yVar = androidx.compose.ui.text.y.m(this.mBufferState.getSelection()) ? null : yVarB;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedStringS, yVar != null ? yVar.getPackedValue() : C17334A.b(androidx.compose.ui.text.y.k(jI), androidx.compose.ui.text.y.l(jI)), this.mBuffer.d(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e12) {
            e = e12;
        }
    }

    private final String c(List<? extends InterfaceC18426i> editCommands, InterfaceC18426i failedCommand) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.h() + ", composition=" + this.mBuffer.d() + ", selection=" + ((Object) androidx.compose.ui.text.y.q(this.mBuffer.i())) + "):");
        Intrinsics.i(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.i(sb2, "append(...)");
        CollectionsKt___CollectionsKt.y0(editCommands, sb2, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new a(failedCommand, this));
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(InterfaceC18426i interfaceC18426i) {
        if (interfaceC18426i instanceof CommitTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) interfaceC18426i;
            sb2.append(commitTextCommand.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(commitTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (interfaceC18426i instanceof SetComposingTextCommand) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) interfaceC18426i;
            sb3.append(setComposingTextCommand.c().length());
            sb3.append(", newCursorPosition=");
            sb3.append(setComposingTextCommand.getNewCursorPosition());
            sb3.append(')');
            return sb3.toString();
        }
        if (interfaceC18426i instanceof SetComposingRegionCommand) {
            return interfaceC18426i.toString();
        }
        if (interfaceC18426i instanceof DeleteSurroundingTextCommand) {
            return interfaceC18426i.toString();
        }
        if (interfaceC18426i instanceof DeleteSurroundingTextInCodePointsCommand) {
            return interfaceC18426i.toString();
        }
        if (interfaceC18426i instanceof SetSelectionCommand) {
            return interfaceC18426i.toString();
        }
        if (interfaceC18426i instanceof C18431n) {
            return interfaceC18426i.toString();
        }
        if (interfaceC18426i instanceof C18423f) {
            return interfaceC18426i.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown EditCommand: ");
        String strU = Reflection.b(interfaceC18426i.getClass()).u();
        if (strU == null) {
            strU = "{anonymous EditCommand}";
        }
        sb4.append(strU);
        return sb4.toString();
    }

    /* renamed from: f, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    public final void d(TextFieldValue value, T textInputSession) {
        boolean zE = Intrinsics.e(value.getComposition(), this.mBuffer.d());
        boolean z10 = true;
        boolean z11 = false;
        if (!Intrinsics.e(this.mBufferState.getText().getText(), value.getText().getText())) {
            this.mBuffer = new C18429l(value.getText(), value.getSelection(), null);
        } else if (!androidx.compose.ui.text.y.g(this.mBufferState.getSelection(), value.getSelection())) {
            this.mBuffer.p(androidx.compose.ui.text.y.l(value.getSelection()), androidx.compose.ui.text.y.k(value.getSelection()));
            z11 = true;
            z10 = false;
        } else {
            z10 = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.a();
        } else if (!androidx.compose.ui.text.y.h(value.getComposition().getPackedValue())) {
            this.mBuffer.n(androidx.compose.ui.text.y.l(value.getComposition().getPackedValue()), androidx.compose.ui.text.y.k(value.getComposition().getPackedValue()));
        }
        if (z10 || (!z11 && !zE)) {
            this.mBuffer.a();
            value = TextFieldValue.c(value, null, 0L, null, 3, null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.d(textFieldValue, value);
        }
    }
}
