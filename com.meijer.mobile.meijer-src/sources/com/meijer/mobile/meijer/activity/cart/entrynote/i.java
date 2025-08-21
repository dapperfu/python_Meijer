package com.meijer.mobile.meijer.activity.cart.entrynote;

import Ao.W;
import androidx.view.InterfaceC6157f;
import androidx.view.c0;
import androidx.view.d0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import fj.Entry;
import fj.EntryChange;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import il.m;
import kl.t;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u000505*,(B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020/088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002040<8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lil/m;", "cartRepository", "Lkl/t;", "checkoutRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lil/m;Lkl/t;Lhi/a;)V", "", "isLoading", "", "y", "(Z)V", "", "entryNumber", "", "note", "C", "(ILjava/lang/String;)V", "B", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfj/j;", "cartInfo", "v", "(Lfj/j;)V", "t", "()V", "initialEntry", "noteType", "D", "(Ljava/lang/String;Ljava/lang/String;)V", "E", "(Ljava/lang/String;)V", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b;", "action", "A", "(Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b;)V", "a", "Lil/m;", "b", "Lkl/t;", "c", "Lhi/a;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;", "d", "Lpv/B;", "_viewState", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c;", "e", "Lpv/A;", "_events", "Lpv/P;", "x", "()Lpv/P;", "viewState", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class i extends c0 implements InterfaceC6157f {

    /* renamed from: g, reason: collision with root package name */
    public static final int f102648g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m cartRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t checkoutRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<EntryNoteViewState> _viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<c> _events;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b;", "", "<init>", "()V", "c", "b", "a", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b$a;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b$b;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b$a;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b;", "<init>", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f102654a = new a();

            private a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b$b;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b;", "", "note", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.entrynote.i$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class SetDeliveryNote extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String note;

            public SetDeliveryNote(String str) {
                super(null);
                this.note = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetDeliveryNote) && Intrinsics.e(this.note, ((SetDeliveryNote) other).note);
            }

            public int hashCode() {
                String str = this.note;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetDeliveryNote(note=" + this.note + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getNote() {
                return this.note;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b$c;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$b;", "", "entryNumberToAddNote", "", "note", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.entrynote.i$b$c, reason: from toString */
        public static final /* data */ class SetEntryNote extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int entryNumberToAddNote;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String note;

            public SetEntryNote(int i10, String str) {
                super(null);
                this.entryNumberToAddNote = i10;
                this.note = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetEntryNote)) {
                    return false;
                }
                SetEntryNote setEntryNote = (SetEntryNote) other;
                return this.entryNumberToAddNote == setEntryNote.entryNumberToAddNote && Intrinsics.e(this.note, setEntryNote.note);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.entryNumberToAddNote) * 31;
                String str = this.note;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SetEntryNote(entryNumberToAddNote=" + this.entryNumberToAddNote + ", note=" + this.note + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getEntryNumberToAddNote() {
                return this.entryNumberToAddNote;
            }

            /* renamed from: b, reason: from getter */
            public final String getNote() {
                return this.note;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c;", "", "<init>", "()V", "c", "b", "a", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c$a;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c$b;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c$a;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f102658a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -324814269;
            }

            public String toString() {
                return "DeliveryNoteSuccess";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c$b;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f102659a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1308130937;
            }

            public String toString() {
                return "EntryNoteSuccess";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c$c;", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$c;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.entrynote.i$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class FailEvent extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public FailEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FailEvent) && this.messageResId == ((FailEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "FailEvent(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0014\u0010!\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006&"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;", "", "", "initialEntryNote", "entryNote", "deliveryNote", "noteType", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$e;", "loadingState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$e;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$e;)Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "c", "getDeliveryNote", "getNoteType", "e", "Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$e;", "()Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$e;", "f", "I", "maxCount", "g", "Z", "()Z", "isEntryNoteValid", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.entrynote.i$d, reason: from toString */
    public static final /* data */ class EntryNoteViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String initialEntryNote;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String entryNote;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deliveryNote;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String noteType;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final LoadingState loadingState;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int maxCount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean isEntryNoteValid;

        public EntryNoteViewState() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ EntryNoteViewState b(EntryNoteViewState entryNoteViewState, String str, String str2, String str3, String str4, LoadingState loadingState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = entryNoteViewState.initialEntryNote;
            }
            if ((i10 & 2) != 0) {
                str2 = entryNoteViewState.entryNote;
            }
            if ((i10 & 4) != 0) {
                str3 = entryNoteViewState.deliveryNote;
            }
            if ((i10 & 8) != 0) {
                str4 = entryNoteViewState.noteType;
            }
            if ((i10 & 16) != 0) {
                loadingState = entryNoteViewState.loadingState;
            }
            LoadingState loadingState2 = loadingState;
            String str5 = str3;
            return entryNoteViewState.a(str, str2, str5, str4, loadingState2);
        }

        public final EntryNoteViewState a(String initialEntryNote, String entryNote, String deliveryNote, String noteType, LoadingState loadingState) {
            Intrinsics.j(initialEntryNote, "initialEntryNote");
            Intrinsics.j(entryNote, "entryNote");
            Intrinsics.j(deliveryNote, "deliveryNote");
            Intrinsics.j(noteType, "noteType");
            Intrinsics.j(loadingState, "loadingState");
            return new EntryNoteViewState(initialEntryNote, entryNote, deliveryNote, noteType, loadingState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EntryNoteViewState)) {
                return false;
            }
            EntryNoteViewState entryNoteViewState = (EntryNoteViewState) other;
            return Intrinsics.e(this.initialEntryNote, entryNoteViewState.initialEntryNote) && Intrinsics.e(this.entryNote, entryNoteViewState.entryNote) && Intrinsics.e(this.deliveryNote, entryNoteViewState.deliveryNote) && Intrinsics.e(this.noteType, entryNoteViewState.noteType) && Intrinsics.e(this.loadingState, entryNoteViewState.loadingState);
        }

        public int hashCode() {
            return (((((((this.initialEntryNote.hashCode() * 31) + this.entryNote.hashCode()) * 31) + this.deliveryNote.hashCode()) * 31) + this.noteType.hashCode()) * 31) + this.loadingState.hashCode();
        }

        public String toString() {
            return "EntryNoteViewState(initialEntryNote=" + this.initialEntryNote + ", entryNote=" + this.entryNote + ", deliveryNote=" + this.deliveryNote + ", noteType=" + this.noteType + ", loadingState=" + this.loadingState + ')';
        }

        public EntryNoteViewState(String initialEntryNote, String entryNote, String deliveryNote, String noteType, LoadingState loadingState) {
            Intrinsics.j(initialEntryNote, "initialEntryNote");
            Intrinsics.j(entryNote, "entryNote");
            Intrinsics.j(deliveryNote, "deliveryNote");
            Intrinsics.j(noteType, "noteType");
            Intrinsics.j(loadingState, "loadingState");
            this.initialEntryNote = initialEntryNote;
            this.entryNote = entryNote;
            this.deliveryNote = deliveryNote;
            this.noteType = noteType;
            this.loadingState = loadingState;
            int i10 = noteType.contentEquals("com.meijer.intent.extra.EXTRA_ENTRY_NOTE_TYPE") ? 99 : 1052;
            this.maxCount = i10;
            this.isEntryNoteValid = !initialEntryNote.contentEquals(entryNote) && entryNote.length() <= i10;
        }

        /* renamed from: c, reason: from getter */
        public final String getEntryNote() {
            return this.entryNote;
        }

        /* renamed from: d, reason: from getter */
        public final String getInitialEntryNote() {
            return this.initialEntryNote;
        }

        /* renamed from: e, reason: from getter */
        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsEntryNoteValid() {
            return this.isEntryNoteValid;
        }

        public /* synthetic */ EntryNoteViewState(String str, String str2, String str3, String str4, LoadingState loadingState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? new LoadingState(false, 1, null) : loadingState);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/entrynote/i$e;", "", "", "isLoading", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.entrynote.i$e, reason: from toString */
    public static final /* data */ class LoadingState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        public LoadingState() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingState) && this.isLoading == ((LoadingState) other).isLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "LoadingState(isLoading=" + this.isLoading + ')';
        }

        public LoadingState(boolean z10) {
            this.isLoading = z10;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ LoadingState(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteViewModel$onAction$1", f = "EntryNoteViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102669a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f102671c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b bVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f102671c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new f(this.f102671c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f102669a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                i iVar = i.this;
                String note = ((b.SetDeliveryNote) this.f102671c).getNote();
                this.f102669a = 1;
                if (iVar.B(note, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteViewModel$onAction$2", f = "EntryNoteViewModel.kt", l = {159}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102672a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f102672a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                i iVar = i.this;
                this.f102672a = 1;
                if (iVar.B(null, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteViewModel$setEntryNote$1", f = "EntryNoteViewModel.kt", l = {92, 98, 102}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f102674a;

        /* renamed from: b, reason: collision with root package name */
        Object f102675b;

        /* renamed from: c, reason: collision with root package name */
        Object f102676c;

        /* renamed from: d, reason: collision with root package name */
        Object f102677d;

        /* renamed from: e, reason: collision with root package name */
        int f102678e;

        /* renamed from: f, reason: collision with root package name */
        int f102679f;

        /* renamed from: g, reason: collision with root package name */
        int f102680g;

        /* renamed from: h, reason: collision with root package name */
        int f102681h;

        /* renamed from: i, reason: collision with root package name */
        int f102682i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f102683j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f102685l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f102686m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f102685l = i10;
            this.f102686m = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = i.this.new h(this.f102685l, this.f102686m, continuation);
            hVar.f102683j = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e7 A[PHI: r1 r12
          0x00e7: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v3 java.lang.Object), (r1v5 java.lang.Object) binds: [B:24:0x00a5, B:26:0x00b0, B:40:0x00e6] A[DONT_GENERATE, DONT_INLINE]
          0x00e7: PHI (r12v6 mv.O) = (r12v5 mv.O), (r12v5 mv.O), (r12v8 mv.O) binds: [B:24:0x00a5, B:26:0x00b0, B:40:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
        /* JADX WARN: Type inference failed for: r1v18, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.cart.entrynote.i.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void C(int entryNumber, String note) {
        y(true);
        C15809k.d(d0.a(this), null, null, new h(entryNumber, note, null), 3, null);
    }

    public i(m cartRepository, t checkoutRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.cartRepository = cartRepository;
        this.checkoutRepository = checkoutRepository;
        this.analyticsEngine = analyticsEngine;
        this._viewState = S.a(new EntryNoteViewState(null, null, null, null, null, 31, null));
        this._events = C16555H.b(0, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(String str, Continuation<? super Unit> continuation) {
        EntryNoteViewState value;
        if (str != null && str.length() != 0) {
            t();
        }
        this.checkoutRepository.t(str);
        InterfaceC16549B<EntryNoteViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, EntryNoteViewState.b(value, str != null ? str : "", str == null ? "" : str, str == null ? "" : str, null, null, 24, null)));
        Object objEmit = this._events.emit(c.a.f102658a, continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
    }

    private final void t() {
        this.analyticsEngine.b(C14756c.h("Meijer: Add Delivery Note"), new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.entrynote.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.u((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.o("checkout add delivery note");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(EntryChange cartInfo) {
        Entry entry;
        if (cartInfo == null || (entry = cartInfo.getEntry()) == null) {
            return;
        }
        final W.Details details = new W.Details(entry.m().getCode(), null, null, Double.valueOf(entry.getActualQuantity()), Double.valueOf(entry.m().getPrice().getValue()), null, entry.m().getDepartment(), null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -346, 16383, null);
        this.analyticsEngine.b(C14756c.h("Meijer:CartPage"), new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.entrynote.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.w(details, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(W.Details details, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.e(W.i(details));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(boolean isLoading) {
        EntryNoteViewState value;
        InterfaceC16549B<EntryNoteViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, EntryNoteViewState.b(value, null, null, null, null, new LoadingState(isLoading), 15, null)));
    }

    public final void A(b action) {
        Intrinsics.j(action, "action");
        if (action instanceof b.SetEntryNote) {
            b.SetEntryNote setEntryNote = (b.SetEntryNote) action;
            C(setEntryNote.getEntryNumberToAddNote(), setEntryNote.getNote());
            Unit unit = Unit.f143329a;
        } else if (action instanceof b.SetDeliveryNote) {
            C15809k.d(d0.a(this), null, null, new f(action, null), 3, null);
        } else {
            if (!(action instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(d0.a(this), null, null, new g(null), 3, null);
        }
    }

    public final void D(String initialEntry, String noteType) {
        Intrinsics.j(initialEntry, "initialEntry");
        Intrinsics.j(noteType, "noteType");
        InterfaceC16549B<EntryNoteViewState> interfaceC16549B = this._viewState;
        while (true) {
            EntryNoteViewState value = interfaceC16549B.getValue();
            String str = initialEntry;
            String str2 = noteType;
            if (interfaceC16549B.e(value, EntryNoteViewState.b(value, str, initialEntry, null, str2, null, 20, null))) {
                return;
            }
            initialEntry = str;
            noteType = str2;
        }
    }

    public final void E(String note) {
        Intrinsics.j(note, "note");
        InterfaceC16549B<EntryNoteViewState> interfaceC16549B = this._viewState;
        while (true) {
            EntryNoteViewState value = interfaceC16549B.getValue();
            String str = note;
            if (interfaceC16549B.e(value, EntryNoteViewState.b(value, null, str, null, null, null, 29, null))) {
                return;
            } else {
                note = str;
            }
        }
    }

    public final InterfaceC16553F<c> getEvents() {
        return C16563h.b(this._events);
    }

    public final P<EntryNoteViewState> x() {
        return C16563h.c(this._viewState);
    }
}
