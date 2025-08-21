package com.meijer.mobile.architecture;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.architecture.j;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import g.C14274a;
import java.util.UUID;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0006\u0007\b\u0003\t\n\u000b\f\rR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/architecture/j;", "", "Ljava/util/UUID;", "a", "()Ljava/util/UUID;", "uuid", "i", "c", "f", "e", "g", "b", "h", "d", "Lcom/meijer/mobile/architecture/j$a;", "Lcom/meijer/mobile/architecture/j$b;", "Lcom/meijer/mobile/architecture/j$c;", "Lcom/meijer/mobile/architecture/j$d;", "Lcom/meijer/mobile/architecture/j$e;", "Lcom/meijer/mobile/architecture/j$f;", "Lcom/meijer/mobile/architecture/j$g;", "Lcom/meijer/mobile/architecture/j$h;", "Lcom/meijer/mobile/architecture/j$i;", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface j {

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u00020\r2\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\bH\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010\u0019R+\u0010(\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\b¢\u0006\u0002\b\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010'R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/meijer/mobile/architecture/j$a;", "Lcom/meijer/mobile/architecture/j;", "Ljava/util/UUID;", "uuid", "", "requestCode", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroid/content/Context;", "Landroid/content/Intent;", "Lkotlin/ExtensionFunctionType;", "intent", "", "f", "(Lkotlin/jvm/functions/Function1;)V", "Lg/a;", "activityResult", "e", "context", "c", "(Landroid/content/Context;)Landroid/content/Intent;", "b", "(Lg/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "Ljava/lang/String;", "d", "Lkotlin/jvm/functions/Function1;", "provideIntent", "onActivityResult", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.architecture.j$a, reason: from toString */
    public static final /* data */ class ActivityResultEffect implements j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestCode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Function1<? super Context, ? extends Intent> provideIntent;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Function1<? super C14274a, Unit> onActivityResult;

        public ActivityResultEffect(UUID uuid, String requestCode) {
            Intrinsics.j(uuid, "uuid");
            Intrinsics.j(requestCode, "requestCode");
            this.uuid = uuid;
            this.requestCode = requestCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActivityResultEffect)) {
                return false;
            }
            ActivityResultEffect activityResultEffect = (ActivityResultEffect) other;
            return Intrinsics.e(this.uuid, activityResultEffect.uuid) && Intrinsics.e(this.requestCode, activityResultEffect.requestCode);
        }

        public int hashCode() {
            return (this.uuid.hashCode() * 31) + this.requestCode.hashCode();
        }

        public String toString() {
            return "ActivityResultEffect(uuid=" + this.uuid + ", requestCode=" + this.requestCode + ')';
        }

        @Override // com.meijer.mobile.architecture.j
        /* renamed from: a, reason: from getter */
        public UUID getUuid() {
            return this.uuid;
        }

        public final void b(C14274a activityResult) {
            Intrinsics.j(activityResult, "activityResult");
            Function1<? super C14274a, Unit> function1 = this.onActivityResult;
            if (function1 != null) {
                function1.invoke(activityResult);
            }
        }

        public final Intent c(Context context) {
            Intrinsics.j(context, "context");
            Function1<? super Context, ? extends Intent> function1 = this.provideIntent;
            if (function1 != null) {
                return function1.invoke(context);
            }
            return null;
        }

        /* renamed from: d, reason: from getter */
        public final String getRequestCode() {
            return this.requestCode;
        }

        public final void e(Function1<? super C14274a, Unit> activityResult) {
            Intrinsics.j(activityResult, "activityResult");
            this.onActivityResult = activityResult;
        }

        public final void f(Function1<? super Context, ? extends Intent> intent) {
            Intrinsics.j(intent, "intent");
            this.provideIntent = intent;
        }

        public /* synthetic */ ActivityResultEffect(UUID uuid, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, str);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/architecture/j$b;", "Lcom/meijer/mobile/architecture/j;", "Ljava/util/UUID;", "uuid", "Lbk/a;", "toAnnounce", "<init>", "(Ljava/util/UUID;Lbk/a;)V", "", "b", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "Lbk/a;", "c", "()Lbk/a;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "_execute", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.architecture.j$b, reason: from toString */
    public static final /* data */ class AnnounceForAccessibility implements j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a toAnnounce;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Function0<Unit> _execute;

        public AnnounceForAccessibility(UUID uuid, AbstractC6392a toAnnounce) {
            Intrinsics.j(uuid, "uuid");
            Intrinsics.j(toAnnounce, "toAnnounce");
            this.uuid = uuid;
            this.toAnnounce = toAnnounce;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnnounceForAccessibility)) {
                return false;
            }
            AnnounceForAccessibility announceForAccessibility = (AnnounceForAccessibility) other;
            return Intrinsics.e(this.uuid, announceForAccessibility.uuid) && Intrinsics.e(this.toAnnounce, announceForAccessibility.toAnnounce);
        }

        public int hashCode() {
            return (this.uuid.hashCode() * 31) + this.toAnnounce.hashCode();
        }

        public String toString() {
            return "AnnounceForAccessibility(uuid=" + this.uuid + ", toAnnounce=" + this.toAnnounce + ')';
        }

        @Override // com.meijer.mobile.architecture.j
        /* renamed from: a, reason: from getter */
        public UUID getUuid() {
            return this.uuid;
        }

        public final void b() {
            Function0<Unit> function0 = this._execute;
            if (function0 != null) {
                function0.invoke();
            }
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC6392a getToAnnounce() {
            return this.toAnnounce;
        }

        public /* synthetic */ AnnounceForAccessibility(UUID uuid, AbstractC6392a abstractC6392a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, abstractC6392a);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b0\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b1\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R*\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00109R*\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00109R*\u0010<\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00109R$\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010>R$\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010>¨\u0006A"}, d2 = {"Lcom/meijer/mobile/architecture/j$c;", "Lcom/meijer/mobile/architecture/j;", "Ljava/util/UUID;", "uuid", "Lbk/a;", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "neutralButtonResId", "", "cancellable", "", BarcodePickDeserializer.FIELD_ICON, "<init>", "(Ljava/util/UUID;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;ZLjava/lang/Integer;)V", "Lkotlin/Function2;", "Landroid/content/DialogInterface;", "", "onClick", "o", "(Lkotlin/jvm/functions/Function2;)V", "n", "dialog", "which", "f", "(Landroid/content/DialogInterface;I)V", "c", "b", "e", "(Landroid/content/DialogInterface;)V", "d", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "Lbk/a;", "m", "()Lbk/a;", "i", "l", "j", "k", "g", "Z", "()Z", "h", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lkotlin/jvm/functions/Function2;", "positiveListener", "neutralListener", "negativeListener", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "onDismissListener", "onCancelListener", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.architecture.j$c, reason: from toString */
    public static final /* data */ class Dialog implements j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a titleResId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a messageResId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a positiveButtonResId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a negativeButtonResId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a neutralButtonResId;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean cancellable;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer icon;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Function2<? super DialogInterface, ? super Integer, Unit> positiveListener;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Function2<? super DialogInterface, ? super Integer, Unit> neutralListener;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Function2<? super DialogInterface, ? super Integer, Unit> negativeListener;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Function1<? super DialogInterface, Unit> onDismissListener;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Function1<? super DialogInterface, Unit> onCancelListener;

        public Dialog() {
            this(null, null, null, null, null, null, false, null, l3.f93323c, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return Intrinsics.e(this.uuid, dialog.uuid) && Intrinsics.e(this.titleResId, dialog.titleResId) && Intrinsics.e(this.messageResId, dialog.messageResId) && Intrinsics.e(this.positiveButtonResId, dialog.positiveButtonResId) && Intrinsics.e(this.negativeButtonResId, dialog.negativeButtonResId) && Intrinsics.e(this.neutralButtonResId, dialog.neutralButtonResId) && this.cancellable == dialog.cancellable && Intrinsics.e(this.icon, dialog.icon);
        }

        public int hashCode() {
            int iHashCode = this.uuid.hashCode() * 31;
            AbstractC6392a abstractC6392a = this.titleResId;
            int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
            AbstractC6392a abstractC6392a2 = this.messageResId;
            int iHashCode3 = (iHashCode2 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
            AbstractC6392a abstractC6392a3 = this.positiveButtonResId;
            int iHashCode4 = (iHashCode3 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31;
            AbstractC6392a abstractC6392a4 = this.negativeButtonResId;
            int iHashCode5 = (iHashCode4 + (abstractC6392a4 == null ? 0 : abstractC6392a4.hashCode())) * 31;
            AbstractC6392a abstractC6392a5 = this.neutralButtonResId;
            int iHashCode6 = (((iHashCode5 + (abstractC6392a5 == null ? 0 : abstractC6392a5.hashCode())) * 31) + Boolean.hashCode(this.cancellable)) * 31;
            Integer num = this.icon;
            return iHashCode6 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Dialog(uuid=" + this.uuid + ", titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ", positiveButtonResId=" + this.positiveButtonResId + ", negativeButtonResId=" + this.negativeButtonResId + ", neutralButtonResId=" + this.neutralButtonResId + ", cancellable=" + this.cancellable + ", icon=" + this.icon + ')';
        }

        public Dialog(UUID uuid, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, AbstractC6392a abstractC6392a5, boolean z10, Integer num) {
            Intrinsics.j(uuid, "uuid");
            this.uuid = uuid;
            this.titleResId = abstractC6392a;
            this.messageResId = abstractC6392a2;
            this.positiveButtonResId = abstractC6392a3;
            this.negativeButtonResId = abstractC6392a4;
            this.neutralButtonResId = abstractC6392a5;
            this.cancellable = z10;
            this.icon = num;
        }

        @Override // com.meijer.mobile.architecture.j
        /* renamed from: a, reason: from getter */
        public UUID getUuid() {
            return this.uuid;
        }

        public final void b(DialogInterface dialog, int which) {
            Intrinsics.j(dialog, "dialog");
            Function2<? super DialogInterface, ? super Integer, Unit> function2 = this.negativeListener;
            if (function2 != null) {
                function2.invoke(dialog, Integer.valueOf(which));
            }
        }

        public final void c(DialogInterface dialog, int which) {
            Intrinsics.j(dialog, "dialog");
            Function2<? super DialogInterface, ? super Integer, Unit> function2 = this.neutralListener;
            if (function2 != null) {
                function2.invoke(dialog, Integer.valueOf(which));
            }
        }

        public final void d(DialogInterface dialog) {
            Intrinsics.j(dialog, "dialog");
            Function1<? super DialogInterface, Unit> function1 = this.onCancelListener;
            if (function1 != null) {
                function1.invoke(dialog);
            }
        }

        public final void e(DialogInterface dialog) {
            Intrinsics.j(dialog, "dialog");
            Function1<? super DialogInterface, Unit> function1 = this.onDismissListener;
            if (function1 != null) {
                function1.invoke(dialog);
            }
        }

        public final void f(DialogInterface dialog, int which) {
            Intrinsics.j(dialog, "dialog");
            Function2<? super DialogInterface, ? super Integer, Unit> function2 = this.positiveListener;
            if (function2 != null) {
                function2.invoke(dialog, Integer.valueOf(which));
            }
        }

        /* renamed from: g, reason: from getter */
        public final boolean getCancellable() {
            return this.cancellable;
        }

        /* renamed from: h, reason: from getter */
        public final Integer getIcon() {
            return this.icon;
        }

        /* renamed from: i, reason: from getter */
        public final AbstractC6392a getMessageResId() {
            return this.messageResId;
        }

        /* renamed from: j, reason: from getter */
        public final AbstractC6392a getNegativeButtonResId() {
            return this.negativeButtonResId;
        }

        /* renamed from: k, reason: from getter */
        public final AbstractC6392a getNeutralButtonResId() {
            return this.neutralButtonResId;
        }

        /* renamed from: l, reason: from getter */
        public final AbstractC6392a getPositiveButtonResId() {
            return this.positiveButtonResId;
        }

        /* renamed from: m, reason: from getter */
        public final AbstractC6392a getTitleResId() {
            return this.titleResId;
        }

        public final void n(Function2<? super DialogInterface, ? super Integer, Unit> onClick) {
            Intrinsics.j(onClick, "onClick");
            this.negativeListener = onClick;
        }

        public final void o(Function2<? super DialogInterface, ? super Integer, Unit> onClick) {
            Intrinsics.j(onClick, "onClick");
            this.positiveListener = onClick;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Dialog(java.util.UUID r2, bk.AbstractC6392a r3, bk.AbstractC6392a r4, bk.AbstractC6392a r5, bk.AbstractC6392a r6, bk.AbstractC6392a r7, boolean r8, java.lang.Integer r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto L8
                java.util.UUID r2 = java.util.UUID.randomUUID()
            L8:
                r11 = r10 & 2
                r0 = 0
                if (r11 == 0) goto Le
                r3 = r0
            Le:
                r11 = r10 & 4
                if (r11 == 0) goto L13
                r4 = r0
            L13:
                r11 = r10 & 8
                if (r11 == 0) goto L18
                r5 = r0
            L18:
                r11 = r10 & 16
                if (r11 == 0) goto L1d
                r6 = r0
            L1d:
                r11 = r10 & 32
                if (r11 == 0) goto L22
                r7 = r0
            L22:
                r11 = r10 & 64
                if (r11 == 0) goto L27
                r8 = 1
            L27:
                r10 = r10 & 128(0x80, float:1.8E-43)
                if (r10 == 0) goto L35
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3e
            L35:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3e:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.architecture.j.Dialog.<init>(java.util.UUID, bk.a, bk.a, bk.a, bk.a, bk.a, boolean, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/architecture/j$d;", "Lcom/meijer/mobile/architecture/j;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "b", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "_execute", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.architecture.j$d, reason: from toString */
    public static final /* data */ class DismissKeyboard implements j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Function0<Unit> _execute;

        /* JADX WARN: Multi-variable type inference failed */
        public DismissKeyboard() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DismissKeyboard) && Intrinsics.e(this.uuid, ((DismissKeyboard) other).uuid);
        }

        public int hashCode() {
            return this.uuid.hashCode();
        }

        public String toString() {
            return "DismissKeyboard(uuid=" + this.uuid + ')';
        }

        public DismissKeyboard(UUID uuid) {
            Intrinsics.j(uuid, "uuid");
            this.uuid = uuid;
        }

        @Override // com.meijer.mobile.architecture.j
        /* renamed from: a, reason: from getter */
        public UUID getUuid() {
            return this.uuid;
        }

        public final void b() {
            Function0<Unit> function0 = this._execute;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public /* synthetic */ DismissKeyboard(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR)\u0010\u001f\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006 "}, d2 = {"Lcom/meijer/mobile/architecture/j$e;", "Lcom/meijer/mobile/architecture/j;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "Lkotlin/Function1;", "LWi/a;", "", "Lkotlin/ExtensionFunctionType;", "onFinish", "c", "(Lkotlin/jvm/functions/Function1;)V", "activityDelegate", "b", "(LWi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "Lkotlin/jvm/functions/Function1;", "finish", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.architecture.j$e, reason: from toString */
    public static final /* data */ class FinishActivity implements j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Function1<? super Wi.a, Unit> finish;

        /* JADX WARN: Multi-variable type inference failed */
        public FinishActivity() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinishActivity) && Intrinsics.e(this.uuid, ((FinishActivity) other).uuid);
        }

        public int hashCode() {
            return this.uuid.hashCode();
        }

        public String toString() {
            return "FinishActivity(uuid=" + this.uuid + ')';
        }

        public FinishActivity(UUID uuid) {
            Intrinsics.j(uuid, "uuid");
            this.uuid = uuid;
        }

        @Override // com.meijer.mobile.architecture.j
        /* renamed from: a, reason: from getter */
        public UUID getUuid() {
            return this.uuid;
        }

        public final void b(Wi.a activityDelegate) {
            Intrinsics.j(activityDelegate, "activityDelegate");
            Function1<? super Wi.a, Unit> function1 = this.finish;
            if (function1 != null) {
                function1.invoke(activityDelegate);
            }
        }

        public final void c(Function1<? super Wi.a, Unit> onFinish) {
            Intrinsics.j(onFinish, "onFinish");
            this.finish = onFinish;
        }

        public /* synthetic */ FinishActivity(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR+\u0010 \u001a\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006¢\u0006\u0002\b\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001f¨\u0006!"}, d2 = {"Lcom/meijer/mobile/architecture/j$f;", "Lcom/meijer/mobile/architecture/j;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "Lkotlin/Function1;", "Landroid/content/Context;", "Landroid/content/Intent;", "Lkotlin/ExtensionFunctionType;", "navigate", "", "c", "(Lkotlin/jvm/functions/Function1;)V", "context", "b", "(Landroid/content/Context;)Landroid/content/Intent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "Lkotlin/jvm/functions/Function1;", "intent", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.architecture.j$f, reason: from toString */
    public static final /* data */ class NavigateTo implements j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Function1<? super Context, ? extends Intent> intent;

        /* JADX WARN: Multi-variable type inference failed */
        public NavigateTo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateTo) && Intrinsics.e(this.uuid, ((NavigateTo) other).uuid);
        }

        public int hashCode() {
            return this.uuid.hashCode();
        }

        public String toString() {
            return "NavigateTo(uuid=" + this.uuid + ')';
        }

        public NavigateTo(UUID uuid) {
            Intrinsics.j(uuid, "uuid");
            this.uuid = uuid;
        }

        @Override // com.meijer.mobile.architecture.j
        /* renamed from: a, reason: from getter */
        public UUID getUuid() {
            return this.uuid;
        }

        public final Intent b(Context context) {
            Intrinsics.j(context, "context");
            Function1<? super Context, ? extends Intent> function1 = this.intent;
            if (function1 != null) {
                return function1.invoke(context);
            }
            return null;
        }

        public final void c(Function1<? super Context, ? extends Intent> navigate) {
            Intrinsics.j(navigate, "navigate");
            this.intent = navigate;
        }

        public /* synthetic */ NavigateTo(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R)\u0010\u001c\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0019¢\u0006\u0002\b\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/architecture/j$g;", "Lcom/meijer/mobile/architecture/j;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "LWi/a;", "activityDelegate", "", "b", "(LWi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "navigateUp", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.architecture.j$g, reason: from toString */
    public static final /* data */ class NavigateUp implements j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Function1<? super Wi.a, Unit> navigateUp;

        /* JADX WARN: Multi-variable type inference failed */
        public NavigateUp() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateUp) && Intrinsics.e(this.uuid, ((NavigateUp) other).uuid);
        }

        public int hashCode() {
            return this.uuid.hashCode();
        }

        public String toString() {
            return "NavigateUp(uuid=" + this.uuid + ')';
        }

        public NavigateUp(UUID uuid) {
            Intrinsics.j(uuid, "uuid");
            this.uuid = uuid;
        }

        @Override // com.meijer.mobile.architecture.j
        /* renamed from: a, reason: from getter */
        public UUID getUuid() {
            return this.uuid;
        }

        public final void b(Wi.a activityDelegate) {
            Intrinsics.j(activityDelegate, "activityDelegate");
            Function1<? super Wi.a, Unit> function1 = this.navigateUp;
            if (function1 != null) {
                function1.invoke(activityDelegate);
            }
        }

        public /* synthetic */ NavigateUp(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/architecture/j$h;", "Lcom/meijer/mobile/architecture/j;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "b", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "_execute", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.architecture.j$h, reason: from toString */
    public static final /* data */ class OpenKeyboard implements j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Function0<Unit> _execute;

        /* JADX WARN: Multi-variable type inference failed */
        public OpenKeyboard() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenKeyboard) && Intrinsics.e(this.uuid, ((OpenKeyboard) other).uuid);
        }

        public int hashCode() {
            return this.uuid.hashCode();
        }

        public String toString() {
            return "OpenKeyboard(uuid=" + this.uuid + ')';
        }

        public OpenKeyboard(UUID uuid) {
            Intrinsics.j(uuid, "uuid");
            this.uuid = uuid;
        }

        @Override // com.meijer.mobile.architecture.j
        /* renamed from: a, reason: from getter */
        public UUID getUuid() {
            return this.uuid;
        }

        public final void b() {
            Function0<Unit> function0 = this._execute;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public /* synthetic */ OpenKeyboard(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b5\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00109R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00109R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00109¨\u0006="}, d2 = {"Lcom/meijer/mobile/architecture/j$i;", "Lcom/meijer/mobile/architecture/j;", "Ljava/util/UUID;", "uuid", "Lbk/a;", "bodyLabel", "LH1/h;", "bottomMargin", "actionLabel", "LHi/e;", "duration", "", "showCloseIcon", "Lki/q1$m$a;", "toastState", "<init>", "(Ljava/util/UUID;Lbk/a;FLbk/a;LHi/e;ZLki/q1$m$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function0;", "execute", "", "o", "(Lkotlin/jvm/functions/Function0;)V", "f", "()Z", "d", "e", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "Lbk/a;", "h", "()Lbk/a;", "c", "F", "i", "()F", "g", "LHi/e;", "j", "()LHi/e;", "Z", "k", "Lki/q1$m$a;", "l", "()Lki/q1$m$a;", "Lkotlin/jvm/functions/Function0;", "onLabelClicked", "onCloseClicked", "onDismiss", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.architecture.j$i, reason: from toString */
    public static final /* data */ class Toast implements j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID uuid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a bodyLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float bottomMargin;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a actionLabel;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Hi.e duration;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showCloseIcon;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final q1.m.a toastState;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Function0<Boolean> onLabelClicked;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Function0<Boolean> onCloseClicked;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Function0<Unit> onDismiss;

        public /* synthetic */ Toast(UUID uuid, AbstractC6392a abstractC6392a, float f10, AbstractC6392a abstractC6392a2, Hi.e eVar, boolean z10, q1.m.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, abstractC6392a, f10, abstractC6392a2, eVar, z10, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n() {
            return true;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Toast)) {
                return false;
            }
            Toast toast = (Toast) other;
            return Intrinsics.e(this.uuid, toast.uuid) && Intrinsics.e(this.bodyLabel, toast.bodyLabel) && H1.h.u(this.bottomMargin, toast.bottomMargin) && Intrinsics.e(this.actionLabel, toast.actionLabel) && this.duration == toast.duration && this.showCloseIcon == toast.showCloseIcon && Intrinsics.e(this.toastState, toast.toastState);
        }

        public int hashCode() {
            int iHashCode = ((((this.uuid.hashCode() * 31) + this.bodyLabel.hashCode()) * 31) + H1.h.w(this.bottomMargin)) * 31;
            AbstractC6392a abstractC6392a = this.actionLabel;
            return ((((((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + this.duration.hashCode()) * 31) + Boolean.hashCode(this.showCloseIcon)) * 31) + this.toastState.hashCode();
        }

        public String toString() {
            return "Toast(uuid=" + this.uuid + ", bodyLabel=" + this.bodyLabel + ", bottomMargin=" + ((Object) H1.h.z(this.bottomMargin)) + ", actionLabel=" + this.actionLabel + ", duration=" + this.duration + ", showCloseIcon=" + this.showCloseIcon + ", toastState=" + this.toastState + ')';
        }

        private Toast(UUID uuid, AbstractC6392a bodyLabel, float f10, AbstractC6392a abstractC6392a, Hi.e duration, boolean z10, q1.m.a toastState) {
            Intrinsics.j(uuid, "uuid");
            Intrinsics.j(bodyLabel, "bodyLabel");
            Intrinsics.j(duration, "duration");
            Intrinsics.j(toastState, "toastState");
            this.uuid = uuid;
            this.bodyLabel = bodyLabel;
            this.bottomMargin = f10;
            this.actionLabel = abstractC6392a;
            this.duration = duration;
            this.showCloseIcon = z10;
            this.toastState = toastState;
            this.onLabelClicked = new Function0() { // from class: Wi.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(j.Toast.n());
                }
            };
            this.onCloseClicked = new Function0() { // from class: Wi.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(j.Toast.m());
                }
            };
        }

        @Override // com.meijer.mobile.architecture.j
        /* renamed from: a, reason: from getter */
        public UUID getUuid() {
            return this.uuid;
        }

        public final boolean d() {
            return this.onCloseClicked.invoke().booleanValue();
        }

        public final void e() {
            Function0<Unit> function0 = this.onDismiss;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final boolean f() {
            return this.onLabelClicked.invoke().booleanValue();
        }

        /* renamed from: g, reason: from getter */
        public final AbstractC6392a getActionLabel() {
            return this.actionLabel;
        }

        /* renamed from: h, reason: from getter */
        public final AbstractC6392a getBodyLabel() {
            return this.bodyLabel;
        }

        /* renamed from: i, reason: from getter */
        public final float getBottomMargin() {
            return this.bottomMargin;
        }

        /* renamed from: j, reason: from getter */
        public final Hi.e getDuration() {
            return this.duration;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        /* renamed from: l, reason: from getter */
        public final q1.m.a getToastState() {
            return this.toastState;
        }

        public final void o(Function0<Boolean> execute) {
            Intrinsics.j(execute, "execute");
            this.onLabelClicked = execute;
        }

        public /* synthetic */ Toast(UUID uuid, AbstractC6392a abstractC6392a, float f10, AbstractC6392a abstractC6392a2, Hi.e eVar, boolean z10, q1.m.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, abstractC6392a, (i10 & 4) != 0 ? H1.h.p(0) : f10, (i10 & 8) != 0 ? null : abstractC6392a2, (i10 & 16) != 0 ? Hi.e.f13556a : eVar, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? q1.m.a.C2256a.f142367a : aVar, null);
        }
    }

    /* renamed from: a */
    UUID getUuid();
}
