package ji;

import Ci.AdsNotificationColors;
import P0.e;
import V0.C5346q0;
import V0.D1;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.BorderStroke;
import j0.InterfaceC14794C;
import java.util.List;
import ji.InterfaceC14923a;
import kotlin.C1;
import kotlin.C17876E;
import kotlin.C17877E0;
import kotlin.Deprecated;
import kotlin.InterfaceC13820s;
import kotlin.InterfaceC17977u;
import kotlin.InterfaceC17981w;
import kotlin.Metadata;
import kotlin.TabPosition;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oc.C16014c;
import oc.PagerState;
import zi.AdsTextFieldColors;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0003\u0015\u0016\u0017R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\u0018\u0019\u001a\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lji/q1;", "", "Landroidx/compose/ui/Modifier;", "a", "()Landroidx/compose/ui/Modifier;", "modifier", "q", "p", "o", "g", "e", "n", "c", "h", "j", "d", "s", "f", "r", "i", "k", "l", "m", "b", "Lji/q1$g;", "Lji/q1$o;", "Lji/q1$p;", "Lji/q1$q;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface q1 {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lji/q1$a;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Lji/q1$j;", "titleLabel", "descriptionLabel", "Lji/q1$h$b;", BarcodePickDeserializer.FIELD_ICON, "", "isEnabled", "Lji/a$c;", "containers", "<init>", "(Landroidx/compose/ui/Modifier;Lji/q1$j;Lji/q1$j;Lji/q1$h$b;ZLji/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Lji/q1$j;", "getTitleLabel", "()Lji/q1$j;", "c", "getDescriptionLabel", "d", "Lji/q1$h$b;", "y", "()Lji/q1$h$b;", "e", "Z", "z", "()Z", "f", "Lji/a$c;", "x", "()Lji/a$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$a, reason: from toString */
    public static final /* data */ class Accordion implements q1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label titleLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label descriptionLabel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final h.DrawableIcon icon;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEnabled;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC14923a.DefaultContainer containers;

        public Accordion(Modifier modifier, Label titleLabel, Label descriptionLabel, h.DrawableIcon icon, boolean z10, InterfaceC14923a.DefaultContainer containers) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(titleLabel, "titleLabel");
            Intrinsics.j(descriptionLabel, "descriptionLabel");
            Intrinsics.j(icon, "icon");
            Intrinsics.j(containers, "containers");
            this.modifier = modifier;
            this.titleLabel = titleLabel;
            this.descriptionLabel = descriptionLabel;
            this.icon = icon;
            this.isEnabled = z10;
            this.containers = containers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Accordion)) {
                return false;
            }
            Accordion accordion = (Accordion) other;
            return Intrinsics.e(this.modifier, accordion.modifier) && Intrinsics.e(this.titleLabel, accordion.titleLabel) && Intrinsics.e(this.descriptionLabel, accordion.descriptionLabel) && Intrinsics.e(this.icon, accordion.icon) && this.isEnabled == accordion.isEnabled && Intrinsics.e(this.containers, accordion.containers);
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            return (((((((((this.modifier.hashCode() * 31) + this.titleLabel.hashCode()) * 31) + this.descriptionLabel.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.containers.hashCode();
        }

        public String toString() {
            return "Accordion(modifier=" + this.modifier + ", titleLabel=" + this.titleLabel + ", descriptionLabel=" + this.descriptionLabel + ", icon=" + this.icon + ", isEnabled=" + this.isEnabled + ", containers=" + this.containers + ')';
        }

        /* renamed from: x, reason: from getter */
        public final InterfaceC14923a.DefaultContainer getContainers() {
            return this.containers;
        }

        /* renamed from: y, reason: from getter */
        public final h.DrawableIcon getIcon() {
            return this.icon;
        }

        /* renamed from: z, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public /* synthetic */ Accordion(Modifier modifier, Label label, Label label2, h.DrawableIcon drawableIcon, boolean z10, InterfaceC14923a.DefaultContainer cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, label, label2, drawableIcon, z10, cVar);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lji/q1$b;", "", "Landroidx/compose/ui/Modifier;", "modifier", "LJi/T;", "badgeBackground", "Lji/q1$j;", "countLabel", "Lh0/l;", "interactionSource", "<init>", "(Landroidx/compose/ui/Modifier;LJi/T;Lji/q1$j;Lh0/l;)V", "x", "(Landroidx/compose/ui/Modifier;LJi/T;Lji/q1$j;Lh0/l;)Lji/q1$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "LJi/T;", "z", "()LJi/T;", "c", "Lji/q1$j;", "A", "()Lji/q1$j;", "d", "Lh0/l;", "e", "()Lh0/l;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$b, reason: from toString */
    public static final /* data */ class Badge implements q1 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f139931e = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Ji.T badgeBackground;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label countLabel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final h0.l interactionSource;

        public Badge(Modifier modifier, Ji.T badgeBackground, Label countLabel, h0.l lVar) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(badgeBackground, "badgeBackground");
            Intrinsics.j(countLabel, "countLabel");
            this.modifier = modifier;
            this.badgeBackground = badgeBackground;
            this.countLabel = countLabel;
            this.interactionSource = lVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return Intrinsics.e(this.modifier, badge.modifier) && Intrinsics.e(this.badgeBackground, badge.badgeBackground) && Intrinsics.e(this.countLabel, badge.countLabel) && Intrinsics.e(this.interactionSource, badge.interactionSource);
        }

        public static /* synthetic */ Badge y(Badge badge, Modifier modifier, Ji.T t10, Label label, h0.l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                modifier = badge.modifier;
            }
            if ((i10 & 2) != 0) {
                t10 = badge.badgeBackground;
            }
            if ((i10 & 4) != 0) {
                label = badge.countLabel;
            }
            if ((i10 & 8) != 0) {
                lVar = badge.interactionSource;
            }
            return badge.x(modifier, t10, label, lVar);
        }

        /* renamed from: A, reason: from getter */
        public final Label getCountLabel() {
            return this.countLabel;
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        /* renamed from: e, reason: from getter */
        public final h0.l getInteractionSource() {
            return this.interactionSource;
        }

        public int hashCode() {
            int iHashCode = ((((this.modifier.hashCode() * 31) + this.badgeBackground.hashCode()) * 31) + this.countLabel.hashCode()) * 31;
            h0.l lVar = this.interactionSource;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "Badge(modifier=" + this.modifier + ", badgeBackground=" + this.badgeBackground + ", countLabel=" + this.countLabel + ", interactionSource=" + this.interactionSource + ')';
        }

        public final Badge x(Modifier modifier, Ji.T badgeBackground, Label countLabel, h0.l interactionSource) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(badgeBackground, "badgeBackground");
            Intrinsics.j(countLabel, "countLabel");
            return new Badge(modifier, badgeBackground, countLabel, interactionSource);
        }

        /* renamed from: z, reason: from getter */
        public final Ji.T getBadgeBackground() {
            return this.badgeBackground;
        }

        public /* synthetic */ Badge(Modifier modifier, Ji.T t10, Label label, h0.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, t10, label, (i10 & 8) != 0 ? null : lVar);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lji/q1$c;", "", "Landroidx/compose/ui/Modifier;", "modifier", "LP0/e;", "contentAlignment", "", "propagateMinConstraints", "<init>", "(Landroidx/compose/ui/Modifier;LP0/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "LP0/e;", "x", "()LP0/e;", "c", "Z", "y", "()Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$c, reason: from toString */
    public static final /* data */ class Box implements q1 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f139936d = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final P0.e contentAlignment;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean propagateMinConstraints;

        public Box() {
            this(null, null, false, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Box)) {
                return false;
            }
            Box box = (Box) other;
            return Intrinsics.e(this.modifier, box.modifier) && Intrinsics.e(this.contentAlignment, box.contentAlignment) && this.propagateMinConstraints == box.propagateMinConstraints;
        }

        public Box(Modifier modifier, P0.e contentAlignment, boolean z10) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(contentAlignment, "contentAlignment");
            this.modifier = modifier;
            this.contentAlignment = contentAlignment;
            this.propagateMinConstraints = z10;
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            return (((this.modifier.hashCode() * 31) + this.contentAlignment.hashCode()) * 31) + Boolean.hashCode(this.propagateMinConstraints);
        }

        public String toString() {
            return "Box(modifier=" + this.modifier + ", contentAlignment=" + this.contentAlignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
        }

        /* renamed from: x, reason: from getter */
        public final P0.e getContentAlignment() {
            return this.contentAlignment;
        }

        /* renamed from: y, reason: from getter */
        public final boolean getPropagateMinConstraints() {
            return this.propagateMinConstraints;
        }

        public /* synthetic */ Box(Modifier modifier, P0.e eVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? P0.e.INSTANCE.o() : eVar, (i10 & 4) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u000f\u0017\u001b$R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004R\u0016\u0010#\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0001\u0004%&'(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Lji/q1$d;", "", "", "h", "()Z", "enabled", "Lh0/l;", "e", "()Lh0/l;", "interactionSource", "Lx0/w;", "s", "()Lx0/w;", "elevation", "LV0/D1;", "d", "()LV0/D1;", "shape", "Ld0/h;", "v", "()Ld0/h;", "border", "Lx0/u;", "b", "()Lx0/u;", "colors", "Lj0/C;", "c", "()Lj0/C;", "contentPadding", "t", "localMinimumTouchTargetEnforcement", "LJi/T;", "g", "()LJi/T;", "rippleColor", "a", "Lji/q1$d$a;", "Lji/q1$d$b;", "Lji/q1$d$c;", "Lji/q1$d$d;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d extends q1 {

        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0082\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b3\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b'\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b+\u0010:R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010;\u001a\u0004\b#\u0010<R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b8\u0010A¨\u0006B"}, d2 = {"Lji/q1$d$a;", "Lji/q1$d;", "", "enabled", "Lh0/l;", "interactionSource", "Lx0/w;", "elevation", "LV0/D1;", "shape", "Ld0/h;", "border", "Lx0/u;", "colors", "Lj0/C;", "contentPadding", "Landroidx/compose/ui/Modifier;", "modifier", "localMinimumTouchTargetEnforcement", "LJi/T;", "rippleColor", "<init>", "(ZLh0/l;Lx0/w;LV0/D1;Ld0/h;Lx0/u;Lj0/C;Landroidx/compose/ui/Modifier;ZLJi/T;)V", "x", "(ZLh0/l;Lx0/w;LV0/D1;Ld0/h;Lx0/u;Lj0/C;Landroidx/compose/ui/Modifier;ZLJi/T;)Lji/q1$d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "h", "()Z", "b", "Lh0/l;", "e", "()Lh0/l;", "c", "Lx0/w;", "s", "()Lx0/w;", "d", "LV0/D1;", "()LV0/D1;", "Ld0/h;", "v", "()Ld0/h;", "f", "Lx0/u;", "()Lx0/u;", "g", "Lj0/C;", "()Lj0/C;", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "i", "t", "j", "LJi/T;", "()LJi/T;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$d$a, reason: from toString */
        public static final /* data */ class ChipButton implements d {

            /* renamed from: k, reason: collision with root package name */
            public static final int f139940k = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enabled;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC17981w elevation;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final D1 shape;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final BorderStroke border;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC17977u colors;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC14794C contentPadding;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean localMinimumTouchTargetEnforcement;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.T rippleColor;

            public ChipButton() {
                this(false, null, null, null, null, null, null, null, false, null, 1023, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChipButton)) {
                    return false;
                }
                ChipButton chipButton = (ChipButton) other;
                return this.enabled == chipButton.enabled && Intrinsics.e(this.interactionSource, chipButton.interactionSource) && Intrinsics.e(this.elevation, chipButton.elevation) && Intrinsics.e(this.shape, chipButton.shape) && Intrinsics.e(this.border, chipButton.border) && Intrinsics.e(this.colors, chipButton.colors) && Intrinsics.e(this.contentPadding, chipButton.contentPadding) && Intrinsics.e(this.modifier, chipButton.modifier) && this.localMinimumTouchTargetEnforcement == chipButton.localMinimumTouchTargetEnforcement && Intrinsics.e(this.rippleColor, chipButton.rippleColor);
            }

            public ChipButton(boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Modifier modifier, boolean z11, Ji.T t10) {
                Intrinsics.j(modifier, "modifier");
                this.enabled = z10;
                this.interactionSource = lVar;
                this.elevation = interfaceC17981w;
                this.shape = d12;
                this.border = c13441h;
                this.colors = interfaceC17977u;
                this.contentPadding = interfaceC14794C;
                this.modifier = modifier;
                this.localMinimumTouchTargetEnforcement = z11;
                this.rippleColor = t10;
            }

            public static /* synthetic */ ChipButton y(ChipButton chipButton, boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Modifier modifier, boolean z11, Ji.T t10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = chipButton.enabled;
                }
                if ((i10 & 2) != 0) {
                    lVar = chipButton.interactionSource;
                }
                if ((i10 & 4) != 0) {
                    interfaceC17981w = chipButton.elevation;
                }
                if ((i10 & 8) != 0) {
                    d12 = chipButton.shape;
                }
                if ((i10 & 16) != 0) {
                    c13441h = chipButton.border;
                }
                if ((i10 & 32) != 0) {
                    interfaceC17977u = chipButton.colors;
                }
                if ((i10 & 64) != 0) {
                    interfaceC14794C = chipButton.contentPadding;
                }
                if ((i10 & 128) != 0) {
                    modifier = chipButton.modifier;
                }
                if ((i10 & 256) != 0) {
                    z11 = chipButton.localMinimumTouchTargetEnforcement;
                }
                if ((i10 & 512) != 0) {
                    t10 = chipButton.rippleColor;
                }
                boolean z12 = z11;
                Ji.T t11 = t10;
                InterfaceC14794C interfaceC14794C2 = interfaceC14794C;
                Modifier modifier2 = modifier;
                BorderStroke c13441h2 = c13441h;
                InterfaceC17977u interfaceC17977u2 = interfaceC17977u;
                return chipButton.x(z10, lVar, interfaceC17981w, d12, c13441h2, interfaceC17977u2, interfaceC14794C2, modifier2, z12, t11);
            }

            @Override // ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.d
            /* renamed from: b, reason: from getter */
            public InterfaceC17977u getColors() {
                return this.colors;
            }

            @Override // ji.q1.d
            /* renamed from: c, reason: from getter */
            public InterfaceC14794C getContentPadding() {
                return this.contentPadding;
            }

            @Override // ji.q1.d
            /* renamed from: d, reason: from getter */
            public D1 getShape() {
                return this.shape;
            }

            @Override // ji.q1.d
            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            @Override // ji.q1.d
            /* renamed from: g, reason: from getter */
            public Ji.T getRippleColor() {
                return this.rippleColor;
            }

            @Override // ji.q1.d
            /* renamed from: h, reason: from getter */
            public boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.enabled) * 31;
                h0.l lVar = this.interactionSource;
                int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
                InterfaceC17981w interfaceC17981w = this.elevation;
                int iHashCode3 = (iHashCode2 + (interfaceC17981w == null ? 0 : interfaceC17981w.hashCode())) * 31;
                D1 d12 = this.shape;
                int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
                BorderStroke c13441h = this.border;
                int iHashCode5 = (iHashCode4 + (c13441h == null ? 0 : c13441h.hashCode())) * 31;
                InterfaceC17977u interfaceC17977u = this.colors;
                int iHashCode6 = (iHashCode5 + (interfaceC17977u == null ? 0 : interfaceC17977u.hashCode())) * 31;
                InterfaceC14794C interfaceC14794C = this.contentPadding;
                int iHashCode7 = (((((iHashCode6 + (interfaceC14794C == null ? 0 : interfaceC14794C.hashCode())) * 31) + this.modifier.hashCode()) * 31) + Boolean.hashCode(this.localMinimumTouchTargetEnforcement)) * 31;
                Ji.T t10 = this.rippleColor;
                return iHashCode7 + (t10 != null ? t10.hashCode() : 0);
            }

            @Override // ji.q1.d
            /* renamed from: s, reason: from getter */
            public InterfaceC17981w getElevation() {
                return this.elevation;
            }

            @Override // ji.q1.d
            /* renamed from: t, reason: from getter */
            public boolean getLocalMinimumTouchTargetEnforcement() {
                return this.localMinimumTouchTargetEnforcement;
            }

            public String toString() {
                return "ChipButton(enabled=" + this.enabled + ", interactionSource=" + this.interactionSource + ", elevation=" + this.elevation + ", shape=" + this.shape + ", border=" + this.border + ", colors=" + this.colors + ", contentPadding=" + this.contentPadding + ", modifier=" + this.modifier + ", localMinimumTouchTargetEnforcement=" + this.localMinimumTouchTargetEnforcement + ", rippleColor=" + this.rippleColor + ')';
            }

            @Override // ji.q1.d
            /* renamed from: v, reason: from getter */
            public BorderStroke getBorder() {
                return this.border;
            }

            public final ChipButton x(boolean enabled, h0.l interactionSource, InterfaceC17981w elevation, D1 shape, BorderStroke border, InterfaceC17977u colors, InterfaceC14794C contentPadding, Modifier modifier, boolean localMinimumTouchTargetEnforcement, Ji.T rippleColor) {
                Intrinsics.j(modifier, "modifier");
                return new ChipButton(enabled, interactionSource, elevation, shape, border, colors, contentPadding, modifier, localMinimumTouchTargetEnforcement, rippleColor);
            }

            public /* synthetic */ ChipButton(boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Modifier modifier, boolean z11, Ji.T t10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? null : interfaceC17981w, (i10 & 8) != 0 ? null : d12, (i10 & 16) != 0 ? null : c13441h, (i10 & 32) != 0 ? null : interfaceC17977u, (i10 & 64) != 0 ? null : interfaceC14794C, (i10 & 128) != 0 ? Modifier.INSTANCE : modifier, (i10 & 256) != 0 ? true : z11, (i10 & 512) != 0 ? null : t10);
            }
        }

        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u008c\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b4\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b(\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b,\u0010;R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b$\u0010=R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010%\u001a\u0004\b?\u0010'R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u001fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b9\u0010E¨\u0006F"}, d2 = {"Lji/q1$d$b;", "Lji/q1$d;", "", "enabled", "Lh0/l;", "interactionSource", "Lx0/w;", "elevation", "LV0/D1;", "shape", "Ld0/h;", "border", "Lx0/u;", "colors", "Lj0/C;", "contentPadding", "Landroidx/compose/ui/Modifier;", "modifier", "localMinimumTouchTargetEnforcement", "", "strokeWidth", "LJi/T;", "rippleColor", "<init>", "(ZLh0/l;Lx0/w;LV0/D1;Ld0/h;Lx0/u;Lj0/C;Landroidx/compose/ui/Modifier;ZILJi/T;)V", "x", "(ZLh0/l;Lx0/w;LV0/D1;Ld0/h;Lx0/u;Lj0/C;Landroidx/compose/ui/Modifier;ZILJi/T;)Lji/q1$d$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "h", "()Z", "b", "Lh0/l;", "e", "()Lh0/l;", "c", "Lx0/w;", "s", "()Lx0/w;", "d", "LV0/D1;", "()LV0/D1;", "Ld0/h;", "v", "()Ld0/h;", "f", "Lx0/u;", "()Lx0/u;", "g", "Lj0/C;", "()Lj0/C;", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "i", "t", "j", "I", "z", "k", "LJi/T;", "()LJi/T;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$d$b, reason: from toString */
        public static final /* data */ class ClippableCouponButton implements d {

            /* renamed from: l, reason: collision with root package name */
            public static final int f139951l = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enabled;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC17981w elevation;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final D1 shape;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final BorderStroke border;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC17977u colors;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC14794C contentPadding;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean localMinimumTouchTargetEnforcement;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final int strokeWidth;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.T rippleColor;

            public ClippableCouponButton() {
                this(false, null, null, null, null, null, null, null, false, 0, null, 2047, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClippableCouponButton)) {
                    return false;
                }
                ClippableCouponButton clippableCouponButton = (ClippableCouponButton) other;
                return this.enabled == clippableCouponButton.enabled && Intrinsics.e(this.interactionSource, clippableCouponButton.interactionSource) && Intrinsics.e(this.elevation, clippableCouponButton.elevation) && Intrinsics.e(this.shape, clippableCouponButton.shape) && Intrinsics.e(this.border, clippableCouponButton.border) && Intrinsics.e(this.colors, clippableCouponButton.colors) && Intrinsics.e(this.contentPadding, clippableCouponButton.contentPadding) && Intrinsics.e(this.modifier, clippableCouponButton.modifier) && this.localMinimumTouchTargetEnforcement == clippableCouponButton.localMinimumTouchTargetEnforcement && this.strokeWidth == clippableCouponButton.strokeWidth && Intrinsics.e(this.rippleColor, clippableCouponButton.rippleColor);
            }

            public ClippableCouponButton(boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Modifier modifier, boolean z11, int i10, Ji.T t10) {
                Intrinsics.j(modifier, "modifier");
                this.enabled = z10;
                this.interactionSource = lVar;
                this.elevation = interfaceC17981w;
                this.shape = d12;
                this.border = c13441h;
                this.colors = interfaceC17977u;
                this.contentPadding = interfaceC14794C;
                this.modifier = modifier;
                this.localMinimumTouchTargetEnforcement = z11;
                this.strokeWidth = i10;
                this.rippleColor = t10;
            }

            public static /* synthetic */ ClippableCouponButton y(ClippableCouponButton clippableCouponButton, boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Modifier modifier, boolean z11, int i10, Ji.T t10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z10 = clippableCouponButton.enabled;
                }
                if ((i11 & 2) != 0) {
                    lVar = clippableCouponButton.interactionSource;
                }
                if ((i11 & 4) != 0) {
                    interfaceC17981w = clippableCouponButton.elevation;
                }
                if ((i11 & 8) != 0) {
                    d12 = clippableCouponButton.shape;
                }
                if ((i11 & 16) != 0) {
                    c13441h = clippableCouponButton.border;
                }
                if ((i11 & 32) != 0) {
                    interfaceC17977u = clippableCouponButton.colors;
                }
                if ((i11 & 64) != 0) {
                    interfaceC14794C = clippableCouponButton.contentPadding;
                }
                if ((i11 & 128) != 0) {
                    modifier = clippableCouponButton.modifier;
                }
                if ((i11 & 256) != 0) {
                    z11 = clippableCouponButton.localMinimumTouchTargetEnforcement;
                }
                if ((i11 & 512) != 0) {
                    i10 = clippableCouponButton.strokeWidth;
                }
                if ((i11 & 1024) != 0) {
                    t10 = clippableCouponButton.rippleColor;
                }
                int i12 = i10;
                Ji.T t11 = t10;
                Modifier modifier2 = modifier;
                boolean z12 = z11;
                InterfaceC17977u interfaceC17977u2 = interfaceC17977u;
                InterfaceC14794C interfaceC14794C2 = interfaceC14794C;
                BorderStroke c13441h2 = c13441h;
                InterfaceC17981w interfaceC17981w2 = interfaceC17981w;
                return clippableCouponButton.x(z10, lVar, interfaceC17981w2, d12, c13441h2, interfaceC17977u2, interfaceC14794C2, modifier2, z12, i12, t11);
            }

            @Override // ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.d
            /* renamed from: b, reason: from getter */
            public InterfaceC17977u getColors() {
                return this.colors;
            }

            @Override // ji.q1.d
            /* renamed from: c, reason: from getter */
            public InterfaceC14794C getContentPadding() {
                return this.contentPadding;
            }

            @Override // ji.q1.d
            /* renamed from: d, reason: from getter */
            public D1 getShape() {
                return this.shape;
            }

            @Override // ji.q1.d
            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            @Override // ji.q1.d
            /* renamed from: g, reason: from getter */
            public Ji.T getRippleColor() {
                return this.rippleColor;
            }

            @Override // ji.q1.d
            /* renamed from: h, reason: from getter */
            public boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.enabled) * 31;
                h0.l lVar = this.interactionSource;
                int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
                InterfaceC17981w interfaceC17981w = this.elevation;
                int iHashCode3 = (iHashCode2 + (interfaceC17981w == null ? 0 : interfaceC17981w.hashCode())) * 31;
                D1 d12 = this.shape;
                int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
                BorderStroke c13441h = this.border;
                int iHashCode5 = (iHashCode4 + (c13441h == null ? 0 : c13441h.hashCode())) * 31;
                InterfaceC17977u interfaceC17977u = this.colors;
                int iHashCode6 = (iHashCode5 + (interfaceC17977u == null ? 0 : interfaceC17977u.hashCode())) * 31;
                InterfaceC14794C interfaceC14794C = this.contentPadding;
                int iHashCode7 = (((((((iHashCode6 + (interfaceC14794C == null ? 0 : interfaceC14794C.hashCode())) * 31) + this.modifier.hashCode()) * 31) + Boolean.hashCode(this.localMinimumTouchTargetEnforcement)) * 31) + Integer.hashCode(this.strokeWidth)) * 31;
                Ji.T t10 = this.rippleColor;
                return iHashCode7 + (t10 != null ? t10.hashCode() : 0);
            }

            @Override // ji.q1.d
            /* renamed from: s, reason: from getter */
            public InterfaceC17981w getElevation() {
                return this.elevation;
            }

            @Override // ji.q1.d
            /* renamed from: t, reason: from getter */
            public boolean getLocalMinimumTouchTargetEnforcement() {
                return this.localMinimumTouchTargetEnforcement;
            }

            public String toString() {
                return "ClippableCouponButton(enabled=" + this.enabled + ", interactionSource=" + this.interactionSource + ", elevation=" + this.elevation + ", shape=" + this.shape + ", border=" + this.border + ", colors=" + this.colors + ", contentPadding=" + this.contentPadding + ", modifier=" + this.modifier + ", localMinimumTouchTargetEnforcement=" + this.localMinimumTouchTargetEnforcement + ", strokeWidth=" + this.strokeWidth + ", rippleColor=" + this.rippleColor + ')';
            }

            @Override // ji.q1.d
            /* renamed from: v, reason: from getter */
            public BorderStroke getBorder() {
                return this.border;
            }

            public final ClippableCouponButton x(boolean enabled, h0.l interactionSource, InterfaceC17981w elevation, D1 shape, BorderStroke border, InterfaceC17977u colors, InterfaceC14794C contentPadding, Modifier modifier, boolean localMinimumTouchTargetEnforcement, int strokeWidth, Ji.T rippleColor) {
                Intrinsics.j(modifier, "modifier");
                return new ClippableCouponButton(enabled, interactionSource, elevation, shape, border, colors, contentPadding, modifier, localMinimumTouchTargetEnforcement, strokeWidth, rippleColor);
            }

            /* renamed from: z, reason: from getter */
            public final int getStrokeWidth() {
                return this.strokeWidth;
            }

            public /* synthetic */ ClippableCouponButton(boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Modifier modifier, boolean z11, int i10, Ji.T t10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? null : lVar, (i11 & 4) != 0 ? null : interfaceC17981w, (i11 & 8) != 0 ? null : d12, (i11 & 16) != 0 ? null : c13441h, (i11 & 32) != 0 ? null : interfaceC17977u, (i11 & 64) != 0 ? null : interfaceC14794C, (i11 & 128) != 0 ? Modifier.INSTANCE : modifier, (i11 & 256) != 0 ? true : z11, (i11 & 512) != 0 ? 6 : i10, (i11 & 1024) != 0 ? null : t10);
            }
        }

        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b,\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b$\u00108R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\b(\u0010:R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b6\u0010?¨\u0006@"}, d2 = {"Lji/q1$d$c;", "Lji/q1$d;", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lh0/l;", "interactionSource", "Lx0/w;", "elevation", "LV0/D1;", "shape", "Ld0/h;", "border", "Lx0/u;", "colors", "Lj0/C;", "contentPadding", "localMinimumTouchTargetEnforcement", "LJi/T;", "rippleColor", "<init>", "(Landroidx/compose/ui/Modifier;ZLh0/l;Lx0/w;LV0/D1;Ld0/h;Lx0/u;Lj0/C;ZLJi/T;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Z", "h", "()Z", "c", "Lh0/l;", "e", "()Lh0/l;", "d", "Lx0/w;", "s", "()Lx0/w;", "LV0/D1;", "()LV0/D1;", "f", "Ld0/h;", "v", "()Ld0/h;", "g", "Lx0/u;", "()Lx0/u;", "Lj0/C;", "()Lj0/C;", "i", "t", "j", "LJi/T;", "()LJi/T;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$d$c, reason: from toString */
        public static final /* data */ class ModalButton implements d {

            /* renamed from: k, reason: collision with root package name */
            public static final int f139963k = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enabled;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC17981w elevation;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final D1 shape;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final BorderStroke border;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC17977u colors;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC14794C contentPadding;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean localMinimumTouchTargetEnforcement;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.T rippleColor;

            public ModalButton() {
                this(null, false, null, null, null, null, null, null, false, null, 1023, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ModalButton)) {
                    return false;
                }
                ModalButton modalButton = (ModalButton) other;
                return Intrinsics.e(this.modifier, modalButton.modifier) && this.enabled == modalButton.enabled && Intrinsics.e(this.interactionSource, modalButton.interactionSource) && Intrinsics.e(this.elevation, modalButton.elevation) && Intrinsics.e(this.shape, modalButton.shape) && Intrinsics.e(this.border, modalButton.border) && Intrinsics.e(this.colors, modalButton.colors) && Intrinsics.e(this.contentPadding, modalButton.contentPadding) && this.localMinimumTouchTargetEnforcement == modalButton.localMinimumTouchTargetEnforcement && Intrinsics.e(this.rippleColor, modalButton.rippleColor);
            }

            public ModalButton(Modifier modifier, boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, boolean z11, Ji.T t10) {
                Intrinsics.j(modifier, "modifier");
                this.modifier = modifier;
                this.enabled = z10;
                this.interactionSource = lVar;
                this.elevation = interfaceC17981w;
                this.shape = d12;
                this.border = c13441h;
                this.colors = interfaceC17977u;
                this.contentPadding = interfaceC14794C;
                this.localMinimumTouchTargetEnforcement = z11;
                this.rippleColor = t10;
            }

            @Override // ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.d
            /* renamed from: b, reason: from getter */
            public InterfaceC17977u getColors() {
                return this.colors;
            }

            @Override // ji.q1.d
            /* renamed from: c, reason: from getter */
            public InterfaceC14794C getContentPadding() {
                return this.contentPadding;
            }

            @Override // ji.q1.d
            /* renamed from: d, reason: from getter */
            public D1 getShape() {
                return this.shape;
            }

            @Override // ji.q1.d
            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            @Override // ji.q1.d
            /* renamed from: g, reason: from getter */
            public Ji.T getRippleColor() {
                return this.rippleColor;
            }

            @Override // ji.q1.d
            /* renamed from: h, reason: from getter */
            public boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                int iHashCode = ((this.modifier.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
                h0.l lVar = this.interactionSource;
                int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
                InterfaceC17981w interfaceC17981w = this.elevation;
                int iHashCode3 = (iHashCode2 + (interfaceC17981w == null ? 0 : interfaceC17981w.hashCode())) * 31;
                D1 d12 = this.shape;
                int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
                BorderStroke c13441h = this.border;
                int iHashCode5 = (iHashCode4 + (c13441h == null ? 0 : c13441h.hashCode())) * 31;
                InterfaceC17977u interfaceC17977u = this.colors;
                int iHashCode6 = (iHashCode5 + (interfaceC17977u == null ? 0 : interfaceC17977u.hashCode())) * 31;
                InterfaceC14794C interfaceC14794C = this.contentPadding;
                int iHashCode7 = (((iHashCode6 + (interfaceC14794C == null ? 0 : interfaceC14794C.hashCode())) * 31) + Boolean.hashCode(this.localMinimumTouchTargetEnforcement)) * 31;
                Ji.T t10 = this.rippleColor;
                return iHashCode7 + (t10 != null ? t10.hashCode() : 0);
            }

            @Override // ji.q1.d
            /* renamed from: s, reason: from getter */
            public InterfaceC17981w getElevation() {
                return this.elevation;
            }

            @Override // ji.q1.d
            /* renamed from: t, reason: from getter */
            public boolean getLocalMinimumTouchTargetEnforcement() {
                return this.localMinimumTouchTargetEnforcement;
            }

            public String toString() {
                return "ModalButton(modifier=" + this.modifier + ", enabled=" + this.enabled + ", interactionSource=" + this.interactionSource + ", elevation=" + this.elevation + ", shape=" + this.shape + ", border=" + this.border + ", colors=" + this.colors + ", contentPadding=" + this.contentPadding + ", localMinimumTouchTargetEnforcement=" + this.localMinimumTouchTargetEnforcement + ", rippleColor=" + this.rippleColor + ')';
            }

            @Override // ji.q1.d
            /* renamed from: v, reason: from getter */
            public BorderStroke getBorder() {
                return this.border;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ ModalButton(androidx.compose.ui.Modifier r2, boolean r3, h0.l r4, kotlin.InterfaceC17981w r5, V0.D1 r6, d0.BorderStroke r7, kotlin.InterfaceC17977u r8, j0.InterfaceC14794C r9, boolean r10, Ji.T r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
                /*
                    r1 = this;
                    r13 = r12 & 1
                    if (r13 == 0) goto L6
                    androidx.compose.ui.Modifier$a r2 = androidx.compose.ui.Modifier.INSTANCE
                L6:
                    r13 = r12 & 2
                    if (r13 == 0) goto Lb
                    r3 = 1
                Lb:
                    r13 = r12 & 4
                    r0 = 0
                    if (r13 == 0) goto L11
                    r4 = r0
                L11:
                    r13 = r12 & 8
                    if (r13 == 0) goto L16
                    r5 = r0
                L16:
                    r13 = r12 & 16
                    if (r13 == 0) goto L1b
                    r6 = r0
                L1b:
                    r13 = r12 & 32
                    if (r13 == 0) goto L20
                    r7 = r0
                L20:
                    r13 = r12 & 64
                    if (r13 == 0) goto L25
                    r8 = r0
                L25:
                    r13 = r12 & 128(0x80, float:1.8E-43)
                    if (r13 == 0) goto L2a
                    r9 = r0
                L2a:
                    r13 = r12 & 256(0x100, float:3.59E-43)
                    if (r13 == 0) goto L2f
                    r10 = 0
                L2f:
                    r12 = r12 & 512(0x200, float:7.17E-43)
                    if (r12 == 0) goto L3f
                    r13 = r0
                    r11 = r9
                    r12 = r10
                    r9 = r7
                    r10 = r8
                    r7 = r5
                    r8 = r6
                    r5 = r3
                    r6 = r4
                    r3 = r1
                    r4 = r2
                    goto L4a
                L3f:
                    r13 = r11
                    r12 = r10
                    r10 = r8
                    r11 = r9
                    r8 = r6
                    r9 = r7
                    r6 = r4
                    r7 = r5
                    r4 = r2
                    r5 = r3
                    r3 = r1
                L4a:
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ji.q1.d.ModalButton.<init>(androidx.compose.ui.Modifier, boolean, h0.l, x0.w, V0.D1, d0.h, x0.u, j0.C, boolean, Ji.T, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0082\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b3\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b'\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b+\u0010:R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010;\u001a\u0004\b#\u0010<R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b8\u0010A¨\u0006B"}, d2 = {"Lji/q1$d$d;", "Lji/q1$d;", "", "enabled", "Lh0/l;", "interactionSource", "Lx0/w;", "elevation", "LV0/D1;", "shape", "Ld0/h;", "border", "Lx0/u;", "colors", "Lj0/C;", "contentPadding", "Landroidx/compose/ui/Modifier;", "modifier", "localMinimumTouchTargetEnforcement", "LJi/T;", "rippleColor", "<init>", "(ZLh0/l;Lx0/w;LV0/D1;Ld0/h;Lx0/u;Lj0/C;Landroidx/compose/ui/Modifier;ZLJi/T;)V", "x", "(ZLh0/l;Lx0/w;LV0/D1;Ld0/h;Lx0/u;Lj0/C;Landroidx/compose/ui/Modifier;ZLJi/T;)Lji/q1$d$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "h", "()Z", "b", "Lh0/l;", "e", "()Lh0/l;", "c", "Lx0/w;", "s", "()Lx0/w;", "d", "LV0/D1;", "()LV0/D1;", "Ld0/h;", "v", "()Ld0/h;", "f", "Lx0/u;", "()Lx0/u;", "g", "Lj0/C;", "()Lj0/C;", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "i", "t", "j", "LJi/T;", "()LJi/T;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$d$d, reason: collision with other inner class name and from toString */
        public static final /* data */ class StandardButton implements d {

            /* renamed from: k, reason: collision with root package name */
            public static final int f139974k = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enabled;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC17981w elevation;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final D1 shape;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final BorderStroke border;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC17977u colors;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC14794C contentPadding;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean localMinimumTouchTargetEnforcement;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.T rippleColor;

            public StandardButton() {
                this(false, null, null, null, null, null, null, null, false, null, 1023, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StandardButton)) {
                    return false;
                }
                StandardButton standardButton = (StandardButton) other;
                return this.enabled == standardButton.enabled && Intrinsics.e(this.interactionSource, standardButton.interactionSource) && Intrinsics.e(this.elevation, standardButton.elevation) && Intrinsics.e(this.shape, standardButton.shape) && Intrinsics.e(this.border, standardButton.border) && Intrinsics.e(this.colors, standardButton.colors) && Intrinsics.e(this.contentPadding, standardButton.contentPadding) && Intrinsics.e(this.modifier, standardButton.modifier) && this.localMinimumTouchTargetEnforcement == standardButton.localMinimumTouchTargetEnforcement && Intrinsics.e(this.rippleColor, standardButton.rippleColor);
            }

            public StandardButton(boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Modifier modifier, boolean z11, Ji.T t10) {
                Intrinsics.j(modifier, "modifier");
                this.enabled = z10;
                this.interactionSource = lVar;
                this.elevation = interfaceC17981w;
                this.shape = d12;
                this.border = c13441h;
                this.colors = interfaceC17977u;
                this.contentPadding = interfaceC14794C;
                this.modifier = modifier;
                this.localMinimumTouchTargetEnforcement = z11;
                this.rippleColor = t10;
            }

            public static /* synthetic */ StandardButton y(StandardButton standardButton, boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Modifier modifier, boolean z11, Ji.T t10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = standardButton.enabled;
                }
                if ((i10 & 2) != 0) {
                    lVar = standardButton.interactionSource;
                }
                if ((i10 & 4) != 0) {
                    interfaceC17981w = standardButton.elevation;
                }
                if ((i10 & 8) != 0) {
                    d12 = standardButton.shape;
                }
                if ((i10 & 16) != 0) {
                    c13441h = standardButton.border;
                }
                if ((i10 & 32) != 0) {
                    interfaceC17977u = standardButton.colors;
                }
                if ((i10 & 64) != 0) {
                    interfaceC14794C = standardButton.contentPadding;
                }
                if ((i10 & 128) != 0) {
                    modifier = standardButton.modifier;
                }
                if ((i10 & 256) != 0) {
                    z11 = standardButton.localMinimumTouchTargetEnforcement;
                }
                if ((i10 & 512) != 0) {
                    t10 = standardButton.rippleColor;
                }
                boolean z12 = z11;
                Ji.T t11 = t10;
                InterfaceC14794C interfaceC14794C2 = interfaceC14794C;
                Modifier modifier2 = modifier;
                BorderStroke c13441h2 = c13441h;
                InterfaceC17977u interfaceC17977u2 = interfaceC17977u;
                return standardButton.x(z10, lVar, interfaceC17981w, d12, c13441h2, interfaceC17977u2, interfaceC14794C2, modifier2, z12, t11);
            }

            @Override // ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.d
            /* renamed from: b, reason: from getter */
            public InterfaceC17977u getColors() {
                return this.colors;
            }

            @Override // ji.q1.d
            /* renamed from: c, reason: from getter */
            public InterfaceC14794C getContentPadding() {
                return this.contentPadding;
            }

            @Override // ji.q1.d
            /* renamed from: d, reason: from getter */
            public D1 getShape() {
                return this.shape;
            }

            @Override // ji.q1.d
            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            @Override // ji.q1.d
            /* renamed from: g, reason: from getter */
            public Ji.T getRippleColor() {
                return this.rippleColor;
            }

            @Override // ji.q1.d
            /* renamed from: h, reason: from getter */
            public boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.enabled) * 31;
                h0.l lVar = this.interactionSource;
                int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
                InterfaceC17981w interfaceC17981w = this.elevation;
                int iHashCode3 = (iHashCode2 + (interfaceC17981w == null ? 0 : interfaceC17981w.hashCode())) * 31;
                D1 d12 = this.shape;
                int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
                BorderStroke c13441h = this.border;
                int iHashCode5 = (iHashCode4 + (c13441h == null ? 0 : c13441h.hashCode())) * 31;
                InterfaceC17977u interfaceC17977u = this.colors;
                int iHashCode6 = (iHashCode5 + (interfaceC17977u == null ? 0 : interfaceC17977u.hashCode())) * 31;
                InterfaceC14794C interfaceC14794C = this.contentPadding;
                int iHashCode7 = (((((iHashCode6 + (interfaceC14794C == null ? 0 : interfaceC14794C.hashCode())) * 31) + this.modifier.hashCode()) * 31) + Boolean.hashCode(this.localMinimumTouchTargetEnforcement)) * 31;
                Ji.T t10 = this.rippleColor;
                return iHashCode7 + (t10 != null ? t10.hashCode() : 0);
            }

            @Override // ji.q1.d
            /* renamed from: s, reason: from getter */
            public InterfaceC17981w getElevation() {
                return this.elevation;
            }

            @Override // ji.q1.d
            /* renamed from: t, reason: from getter */
            public boolean getLocalMinimumTouchTargetEnforcement() {
                return this.localMinimumTouchTargetEnforcement;
            }

            public String toString() {
                return "StandardButton(enabled=" + this.enabled + ", interactionSource=" + this.interactionSource + ", elevation=" + this.elevation + ", shape=" + this.shape + ", border=" + this.border + ", colors=" + this.colors + ", contentPadding=" + this.contentPadding + ", modifier=" + this.modifier + ", localMinimumTouchTargetEnforcement=" + this.localMinimumTouchTargetEnforcement + ", rippleColor=" + this.rippleColor + ')';
            }

            @Override // ji.q1.d
            /* renamed from: v, reason: from getter */
            public BorderStroke getBorder() {
                return this.border;
            }

            public final StandardButton x(boolean enabled, h0.l interactionSource, InterfaceC17981w elevation, D1 shape, BorderStroke border, InterfaceC17977u colors, InterfaceC14794C contentPadding, Modifier modifier, boolean localMinimumTouchTargetEnforcement, Ji.T rippleColor) {
                Intrinsics.j(modifier, "modifier");
                return new StandardButton(enabled, interactionSource, elevation, shape, border, colors, contentPadding, modifier, localMinimumTouchTargetEnforcement, rippleColor);
            }

            public /* synthetic */ StandardButton(boolean z10, h0.l lVar, InterfaceC17981w interfaceC17981w, D1 d12, BorderStroke c13441h, InterfaceC17977u interfaceC17977u, InterfaceC14794C interfaceC14794C, Modifier modifier, boolean z11, Ji.T t10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? null : interfaceC17981w, (i10 & 8) != 0 ? null : d12, (i10 & 16) != 0 ? null : c13441h, (i10 & 32) != 0 ? null : interfaceC17977u, (i10 & 64) != 0 ? null : interfaceC14794C, (i10 & 128) != 0 ? Modifier.INSTANCE : modifier, (i10 & 256) != 0 ? true : z11, (i10 & 512) != 0 ? null : t10);
            }
        }

        /* renamed from: b */
        InterfaceC17977u getColors();

        /* renamed from: c */
        InterfaceC14794C getContentPadding();

        /* renamed from: d */
        D1 getShape();

        /* renamed from: e */
        h0.l getInteractionSource();

        /* renamed from: g */
        Ji.T getRippleColor();

        /* renamed from: h */
        boolean getEnabled();

        /* renamed from: s */
        InterfaceC17981w getElevation();

        /* renamed from: t */
        boolean getLocalMinimumTouchTargetEnforcement();

        /* renamed from: v */
        BorderStroke getBorder();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lji/q1$e;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "LP0/e$b;", "horizontalAlignment", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/d$m;LP0/e$b;)V", "x", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/d$m;LP0/e$b;)Lji/q1$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Landroidx/compose/foundation/layout/d$m;", "A", "()Landroidx/compose/foundation/layout/d$m;", "c", "LP0/e$b;", "z", "()LP0/e$b;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$e, reason: from toString */
    public static final /* data */ class Column implements q1 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f139985d = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final C5658d.m verticalArrangement;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final e.b horizontalAlignment;

        public Column() {
            this(null, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Column)) {
                return false;
            }
            Column column = (Column) other;
            return Intrinsics.e(this.modifier, column.modifier) && Intrinsics.e(this.verticalArrangement, column.verticalArrangement) && Intrinsics.e(this.horizontalAlignment, column.horizontalAlignment);
        }

        public Column(Modifier modifier, C5658d.m verticalArrangement, e.b horizontalAlignment) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(verticalArrangement, "verticalArrangement");
            Intrinsics.j(horizontalAlignment, "horizontalAlignment");
            this.modifier = modifier;
            this.verticalArrangement = verticalArrangement;
            this.horizontalAlignment = horizontalAlignment;
        }

        public static /* synthetic */ Column y(Column column, Modifier modifier, C5658d.m mVar, e.b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                modifier = column.modifier;
            }
            if ((i10 & 2) != 0) {
                mVar = column.verticalArrangement;
            }
            if ((i10 & 4) != 0) {
                bVar = column.horizontalAlignment;
            }
            return column.x(modifier, mVar, bVar);
        }

        /* renamed from: A, reason: from getter */
        public final C5658d.m getVerticalArrangement() {
            return this.verticalArrangement;
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            return (((this.modifier.hashCode() * 31) + this.verticalArrangement.hashCode()) * 31) + this.horizontalAlignment.hashCode();
        }

        public String toString() {
            return "Column(modifier=" + this.modifier + ", verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
        }

        public final Column x(Modifier modifier, C5658d.m verticalArrangement, e.b horizontalAlignment) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(verticalArrangement, "verticalArrangement");
            Intrinsics.j(horizontalAlignment, "horizontalAlignment");
            return new Column(modifier, verticalArrangement, horizontalAlignment);
        }

        /* renamed from: z, reason: from getter */
        public final e.b getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        public /* synthetic */ Column(Modifier modifier, C5658d.m mVar, e.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? C5658d.f48555a.h() : mVar, (i10 & 4) != 0 ? P0.e.INSTANCE.k() : bVar);
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005%0-)\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\bR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0001\u00041234ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, d2 = {"Lji/q1$f;", "", "Landroidx/compose/ui/Modifier;", "a", "()Landroidx/compose/ui/Modifier;", "modifier", "", "j", "()Z", "readOnly", "Lji/q1$f$a;", "getState", "()Lji/q1$f$a;", "state", "LJi/I;", "o", "()LJi/I;", "textStyle", "Lz1/W;", "m", "()Lz1/W;", "visualTransformation", "Landroidx/compose/foundation/text/A;", "r", "()Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "w", "()Landroidx/compose/foundation/text/z;", "keyboardActions", "q", "singleLine", "", "l", "()I", "maxLines", "Lh0/l;", "e", "()Lh0/l;", "interactionSource", "LV0/D1;", "d", "()LV0/D1;", "shape", "Lzi/c1;", "b", "()Lzi/c1;", "colors", "c", "Lji/q1$f$b;", "Lji/q1$f$c;", "Lji/q1$f$d;", "Lji/q1$f$e;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface f extends q1 {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lji/q1$f$a;", "", "c", "e", "f", "b", "a", "d", "Lji/q1$f$a$a;", "Lji/q1$f$a$b;", "Lji/q1$f$a$c;", "Lji/q1$f$a$d;", "Lji/q1$f$a$e;", "Lji/q1$f$a$f;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface a {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$f$a$a;", "Lji/q1$f$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ji.q1$f$a$a, reason: collision with other inner class name */
            public static final class C2215a implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final C2215a f139989a = new C2215a();

                private C2215a() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$f$a$b;", "Lji/q1$f$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class b implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final b f139990a = new b();

                private b() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$f$a$c;", "Lji/q1$f$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final c f139991a = new c();

                private c() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$f$a$d;", "Lji/q1$f$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final d f139992a = new d();

                private d() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$f$a$e;", "Lji/q1$f$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class e implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final e f139993a = new e();

                private e() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$f$a$f;", "Lji/q1$f$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ji.q1$f$a$f, reason: collision with other inner class name */
            public static final class C2216f implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final C2216f f139994a = new C2216f();

                private C2216f() {
                }
            }
        }

        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u008c\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\bB\u0010,R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010F\u001a\u0004\b5\u0010GR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b1\u0010JR\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010K\u001a\u0004\b)\u0010L¨\u0006M"}, d2 = {"Lji/q1$f$b;", "Lji/q1$f;", "Landroidx/compose/ui/Modifier;", "modifier", "", "readOnly", "Lji/q1$f$a;", "state", "LJi/I;", "textStyle", "Lz1/W;", "visualTransformation", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "singleLine", "", "maxLines", "Lh0/l;", "interactionSource", "LV0/D1;", "shape", "Lzi/c1;", "colors", "<init>", "(Landroidx/compose/ui/Modifier;ZLji/q1$f$a;LJi/I;Lz1/W;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZILh0/l;LV0/D1;Lzi/c1;)V", "x", "(Landroidx/compose/ui/Modifier;ZLji/q1$f$a;LJi/I;Lz1/W;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZILh0/l;LV0/D1;Lzi/c1;)Lji/q1$f$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Z", "j", "()Z", "c", "Lji/q1$f$a;", "getState", "()Lji/q1$f$a;", "d", "LJi/I;", "o", "()LJi/I;", "e", "Lz1/W;", "m", "()Lz1/W;", "f", "Landroidx/compose/foundation/text/A;", "r", "()Landroidx/compose/foundation/text/A;", "g", "Landroidx/compose/foundation/text/z;", "w", "()Landroidx/compose/foundation/text/z;", "h", "q", "i", "I", "l", "Lh0/l;", "()Lh0/l;", "k", "LV0/D1;", "()LV0/D1;", "Lzi/c1;", "()Lzi/c1;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$f$b, reason: from toString */
        public static final /* data */ class Dropdown implements f {

            /* renamed from: m, reason: collision with root package name */
            public static final int f139995m = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean readOnly;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final a state;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.I textStyle;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final z1.W visualTransformation;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final KeyboardOptions keyboardOptions;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final C5693z keyboardActions;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean singleLine;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final int maxLines;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final D1 shape;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsTextFieldColors colors;

            public Dropdown(Modifier modifier, boolean z10, a state, Ji.I textStyle, z1.W visualTransformation, KeyboardOptions keyboardOptions, C5693z keyboardActions, boolean z11, int i10, h0.l lVar, D1 d12, AdsTextFieldColors colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(textStyle, "textStyle");
                Intrinsics.j(visualTransformation, "visualTransformation");
                Intrinsics.j(keyboardOptions, "keyboardOptions");
                Intrinsics.j(keyboardActions, "keyboardActions");
                Intrinsics.j(colors, "colors");
                this.modifier = modifier;
                this.readOnly = z10;
                this.state = state;
                this.textStyle = textStyle;
                this.visualTransformation = visualTransformation;
                this.keyboardOptions = keyboardOptions;
                this.keyboardActions = keyboardActions;
                this.singleLine = z11;
                this.maxLines = i10;
                this.interactionSource = lVar;
                this.shape = d12;
                this.colors = colors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dropdown)) {
                    return false;
                }
                Dropdown dropdown = (Dropdown) other;
                return Intrinsics.e(this.modifier, dropdown.modifier) && this.readOnly == dropdown.readOnly && Intrinsics.e(this.state, dropdown.state) && Intrinsics.e(this.textStyle, dropdown.textStyle) && Intrinsics.e(this.visualTransformation, dropdown.visualTransformation) && Intrinsics.e(this.keyboardOptions, dropdown.keyboardOptions) && Intrinsics.e(this.keyboardActions, dropdown.keyboardActions) && this.singleLine == dropdown.singleLine && this.maxLines == dropdown.maxLines && Intrinsics.e(this.interactionSource, dropdown.interactionSource) && Intrinsics.e(this.shape, dropdown.shape) && Intrinsics.e(this.colors, dropdown.colors);
            }

            public static /* synthetic */ Dropdown y(Dropdown dropdown, Modifier modifier, boolean z10, a aVar, Ji.I i10, z1.W w10, KeyboardOptions a10, C5693z c5693z, boolean z11, int i11, h0.l lVar, D1 d12, AdsTextFieldColors c18477c1, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    modifier = dropdown.modifier;
                }
                if ((i12 & 2) != 0) {
                    z10 = dropdown.readOnly;
                }
                if ((i12 & 4) != 0) {
                    aVar = dropdown.state;
                }
                if ((i12 & 8) != 0) {
                    i10 = dropdown.textStyle;
                }
                if ((i12 & 16) != 0) {
                    w10 = dropdown.visualTransformation;
                }
                if ((i12 & 32) != 0) {
                    a10 = dropdown.keyboardOptions;
                }
                if ((i12 & 64) != 0) {
                    c5693z = dropdown.keyboardActions;
                }
                if ((i12 & 128) != 0) {
                    z11 = dropdown.singleLine;
                }
                if ((i12 & 256) != 0) {
                    i11 = dropdown.maxLines;
                }
                if ((i12 & 512) != 0) {
                    lVar = dropdown.interactionSource;
                }
                if ((i12 & 1024) != 0) {
                    d12 = dropdown.shape;
                }
                if ((i12 & RecyclerView.m.FLAG_MOVED) != 0) {
                    c18477c1 = dropdown.colors;
                }
                D1 d13 = d12;
                AdsTextFieldColors c18477c12 = c18477c1;
                int i13 = i11;
                h0.l lVar2 = lVar;
                C5693z c5693z2 = c5693z;
                boolean z12 = z11;
                z1.W w11 = w10;
                KeyboardOptions a11 = a10;
                return dropdown.x(modifier, z10, aVar, i10, w11, a11, c5693z2, z12, i13, lVar2, d13, c18477c12);
            }

            @Override // ji.q1.f, ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.f
            /* renamed from: b, reason: from getter */
            public AdsTextFieldColors getColors() {
                return this.colors;
            }

            @Override // ji.q1.f
            /* renamed from: d, reason: from getter */
            public D1 getShape() {
                return this.shape;
            }

            @Override // ji.q1.f
            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            @Override // ji.q1.f
            public a getState() {
                return this.state;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((this.modifier.hashCode() * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.state.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + this.visualTransformation.hashCode()) * 31) + this.keyboardOptions.hashCode()) * 31) + this.keyboardActions.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31) + Integer.hashCode(this.maxLines)) * 31;
                h0.l lVar = this.interactionSource;
                int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
                D1 d12 = this.shape;
                return ((iHashCode2 + (d12 != null ? d12.hashCode() : 0)) * 31) + this.colors.hashCode();
            }

            @Override // ji.q1.f
            /* renamed from: j, reason: from getter */
            public boolean getReadOnly() {
                return this.readOnly;
            }

            @Override // ji.q1.f
            /* renamed from: l, reason: from getter */
            public int getMaxLines() {
                return this.maxLines;
            }

            @Override // ji.q1.f
            /* renamed from: m, reason: from getter */
            public z1.W getVisualTransformation() {
                return this.visualTransformation;
            }

            @Override // ji.q1.f
            /* renamed from: o, reason: from getter */
            public Ji.I getTextStyle() {
                return this.textStyle;
            }

            @Override // ji.q1.f
            /* renamed from: q, reason: from getter */
            public boolean getSingleLine() {
                return this.singleLine;
            }

            @Override // ji.q1.f
            /* renamed from: r, reason: from getter */
            public KeyboardOptions getKeyboardOptions() {
                return this.keyboardOptions;
            }

            public String toString() {
                return "Dropdown(modifier=" + this.modifier + ", readOnly=" + this.readOnly + ", state=" + this.state + ", textStyle=" + this.textStyle + ", visualTransformation=" + this.visualTransformation + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActions=" + this.keyboardActions + ", singleLine=" + this.singleLine + ", maxLines=" + this.maxLines + ", interactionSource=" + this.interactionSource + ", shape=" + this.shape + ", colors=" + this.colors + ')';
            }

            @Override // ji.q1.f
            /* renamed from: w, reason: from getter */
            public C5693z getKeyboardActions() {
                return this.keyboardActions;
            }

            public final Dropdown x(Modifier modifier, boolean readOnly, a state, Ji.I textStyle, z1.W visualTransformation, KeyboardOptions keyboardOptions, C5693z keyboardActions, boolean singleLine, int maxLines, h0.l interactionSource, D1 shape, AdsTextFieldColors colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(textStyle, "textStyle");
                Intrinsics.j(visualTransformation, "visualTransformation");
                Intrinsics.j(keyboardOptions, "keyboardOptions");
                Intrinsics.j(keyboardActions, "keyboardActions");
                Intrinsics.j(colors, "colors");
                return new Dropdown(modifier, readOnly, state, textStyle, visualTransformation, keyboardOptions, keyboardActions, singleLine, maxLines, interactionSource, shape, colors);
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ Dropdown(androidx.compose.ui.Modifier r19, boolean r20, ji.q1.f.a r21, Ji.I r22, z1.W r23, androidx.compose.foundation.text.KeyboardOptions r24, androidx.compose.foundation.text.C5693z r25, boolean r26, int r27, h0.l r28, V0.D1 r29, zi.AdsTextFieldColors r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
                /*
                    r18 = this;
                    r0 = r31
                    r1 = r0 & 1
                    if (r1 == 0) goto La
                    androidx.compose.ui.Modifier$a r1 = androidx.compose.ui.Modifier.INSTANCE
                    r3 = r1
                    goto Lc
                La:
                    r3 = r19
                Lc:
                    r1 = r0 & 2
                    if (r1 == 0) goto L13
                    r1 = 1
                    r4 = r1
                    goto L15
                L13:
                    r4 = r20
                L15:
                    r1 = r0 & 4
                    if (r1 == 0) goto L1d
                    ji.q1$f$a$b r1 = ji.q1.f.a.b.f139990a
                    r5 = r1
                    goto L1f
                L1d:
                    r5 = r21
                L1f:
                    r1 = r0 & 16
                    if (r1 == 0) goto L2b
                    z1.W$a r1 = z1.W.INSTANCE
                    z1.W r1 = r1.c()
                    r7 = r1
                    goto L2d
                L2b:
                    r7 = r23
                L2d:
                    r1 = r0 & 32
                    if (r1 == 0) goto L39
                    androidx.compose.foundation.text.A$a r1 = androidx.compose.foundation.text.KeyboardOptions.INSTANCE
                    androidx.compose.foundation.text.A r1 = r1.a()
                    r8 = r1
                    goto L3b
                L39:
                    r8 = r24
                L3b:
                    r1 = r0 & 64
                    if (r1 == 0) goto L4f
                    androidx.compose.foundation.text.z r9 = new androidx.compose.foundation.text.z
                    r16 = 63
                    r17 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                    goto L51
                L4f:
                    r9 = r25
                L51:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L58
                    r1 = 0
                    r10 = r1
                    goto L5a
                L58:
                    r10 = r26
                L5a:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L63
                    r1 = 2147483647(0x7fffffff, float:NaN)
                    r11 = r1
                    goto L65
                L63:
                    r11 = r27
                L65:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    r2 = 0
                    if (r1 == 0) goto L6c
                    r12 = r2
                    goto L6e
                L6c:
                    r12 = r28
                L6e:
                    r0 = r0 & 1024(0x400, float:1.435E-42)
                    if (r0 == 0) goto L7a
                    r13 = r2
                    r6 = r22
                    r14 = r30
                    r2 = r18
                    goto L82
                L7a:
                    r13 = r29
                    r2 = r18
                    r6 = r22
                    r14 = r30
                L82:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ji.q1.f.Dropdown.<init>(androidx.compose.ui.Modifier, boolean, ji.q1$f$a, Ji.I, z1.W, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, boolean, int, h0.l, V0.D1, zi.c1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!Jº\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u00102R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\b;\u0010MR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b7\u0010PR\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010Q\u001a\u0004\b/\u0010RR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b=\u0010S\u001a\u0004\bT\u0010%R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\bY\u0010.R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u00100\u001a\u0004\b[\u00102¨\u0006\\"}, d2 = {"Lji/q1$f$c;", "Lji/q1$f;", "Landroidx/compose/ui/Modifier;", "modifier", "", "readOnly", "Lji/q1$f$a;", "state", "LJi/I;", "textStyle", "Lz1/W;", "visualTransformation", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "singleLine", "", "maxLines", "Lh0/l;", "interactionSource", "LV0/D1;", "shape", "Lzi/c1;", "colors", "", "signifier", "Lji/w1;", "Lji/j1;", "internalButtonAssembly", "outerModifier", "shouldFillMaxWidth", "<init>", "(Landroidx/compose/ui/Modifier;ZLji/q1$f$a;LJi/I;Lz1/W;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZILh0/l;LV0/D1;Lzi/c1;Ljava/lang/String;Lji/w1;Landroidx/compose/ui/Modifier;Z)V", "x", "(Landroidx/compose/ui/Modifier;ZLji/q1$f$a;LJi/I;Lz1/W;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZILh0/l;LV0/D1;Lzi/c1;Ljava/lang/String;Lji/w1;Landroidx/compose/ui/Modifier;Z)Lji/q1$f$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Z", "j", "()Z", "c", "Lji/q1$f$a;", "getState", "()Lji/q1$f$a;", "d", "LJi/I;", "o", "()LJi/I;", "e", "Lz1/W;", "m", "()Lz1/W;", "f", "Landroidx/compose/foundation/text/A;", "r", "()Landroidx/compose/foundation/text/A;", "g", "Landroidx/compose/foundation/text/z;", "w", "()Landroidx/compose/foundation/text/z;", "h", "q", "i", "I", "l", "Lh0/l;", "()Lh0/l;", "k", "LV0/D1;", "()LV0/D1;", "Lzi/c1;", "()Lzi/c1;", "Ljava/lang/String;", "C", "n", "Lji/w1;", "z", "()Lji/w1;", "A", "p", "B", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$f$c, reason: from toString */
        public static final /* data */ class QuantityInput implements f {

            /* renamed from: q, reason: collision with root package name */
            public static final int f140008q = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean readOnly;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final a state;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.I textStyle;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final z1.W visualTransformation;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final KeyboardOptions keyboardOptions;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final C5693z keyboardActions;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean singleLine;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final int maxLines;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final D1 shape;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsTextFieldColors colors;

            /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final String signifier;

            /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final w1<j1> internalButtonAssembly;

            /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier outerModifier;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldFillMaxWidth;

            public QuantityInput(Modifier modifier, boolean z10, a state, Ji.I textStyle, z1.W visualTransformation, KeyboardOptions keyboardOptions, C5693z keyboardActions, boolean z11, int i10, h0.l lVar, D1 d12, AdsTextFieldColors colors, String signifier, w1<j1> internalButtonAssembly, Modifier outerModifier, boolean z12) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(textStyle, "textStyle");
                Intrinsics.j(visualTransformation, "visualTransformation");
                Intrinsics.j(keyboardOptions, "keyboardOptions");
                Intrinsics.j(keyboardActions, "keyboardActions");
                Intrinsics.j(colors, "colors");
                Intrinsics.j(signifier, "signifier");
                Intrinsics.j(internalButtonAssembly, "internalButtonAssembly");
                Intrinsics.j(outerModifier, "outerModifier");
                this.modifier = modifier;
                this.readOnly = z10;
                this.state = state;
                this.textStyle = textStyle;
                this.visualTransformation = visualTransformation;
                this.keyboardOptions = keyboardOptions;
                this.keyboardActions = keyboardActions;
                this.singleLine = z11;
                this.maxLines = i10;
                this.interactionSource = lVar;
                this.shape = d12;
                this.colors = colors;
                this.signifier = signifier;
                this.internalButtonAssembly = internalButtonAssembly;
                this.outerModifier = outerModifier;
                this.shouldFillMaxWidth = z12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuantityInput)) {
                    return false;
                }
                QuantityInput quantityInput = (QuantityInput) other;
                return Intrinsics.e(this.modifier, quantityInput.modifier) && this.readOnly == quantityInput.readOnly && Intrinsics.e(this.state, quantityInput.state) && Intrinsics.e(this.textStyle, quantityInput.textStyle) && Intrinsics.e(this.visualTransformation, quantityInput.visualTransformation) && Intrinsics.e(this.keyboardOptions, quantityInput.keyboardOptions) && Intrinsics.e(this.keyboardActions, quantityInput.keyboardActions) && this.singleLine == quantityInput.singleLine && this.maxLines == quantityInput.maxLines && Intrinsics.e(this.interactionSource, quantityInput.interactionSource) && Intrinsics.e(this.shape, quantityInput.shape) && Intrinsics.e(this.colors, quantityInput.colors) && Intrinsics.e(this.signifier, quantityInput.signifier) && Intrinsics.e(this.internalButtonAssembly, quantityInput.internalButtonAssembly) && Intrinsics.e(this.outerModifier, quantityInput.outerModifier) && this.shouldFillMaxWidth == quantityInput.shouldFillMaxWidth;
            }

            /* renamed from: A, reason: from getter */
            public final Modifier getOuterModifier() {
                return this.outerModifier;
            }

            /* renamed from: B, reason: from getter */
            public final boolean getShouldFillMaxWidth() {
                return this.shouldFillMaxWidth;
            }

            /* renamed from: C, reason: from getter */
            public final String getSignifier() {
                return this.signifier;
            }

            @Override // ji.q1.f, ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.f
            /* renamed from: b, reason: from getter */
            public AdsTextFieldColors getColors() {
                return this.colors;
            }

            @Override // ji.q1.f
            /* renamed from: d, reason: from getter */
            public D1 getShape() {
                return this.shape;
            }

            @Override // ji.q1.f
            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            @Override // ji.q1.f
            public a getState() {
                return this.state;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((this.modifier.hashCode() * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.state.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + this.visualTransformation.hashCode()) * 31) + this.keyboardOptions.hashCode()) * 31) + this.keyboardActions.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31) + Integer.hashCode(this.maxLines)) * 31;
                h0.l lVar = this.interactionSource;
                int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
                D1 d12 = this.shape;
                return ((((((((((iHashCode2 + (d12 != null ? d12.hashCode() : 0)) * 31) + this.colors.hashCode()) * 31) + this.signifier.hashCode()) * 31) + this.internalButtonAssembly.hashCode()) * 31) + this.outerModifier.hashCode()) * 31) + Boolean.hashCode(this.shouldFillMaxWidth);
            }

            @Override // ji.q1.f
            /* renamed from: j, reason: from getter */
            public boolean getReadOnly() {
                return this.readOnly;
            }

            @Override // ji.q1.f
            /* renamed from: l, reason: from getter */
            public int getMaxLines() {
                return this.maxLines;
            }

            @Override // ji.q1.f
            /* renamed from: m, reason: from getter */
            public z1.W getVisualTransformation() {
                return this.visualTransformation;
            }

            @Override // ji.q1.f
            /* renamed from: o, reason: from getter */
            public Ji.I getTextStyle() {
                return this.textStyle;
            }

            @Override // ji.q1.f
            /* renamed from: q, reason: from getter */
            public boolean getSingleLine() {
                return this.singleLine;
            }

            @Override // ji.q1.f
            /* renamed from: r, reason: from getter */
            public KeyboardOptions getKeyboardOptions() {
                return this.keyboardOptions;
            }

            public String toString() {
                return "QuantityInput(modifier=" + this.modifier + ", readOnly=" + this.readOnly + ", state=" + this.state + ", textStyle=" + this.textStyle + ", visualTransformation=" + this.visualTransformation + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActions=" + this.keyboardActions + ", singleLine=" + this.singleLine + ", maxLines=" + this.maxLines + ", interactionSource=" + this.interactionSource + ", shape=" + this.shape + ", colors=" + this.colors + ", signifier=" + this.signifier + ", internalButtonAssembly=" + this.internalButtonAssembly + ", outerModifier=" + this.outerModifier + ", shouldFillMaxWidth=" + this.shouldFillMaxWidth + ')';
            }

            @Override // ji.q1.f
            /* renamed from: w, reason: from getter */
            public C5693z getKeyboardActions() {
                return this.keyboardActions;
            }

            public final QuantityInput x(Modifier modifier, boolean readOnly, a state, Ji.I textStyle, z1.W visualTransformation, KeyboardOptions keyboardOptions, C5693z keyboardActions, boolean singleLine, int maxLines, h0.l interactionSource, D1 shape, AdsTextFieldColors colors, String signifier, w1<j1> internalButtonAssembly, Modifier outerModifier, boolean shouldFillMaxWidth) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(textStyle, "textStyle");
                Intrinsics.j(visualTransformation, "visualTransformation");
                Intrinsics.j(keyboardOptions, "keyboardOptions");
                Intrinsics.j(keyboardActions, "keyboardActions");
                Intrinsics.j(colors, "colors");
                Intrinsics.j(signifier, "signifier");
                Intrinsics.j(internalButtonAssembly, "internalButtonAssembly");
                Intrinsics.j(outerModifier, "outerModifier");
                return new QuantityInput(modifier, readOnly, state, textStyle, visualTransformation, keyboardOptions, keyboardActions, singleLine, maxLines, interactionSource, shape, colors, signifier, internalButtonAssembly, outerModifier, shouldFillMaxWidth);
            }

            public final w1<j1> z() {
                return this.internalButtonAssembly;
            }

            public /* synthetic */ QuantityInput(Modifier modifier, boolean z10, a aVar, Ji.I i10, z1.W w10, KeyboardOptions a10, C5693z c5693z, boolean z11, int i11, h0.l lVar, D1 d12, AdsTextFieldColors c18477c1, String str, w1 w1Var, Modifier modifier2, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? Modifier.INSTANCE : modifier, (i12 & 2) != 0 ? false : z10, (i12 & 4) != 0 ? a.b.f139990a : aVar, i10, (i12 & 16) != 0 ? z1.W.INSTANCE.c() : w10, (i12 & 32) != 0 ? KeyboardOptions.INSTANCE.a() : a10, (i12 & 64) != 0 ? new C5693z(null, null, null, null, null, null, 63, null) : c5693z, (i12 & 128) != 0 ? true : z11, (i12 & 256) != 0 ? Integer.MAX_VALUE : i11, (i12 & 512) != 0 ? null : lVar, (i12 & 1024) != 0 ? null : d12, c18477c1, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "Qty:" : str, w1Var, modifier2, z12);
            }
        }

        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u008c\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\bB\u0010,R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010F\u001a\u0004\b5\u0010GR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b1\u0010JR\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010K\u001a\u0004\b)\u0010L¨\u0006M"}, d2 = {"Lji/q1$f$d;", "Lji/q1$f;", "Landroidx/compose/ui/Modifier;", "modifier", "", "readOnly", "Lji/q1$f$a;", "state", "LJi/I;", "textStyle", "Lz1/W;", "visualTransformation", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "singleLine", "", "maxLines", "Lh0/l;", "interactionSource", "LV0/D1;", "shape", "Lzi/c1;", "colors", "<init>", "(Landroidx/compose/ui/Modifier;ZLji/q1$f$a;LJi/I;Lz1/W;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZILh0/l;LV0/D1;Lzi/c1;)V", "x", "(Landroidx/compose/ui/Modifier;ZLji/q1$f$a;LJi/I;Lz1/W;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZILh0/l;LV0/D1;Lzi/c1;)Lji/q1$f$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Z", "j", "()Z", "c", "Lji/q1$f$a;", "getState", "()Lji/q1$f$a;", "d", "LJi/I;", "o", "()LJi/I;", "e", "Lz1/W;", "m", "()Lz1/W;", "f", "Landroidx/compose/foundation/text/A;", "r", "()Landroidx/compose/foundation/text/A;", "g", "Landroidx/compose/foundation/text/z;", "w", "()Landroidx/compose/foundation/text/z;", "h", "q", "i", "I", "l", "Lh0/l;", "()Lh0/l;", "k", "LV0/D1;", "()LV0/D1;", "Lzi/c1;", "()Lzi/c1;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$f$d, reason: from toString */
        public static final /* data */ class TextArea implements f {

            /* renamed from: m, reason: collision with root package name */
            public static final int f140025m = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean readOnly;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final a state;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.I textStyle;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final z1.W visualTransformation;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final KeyboardOptions keyboardOptions;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final C5693z keyboardActions;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean singleLine;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final int maxLines;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final D1 shape;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsTextFieldColors colors;

            public TextArea(Modifier modifier, boolean z10, a state, Ji.I textStyle, z1.W visualTransformation, KeyboardOptions keyboardOptions, C5693z keyboardActions, boolean z11, int i10, h0.l lVar, D1 d12, AdsTextFieldColors colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(textStyle, "textStyle");
                Intrinsics.j(visualTransformation, "visualTransformation");
                Intrinsics.j(keyboardOptions, "keyboardOptions");
                Intrinsics.j(keyboardActions, "keyboardActions");
                Intrinsics.j(colors, "colors");
                this.modifier = modifier;
                this.readOnly = z10;
                this.state = state;
                this.textStyle = textStyle;
                this.visualTransformation = visualTransformation;
                this.keyboardOptions = keyboardOptions;
                this.keyboardActions = keyboardActions;
                this.singleLine = z11;
                this.maxLines = i10;
                this.interactionSource = lVar;
                this.shape = d12;
                this.colors = colors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextArea)) {
                    return false;
                }
                TextArea textArea = (TextArea) other;
                return Intrinsics.e(this.modifier, textArea.modifier) && this.readOnly == textArea.readOnly && Intrinsics.e(this.state, textArea.state) && Intrinsics.e(this.textStyle, textArea.textStyle) && Intrinsics.e(this.visualTransformation, textArea.visualTransformation) && Intrinsics.e(this.keyboardOptions, textArea.keyboardOptions) && Intrinsics.e(this.keyboardActions, textArea.keyboardActions) && this.singleLine == textArea.singleLine && this.maxLines == textArea.maxLines && Intrinsics.e(this.interactionSource, textArea.interactionSource) && Intrinsics.e(this.shape, textArea.shape) && Intrinsics.e(this.colors, textArea.colors);
            }

            public static /* synthetic */ TextArea y(TextArea textArea, Modifier modifier, boolean z10, a aVar, Ji.I i10, z1.W w10, KeyboardOptions a10, C5693z c5693z, boolean z11, int i11, h0.l lVar, D1 d12, AdsTextFieldColors c18477c1, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    modifier = textArea.modifier;
                }
                if ((i12 & 2) != 0) {
                    z10 = textArea.readOnly;
                }
                if ((i12 & 4) != 0) {
                    aVar = textArea.state;
                }
                if ((i12 & 8) != 0) {
                    i10 = textArea.textStyle;
                }
                if ((i12 & 16) != 0) {
                    w10 = textArea.visualTransformation;
                }
                if ((i12 & 32) != 0) {
                    a10 = textArea.keyboardOptions;
                }
                if ((i12 & 64) != 0) {
                    c5693z = textArea.keyboardActions;
                }
                if ((i12 & 128) != 0) {
                    z11 = textArea.singleLine;
                }
                if ((i12 & 256) != 0) {
                    i11 = textArea.maxLines;
                }
                if ((i12 & 512) != 0) {
                    lVar = textArea.interactionSource;
                }
                if ((i12 & 1024) != 0) {
                    d12 = textArea.shape;
                }
                if ((i12 & RecyclerView.m.FLAG_MOVED) != 0) {
                    c18477c1 = textArea.colors;
                }
                D1 d13 = d12;
                AdsTextFieldColors c18477c12 = c18477c1;
                int i13 = i11;
                h0.l lVar2 = lVar;
                C5693z c5693z2 = c5693z;
                boolean z12 = z11;
                z1.W w11 = w10;
                KeyboardOptions a11 = a10;
                return textArea.x(modifier, z10, aVar, i10, w11, a11, c5693z2, z12, i13, lVar2, d13, c18477c12);
            }

            @Override // ji.q1.f, ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.f
            /* renamed from: b, reason: from getter */
            public AdsTextFieldColors getColors() {
                return this.colors;
            }

            @Override // ji.q1.f
            /* renamed from: d, reason: from getter */
            public D1 getShape() {
                return this.shape;
            }

            @Override // ji.q1.f
            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            @Override // ji.q1.f
            public a getState() {
                return this.state;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((this.modifier.hashCode() * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.state.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + this.visualTransformation.hashCode()) * 31) + this.keyboardOptions.hashCode()) * 31) + this.keyboardActions.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31) + Integer.hashCode(this.maxLines)) * 31;
                h0.l lVar = this.interactionSource;
                int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
                D1 d12 = this.shape;
                return ((iHashCode2 + (d12 != null ? d12.hashCode() : 0)) * 31) + this.colors.hashCode();
            }

            @Override // ji.q1.f
            /* renamed from: j, reason: from getter */
            public boolean getReadOnly() {
                return this.readOnly;
            }

            @Override // ji.q1.f
            /* renamed from: l, reason: from getter */
            public int getMaxLines() {
                return this.maxLines;
            }

            @Override // ji.q1.f
            /* renamed from: m, reason: from getter */
            public z1.W getVisualTransformation() {
                return this.visualTransformation;
            }

            @Override // ji.q1.f
            /* renamed from: o, reason: from getter */
            public Ji.I getTextStyle() {
                return this.textStyle;
            }

            @Override // ji.q1.f
            /* renamed from: q, reason: from getter */
            public boolean getSingleLine() {
                return this.singleLine;
            }

            @Override // ji.q1.f
            /* renamed from: r, reason: from getter */
            public KeyboardOptions getKeyboardOptions() {
                return this.keyboardOptions;
            }

            public String toString() {
                return "TextArea(modifier=" + this.modifier + ", readOnly=" + this.readOnly + ", state=" + this.state + ", textStyle=" + this.textStyle + ", visualTransformation=" + this.visualTransformation + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActions=" + this.keyboardActions + ", singleLine=" + this.singleLine + ", maxLines=" + this.maxLines + ", interactionSource=" + this.interactionSource + ", shape=" + this.shape + ", colors=" + this.colors + ')';
            }

            @Override // ji.q1.f
            /* renamed from: w, reason: from getter */
            public C5693z getKeyboardActions() {
                return this.keyboardActions;
            }

            public final TextArea x(Modifier modifier, boolean readOnly, a state, Ji.I textStyle, z1.W visualTransformation, KeyboardOptions keyboardOptions, C5693z keyboardActions, boolean singleLine, int maxLines, h0.l interactionSource, D1 shape, AdsTextFieldColors colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(textStyle, "textStyle");
                Intrinsics.j(visualTransformation, "visualTransformation");
                Intrinsics.j(keyboardOptions, "keyboardOptions");
                Intrinsics.j(keyboardActions, "keyboardActions");
                Intrinsics.j(colors, "colors");
                return new TextArea(modifier, readOnly, state, textStyle, visualTransformation, keyboardOptions, keyboardActions, singleLine, maxLines, interactionSource, shape, colors);
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ TextArea(androidx.compose.ui.Modifier r19, boolean r20, ji.q1.f.a r21, Ji.I r22, z1.W r23, androidx.compose.foundation.text.KeyboardOptions r24, androidx.compose.foundation.text.C5693z r25, boolean r26, int r27, h0.l r28, V0.D1 r29, zi.AdsTextFieldColors r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
                /*
                    r18 = this;
                    r0 = r31
                    r1 = r0 & 1
                    if (r1 == 0) goto La
                    androidx.compose.ui.Modifier$a r1 = androidx.compose.ui.Modifier.INSTANCE
                    r3 = r1
                    goto Lc
                La:
                    r3 = r19
                Lc:
                    r1 = r0 & 2
                    r2 = 0
                    if (r1 == 0) goto L13
                    r4 = r2
                    goto L15
                L13:
                    r4 = r20
                L15:
                    r1 = r0 & 4
                    if (r1 == 0) goto L1d
                    ji.q1$f$a$b r1 = ji.q1.f.a.b.f139990a
                    r5 = r1
                    goto L1f
                L1d:
                    r5 = r21
                L1f:
                    r1 = r0 & 16
                    if (r1 == 0) goto L2b
                    z1.W$a r1 = z1.W.INSTANCE
                    z1.W r1 = r1.c()
                    r7 = r1
                    goto L2d
                L2b:
                    r7 = r23
                L2d:
                    r1 = r0 & 32
                    if (r1 == 0) goto L39
                    androidx.compose.foundation.text.A$a r1 = androidx.compose.foundation.text.KeyboardOptions.INSTANCE
                    androidx.compose.foundation.text.A r1 = r1.a()
                    r8 = r1
                    goto L3b
                L39:
                    r8 = r24
                L3b:
                    r1 = r0 & 64
                    if (r1 == 0) goto L4f
                    androidx.compose.foundation.text.z r9 = new androidx.compose.foundation.text.z
                    r16 = 63
                    r17 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                    goto L51
                L4f:
                    r9 = r25
                L51:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L57
                    r10 = r2
                    goto L59
                L57:
                    r10 = r26
                L59:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L62
                    r1 = 2147483647(0x7fffffff, float:NaN)
                    r11 = r1
                    goto L64
                L62:
                    r11 = r27
                L64:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    r2 = 0
                    if (r1 == 0) goto L6b
                    r12 = r2
                    goto L6d
                L6b:
                    r12 = r28
                L6d:
                    r0 = r0 & 1024(0x400, float:1.435E-42)
                    if (r0 == 0) goto L79
                    r13 = r2
                    r6 = r22
                    r14 = r30
                    r2 = r18
                    goto L81
                L79:
                    r13 = r29
                    r2 = r18
                    r6 = r22
                    r14 = r30
                L81:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ji.q1.f.TextArea.<init>(androidx.compose.ui.Modifier, boolean, ji.q1$f$a, Ji.I, z1.W, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, boolean, int, h0.l, V0.D1, zi.c1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u008c\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\bB\u0010,R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010F\u001a\u0004\b5\u0010GR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b1\u0010JR\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010K\u001a\u0004\b)\u0010L¨\u0006M"}, d2 = {"Lji/q1$f$e;", "Lji/q1$f;", "Landroidx/compose/ui/Modifier;", "modifier", "", "readOnly", "Lji/q1$f$a;", "state", "LJi/I;", "textStyle", "Lz1/W;", "visualTransformation", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "singleLine", "", "maxLines", "Lh0/l;", "interactionSource", "LV0/D1;", "shape", "Lzi/c1;", "colors", "<init>", "(Landroidx/compose/ui/Modifier;ZLji/q1$f$a;LJi/I;Lz1/W;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZILh0/l;LV0/D1;Lzi/c1;)V", "x", "(Landroidx/compose/ui/Modifier;ZLji/q1$f$a;LJi/I;Lz1/W;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZILh0/l;LV0/D1;Lzi/c1;)Lji/q1$f$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Z", "j", "()Z", "c", "Lji/q1$f$a;", "getState", "()Lji/q1$f$a;", "d", "LJi/I;", "o", "()LJi/I;", "e", "Lz1/W;", "m", "()Lz1/W;", "f", "Landroidx/compose/foundation/text/A;", "r", "()Landroidx/compose/foundation/text/A;", "g", "Landroidx/compose/foundation/text/z;", "w", "()Landroidx/compose/foundation/text/z;", "h", "q", "i", "I", "l", "Lh0/l;", "()Lh0/l;", "k", "LV0/D1;", "()LV0/D1;", "Lzi/c1;", "()Lzi/c1;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$f$e, reason: from toString */
        public static final /* data */ class TextInput implements f {

            /* renamed from: m, reason: collision with root package name */
            public static final int f140038m = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean readOnly;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final a state;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.I textStyle;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final z1.W visualTransformation;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final KeyboardOptions keyboardOptions;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final C5693z keyboardActions;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean singleLine;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final int maxLines;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final D1 shape;

            /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsTextFieldColors colors;

            public TextInput(Modifier modifier, boolean z10, a state, Ji.I textStyle, z1.W visualTransformation, KeyboardOptions keyboardOptions, C5693z keyboardActions, boolean z11, int i10, h0.l lVar, D1 d12, AdsTextFieldColors colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(textStyle, "textStyle");
                Intrinsics.j(visualTransformation, "visualTransformation");
                Intrinsics.j(keyboardOptions, "keyboardOptions");
                Intrinsics.j(keyboardActions, "keyboardActions");
                Intrinsics.j(colors, "colors");
                this.modifier = modifier;
                this.readOnly = z10;
                this.state = state;
                this.textStyle = textStyle;
                this.visualTransformation = visualTransformation;
                this.keyboardOptions = keyboardOptions;
                this.keyboardActions = keyboardActions;
                this.singleLine = z11;
                this.maxLines = i10;
                this.interactionSource = lVar;
                this.shape = d12;
                this.colors = colors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextInput)) {
                    return false;
                }
                TextInput textInput = (TextInput) other;
                return Intrinsics.e(this.modifier, textInput.modifier) && this.readOnly == textInput.readOnly && Intrinsics.e(this.state, textInput.state) && Intrinsics.e(this.textStyle, textInput.textStyle) && Intrinsics.e(this.visualTransformation, textInput.visualTransformation) && Intrinsics.e(this.keyboardOptions, textInput.keyboardOptions) && Intrinsics.e(this.keyboardActions, textInput.keyboardActions) && this.singleLine == textInput.singleLine && this.maxLines == textInput.maxLines && Intrinsics.e(this.interactionSource, textInput.interactionSource) && Intrinsics.e(this.shape, textInput.shape) && Intrinsics.e(this.colors, textInput.colors);
            }

            public static /* synthetic */ TextInput y(TextInput textInput, Modifier modifier, boolean z10, a aVar, Ji.I i10, z1.W w10, KeyboardOptions a10, C5693z c5693z, boolean z11, int i11, h0.l lVar, D1 d12, AdsTextFieldColors c18477c1, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    modifier = textInput.modifier;
                }
                if ((i12 & 2) != 0) {
                    z10 = textInput.readOnly;
                }
                if ((i12 & 4) != 0) {
                    aVar = textInput.state;
                }
                if ((i12 & 8) != 0) {
                    i10 = textInput.textStyle;
                }
                if ((i12 & 16) != 0) {
                    w10 = textInput.visualTransformation;
                }
                if ((i12 & 32) != 0) {
                    a10 = textInput.keyboardOptions;
                }
                if ((i12 & 64) != 0) {
                    c5693z = textInput.keyboardActions;
                }
                if ((i12 & 128) != 0) {
                    z11 = textInput.singleLine;
                }
                if ((i12 & 256) != 0) {
                    i11 = textInput.maxLines;
                }
                if ((i12 & 512) != 0) {
                    lVar = textInput.interactionSource;
                }
                if ((i12 & 1024) != 0) {
                    d12 = textInput.shape;
                }
                if ((i12 & RecyclerView.m.FLAG_MOVED) != 0) {
                    c18477c1 = textInput.colors;
                }
                D1 d13 = d12;
                AdsTextFieldColors c18477c12 = c18477c1;
                int i13 = i11;
                h0.l lVar2 = lVar;
                C5693z c5693z2 = c5693z;
                boolean z12 = z11;
                z1.W w11 = w10;
                KeyboardOptions a11 = a10;
                return textInput.x(modifier, z10, aVar, i10, w11, a11, c5693z2, z12, i13, lVar2, d13, c18477c12);
            }

            @Override // ji.q1.f, ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.f
            /* renamed from: b, reason: from getter */
            public AdsTextFieldColors getColors() {
                return this.colors;
            }

            @Override // ji.q1.f
            /* renamed from: d, reason: from getter */
            public D1 getShape() {
                return this.shape;
            }

            @Override // ji.q1.f
            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            @Override // ji.q1.f
            public a getState() {
                return this.state;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((this.modifier.hashCode() * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.state.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + this.visualTransformation.hashCode()) * 31) + this.keyboardOptions.hashCode()) * 31) + this.keyboardActions.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31) + Integer.hashCode(this.maxLines)) * 31;
                h0.l lVar = this.interactionSource;
                int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
                D1 d12 = this.shape;
                return ((iHashCode2 + (d12 != null ? d12.hashCode() : 0)) * 31) + this.colors.hashCode();
            }

            @Override // ji.q1.f
            /* renamed from: j, reason: from getter */
            public boolean getReadOnly() {
                return this.readOnly;
            }

            @Override // ji.q1.f
            /* renamed from: l, reason: from getter */
            public int getMaxLines() {
                return this.maxLines;
            }

            @Override // ji.q1.f
            /* renamed from: m, reason: from getter */
            public z1.W getVisualTransformation() {
                return this.visualTransformation;
            }

            @Override // ji.q1.f
            /* renamed from: o, reason: from getter */
            public Ji.I getTextStyle() {
                return this.textStyle;
            }

            @Override // ji.q1.f
            /* renamed from: q, reason: from getter */
            public boolean getSingleLine() {
                return this.singleLine;
            }

            @Override // ji.q1.f
            /* renamed from: r, reason: from getter */
            public KeyboardOptions getKeyboardOptions() {
                return this.keyboardOptions;
            }

            public String toString() {
                return "TextInput(modifier=" + this.modifier + ", readOnly=" + this.readOnly + ", state=" + this.state + ", textStyle=" + this.textStyle + ", visualTransformation=" + this.visualTransformation + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActions=" + this.keyboardActions + ", singleLine=" + this.singleLine + ", maxLines=" + this.maxLines + ", interactionSource=" + this.interactionSource + ", shape=" + this.shape + ", colors=" + this.colors + ')';
            }

            @Override // ji.q1.f
            /* renamed from: w, reason: from getter */
            public C5693z getKeyboardActions() {
                return this.keyboardActions;
            }

            public final TextInput x(Modifier modifier, boolean readOnly, a state, Ji.I textStyle, z1.W visualTransformation, KeyboardOptions keyboardOptions, C5693z keyboardActions, boolean singleLine, int maxLines, h0.l interactionSource, D1 shape, AdsTextFieldColors colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(textStyle, "textStyle");
                Intrinsics.j(visualTransformation, "visualTransformation");
                Intrinsics.j(keyboardOptions, "keyboardOptions");
                Intrinsics.j(keyboardActions, "keyboardActions");
                Intrinsics.j(colors, "colors");
                return new TextInput(modifier, readOnly, state, textStyle, visualTransformation, keyboardOptions, keyboardActions, singleLine, maxLines, interactionSource, shape, colors);
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ TextInput(androidx.compose.ui.Modifier r19, boolean r20, ji.q1.f.a r21, Ji.I r22, z1.W r23, androidx.compose.foundation.text.KeyboardOptions r24, androidx.compose.foundation.text.C5693z r25, boolean r26, int r27, h0.l r28, V0.D1 r29, zi.AdsTextFieldColors r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
                /*
                    r18 = this;
                    r0 = r31
                    r1 = r0 & 1
                    if (r1 == 0) goto La
                    androidx.compose.ui.Modifier$a r1 = androidx.compose.ui.Modifier.INSTANCE
                    r3 = r1
                    goto Lc
                La:
                    r3 = r19
                Lc:
                    r1 = r0 & 2
                    if (r1 == 0) goto L13
                    r1 = 0
                    r4 = r1
                    goto L15
                L13:
                    r4 = r20
                L15:
                    r1 = r0 & 4
                    if (r1 == 0) goto L1d
                    ji.q1$f$a$b r1 = ji.q1.f.a.b.f139990a
                    r5 = r1
                    goto L1f
                L1d:
                    r5 = r21
                L1f:
                    r1 = r0 & 16
                    if (r1 == 0) goto L2b
                    z1.W$a r1 = z1.W.INSTANCE
                    z1.W r1 = r1.c()
                    r7 = r1
                    goto L2d
                L2b:
                    r7 = r23
                L2d:
                    r1 = r0 & 32
                    if (r1 == 0) goto L39
                    androidx.compose.foundation.text.A$a r1 = androidx.compose.foundation.text.KeyboardOptions.INSTANCE
                    androidx.compose.foundation.text.A r1 = r1.a()
                    r8 = r1
                    goto L3b
                L39:
                    r8 = r24
                L3b:
                    r1 = r0 & 64
                    if (r1 == 0) goto L4f
                    androidx.compose.foundation.text.z r9 = new androidx.compose.foundation.text.z
                    r16 = 63
                    r17 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                    goto L51
                L4f:
                    r9 = r25
                L51:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    r2 = 1
                    if (r1 == 0) goto L58
                    r10 = r2
                    goto L5a
                L58:
                    r10 = r26
                L5a:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L60
                    r11 = r2
                    goto L62
                L60:
                    r11 = r27
                L62:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    r2 = 0
                    if (r1 == 0) goto L69
                    r12 = r2
                    goto L6b
                L69:
                    r12 = r28
                L6b:
                    r0 = r0 & 1024(0x400, float:1.435E-42)
                    if (r0 == 0) goto L77
                    r13 = r2
                    r6 = r22
                    r14 = r30
                    r2 = r18
                    goto L7f
                L77:
                    r13 = r29
                    r2 = r18
                    r6 = r22
                    r14 = r30
                L7f:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ji.q1.f.TextInput.<init>(androidx.compose.ui.Modifier, boolean, ji.q1$f$a, Ji.I, z1.W, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, boolean, int, h0.l, V0.D1, zi.c1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @Override // ji.q1
        /* renamed from: a */
        Modifier getModifier();

        /* renamed from: b */
        AdsTextFieldColors getColors();

        /* renamed from: d */
        D1 getShape();

        /* renamed from: e */
        h0.l getInteractionSource();

        a getState();

        /* renamed from: j */
        boolean getReadOnly();

        /* renamed from: l */
        int getMaxLines();

        /* renamed from: m */
        z1.W getVisualTransformation();

        /* renamed from: o */
        Ji.I getTextStyle();

        /* renamed from: q */
        boolean getSingleLine();

        /* renamed from: r */
        KeyboardOptions getKeyboardOptions();

        /* renamed from: w */
        C5693z getKeyboardActions();
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bv\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\u007f\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b*\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R4\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lji/q1$g;", "Lji/q1;", "Landroidx/compose/ui/Modifier;", "modifier", "", "reverseLayout", "LH1/h;", "itemSpacing", "Lj0/C;", "contentPadding", "LP0/e$c;", "verticalAlignment", "Lkotlin/Function1;", "Loc/g;", "Lf0/s;", "flingBehavior", "", "Lkotlin/ParameterName;", "name", "page", "", "key", "<init>", "(Landroidx/compose/ui/Modifier;ZFLj0/C;LP0/e$c;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "x", "(Landroidx/compose/ui/Modifier;ZFLj0/C;LP0/e$c;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)Lji/q1$g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "b", "Z", "C", "()Z", "c", "F", "A", "()F", "d", "Lj0/C;", "()Lj0/C;", "e", "LP0/e$c;", "D", "()LP0/e$c;", "f", "Lkotlin/jvm/functions/Function3;", "z", "()Lkotlin/jvm/functions/Function3;", "g", "Lkotlin/jvm/functions/Function1;", "B", "()Lkotlin/jvm/functions/Function1;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ji.q1$g, reason: from toString */
    public static final /* data */ class HorizontalPagerTemplate implements q1 {

        /* renamed from: h, reason: collision with root package name */
        public static final int f140051h = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean reverseLayout;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float itemSpacing;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC14794C contentPadding;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final e.c verticalAlignment;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function3<PagerState, Composer, Integer, InterfaceC13820s> flingBehavior;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function1<Integer, Object> key;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$g$a */
        public static final class a implements Function3<PagerState, Composer, Integer, InterfaceC13820s> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC14794C f140059a;

            a(InterfaceC14794C interfaceC14794C) {
                this.f140059a = interfaceC14794C;
            }

            public final InterfaceC13820s a(PagerState pagerState, Composer composer, int i10) {
                Intrinsics.j(pagerState, "pagerState");
                composer.startReplaceGroup(-774550099);
                if (ComposerKt.M()) {
                    ComposerKt.U(-774550099, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Template.HorizontalPagerTemplate.<init>.<anonymous> (Templates.kt:135)");
                }
                InterfaceC13820s interfaceC13820sA = C16014c.f153306a.a(pagerState, null, null, androidx.compose.foundation.layout.D.f(this.f140059a, H1.t.f12006a), composer, (i10 & 14) | (C16014c.f153309d << 12), 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return interfaceC13820sA;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ InterfaceC13820s invoke(PagerState c16018g, Composer composer, Integer num) {
                return a(c16018g, composer, num.intValue());
            }
        }

        public /* synthetic */ HorizontalPagerTemplate(Modifier modifier, boolean z10, float f10, InterfaceC14794C interfaceC14794C, e.c cVar, Function3 function3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
            this(modifier, z10, f10, interfaceC14794C, cVar, function3, function1);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalPagerTemplate)) {
                return false;
            }
            HorizontalPagerTemplate horizontalPagerTemplate = (HorizontalPagerTemplate) other;
            return Intrinsics.e(this.modifier, horizontalPagerTemplate.modifier) && this.reverseLayout == horizontalPagerTemplate.reverseLayout && H1.h.u(this.itemSpacing, horizontalPagerTemplate.itemSpacing) && Intrinsics.e(this.contentPadding, horizontalPagerTemplate.contentPadding) && Intrinsics.e(this.verticalAlignment, horizontalPagerTemplate.verticalAlignment) && Intrinsics.e(this.flingBehavior, horizontalPagerTemplate.flingBehavior) && Intrinsics.e(this.key, horizontalPagerTemplate.key);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private HorizontalPagerTemplate(Modifier modifier, boolean z10, float f10, InterfaceC14794C contentPadding, e.c verticalAlignment, Function3<? super PagerState, ? super Composer, ? super Integer, ? extends InterfaceC13820s> flingBehavior, Function1<? super Integer, ? extends Object> function1) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(contentPadding, "contentPadding");
            Intrinsics.j(verticalAlignment, "verticalAlignment");
            Intrinsics.j(flingBehavior, "flingBehavior");
            this.modifier = modifier;
            this.reverseLayout = z10;
            this.itemSpacing = f10;
            this.contentPadding = contentPadding;
            this.verticalAlignment = verticalAlignment;
            this.flingBehavior = flingBehavior;
            this.key = function1;
        }

        public static /* synthetic */ HorizontalPagerTemplate y(HorizontalPagerTemplate horizontalPagerTemplate, Modifier modifier, boolean z10, float f10, InterfaceC14794C interfaceC14794C, e.c cVar, Function3 function3, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                modifier = horizontalPagerTemplate.modifier;
            }
            if ((i10 & 2) != 0) {
                z10 = horizontalPagerTemplate.reverseLayout;
            }
            if ((i10 & 4) != 0) {
                f10 = horizontalPagerTemplate.itemSpacing;
            }
            if ((i10 & 8) != 0) {
                interfaceC14794C = horizontalPagerTemplate.contentPadding;
            }
            if ((i10 & 16) != 0) {
                cVar = horizontalPagerTemplate.verticalAlignment;
            }
            if ((i10 & 32) != 0) {
                function3 = horizontalPagerTemplate.flingBehavior;
            }
            if ((i10 & 64) != 0) {
                function1 = horizontalPagerTemplate.key;
            }
            Function3 function32 = function3;
            Function1 function12 = function1;
            e.c cVar2 = cVar;
            float f11 = f10;
            return horizontalPagerTemplate.x(modifier, z10, f11, interfaceC14794C, cVar2, function32, function12);
        }

        /* renamed from: A, reason: from getter */
        public final float getItemSpacing() {
            return this.itemSpacing;
        }

        public final Function1<Integer, Object> B() {
            return this.key;
        }

        /* renamed from: C, reason: from getter */
        public final boolean getReverseLayout() {
            return this.reverseLayout;
        }

        /* renamed from: D, reason: from getter */
        public final e.c getVerticalAlignment() {
            return this.verticalAlignment;
        }

        /* renamed from: c, reason: from getter */
        public final InterfaceC14794C getContentPadding() {
            return this.contentPadding;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.modifier.hashCode() * 31) + Boolean.hashCode(this.reverseLayout)) * 31) + H1.h.w(this.itemSpacing)) * 31) + this.contentPadding.hashCode()) * 31) + this.verticalAlignment.hashCode()) * 31) + this.flingBehavior.hashCode()) * 31;
            Function1<Integer, Object> function1 = this.key;
            return iHashCode + (function1 == null ? 0 : function1.hashCode());
        }

        public String toString() {
            return "HorizontalPagerTemplate(modifier=" + this.modifier + ", reverseLayout=" + this.reverseLayout + ", itemSpacing=" + ((Object) H1.h.z(this.itemSpacing)) + ", contentPadding=" + this.contentPadding + ", verticalAlignment=" + this.verticalAlignment + ", flingBehavior=" + this.flingBehavior + ", key=" + this.key + ')';
        }

        public final HorizontalPagerTemplate x(Modifier modifier, boolean reverseLayout, float itemSpacing, InterfaceC14794C contentPadding, e.c verticalAlignment, Function3<? super PagerState, ? super Composer, ? super Integer, ? extends InterfaceC13820s> flingBehavior, Function1<? super Integer, ? extends Object> key) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(contentPadding, "contentPadding");
            Intrinsics.j(verticalAlignment, "verticalAlignment");
            Intrinsics.j(flingBehavior, "flingBehavior");
            return new HorizontalPagerTemplate(modifier, reverseLayout, itemSpacing, contentPadding, verticalAlignment, flingBehavior, key, null);
        }

        public final Function3<PagerState, Composer, Integer, InterfaceC13820s> z() {
            return this.flingBehavior;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ HorizontalPagerTemplate(Modifier modifier, boolean z10, float f10, InterfaceC14794C interfaceC14794C, e.c cVar, Function3 function3, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            Modifier modifier2 = (i10 & 1) != 0 ? Modifier.INSTANCE : modifier;
            boolean z11 = (i10 & 2) != 0 ? false : z10;
            float fP = (i10 & 4) != 0 ? H1.h.p(0) : f10;
            InterfaceC14794C interfaceC14794CA = (i10 & 8) != 0 ? androidx.compose.foundation.layout.D.a(H1.h.p(0)) : interfaceC14794C;
            this(modifier2, z11, fP, interfaceC14794CA, (i10 & 16) != 0 ? P0.e.INSTANCE.i() : cVar, (i10 & 32) != 0 ? new a(interfaceC14794CA) : function3, (i10 & 64) != 0 ? null : function1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lji/q1$h;", "", "c", "b", "a", "Lji/q1$h$a;", "Lji/q1$h$b;", "Lji/q1$h$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface h extends q1 {

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u001e\u00107¨\u00068"}, d2 = {"Lji/q1$h$a;", "Lji/q1$h;", "LJi/B;", BarcodePickDeserializer.FIELD_ICON, "", "contentDescription", "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "", "alpha", "LJi/T;", "color", "Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(LJi/B;Ljava/lang/String;LP0/e;Landroidx/compose/ui/layout/k;FLJi/T;Landroidx/compose/ui/Modifier;)V", "x", "(LJi/B;Ljava/lang/String;LP0/e;Landroidx/compose/ui/layout/k;FLJi/T;Landroidx/compose/ui/Modifier;)Lji/q1$h$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/B;", "getIcon", "()LJi/B;", "b", "Ljava/lang/String;", "getContentDescription", "c", "LP0/e;", "getAlignment", "()LP0/e;", "d", "Landroidx/compose/ui/layout/k;", "getContentScale", "()Landroidx/compose/ui/layout/k;", "e", "F", "getAlpha", "()F", "f", "LJi/T;", "getColor", "()LJi/T;", "g", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$h$a, reason: from toString */
        public static final /* data */ class AnimatedIcon implements h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.B icon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String contentDescription;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final P0.e alignment;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC5784k contentScale;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final float alpha;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.T color;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            public AnimatedIcon(Ji.B icon, String str, P0.e alignment, InterfaceC5784k contentScale, float f10, Ji.T t10, Modifier modifier) {
                Intrinsics.j(icon, "icon");
                Intrinsics.j(alignment, "alignment");
                Intrinsics.j(contentScale, "contentScale");
                Intrinsics.j(modifier, "modifier");
                this.icon = icon;
                this.contentDescription = str;
                this.alignment = alignment;
                this.contentScale = contentScale;
                this.alpha = f10;
                this.color = t10;
                this.modifier = modifier;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnimatedIcon)) {
                    return false;
                }
                AnimatedIcon animatedIcon = (AnimatedIcon) other;
                return Intrinsics.e(this.icon, animatedIcon.icon) && Intrinsics.e(this.contentDescription, animatedIcon.contentDescription) && Intrinsics.e(this.alignment, animatedIcon.alignment) && Intrinsics.e(this.contentScale, animatedIcon.contentScale) && Float.compare(this.alpha, animatedIcon.alpha) == 0 && Intrinsics.e(this.color, animatedIcon.color) && Intrinsics.e(this.modifier, animatedIcon.modifier);
            }

            public static /* synthetic */ AnimatedIcon y(AnimatedIcon animatedIcon, Ji.B b10, String str, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, Ji.T t10, Modifier modifier, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    b10 = animatedIcon.icon;
                }
                if ((i10 & 2) != 0) {
                    str = animatedIcon.contentDescription;
                }
                if ((i10 & 4) != 0) {
                    eVar = animatedIcon.alignment;
                }
                if ((i10 & 8) != 0) {
                    interfaceC5784k = animatedIcon.contentScale;
                }
                if ((i10 & 16) != 0) {
                    f10 = animatedIcon.alpha;
                }
                if ((i10 & 32) != 0) {
                    t10 = animatedIcon.color;
                }
                if ((i10 & 64) != 0) {
                    modifier = animatedIcon.modifier;
                }
                Ji.T t11 = t10;
                Modifier modifier2 = modifier;
                float f11 = f10;
                P0.e eVar2 = eVar;
                return animatedIcon.x(b10, str, eVar2, interfaceC5784k, f11, t11, modifier2);
            }

            @Override // ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            public int hashCode() {
                int iHashCode = this.icon.hashCode() * 31;
                String str = this.contentDescription;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
                Ji.T t10 = this.color;
                return ((iHashCode2 + (t10 != null ? t10.hashCode() : 0)) * 31) + this.modifier.hashCode();
            }

            public String toString() {
                return "AnimatedIcon(icon=" + this.icon + ", contentDescription=" + this.contentDescription + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", color=" + this.color + ", modifier=" + this.modifier + ')';
            }

            public final AnimatedIcon x(Ji.B icon, String contentDescription, P0.e alignment, InterfaceC5784k contentScale, float alpha, Ji.T color, Modifier modifier) {
                Intrinsics.j(icon, "icon");
                Intrinsics.j(alignment, "alignment");
                Intrinsics.j(contentScale, "contentScale");
                Intrinsics.j(modifier, "modifier");
                return new AnimatedIcon(icon, contentDescription, alignment, contentScale, alpha, color, modifier);
            }

            public /* synthetic */ AnimatedIcon(Ji.B b10, String str, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, Ji.T t10, Modifier modifier, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(b10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? P0.e.INSTANCE.e() : eVar, (i10 & 8) != 0 ? InterfaceC5784k.INSTANCE.e() : interfaceC5784k, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? null : t10, (i10 & 64) != 0 ? Modifier.INSTANCE : modifier);
            }
        }

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u001e\u00107¨\u00068"}, d2 = {"Lji/q1$h$b;", "Lji/q1$h;", "LJi/C;", BarcodePickDeserializer.FIELD_ICON, "", "contentDescription", "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "", "alpha", "LJi/T;", "color", "Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(LJi/C;Ljava/lang/String;LP0/e;Landroidx/compose/ui/layout/k;FLJi/T;Landroidx/compose/ui/Modifier;)V", "x", "(LJi/C;Ljava/lang/String;LP0/e;Landroidx/compose/ui/layout/k;FLJi/T;Landroidx/compose/ui/Modifier;)Lji/q1$h$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/C;", "B", "()LJi/C;", "b", "Ljava/lang/String;", "A", "c", "LP0/e;", "getAlignment", "()LP0/e;", "d", "Landroidx/compose/ui/layout/k;", "getContentScale", "()Landroidx/compose/ui/layout/k;", "e", "F", "getAlpha", "()F", "f", "LJi/T;", "z", "()LJi/T;", "g", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$h$b, reason: from toString */
        public static final /* data */ class DrawableIcon implements h {

            /* renamed from: h, reason: collision with root package name */
            public static final int f140067h = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.C icon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String contentDescription;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final P0.e alignment;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC5784k contentScale;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final float alpha;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ji.T color;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            public DrawableIcon(Ji.C icon, String str, P0.e alignment, InterfaceC5784k contentScale, float f10, Ji.T t10, Modifier modifier) {
                Intrinsics.j(icon, "icon");
                Intrinsics.j(alignment, "alignment");
                Intrinsics.j(contentScale, "contentScale");
                Intrinsics.j(modifier, "modifier");
                this.icon = icon;
                this.contentDescription = str;
                this.alignment = alignment;
                this.contentScale = contentScale;
                this.alpha = f10;
                this.color = t10;
                this.modifier = modifier;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DrawableIcon)) {
                    return false;
                }
                DrawableIcon drawableIcon = (DrawableIcon) other;
                return Intrinsics.e(this.icon, drawableIcon.icon) && Intrinsics.e(this.contentDescription, drawableIcon.contentDescription) && Intrinsics.e(this.alignment, drawableIcon.alignment) && Intrinsics.e(this.contentScale, drawableIcon.contentScale) && Float.compare(this.alpha, drawableIcon.alpha) == 0 && Intrinsics.e(this.color, drawableIcon.color) && Intrinsics.e(this.modifier, drawableIcon.modifier);
            }

            public static /* synthetic */ DrawableIcon y(DrawableIcon drawableIcon, Ji.C c10, String str, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, Ji.T t10, Modifier modifier, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    c10 = drawableIcon.icon;
                }
                if ((i10 & 2) != 0) {
                    str = drawableIcon.contentDescription;
                }
                if ((i10 & 4) != 0) {
                    eVar = drawableIcon.alignment;
                }
                if ((i10 & 8) != 0) {
                    interfaceC5784k = drawableIcon.contentScale;
                }
                if ((i10 & 16) != 0) {
                    f10 = drawableIcon.alpha;
                }
                if ((i10 & 32) != 0) {
                    t10 = drawableIcon.color;
                }
                if ((i10 & 64) != 0) {
                    modifier = drawableIcon.modifier;
                }
                Ji.T t11 = t10;
                Modifier modifier2 = modifier;
                float f11 = f10;
                P0.e eVar2 = eVar;
                return drawableIcon.x(c10, str, eVar2, interfaceC5784k, f11, t11, modifier2);
            }

            /* renamed from: A, reason: from getter */
            public final String getContentDescription() {
                return this.contentDescription;
            }

            /* renamed from: B, reason: from getter */
            public final Ji.C getIcon() {
                return this.icon;
            }

            @Override // ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            public int hashCode() {
                int iHashCode = this.icon.hashCode() * 31;
                String str = this.contentDescription;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
                Ji.T t10 = this.color;
                return ((iHashCode2 + (t10 != null ? t10.hashCode() : 0)) * 31) + this.modifier.hashCode();
            }

            public String toString() {
                return "DrawableIcon(icon=" + this.icon + ", contentDescription=" + this.contentDescription + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", color=" + this.color + ", modifier=" + this.modifier + ')';
            }

            public final DrawableIcon x(Ji.C icon, String contentDescription, P0.e alignment, InterfaceC5784k contentScale, float alpha, Ji.T color, Modifier modifier) {
                Intrinsics.j(icon, "icon");
                Intrinsics.j(alignment, "alignment");
                Intrinsics.j(contentScale, "contentScale");
                Intrinsics.j(modifier, "modifier");
                return new DrawableIcon(icon, contentDescription, alignment, contentScale, alpha, color, modifier);
            }

            /* renamed from: z, reason: from getter */
            public final Ji.T getColor() {
                return this.color;
            }

            public /* synthetic */ DrawableIcon(Ji.C c10, String str, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, Ji.T t10, Modifier modifier, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(c10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? P0.e.INSTANCE.e() : eVar, (i10 & 8) != 0 ? InterfaceC5784k.INSTANCE.e() : interfaceC5784k, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? null : t10, (i10 & 64) != 0 ? Modifier.INSTANCE : modifier);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lji/q1$h$c;", "Lji/q1$h;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "b", "Landroidx/compose/ui/Modifier;", "a", "()Landroidx/compose/ui/Modifier;", "modifier", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements h {

            /* renamed from: a, reason: collision with root package name */
            public static final c f140075a = new c();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final Modifier modifier = Modifier.INSTANCE;

            @Override // ji.q1
            /* renamed from: a */
            public Modifier getModifier() {
                return modifier;
            }

            private c() {
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lji/q1$i;", "", "Landroidx/compose/ui/Modifier;", "modifier", "LJi/T;", "color", "<init>", "(Landroidx/compose/ui/Modifier;LJi/T;)V", "x", "(Landroidx/compose/ui/Modifier;LJi/T;)Lji/q1$i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "LJi/T;", "z", "()LJi/T;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$i, reason: from toString */
    public static final /* data */ class InfoBlock implements q1 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f140077c = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Ji.T color;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoBlock)) {
                return false;
            }
            InfoBlock infoBlock = (InfoBlock) other;
            return Intrinsics.e(this.modifier, infoBlock.modifier) && Intrinsics.e(this.color, infoBlock.color);
        }

        public InfoBlock(Modifier modifier, Ji.T color) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(color, "color");
            this.modifier = modifier;
            this.color = color;
        }

        public static /* synthetic */ InfoBlock y(InfoBlock infoBlock, Modifier modifier, Ji.T t10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                modifier = infoBlock.modifier;
            }
            if ((i10 & 2) != 0) {
                t10 = infoBlock.color;
            }
            return infoBlock.x(modifier, t10);
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            return (this.modifier.hashCode() * 31) + this.color.hashCode();
        }

        public String toString() {
            return "InfoBlock(modifier=" + this.modifier + ", color=" + this.color + ')';
        }

        public final InfoBlock x(Modifier modifier, Ji.T color) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(color, "color");
            return new InfoBlock(modifier, color);
        }

        /* renamed from: z, reason: from getter */
        public final Ji.T getColor() {
            return this.color;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014Jr\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lji/q1$j;", "", "Landroidx/compose/ui/Modifier;", "modifier", "LJi/T;", "color", "LF1/k;", "textDecoration", "LF1/j;", "textAlign", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "LJi/I;", "style", "stringRes", "<init>", "(Landroidx/compose/ui/Modifier;LJi/T;LF1/k;LF1/j;IZILJi/I;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "x", "(Landroidx/compose/ui/Modifier;LJi/T;LF1/k;LF1/j;IZILJi/I;Ljava/lang/Integer;)Lji/q1$j;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "LJi/T;", "z", "()LJi/T;", "c", "LF1/k;", "F", "()LF1/k;", "d", "LF1/j;", "E", "()LF1/j;", "e", "I", "A", "f", "Z", "B", "()Z", "g", "l", "h", "LJi/I;", "D", "()LJi/I;", "i", "Ljava/lang/Integer;", "C", "()Ljava/lang/Integer;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$j, reason: from toString */
    public static final /* data */ class Label implements q1 {

        /* renamed from: j, reason: collision with root package name */
        public static final int f140080j = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Ji.T color;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final F1.k textDecoration;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final F1.j textAlign;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int overflow;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean softWrap;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxLines;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Ji.I style;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer stringRes;

        public /* synthetic */ Label(Modifier modifier, Ji.T t10, F1.k kVar, F1.j jVar, int i10, boolean z10, int i11, Ji.I i12, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(modifier, t10, kVar, jVar, i10, z10, i11, i12, num);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Label)) {
                return false;
            }
            Label label = (Label) other;
            return Intrinsics.e(this.modifier, label.modifier) && Intrinsics.e(this.color, label.color) && Intrinsics.e(this.textDecoration, label.textDecoration) && Intrinsics.e(this.textAlign, label.textAlign) && F1.t.g(this.overflow, label.overflow) && this.softWrap == label.softWrap && this.maxLines == label.maxLines && Intrinsics.e(this.style, label.style) && Intrinsics.e(this.stringRes, label.stringRes);
        }

        private Label(Modifier modifier, Ji.T t10, F1.k kVar, F1.j jVar, int i10, boolean z10, int i11, Ji.I style, Integer num) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(style, "style");
            this.modifier = modifier;
            this.color = t10;
            this.textDecoration = kVar;
            this.textAlign = jVar;
            this.overflow = i10;
            this.softWrap = z10;
            this.maxLines = i11;
            this.style = style;
            this.stringRes = num;
        }

        public static /* synthetic */ Label y(Label label, Modifier modifier, Ji.T t10, F1.k kVar, F1.j jVar, int i10, boolean z10, int i11, Ji.I i12, Integer num, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                modifier = label.modifier;
            }
            if ((i13 & 2) != 0) {
                t10 = label.color;
            }
            if ((i13 & 4) != 0) {
                kVar = label.textDecoration;
            }
            if ((i13 & 8) != 0) {
                jVar = label.textAlign;
            }
            if ((i13 & 16) != 0) {
                i10 = label.overflow;
            }
            if ((i13 & 32) != 0) {
                z10 = label.softWrap;
            }
            if ((i13 & 64) != 0) {
                i11 = label.maxLines;
            }
            if ((i13 & 128) != 0) {
                i12 = label.style;
            }
            if ((i13 & 256) != 0) {
                num = label.stringRes;
            }
            Ji.I i14 = i12;
            Integer num2 = num;
            boolean z11 = z10;
            int i15 = i11;
            int i16 = i10;
            F1.k kVar2 = kVar;
            return label.x(modifier, t10, kVar2, jVar, i16, z11, i15, i14, num2);
        }

        /* renamed from: A, reason: from getter */
        public final int getOverflow() {
            return this.overflow;
        }

        /* renamed from: B, reason: from getter */
        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        /* renamed from: C, reason: from getter */
        public final Integer getStringRes() {
            return this.stringRes;
        }

        /* renamed from: D, reason: from getter */
        public final Ji.I getStyle() {
            return this.style;
        }

        /* renamed from: E, reason: from getter */
        public final F1.j getTextAlign() {
            return this.textAlign;
        }

        /* renamed from: F, reason: from getter */
        public final F1.k getTextDecoration() {
            return this.textDecoration;
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            int iHashCode = this.modifier.hashCode() * 31;
            Ji.T t10 = this.color;
            int iHashCode2 = (iHashCode + (t10 == null ? 0 : t10.hashCode())) * 31;
            F1.k kVar = this.textDecoration;
            int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            F1.j jVar = this.textAlign;
            int iL = (((((((((iHashCode3 + (jVar == null ? 0 : F1.j.l(jVar.getValue()))) * 31) + F1.t.h(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.style.hashCode()) * 31;
            Integer num = this.stringRes;
            return iL + (num != null ? num.hashCode() : 0);
        }

        /* renamed from: l, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        public String toString() {
            return "Label(modifier=" + this.modifier + ", color=" + this.color + ", textDecoration=" + this.textDecoration + ", textAlign=" + this.textAlign + ", overflow=" + ((Object) F1.t.i(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", style=" + this.style + ", stringRes=" + this.stringRes + ')';
        }

        public final Label x(Modifier modifier, Ji.T color, F1.k textDecoration, F1.j textAlign, int overflow, boolean softWrap, int maxLines, Ji.I style, Integer stringRes) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(style, "style");
            return new Label(modifier, color, textDecoration, textAlign, overflow, softWrap, maxLines, style, stringRes, null);
        }

        /* renamed from: z, reason: from getter */
        public final Ji.T getColor() {
            return this.color;
        }

        public /* synthetic */ Label(Modifier modifier, Ji.T t10, F1.k kVar, F1.j jVar, int i10, boolean z10, int i11, Ji.I i12, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? Modifier.INSTANCE : modifier, (i13 & 2) != 0 ? null : t10, (i13 & 4) != 0 ? null : kVar, (i13 & 8) != 0 ? null : jVar, (i13 & 16) != 0 ? F1.t.INSTANCE.e() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, i12, (i13 & 256) != 0 ? null : num, null);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u0007\u0015R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f\u0082\u0001\u0003\u0016\u0017\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lji/q1$k;", "", "Landroidx/compose/ui/Modifier;", "a", "()Landroidx/compose/ui/Modifier;", "modifier", "Lji/b;", "b", "()Lji/b;", "colors", "LH1/h;", "u", "()F", "strokeWidth", "", "k", "()I", "rotationDuration", "", "p", "baseRotationAngle", "c", "Lji/q1$k$a;", "Lji/q1$k$b;", "Lji/q1$k$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface k extends q1 {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!¨\u0006'"}, d2 = {"Lji/q1$k$a;", "Lji/q1$k;", "Landroidx/compose/ui/Modifier;", "modifier", "Lji/b;", "colors", "LH1/h;", "strokeWidth", "", "rotationDuration", "", "baseRotationAngle", "<init>", "(Landroidx/compose/ui/Modifier;Lji/b;FIFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Lji/b;", "()Lji/b;", "c", "F", "u", "()F", "d", "I", "k", "e", "p", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @Deprecated
        @SourceDebugExtension
        /* renamed from: ji.q1$k$a, reason: from toString */
        public static final /* data */ class Large implements k {

            /* renamed from: f, reason: collision with root package name */
            public static final int f140090f = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsLoadingColor colors;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final float strokeWidth;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int rotationDuration;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final float baseRotationAngle;

            public /* synthetic */ Large(Modifier modifier, AdsLoadingColor c14925b, float f10, int i10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
                this(modifier, c14925b, f10, i10, f11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Large)) {
                    return false;
                }
                Large large = (Large) other;
                return Intrinsics.e(this.modifier, large.modifier) && Intrinsics.e(this.colors, large.colors) && H1.h.u(this.strokeWidth, large.strokeWidth) && this.rotationDuration == large.rotationDuration && Float.compare(this.baseRotationAngle, large.baseRotationAngle) == 0;
            }

            private Large(Modifier modifier, AdsLoadingColor colors, float f10, int i10, float f11) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(colors, "colors");
                this.modifier = modifier;
                this.colors = colors;
                this.strokeWidth = f10;
                this.rotationDuration = i10;
                this.baseRotationAngle = f11;
            }

            @Override // ji.q1.k, ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.k
            /* renamed from: b, reason: from getter */
            public AdsLoadingColor getColors() {
                return this.colors;
            }

            public int hashCode() {
                return (((((((this.modifier.hashCode() * 31) + this.colors.hashCode()) * 31) + H1.h.w(this.strokeWidth)) * 31) + Integer.hashCode(this.rotationDuration)) * 31) + Float.hashCode(this.baseRotationAngle);
            }

            @Override // ji.q1.k
            /* renamed from: k, reason: from getter */
            public int getRotationDuration() {
                return this.rotationDuration;
            }

            @Override // ji.q1.k
            /* renamed from: p, reason: from getter */
            public float getBaseRotationAngle() {
                return this.baseRotationAngle;
            }

            public String toString() {
                return "Large(modifier=" + this.modifier + ", colors=" + this.colors + ", strokeWidth=" + ((Object) H1.h.z(this.strokeWidth)) + ", rotationDuration=" + this.rotationDuration + ", baseRotationAngle=" + this.baseRotationAngle + ')';
            }

            @Override // ji.q1.k
            /* renamed from: u, reason: from getter */
            public float getStrokeWidth() {
                return this.strokeWidth;
            }

            public /* synthetic */ Large(Modifier modifier, AdsLoadingColor c14925b, float f10, int i10, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Modifier.INSTANCE : modifier, c14925b, (i11 & 4) != 0 ? H1.h.p(4) : f10, (i11 & 8) != 0 ? 1332 : i10, (i11 & 16) != 0 ? 360.0f : f11, null);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!¨\u0006'"}, d2 = {"Lji/q1$k$b;", "Lji/q1$k;", "Landroidx/compose/ui/Modifier;", "modifier", "Lji/b;", "colors", "LH1/h;", "strokeWidth", "", "rotationDuration", "", "baseRotationAngle", "<init>", "(Landroidx/compose/ui/Modifier;Lji/b;FIFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Lji/b;", "()Lji/b;", "c", "F", "u", "()F", "d", "I", "k", "e", "p", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ji.q1$k$b, reason: from toString */
        public static final /* data */ class LargeV2 implements k {

            /* renamed from: f, reason: collision with root package name */
            public static final int f140096f = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsLoadingColor colors;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final float strokeWidth;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int rotationDuration;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final float baseRotationAngle;

            public /* synthetic */ LargeV2(Modifier modifier, AdsLoadingColor c14925b, float f10, int i10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
                this(modifier, c14925b, f10, i10, f11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LargeV2)) {
                    return false;
                }
                LargeV2 largeV2 = (LargeV2) other;
                return Intrinsics.e(this.modifier, largeV2.modifier) && Intrinsics.e(this.colors, largeV2.colors) && H1.h.u(this.strokeWidth, largeV2.strokeWidth) && this.rotationDuration == largeV2.rotationDuration && Float.compare(this.baseRotationAngle, largeV2.baseRotationAngle) == 0;
            }

            private LargeV2(Modifier modifier, AdsLoadingColor colors, float f10, int i10, float f11) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(colors, "colors");
                this.modifier = modifier;
                this.colors = colors;
                this.strokeWidth = f10;
                this.rotationDuration = i10;
                this.baseRotationAngle = f11;
            }

            @Override // ji.q1.k, ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.k
            /* renamed from: b, reason: from getter */
            public AdsLoadingColor getColors() {
                return this.colors;
            }

            public int hashCode() {
                return (((((((this.modifier.hashCode() * 31) + this.colors.hashCode()) * 31) + H1.h.w(this.strokeWidth)) * 31) + Integer.hashCode(this.rotationDuration)) * 31) + Float.hashCode(this.baseRotationAngle);
            }

            @Override // ji.q1.k
            /* renamed from: k, reason: from getter */
            public int getRotationDuration() {
                return this.rotationDuration;
            }

            @Override // ji.q1.k
            /* renamed from: p, reason: from getter */
            public float getBaseRotationAngle() {
                return this.baseRotationAngle;
            }

            public String toString() {
                return "LargeV2(modifier=" + this.modifier + ", colors=" + this.colors + ", strokeWidth=" + ((Object) H1.h.z(this.strokeWidth)) + ", rotationDuration=" + this.rotationDuration + ", baseRotationAngle=" + this.baseRotationAngle + ')';
            }

            @Override // ji.q1.k
            /* renamed from: u, reason: from getter */
            public float getStrokeWidth() {
                return this.strokeWidth;
            }

            public /* synthetic */ LargeV2(Modifier modifier, AdsLoadingColor c14925b, float f10, int i10, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Modifier.INSTANCE : modifier, c14925b, (i11 & 4) != 0 ? H1.h.p(4) : f10, (i11 & 8) != 0 ? 1332 : i10, (i11 & 16) != 0 ? 360.0f : f11, null);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!¨\u0006'"}, d2 = {"Lji/q1$k$c;", "Lji/q1$k;", "Landroidx/compose/ui/Modifier;", "modifier", "Lji/b;", "colors", "LH1/h;", "strokeWidth", "", "rotationDuration", "", "baseRotationAngle", "<init>", "(Landroidx/compose/ui/Modifier;Lji/b;FIFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Lji/b;", "()Lji/b;", "c", "F", "u", "()F", "d", "I", "k", "e", "p", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ji.q1$k$c, reason: from toString */
        public static final /* data */ class Small implements k {

            /* renamed from: f, reason: collision with root package name */
            public static final int f140102f = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsLoadingColor colors;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final float strokeWidth;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int rotationDuration;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final float baseRotationAngle;

            public /* synthetic */ Small(Modifier modifier, AdsLoadingColor c14925b, float f10, int i10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
                this(modifier, c14925b, f10, i10, f11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Small)) {
                    return false;
                }
                Small small = (Small) other;
                return Intrinsics.e(this.modifier, small.modifier) && Intrinsics.e(this.colors, small.colors) && H1.h.u(this.strokeWidth, small.strokeWidth) && this.rotationDuration == small.rotationDuration && Float.compare(this.baseRotationAngle, small.baseRotationAngle) == 0;
            }

            private Small(Modifier modifier, AdsLoadingColor colors, float f10, int i10, float f11) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(colors, "colors");
                this.modifier = modifier;
                this.colors = colors;
                this.strokeWidth = f10;
                this.rotationDuration = i10;
                this.baseRotationAngle = f11;
            }

            @Override // ji.q1.k, ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.k
            /* renamed from: b, reason: from getter */
            public AdsLoadingColor getColors() {
                return this.colors;
            }

            public int hashCode() {
                return (((((((this.modifier.hashCode() * 31) + this.colors.hashCode()) * 31) + H1.h.w(this.strokeWidth)) * 31) + Integer.hashCode(this.rotationDuration)) * 31) + Float.hashCode(this.baseRotationAngle);
            }

            @Override // ji.q1.k
            /* renamed from: k, reason: from getter */
            public int getRotationDuration() {
                return this.rotationDuration;
            }

            @Override // ji.q1.k
            /* renamed from: p, reason: from getter */
            public float getBaseRotationAngle() {
                return this.baseRotationAngle;
            }

            public String toString() {
                return "Small(modifier=" + this.modifier + ", colors=" + this.colors + ", strokeWidth=" + ((Object) H1.h.z(this.strokeWidth)) + ", rotationDuration=" + this.rotationDuration + ", baseRotationAngle=" + this.baseRotationAngle + ')';
            }

            @Override // ji.q1.k
            /* renamed from: u, reason: from getter */
            public float getStrokeWidth() {
                return this.strokeWidth;
            }

            public /* synthetic */ Small(Modifier modifier, AdsLoadingColor c14925b, float f10, int i10, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Modifier.INSTANCE : modifier, c14925b, (i11 & 4) != 0 ? H1.h.p(2) : f10, (i11 & 8) != 0 ? 1332 : i10, (i11 & 16) != 0 ? 360.0f : f11, null);
            }
        }

        @Override // ji.q1
        /* renamed from: a */
        Modifier getModifier();

        /* renamed from: b */
        AdsLoadingColor getColors();

        /* renamed from: k */
        int getRotationDuration();

        /* renamed from: p */
        float getBaseRotationAngle();

        /* renamed from: u */
        float getStrokeWidth();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lji/q1$l;", "", "Landroidx/compose/ui/Modifier;", "modifier", "LV0/D1;", "shape", "LH1/h;", "elevation", "<init>", "(Landroidx/compose/ui/Modifier;LV0/D1;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "x", "(Landroidx/compose/ui/Modifier;LV0/D1;F)Lji/q1$l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "LV0/D1;", "d", "()LV0/D1;", "c", "F", "z", "()F", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$l, reason: from toString */
    public static final /* data */ class ModalTemplate implements q1 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f140108d = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final D1 shape;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final float elevation;

        public /* synthetic */ ModalTemplate(Modifier modifier, D1 d12, float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(modifier, d12, f10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ModalTemplate)) {
                return false;
            }
            ModalTemplate modalTemplate = (ModalTemplate) other;
            return Intrinsics.e(this.modifier, modalTemplate.modifier) && Intrinsics.e(this.shape, modalTemplate.shape) && H1.h.u(this.elevation, modalTemplate.elevation);
        }

        private ModalTemplate(Modifier modifier, D1 shape, float f10) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(shape, "shape");
            this.modifier = modifier;
            this.shape = shape;
            this.elevation = f10;
        }

        public static /* synthetic */ ModalTemplate y(ModalTemplate modalTemplate, Modifier modifier, D1 d12, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                modifier = modalTemplate.modifier;
            }
            if ((i10 & 2) != 0) {
                d12 = modalTemplate.shape;
            }
            if ((i10 & 4) != 0) {
                f10 = modalTemplate.elevation;
            }
            return modalTemplate.x(modifier, d12, f10);
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        /* renamed from: d, reason: from getter */
        public final D1 getShape() {
            return this.shape;
        }

        public int hashCode() {
            return (((this.modifier.hashCode() * 31) + this.shape.hashCode()) * 31) + H1.h.w(this.elevation);
        }

        public String toString() {
            return "ModalTemplate(modifier=" + this.modifier + ", shape=" + this.shape + ", elevation=" + ((Object) H1.h.z(this.elevation)) + ')';
        }

        public final ModalTemplate x(Modifier modifier, D1 shape, float elevation) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(shape, "shape");
            return new ModalTemplate(modifier, shape, elevation, null);
        }

        /* renamed from: z, reason: from getter */
        public final float getElevation() {
            return this.elevation;
        }

        public /* synthetic */ ModalTemplate(Modifier modifier, D1 d12, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, d12, f10, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0018\u000b\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\u0082\u0001\u0002\u0019\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lji/q1$m;", "", "Landroidx/compose/ui/Modifier;", "a", "()Landroidx/compose/ui/Modifier;", "modifier", "Lji/q1$m$a;", "getState", "()Lji/q1$m$a;", "state", "LCi/a;", "b", "()LCi/a;", "colors", "Lji/q1$h$b;", "n", "()Lji/q1$h$b;", "stateIcon", "Lji/q1$j;", "f", "()Lji/q1$j;", "bodyLabel", "i", "titleLabel", "c", "Lji/q1$m$b;", "Lji/q1$m$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface m extends q1 {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lji/q1$m$a;", "", "b", "d", "e", "c", "a", "Lji/q1$m$a$a;", "Lji/q1$m$a$b;", "Lji/q1$m$a$c;", "Lji/q1$m$a$d;", "Lji/q1$m$a$e;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface a {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$m$a$a;", "Lji/q1$m$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ji.q1$m$a$a, reason: collision with other inner class name */
            public static final class C2217a implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final C2217a f140112a = new C2217a();

                private C2217a() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$m$a$b;", "Lji/q1$m$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class b implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final b f140113a = new b();

                /* renamed from: b, reason: collision with root package name */
                public static final int f140114b = 0;

                private b() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$m$a$c;", "Lji/q1$m$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class c implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final c f140115a = new c();

                /* renamed from: b, reason: collision with root package name */
                public static final int f140116b = 0;

                private c() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$m$a$d;", "Lji/q1$m$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final d f140117a = new d();

                /* renamed from: b, reason: collision with root package name */
                public static final int f140118b = 0;

                private d() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji/q1$m$a$e;", "Lji/q1$m$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class e implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final e f140119a = new e();

                /* renamed from: b, reason: collision with root package name */
                public static final int f140120b = 0;

                private e() {
                }
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010/¨\u00062"}, d2 = {"Lji/q1$m$b;", "Lji/q1$m;", "Landroidx/compose/ui/Modifier;", "modifier", "Lji/q1$m$a;", "state", "LCi/a;", "colors", "Lji/q1$h$b;", "stateIcon", "closeIcon", "Lji/q1$j;", "bodyLabel", "titleLabel", "<init>", "(Landroidx/compose/ui/Modifier;Lji/q1$m$a;LCi/a;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$j;Lji/q1$j;)V", "x", "(Landroidx/compose/ui/Modifier;Lji/q1$m$a;LCi/a;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$j;Lji/q1$j;)Lji/q1$m$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Lji/q1$m$a;", "getState", "()Lji/q1$m$a;", "c", "LCi/a;", "()LCi/a;", "d", "Lji/q1$h$b;", "n", "()Lji/q1$h$b;", "e", "getCloseIcon", "f", "Lji/q1$j;", "()Lji/q1$j;", "g", "i", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$m$b, reason: from toString */
        public static final /* data */ class Inline implements m {

            /* renamed from: h, reason: collision with root package name */
            public static final int f140121h = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final a state;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsNotificationColors colors;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final h.DrawableIcon stateIcon;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final h.DrawableIcon closeIcon;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label bodyLabel;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label titleLabel;

            public Inline(Modifier modifier, a state, AdsNotificationColors colors, h.DrawableIcon stateIcon, h.DrawableIcon closeIcon, Label bodyLabel, Label titleLabel) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(colors, "colors");
                Intrinsics.j(stateIcon, "stateIcon");
                Intrinsics.j(closeIcon, "closeIcon");
                Intrinsics.j(bodyLabel, "bodyLabel");
                Intrinsics.j(titleLabel, "titleLabel");
                this.modifier = modifier;
                this.state = state;
                this.colors = colors;
                this.stateIcon = stateIcon;
                this.closeIcon = closeIcon;
                this.bodyLabel = bodyLabel;
                this.titleLabel = titleLabel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Inline)) {
                    return false;
                }
                Inline inline = (Inline) other;
                return Intrinsics.e(this.modifier, inline.modifier) && Intrinsics.e(this.state, inline.state) && Intrinsics.e(this.colors, inline.colors) && Intrinsics.e(this.stateIcon, inline.stateIcon) && Intrinsics.e(this.closeIcon, inline.closeIcon) && Intrinsics.e(this.bodyLabel, inline.bodyLabel) && Intrinsics.e(this.titleLabel, inline.titleLabel);
            }

            public static /* synthetic */ Inline y(Inline inline, Modifier modifier, a aVar, AdsNotificationColors aVar2, h.DrawableIcon drawableIcon, h.DrawableIcon drawableIcon2, Label label, Label label2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    modifier = inline.modifier;
                }
                if ((i10 & 2) != 0) {
                    aVar = inline.state;
                }
                if ((i10 & 4) != 0) {
                    aVar2 = inline.colors;
                }
                if ((i10 & 8) != 0) {
                    drawableIcon = inline.stateIcon;
                }
                if ((i10 & 16) != 0) {
                    drawableIcon2 = inline.closeIcon;
                }
                if ((i10 & 32) != 0) {
                    label = inline.bodyLabel;
                }
                if ((i10 & 64) != 0) {
                    label2 = inline.titleLabel;
                }
                Label label3 = label;
                Label label4 = label2;
                h.DrawableIcon drawableIcon3 = drawableIcon2;
                AdsNotificationColors aVar3 = aVar2;
                return inline.x(modifier, aVar, aVar3, drawableIcon, drawableIcon3, label3, label4);
            }

            @Override // ji.q1.m, ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.m
            /* renamed from: b, reason: from getter */
            public AdsNotificationColors getColors() {
                return this.colors;
            }

            @Override // ji.q1.m
            /* renamed from: f, reason: from getter */
            public Label getBodyLabel() {
                return this.bodyLabel;
            }

            @Override // ji.q1.m
            public a getState() {
                return this.state;
            }

            public int hashCode() {
                return (((((((((((this.modifier.hashCode() * 31) + this.state.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.stateIcon.hashCode()) * 31) + this.closeIcon.hashCode()) * 31) + this.bodyLabel.hashCode()) * 31) + this.titleLabel.hashCode();
            }

            @Override // ji.q1.m
            /* renamed from: i, reason: from getter */
            public Label getTitleLabel() {
                return this.titleLabel;
            }

            @Override // ji.q1.m
            /* renamed from: n, reason: from getter */
            public h.DrawableIcon getStateIcon() {
                return this.stateIcon;
            }

            public String toString() {
                return "Inline(modifier=" + this.modifier + ", state=" + this.state + ", colors=" + this.colors + ", stateIcon=" + this.stateIcon + ", closeIcon=" + this.closeIcon + ", bodyLabel=" + this.bodyLabel + ", titleLabel=" + this.titleLabel + ')';
            }

            public final Inline x(Modifier modifier, a state, AdsNotificationColors colors, h.DrawableIcon stateIcon, h.DrawableIcon closeIcon, Label bodyLabel, Label titleLabel) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(colors, "colors");
                Intrinsics.j(stateIcon, "stateIcon");
                Intrinsics.j(closeIcon, "closeIcon");
                Intrinsics.j(bodyLabel, "bodyLabel");
                Intrinsics.j(titleLabel, "titleLabel");
                return new Inline(modifier, state, colors, stateIcon, closeIcon, bodyLabel, titleLabel);
            }

            public /* synthetic */ Inline(Modifier modifier, a aVar, AdsNotificationColors aVar2, h.DrawableIcon drawableIcon, h.DrawableIcon drawableIcon2, Label label, Label label2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? a.C2217a.f140112a : aVar, aVar2, drawableIcon, drawableIcon2, label, label2);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010/¨\u00062"}, d2 = {"Lji/q1$m$c;", "Lji/q1$m;", "Landroidx/compose/ui/Modifier;", "modifier", "Lji/q1$m$a;", "state", "LCi/a;", "colors", "Lji/q1$h$b;", "stateIcon", "closeIcon", "Lji/q1$j;", "bodyLabel", "titleLabel", "<init>", "(Landroidx/compose/ui/Modifier;Lji/q1$m$a;LCi/a;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$j;Lji/q1$j;)V", "x", "(Landroidx/compose/ui/Modifier;Lji/q1$m$a;LCi/a;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$j;Lji/q1$j;)Lji/q1$m$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Lji/q1$m$a;", "getState", "()Lji/q1$m$a;", "c", "LCi/a;", "()LCi/a;", "d", "Lji/q1$h$b;", "n", "()Lji/q1$h$b;", "e", "getCloseIcon", "f", "Lji/q1$j;", "()Lji/q1$j;", "g", "i", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$m$c, reason: from toString */
        public static final /* data */ class Toast implements m {

            /* renamed from: h, reason: collision with root package name */
            public static final int f140129h = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final a state;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsNotificationColors colors;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final h.DrawableIcon stateIcon;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final h.DrawableIcon closeIcon;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label bodyLabel;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label titleLabel;

            public Toast(Modifier modifier, a state, AdsNotificationColors colors, h.DrawableIcon stateIcon, h.DrawableIcon closeIcon, Label bodyLabel, Label titleLabel) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(colors, "colors");
                Intrinsics.j(stateIcon, "stateIcon");
                Intrinsics.j(closeIcon, "closeIcon");
                Intrinsics.j(bodyLabel, "bodyLabel");
                Intrinsics.j(titleLabel, "titleLabel");
                this.modifier = modifier;
                this.state = state;
                this.colors = colors;
                this.stateIcon = stateIcon;
                this.closeIcon = closeIcon;
                this.bodyLabel = bodyLabel;
                this.titleLabel = titleLabel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Toast)) {
                    return false;
                }
                Toast toast = (Toast) other;
                return Intrinsics.e(this.modifier, toast.modifier) && Intrinsics.e(this.state, toast.state) && Intrinsics.e(this.colors, toast.colors) && Intrinsics.e(this.stateIcon, toast.stateIcon) && Intrinsics.e(this.closeIcon, toast.closeIcon) && Intrinsics.e(this.bodyLabel, toast.bodyLabel) && Intrinsics.e(this.titleLabel, toast.titleLabel);
            }

            public static /* synthetic */ Toast y(Toast toast, Modifier modifier, a aVar, AdsNotificationColors aVar2, h.DrawableIcon drawableIcon, h.DrawableIcon drawableIcon2, Label label, Label label2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    modifier = toast.modifier;
                }
                if ((i10 & 2) != 0) {
                    aVar = toast.state;
                }
                if ((i10 & 4) != 0) {
                    aVar2 = toast.colors;
                }
                if ((i10 & 8) != 0) {
                    drawableIcon = toast.stateIcon;
                }
                if ((i10 & 16) != 0) {
                    drawableIcon2 = toast.closeIcon;
                }
                if ((i10 & 32) != 0) {
                    label = toast.bodyLabel;
                }
                if ((i10 & 64) != 0) {
                    label2 = toast.titleLabel;
                }
                Label label3 = label;
                Label label4 = label2;
                h.DrawableIcon drawableIcon3 = drawableIcon2;
                AdsNotificationColors aVar3 = aVar2;
                return toast.x(modifier, aVar, aVar3, drawableIcon, drawableIcon3, label3, label4);
            }

            @Override // ji.q1.m, ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            @Override // ji.q1.m
            /* renamed from: b, reason: from getter */
            public AdsNotificationColors getColors() {
                return this.colors;
            }

            @Override // ji.q1.m
            /* renamed from: f, reason: from getter */
            public Label getBodyLabel() {
                return this.bodyLabel;
            }

            @Override // ji.q1.m
            public a getState() {
                return this.state;
            }

            public int hashCode() {
                return (((((((((((this.modifier.hashCode() * 31) + this.state.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.stateIcon.hashCode()) * 31) + this.closeIcon.hashCode()) * 31) + this.bodyLabel.hashCode()) * 31) + this.titleLabel.hashCode();
            }

            @Override // ji.q1.m
            /* renamed from: i, reason: from getter */
            public Label getTitleLabel() {
                return this.titleLabel;
            }

            @Override // ji.q1.m
            /* renamed from: n, reason: from getter */
            public h.DrawableIcon getStateIcon() {
                return this.stateIcon;
            }

            public String toString() {
                return "Toast(modifier=" + this.modifier + ", state=" + this.state + ", colors=" + this.colors + ", stateIcon=" + this.stateIcon + ", closeIcon=" + this.closeIcon + ", bodyLabel=" + this.bodyLabel + ", titleLabel=" + this.titleLabel + ')';
            }

            public final Toast x(Modifier modifier, a state, AdsNotificationColors colors, h.DrawableIcon stateIcon, h.DrawableIcon closeIcon, Label bodyLabel, Label titleLabel) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(state, "state");
                Intrinsics.j(colors, "colors");
                Intrinsics.j(stateIcon, "stateIcon");
                Intrinsics.j(closeIcon, "closeIcon");
                Intrinsics.j(bodyLabel, "bodyLabel");
                Intrinsics.j(titleLabel, "titleLabel");
                return new Toast(modifier, state, colors, stateIcon, closeIcon, bodyLabel, titleLabel);
            }

            public /* synthetic */ Toast(Modifier modifier, a aVar, AdsNotificationColors aVar2, h.DrawableIcon drawableIcon, h.DrawableIcon drawableIcon2, Label label, Label label2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? a.C2217a.f140112a : aVar, aVar2, drawableIcon, drawableIcon2, label, label2);
            }
        }

        @Override // ji.q1
        /* renamed from: a */
        Modifier getModifier();

        /* renamed from: b */
        AdsNotificationColors getColors();

        /* renamed from: f */
        Label getBodyLabel();

        a getState();

        /* renamed from: i */
        Label getTitleLabel();

        /* renamed from: n */
        h.DrawableIcon getStateIcon();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lji/q1$n;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "LP0/e$c;", "verticalAlignment", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/d$e;LP0/e$c;)V", "x", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/d$e;LP0/e$c;)Lji/q1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Landroidx/compose/foundation/layout/d$e;", "z", "()Landroidx/compose/foundation/layout/d$e;", "c", "LP0/e$c;", "A", "()LP0/e$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$n, reason: from toString */
    public static final /* data */ class Row implements q1 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f140137d = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final C5658d.e horizontalArrangement;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final e.c verticalAlignment;

        public Row() {
            this(null, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.e(this.modifier, row.modifier) && Intrinsics.e(this.horizontalArrangement, row.horizontalArrangement) && Intrinsics.e(this.verticalAlignment, row.verticalAlignment);
        }

        public Row(Modifier modifier, C5658d.e horizontalArrangement, e.c verticalAlignment) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(horizontalArrangement, "horizontalArrangement");
            Intrinsics.j(verticalAlignment, "verticalAlignment");
            this.modifier = modifier;
            this.horizontalArrangement = horizontalArrangement;
            this.verticalAlignment = verticalAlignment;
        }

        public static /* synthetic */ Row y(Row row, Modifier modifier, C5658d.e eVar, e.c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                modifier = row.modifier;
            }
            if ((i10 & 2) != 0) {
                eVar = row.horizontalArrangement;
            }
            if ((i10 & 4) != 0) {
                cVar = row.verticalAlignment;
            }
            return row.x(modifier, eVar, cVar);
        }

        /* renamed from: A, reason: from getter */
        public final e.c getVerticalAlignment() {
            return this.verticalAlignment;
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            return (((this.modifier.hashCode() * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalAlignment.hashCode();
        }

        public String toString() {
            return "Row(modifier=" + this.modifier + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
        }

        public final Row x(Modifier modifier, C5658d.e horizontalArrangement, e.c verticalAlignment) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(horizontalArrangement, "horizontalArrangement");
            Intrinsics.j(verticalAlignment, "verticalAlignment");
            return new Row(modifier, horizontalArrangement, verticalAlignment);
        }

        /* renamed from: z, reason: from getter */
        public final C5658d.e getHorizontalArrangement() {
            return this.horizontalArrangement;
        }

        public /* synthetic */ Row(Modifier modifier, C5658d.e eVar, e.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? C5658d.f48555a.g() : eVar, (i10 & 4) != 0 ? P0.e.INSTANCE.l() : cVar);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B~\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012)\b\u0002\u0010\u0013\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\f\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R8\u0010\u0013\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068\u0006¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*¨\u00067"}, d2 = {"Lji/q1$o;", "Lji/q1;", "", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "LV0/q0;", "backgroundColor", "contentColor", "LH1/h;", "edgePadding", "Lkotlin/Function1;", "", "Lx0/B1;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "indicator", "divider", "<init>", "(ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getSelectedTabIndex", "b", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "c", "Lkotlin/jvm/functions/Function2;", "x", "()Lkotlin/jvm/functions/Function2;", "d", "y", "e", "F", "A", "()F", "f", "Lkotlin/jvm/functions/Function3;", "getIndicator", "()Lkotlin/jvm/functions/Function3;", "g", "z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$o, reason: from toString */
    public static final /* data */ class ScrollableTabRowTemplate implements q1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int selectedTabIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function2<Composer, Integer, C5346q0> backgroundColor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function2<Composer, Integer, C5346q0> contentColor;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final float edgePadding;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function3<List<TabPosition>, Composer, Integer, Unit> indicator;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function2<Composer, Integer, Unit> divider;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$o$a */
        static final class a implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f140148a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-847257958);
                if (ComposerKt.M()) {
                    ComposerKt.U(-847257958, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Template.ScrollableTabRowTemplate.<init>.<anonymous> (Templates.kt:108)");
                }
                long jF = C17876E.f(C17877E0.f166879a.a(composer, C17877E0.f166880b));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return jF;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$o$b */
        static final class b implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, C5346q0> f140149a;

            /* JADX WARN: Multi-variable type inference failed */
            b(Function2<? super Composer, ? super Integer, C5346q0> function2) {
                this.f140149a = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(1700509105);
                if (ComposerKt.M()) {
                    ComposerKt.U(1700509105, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Template.ScrollableTabRowTemplate.<init>.<anonymous> (Templates.kt:109)");
                }
                long jB = C17876E.b(this.f140149a.invoke(composer, 0).getValue(), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return jB;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$o$c */
        static final class c implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f140150a;

            c(int i10) {
                this.f140150a = i10;
            }

            public final void a(List<TabPosition> tabPositions, Composer composer, int i10) {
                Intrinsics.j(tabPositions, "tabPositions");
                if (ComposerKt.M()) {
                    ComposerKt.U(1241306305, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Template.ScrollableTabRowTemplate.<init>.<anonymous> (Templates.kt:112)");
                }
                C1 c12 = C1.f166781a;
                c12.b(c12.e(Modifier.INSTANCE, tabPositions.get(this.f140150a)), 0.0f, 0L, composer, C1.f166785e << 9, 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
                a(list, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        public /* synthetic */ ScrollableTabRowTemplate(int i10, Modifier modifier, Function2 function2, Function2 function22, float f10, Function3 function3, Function2 function23, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, modifier, function2, function22, f10, function3, function23);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollableTabRowTemplate)) {
                return false;
            }
            ScrollableTabRowTemplate scrollableTabRowTemplate = (ScrollableTabRowTemplate) other;
            return this.selectedTabIndex == scrollableTabRowTemplate.selectedTabIndex && Intrinsics.e(this.modifier, scrollableTabRowTemplate.modifier) && Intrinsics.e(this.backgroundColor, scrollableTabRowTemplate.backgroundColor) && Intrinsics.e(this.contentColor, scrollableTabRowTemplate.contentColor) && H1.h.u(this.edgePadding, scrollableTabRowTemplate.edgePadding) && Intrinsics.e(this.indicator, scrollableTabRowTemplate.indicator) && Intrinsics.e(this.divider, scrollableTabRowTemplate.divider);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ScrollableTabRowTemplate(int i10, Modifier modifier, Function2<? super Composer, ? super Integer, C5346q0> backgroundColor, Function2<? super Composer, ? super Integer, C5346q0> contentColor, float f10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> indicator, Function2<? super Composer, ? super Integer, Unit> divider) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(backgroundColor, "backgroundColor");
            Intrinsics.j(contentColor, "contentColor");
            Intrinsics.j(indicator, "indicator");
            Intrinsics.j(divider, "divider");
            this.selectedTabIndex = i10;
            this.modifier = modifier;
            this.backgroundColor = backgroundColor;
            this.contentColor = contentColor;
            this.edgePadding = f10;
            this.indicator = indicator;
            this.divider = divider;
        }

        /* renamed from: A, reason: from getter */
        public final float getEdgePadding() {
            return this.edgePadding;
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.selectedTabIndex) * 31) + this.modifier.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.contentColor.hashCode()) * 31) + H1.h.w(this.edgePadding)) * 31) + this.indicator.hashCode()) * 31) + this.divider.hashCode();
        }

        public String toString() {
            return "ScrollableTabRowTemplate(selectedTabIndex=" + this.selectedTabIndex + ", modifier=" + this.modifier + ", backgroundColor=" + this.backgroundColor + ", contentColor=" + this.contentColor + ", edgePadding=" + ((Object) H1.h.z(this.edgePadding)) + ", indicator=" + this.indicator + ", divider=" + this.divider + ')';
        }

        public final Function2<Composer, Integer, C5346q0> x() {
            return this.backgroundColor;
        }

        public final Function2<Composer, Integer, C5346q0> y() {
            return this.contentColor;
        }

        public final Function2<Composer, Integer, Unit> z() {
            return this.divider;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ScrollableTabRowTemplate(int i10, Modifier modifier, Function2 function2, Function2 function22, float f10, Function3 function3, Function2 function23, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
            Function2 function24 = (i11 & 4) != 0 ? a.f140148a : function2;
            this(i10, modifier2, function24, (i11 & 8) != 0 ? new b(function24) : function22, (i11 & 16) != 0 ? C1.f166781a.d() : f10, (i11 & 32) != 0 ? ComposableLambdaKt.composableLambdaInstance(1241306305, true, new c(i10)) : function3, (i11 & 64) != 0 ? C14911N.f139692a.b() : function23, null);
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bt\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012)\b\u0002\u0010\u0011\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R8\u0010\u0011\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(¨\u00061"}, d2 = {"Lji/q1$p;", "Lji/q1;", "", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "LV0/q0;", "backgroundColor", "contentColor", "Lkotlin/Function1;", "", "Lx0/B1;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "indicator", "divider", "<init>", "(ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getSelectedTabIndex", "b", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "c", "Lkotlin/jvm/functions/Function2;", "x", "()Lkotlin/jvm/functions/Function2;", "d", "y", "e", "Lkotlin/jvm/functions/Function3;", "getIndicator", "()Lkotlin/jvm/functions/Function3;", "f", "z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$p, reason: from toString */
    public static final /* data */ class TabRowTemplate implements q1 {

        /* renamed from: g, reason: collision with root package name */
        public static final int f140151g = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int selectedTabIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function2<Composer, Integer, C5346q0> backgroundColor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function2<Composer, Integer, C5346q0> contentColor;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function3<List<TabPosition>, Composer, Integer, Unit> indicator;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function2<Composer, Integer, Unit> divider;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$p$a */
        static final class a implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f140158a = new a();

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            a() {
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(-140875437);
                if (ComposerKt.M()) {
                    ComposerKt.U(-140875437, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Template.TabRowTemplate.<init>.<anonymous> (Templates.kt:88)");
                }
                long jF = C17876E.f(C17877E0.f166879a.a(composer, C17877E0.f166880b));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return jF;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$p$b */
        static final class b implements Function2<Composer, Integer, C5346q0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, C5346q0> f140159a;

            /* JADX WARN: Multi-variable type inference failed */
            b(Function2<? super Composer, ? super Integer, C5346q0> function2) {
                this.f140159a = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ C5346q0 invoke(Composer composer, Integer num) {
                return C5346q0.m(a(composer, num.intValue()));
            }

            public final long a(Composer composer, int i10) {
                composer.startReplaceGroup(181199146);
                if (ComposerKt.M()) {
                    ComposerKt.U(181199146, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Template.TabRowTemplate.<init>.<anonymous> (Templates.kt:89)");
                }
                long jB = C17876E.b(this.f140159a.invoke(composer, 0).getValue(), composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return jB;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$p$c */
        static final class c implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f140160a;

            c(int i10) {
                this.f140160a = i10;
            }

            public final void a(List<TabPosition> tabPositions, Composer composer, int i10) {
                Intrinsics.j(tabPositions, "tabPositions");
                if (ComposerKt.M()) {
                    ComposerKt.U(-479816646, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.Template.TabRowTemplate.<init>.<anonymous> (Templates.kt:91)");
                }
                C1 c12 = C1.f166781a;
                c12.b(c12.e(Modifier.INSTANCE, tabPositions.get(this.f140160a)), 0.0f, 0L, composer, C1.f166785e << 9, 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
                a(list, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TabRowTemplate(int i10, Modifier modifier, Function2<? super Composer, ? super Integer, C5346q0> backgroundColor, Function2<? super Composer, ? super Integer, C5346q0> contentColor, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> indicator, Function2<? super Composer, ? super Integer, Unit> divider) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(backgroundColor, "backgroundColor");
            Intrinsics.j(contentColor, "contentColor");
            Intrinsics.j(indicator, "indicator");
            Intrinsics.j(divider, "divider");
            this.selectedTabIndex = i10;
            this.modifier = modifier;
            this.backgroundColor = backgroundColor;
            this.contentColor = contentColor;
            this.indicator = indicator;
            this.divider = divider;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabRowTemplate)) {
                return false;
            }
            TabRowTemplate tabRowTemplate = (TabRowTemplate) other;
            return this.selectedTabIndex == tabRowTemplate.selectedTabIndex && Intrinsics.e(this.modifier, tabRowTemplate.modifier) && Intrinsics.e(this.backgroundColor, tabRowTemplate.backgroundColor) && Intrinsics.e(this.contentColor, tabRowTemplate.contentColor) && Intrinsics.e(this.indicator, tabRowTemplate.indicator) && Intrinsics.e(this.divider, tabRowTemplate.divider);
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.selectedTabIndex) * 31) + this.modifier.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.contentColor.hashCode()) * 31) + this.indicator.hashCode()) * 31) + this.divider.hashCode();
        }

        public String toString() {
            return "TabRowTemplate(selectedTabIndex=" + this.selectedTabIndex + ", modifier=" + this.modifier + ", backgroundColor=" + this.backgroundColor + ", contentColor=" + this.contentColor + ", indicator=" + this.indicator + ", divider=" + this.divider + ')';
        }

        public final Function2<Composer, Integer, C5346q0> x() {
            return this.backgroundColor;
        }

        public final Function2<Composer, Integer, C5346q0> y() {
            return this.contentColor;
        }

        public final Function2<Composer, Integer, Unit> z() {
            return this.divider;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TabRowTemplate(int i10, Modifier modifier, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
            Function2 function24 = (i11 & 4) != 0 ? a.f140158a : function2;
            this(i10, modifier2, function24, (i11 & 8) != 0 ? new b(function24) : function22, (i11 & 16) != 0 ? ComposableLambdaKt.composableLambdaInstance(-479816646, true, new c(i10)) : function3, (i11 & 32) != 0 ? C14911N.f139692a.a() : function23);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006*"}, d2 = {"Lji/q1$q;", "Lji/q1;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Lh0/l;", "interactionSource", "LV0/q0;", "selectedContentColor", "unselectedContentColor", "selectedTextColor", "unselectedTextColor", "<init>", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Lkotlin/jvm/functions/Function2;", "x", "()Lkotlin/jvm/functions/Function2;", "c", "getSelectedContentColor", "d", "getUnselectedContentColor", "e", "J", "y", "()J", "f", "z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$q, reason: from toString */
    public static final /* data */ class TabTemplate implements q1 {

        /* renamed from: g, reason: collision with root package name */
        public static final int f140161g = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function2<Composer, Integer, h0.l> interactionSource;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function2<Composer, Integer, C5346q0> selectedContentColor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function2<Composer, Integer, C5346q0> unselectedContentColor;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final long selectedTextColor;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final long unselectedTextColor;

        public /* synthetic */ TabTemplate(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(modifier, function2, function22, function23, j10, j11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabTemplate)) {
                return false;
            }
            TabTemplate tabTemplate = (TabTemplate) other;
            return Intrinsics.e(this.modifier, tabTemplate.modifier) && Intrinsics.e(this.interactionSource, tabTemplate.interactionSource) && Intrinsics.e(this.selectedContentColor, tabTemplate.selectedContentColor) && Intrinsics.e(this.unselectedContentColor, tabTemplate.unselectedContentColor) && C5346q0.s(this.selectedTextColor, tabTemplate.selectedTextColor) && C5346q0.s(this.unselectedTextColor, tabTemplate.unselectedTextColor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private TabTemplate(Modifier modifier, Function2<? super Composer, ? super Integer, ? extends h0.l> interactionSource, Function2<? super Composer, ? super Integer, C5346q0> selectedContentColor, Function2<? super Composer, ? super Integer, C5346q0> unselectedContentColor, long j10, long j11) {
            Intrinsics.j(modifier, "modifier");
            Intrinsics.j(interactionSource, "interactionSource");
            Intrinsics.j(selectedContentColor, "selectedContentColor");
            Intrinsics.j(unselectedContentColor, "unselectedContentColor");
            this.modifier = modifier;
            this.interactionSource = interactionSource;
            this.selectedContentColor = selectedContentColor;
            this.unselectedContentColor = unselectedContentColor;
            this.selectedTextColor = j10;
            this.unselectedTextColor = j11;
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            return (((((((((this.modifier.hashCode() * 31) + this.interactionSource.hashCode()) * 31) + this.selectedContentColor.hashCode()) * 31) + this.unselectedContentColor.hashCode()) * 31) + C5346q0.y(this.selectedTextColor)) * 31) + C5346q0.y(this.unselectedTextColor);
        }

        public String toString() {
            return "TabTemplate(modifier=" + this.modifier + ", interactionSource=" + this.interactionSource + ", selectedContentColor=" + this.selectedContentColor + ", unselectedContentColor=" + this.unselectedContentColor + ", selectedTextColor=" + ((Object) C5346q0.z(this.selectedTextColor)) + ", unselectedTextColor=" + ((Object) C5346q0.z(this.unselectedTextColor)) + ')';
        }

        public final Function2<Composer, Integer, h0.l> x() {
            return this.interactionSource;
        }

        /* renamed from: y, reason: from getter */
        public final long getSelectedTextColor() {
            return this.selectedTextColor;
        }

        /* renamed from: z, reason: from getter */
        public final long getUnselectedTextColor() {
            return this.unselectedTextColor;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, d2 = {"Lji/q1$r;", "", "LJi/T;", "backgroundColor", "Lji/q1$j;", "label", "Lji/q1$h;", BarcodePickDeserializer.FIELD_ICON, "Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(LJi/T;Lji/q1$j;Lji/q1$h;Landroidx/compose/ui/Modifier;)V", "x", "(LJi/T;Lji/q1$j;Lji/q1$h;Landroidx/compose/ui/Modifier;)Lji/q1$r;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/T;", "z", "()LJi/T;", "b", "Lji/q1$j;", "B", "()Lji/q1$j;", "c", "Lji/q1$h;", "A", "()Lji/q1$h;", "d", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ji.q1$r, reason: from toString */
    public static final /* data */ class Tag implements q1 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f140168e = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Ji.T backgroundColor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final h icon;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Modifier modifier;

        public Tag(Ji.T backgroundColor, Label label, h icon, Modifier modifier) {
            Intrinsics.j(backgroundColor, "backgroundColor");
            Intrinsics.j(label, "label");
            Intrinsics.j(icon, "icon");
            Intrinsics.j(modifier, "modifier");
            this.backgroundColor = backgroundColor;
            this.label = label;
            this.icon = icon;
            this.modifier = modifier;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) other;
            return Intrinsics.e(this.backgroundColor, tag.backgroundColor) && Intrinsics.e(this.label, tag.label) && Intrinsics.e(this.icon, tag.icon) && Intrinsics.e(this.modifier, tag.modifier);
        }

        public static /* synthetic */ Tag y(Tag tag, Ji.T t10, Label label, h hVar, Modifier modifier, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                t10 = tag.backgroundColor;
            }
            if ((i10 & 2) != 0) {
                label = tag.label;
            }
            if ((i10 & 4) != 0) {
                hVar = tag.icon;
            }
            if ((i10 & 8) != 0) {
                modifier = tag.modifier;
            }
            return tag.x(t10, label, hVar, modifier);
        }

        /* renamed from: A, reason: from getter */
        public final h getIcon() {
            return this.icon;
        }

        /* renamed from: B, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        @Override // ji.q1
        /* renamed from: a, reason: from getter */
        public Modifier getModifier() {
            return this.modifier;
        }

        public int hashCode() {
            return (((((this.backgroundColor.hashCode() * 31) + this.label.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.modifier.hashCode();
        }

        public String toString() {
            return "Tag(backgroundColor=" + this.backgroundColor + ", label=" + this.label + ", icon=" + this.icon + ", modifier=" + this.modifier + ')';
        }

        public final Tag x(Ji.T backgroundColor, Label label, h icon, Modifier modifier) {
            Intrinsics.j(backgroundColor, "backgroundColor");
            Intrinsics.j(label, "label");
            Intrinsics.j(icon, "icon");
            Intrinsics.j(modifier, "modifier");
            return new Tag(backgroundColor, label, icon, modifier);
        }

        /* renamed from: z, reason: from getter */
        public final Ji.T getBackgroundColor() {
            return this.backgroundColor;
        }

        public /* synthetic */ Tag(Ji.T t10, Label label, h hVar, Modifier modifier, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(t10, label, hVar, (i10 & 8) != 0 ? Modifier.INSTANCE : modifier);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lji/q1$s;", "", "a", "b", "c", "Lji/q1$s$a;", "Lji/q1$s$b;", "Lji/q1$s$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface s extends q1 {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lji/q1$s$a;", "Lji/q1$s;", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lh0/l;", "interactionSource", "Lji/c;", "colors", "<init>", "(Landroidx/compose/ui/Modifier;ZLh0/l;Lji/c;)V", "x", "(Landroidx/compose/ui/Modifier;ZLh0/l;Lji/c;)Lji/q1$s$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Z", "getEnabled", "()Z", "c", "Lh0/l;", "e", "()Lh0/l;", "d", "Lji/c;", "z", "()Lji/c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$s$a, reason: from toString */
        public static final /* data */ class Checkbox implements s {

            /* renamed from: e, reason: collision with root package name */
            public static final int f140173e = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enabled;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final C14927c colors;

            public Checkbox(Modifier modifier, boolean z10, h0.l lVar, C14927c colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(colors, "colors");
                this.modifier = modifier;
                this.enabled = z10;
                this.interactionSource = lVar;
                this.colors = colors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checkbox)) {
                    return false;
                }
                Checkbox checkbox = (Checkbox) other;
                return Intrinsics.e(this.modifier, checkbox.modifier) && this.enabled == checkbox.enabled && Intrinsics.e(this.interactionSource, checkbox.interactionSource) && Intrinsics.e(this.colors, checkbox.colors);
            }

            public static /* synthetic */ Checkbox y(Checkbox checkbox, Modifier modifier, boolean z10, h0.l lVar, C14927c c14927c, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    modifier = checkbox.modifier;
                }
                if ((i10 & 2) != 0) {
                    z10 = checkbox.enabled;
                }
                if ((i10 & 4) != 0) {
                    lVar = checkbox.interactionSource;
                }
                if ((i10 & 8) != 0) {
                    c14927c = checkbox.colors;
                }
                return checkbox.x(modifier, z10, lVar, c14927c);
            }

            @Override // ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            public int hashCode() {
                int iHashCode = ((this.modifier.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
                h0.l lVar = this.interactionSource;
                return ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.colors.hashCode();
            }

            public String toString() {
                return "Checkbox(modifier=" + this.modifier + ", enabled=" + this.enabled + ", interactionSource=" + this.interactionSource + ", colors=" + this.colors + ')';
            }

            public final Checkbox x(Modifier modifier, boolean enabled, h0.l interactionSource, C14927c colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(colors, "colors");
                return new Checkbox(modifier, enabled, interactionSource, colors);
            }

            /* renamed from: z, reason: from getter */
            public C14927c getColors() {
                return this.colors;
            }

            public /* synthetic */ Checkbox(Modifier modifier, boolean z10, h0.l lVar, C14927c c14927c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : lVar, c14927c);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lji/q1$s$b;", "Lji/q1$s;", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lh0/l;", "interactionSource", "Lji/d;", "colors", "<init>", "(Landroidx/compose/ui/Modifier;ZLh0/l;Lji/d;)V", "x", "(Landroidx/compose/ui/Modifier;ZLh0/l;Lji/d;)Lji/q1$s$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "b", "Z", "h", "()Z", "c", "Lh0/l;", "e", "()Lh0/l;", "d", "Lji/d;", "z", "()Lji/d;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$s$b, reason: from toString */
        public static final /* data */ class RadioButton implements s {

            /* renamed from: e, reason: collision with root package name */
            public static final int f140178e = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enabled;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsRadioButtonColors colors;

            public RadioButton(Modifier modifier, boolean z10, h0.l lVar, AdsRadioButtonColors colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(colors, "colors");
                this.modifier = modifier;
                this.enabled = z10;
                this.interactionSource = lVar;
                this.colors = colors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RadioButton)) {
                    return false;
                }
                RadioButton radioButton = (RadioButton) other;
                return Intrinsics.e(this.modifier, radioButton.modifier) && this.enabled == radioButton.enabled && Intrinsics.e(this.interactionSource, radioButton.interactionSource) && Intrinsics.e(this.colors, radioButton.colors);
            }

            public static /* synthetic */ RadioButton y(RadioButton radioButton, Modifier modifier, boolean z10, h0.l lVar, AdsRadioButtonColors c14929d, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    modifier = radioButton.modifier;
                }
                if ((i10 & 2) != 0) {
                    z10 = radioButton.enabled;
                }
                if ((i10 & 4) != 0) {
                    lVar = radioButton.interactionSource;
                }
                if ((i10 & 8) != 0) {
                    c14929d = radioButton.colors;
                }
                return radioButton.x(modifier, z10, lVar, c14929d);
            }

            /* renamed from: e, reason: from getter */
            public h0.l getInteractionSource() {
                return this.interactionSource;
            }

            /* renamed from: h, reason: from getter */
            public boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                int iHashCode = ((this.modifier.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
                h0.l lVar = this.interactionSource;
                return ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.colors.hashCode();
            }

            public String toString() {
                return "RadioButton(modifier=" + this.modifier + ", enabled=" + this.enabled + ", interactionSource=" + this.interactionSource + ", colors=" + this.colors + ')';
            }

            public final RadioButton x(Modifier modifier, boolean enabled, h0.l interactionSource, AdsRadioButtonColors colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(colors, "colors");
                return new RadioButton(modifier, enabled, interactionSource, colors);
            }

            /* renamed from: z, reason: from getter */
            public AdsRadioButtonColors getColors() {
                return this.colors;
            }

            public /* synthetic */ RadioButton(Modifier modifier, boolean z10, h0.l lVar, AdsRadioButtonColors c14929d, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : lVar, c14929d);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lji/q1$s$c;", "Lji/q1$s;", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lh0/l;", "interactionSource", "Lji/e;", "colors", "<init>", "(Landroidx/compose/ui/Modifier;ZLh0/l;Lji/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "()Landroidx/compose/ui/Modifier;", "b", "Z", "getEnabled", "()Z", "c", "Lh0/l;", "getInteractionSource", "()Lh0/l;", "d", "Lji/e;", "x", "()Lji/e;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ji.q1$s$c, reason: from toString */
        public static final /* data */ class Switch implements s {

            /* renamed from: e, reason: collision with root package name */
            public static final int f140183e = 0;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Modifier modifier;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enabled;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final h0.l interactionSource;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AdsSwitchColors colors;

            public Switch(Modifier modifier, boolean z10, h0.l lVar, AdsSwitchColors colors) {
                Intrinsics.j(modifier, "modifier");
                Intrinsics.j(colors, "colors");
                this.modifier = modifier;
                this.enabled = z10;
                this.interactionSource = lVar;
                this.colors = colors;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Switch)) {
                    return false;
                }
                Switch r52 = (Switch) other;
                return Intrinsics.e(this.modifier, r52.modifier) && this.enabled == r52.enabled && Intrinsics.e(this.interactionSource, r52.interactionSource) && Intrinsics.e(this.colors, r52.colors);
            }

            @Override // ji.q1
            /* renamed from: a, reason: from getter */
            public Modifier getModifier() {
                return this.modifier;
            }

            public int hashCode() {
                int iHashCode = ((this.modifier.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
                h0.l lVar = this.interactionSource;
                return ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.colors.hashCode();
            }

            public String toString() {
                return "Switch(modifier=" + this.modifier + ", enabled=" + this.enabled + ", interactionSource=" + this.interactionSource + ", colors=" + this.colors + ')';
            }

            /* renamed from: x, reason: from getter */
            public AdsSwitchColors getColors() {
                return this.colors;
            }

            public /* synthetic */ Switch(Modifier modifier, boolean z10, h0.l lVar, AdsSwitchColors c14931e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? Modifier.INSTANCE : modifier, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : lVar, c14931e);
            }
        }
    }

    /* renamed from: a */
    Modifier getModifier();
}
