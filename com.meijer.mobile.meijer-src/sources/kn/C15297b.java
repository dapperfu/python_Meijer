package kn;

import Ek.n;
import io.reactivex.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkn/b;", "", "<init>", "()V", "Lkn/a;", "directions", "", "d", "(Lkn/a;)V", "b", "LEk/n;", "a", "LEk/n;", "commandStore", "Lio/reactivex/l;", "Lio/reactivex/l;", "c", "()Lio/reactivex/l;", "commands", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kn.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15297b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f143080d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC15296a f143081e = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n<InterfaceC15296a> commandStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<InterfaceC15296a> commands;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"kn/b$a", "Lkn/a;", "", "a", "()Ljava/lang/String;", "destination", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kn.b$a */
    public static final class a implements InterfaceC15296a {
        @Override // kn.InterfaceC15296a
        public String a() {
            return "";
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkn/b$b;", "", "<init>", "()V", "Lkn/a;", "defaultDirection", "Lkn/a;", "a", "()Lkn/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kn.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InterfaceC15296a a() {
            return C15297b.f143081e;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkn/b$c;", "LEk/b;", "Lkn/a;", "command", "<init>", "(Lkn/a;)V", "oldState", "d", "(Lkn/a;)Lkn/a;", "b", "Lkn/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kn.b$c */
    public static final class c extends Ek.b<InterfaceC15296a> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15296a command;

        public /* synthetic */ c(InterfaceC15296a interfaceC15296a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C15297b.INSTANCE.a() : interfaceC15296a);
        }

        @Override // Ek.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public InterfaceC15296a b(InterfaceC15296a oldState) {
            Intrinsics.j(oldState, "oldState");
            return this.command;
        }

        public c(InterfaceC15296a command) {
            Intrinsics.j(command, "command");
            this.command = command;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.commandStore.b(new c(null, 1, 0 == true ? 1 : 0));
    }

    public final l<InterfaceC15296a> c() {
        return this.commands;
    }

    public final void d(InterfaceC15296a directions) {
        Intrinsics.j(directions, "directions");
        this.commandStore.b(new c(directions));
    }

    public C15297b() {
        n<InterfaceC15296a> nVar = new n<>(f143081e);
        this.commandStore = nVar;
        this.commands = nVar.t();
    }
}
