package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z1.TextFieldValue;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text/s0;", "", "", "maxStoredCharacters", "<init>", "(I)V", "", "d", "()V", "Lz1/M;", "value", "", "now", "e", "(Lz1/M;J)V", "a", "b", "(Lz1/M;)V", "g", "()Lz1/M;", "c", "I", "getMaxStoredCharacters", "()I", "Landroidx/compose/foundation/text/s0$a;", "Landroidx/compose/foundation/text/s0$a;", "undoStack", "redoStack", "storedCharacters", "Ljava/lang/Long;", "lastSnapshot", "", "f", "Z", "forceNextSnapshot", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxStoredCharacters;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a undoStack;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a redoStack;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int storedCharacters;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Long lastSnapshot;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean forceNextSnapshot;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/s0$a;", "", "next", "Lz1/M;", "value", "<init>", "(Landroidx/compose/foundation/text/s0$a;Lz1/M;)V", "a", "Landroidx/compose/foundation/text/s0$a;", "()Landroidx/compose/foundation/text/s0$a;", "c", "(Landroidx/compose/foundation/text/s0$a;)V", "b", "Lz1/M;", "()Lz1/M;", "d", "(Lz1/M;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private a next;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private TextFieldValue value;

        /* renamed from: a, reason: from getter */
        public final a getNext() {
            return this.next;
        }

        /* renamed from: b, reason: from getter */
        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void c(a aVar) {
            this.next = aVar;
        }

        public final void d(TextFieldValue textFieldValue) {
            this.value = textFieldValue;
        }

        public a(a aVar, TextFieldValue textFieldValue) {
            this.next = aVar;
            this.value = textFieldValue;
        }
    }

    public s0() {
        this(0, 1, null);
    }

    public final void a() {
        this.forceNextSnapshot = true;
    }

    public final void b(TextFieldValue value) {
        TextFieldValue value2;
        this.forceNextSnapshot = false;
        a aVar = this.undoStack;
        if (Intrinsics.e(value, aVar != null ? aVar.getValue() : null)) {
            return;
        }
        String strH = value.h();
        a aVar2 = this.undoStack;
        if (Intrinsics.e(strH, (aVar2 == null || (value2 = aVar2.getValue()) == null) ? null : value2.h())) {
            a aVar3 = this.undoStack;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(value);
            return;
        }
        this.undoStack = new a(this.undoStack, value);
        this.redoStack = null;
        int length = this.storedCharacters + value.h().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            d();
        }
    }

    public s0(int i10) {
        this.maxStoredCharacters = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            r3 = this;
            androidx.compose.foundation.text.s0$a r0 = r3.undoStack
            r1 = 0
            if (r0 == 0) goto La
            androidx.compose.foundation.text.s0$a r2 = r0.getNext()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            goto L25
        Le:
            if (r0 == 0) goto L1b
            androidx.compose.foundation.text.s0$a r2 = r0.getNext()
            if (r2 == 0) goto L1b
            androidx.compose.foundation.text.s0$a r2 = r2.getNext()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            androidx.compose.foundation.text.s0$a r0 = r0.getNext()
            goto Le
        L23:
            if (r0 != 0) goto L26
        L25:
            return
        L26:
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.s0.d():void");
    }

    public static /* synthetic */ void f(s0 s0Var, TextFieldValue textFieldValue, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = u0.a();
        }
        s0Var.e(textFieldValue, j10);
    }

    public final TextFieldValue c() {
        a aVar = this.redoStack;
        if (aVar == null) {
            return null;
        }
        this.redoStack = aVar.getNext();
        this.undoStack = new a(this.undoStack, aVar.getValue());
        this.storedCharacters += aVar.getValue().h().length();
        return aVar.getValue();
    }

    public final void e(TextFieldValue value, long now) {
        if (!this.forceNextSnapshot) {
            Long l10 = this.lastSnapshot;
            if (now <= (l10 != null ? l10.longValue() : 0L) + t0.a()) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(now);
        b(value);
    }

    public final TextFieldValue g() {
        a next;
        a aVar = this.undoStack;
        if (aVar == null || (next = aVar.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= aVar.getValue().h().length();
        this.redoStack = new a(this.redoStack, aVar.getValue());
        return next.getValue();
    }

    public /* synthetic */ s0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }
}
