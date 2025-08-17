package G1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LG1/a;", "", "", "", "words", "<init>", "(I)V", "a", "(I)Ljava/lang/String;", "I", "Lkotlin/sequences/Sequence;", "b", "()Lkotlin/sequences/Sequence;", "values", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int words;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.a$a, reason: collision with other inner class name */
    static final class C0159a extends Lambda implements Function0<String> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f11248f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f11249g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0159a(Ref.IntRef intRef, int i10) {
            super(0);
            this.f11248f = intRef;
            this.f11249g = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            List list = b.f11250a;
            Ref.IntRef intRef = this.f11248f;
            int i10 = intRef.f142833a;
            intRef.f142833a = i10 + 1;
            return (String) list.get(i10 % this.f11249g);
        }
    }

    private final String a(int words) {
        return SequencesKt.K(SequencesKt.T(SequencesKt.r(new C0159a(new Ref.IntRef(), b.f11250a.size())), words), " ", null, null, 0, null, null, 62, null);
    }

    public Sequence<String> b() {
        return SequencesKt.v(a(this.words));
    }

    public a(int i10) {
        this.words = i10;
    }
}
