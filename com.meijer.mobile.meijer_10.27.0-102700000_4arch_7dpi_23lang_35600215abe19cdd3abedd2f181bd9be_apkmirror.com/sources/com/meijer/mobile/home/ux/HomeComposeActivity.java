package com.meijer.mobile.home.ux;

import Hl.FulfillmentBarDecorator;
import Ji.LocalThemeScope;
import Jk.AppVersion;
import P0.e;
import Pk.a;
import Tl.ToastMessageData;
import V2.CreationExtras;
import Wl.a;
import ak.AbstractC5607a;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import ck.C6408b;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.home.ux.HomeComposeActivity;
import com.meijer.mobile.home.ux.k0;
import com.meijer.mobile.meijer.activity.home.HomeFragment;
import cs.AbstractC13422a;
import ds.AbstractC13565b;
import e.C13588d;
import e.C13589e;
import em.AbstractC13687a;
import em.AbstractC13688b;
import em.AbstractC13689c;
import em.AbstractC13696j;
import em.AbstractC13697k;
import es.AbstractC13761f;
import fi.C13902c;
import fs.AbstractC13947a;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import gm.AbstractC14275b;
import hi.AbstractC14481h;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.TrackingData;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ji.C14924a0;
import ji.R0;
import ji.q1;
import jm.C15011a0;
import jm.C15021f0;
import jm.L0;
import km.C15177b;
import km.C15179d;
import km.C15182g;
import km.C15184i;
import km.C15186k;
import km.C15189n;
import km.C15194s;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.C17929d0;
import kotlin.C17932e0;
import kotlin.C17963o1;
import kotlin.EnumC17895N0;
import kotlin.EnumC17935f0;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import li.C15417h;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16193g;
import ps.AbstractC16373C;
import ps.C16372B;
import ps.C16381K;
import ps.C16382L;
import ps.C16395g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import si.C16977b;
import sr.AbstractC17021a;
import tp.Builder;
import tp.C17129c;
import tp.EnumC17127a;
import tr.C17135b;
import tv.C17154h;
import um.C17279b;
import uo.OrderOutOfStockItem;
import vj.C17589b;
import vo.OrderSubstitutionItem;
import wm.C17838h;
import xr.InterfaceC18086a;
import yl.AbstractC18227f;
import yl.C18223b;
import yo.C18264a;
import yo.MeijerUser;
import yr.C18299z;
import zs.C18570a;

@Metadata(d1 = {"\u0000\u009e\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u0098\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0099\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0012\u001a\u00020\b2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\n\u0010\u000f\u001a\u00060\u000bj\u0002`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\"J1\u0010'\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u0010\u0015\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0015\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J[\u0010C\u001a\u00020\b2\u0006\u00108\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010>\u001a\u00020\u00102\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0;H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\bH\u0002¢\u0006\u0004\bP\u0010\u0005J\u0019\u0010S\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\bH\u0002¢\u0006\u0004\bU\u0010\u0005J\u000f\u0010V\u001a\u00020\bH\u0002¢\u0006\u0004\bV\u0010\u0005J)\u0010[\u001a\u00020\b2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u00102\b\b\u0002\u0010Z\u001a\u00020\u0010H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b]\u0010\nJ\u0013\u0010^\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\bH\u0002¢\u0006\u0004\b`\u0010\u0005J\u000f\u0010a\u001a\u00020\bH\u0002¢\u0006\u0004\ba\u0010\u0005J\u000f\u0010b\u001a\u00020\bH\u0002¢\u0006\u0004\bb\u0010\u0005J\u0017\u0010d\u001a\u00020\b2\u0006\u0010c\u001a\u00020\u0010H\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\bH\u0003¢\u0006\u0004\bf\u0010\u0005J\u0019\u0010i\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010gH\u0014¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\bH\u0014¢\u0006\u0004\bk\u0010\u0005J\u000f\u0010l\u001a\u00020\bH\u0014¢\u0006\u0004\bl\u0010\u0005J\u000f\u0010m\u001a\u00020\bH\u0014¢\u0006\u0004\bm\u0010\u0005J\u001f\u0010r\u001a\u00020\b2\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\bH\u0016¢\u0006\u0004\bt\u0010\u0005J\u000f\u0010u\u001a\u00020\bH\u0016¢\u0006\u0004\bu\u0010\u0005J\u000f\u0010v\u001a\u00020\bH\u0016¢\u0006\u0004\bv\u0010\u0005J\u000f\u0010w\u001a\u00020\bH\u0016¢\u0006\u0004\bw\u0010\u0005J\u000f\u0010x\u001a\u00020\bH\u0016¢\u0006\u0004\bx\u0010\u0005R#\u0010\u0080\u0001\u001a\u00020y8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010°\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R*\u0010¸\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010À\u0001\u001a\u00030¹\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R*\u0010È\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R*\u0010Ð\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R*\u0010Ø\u0001\u001a\u00030Ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R*\u0010à\u0001\u001a\u00030Ù\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R*\u0010è\u0001\u001a\u00030á\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R!\u0010î\u0001\u001a\u00030é\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001R\u001c\u0010ò\u0001\u001a\u0005\u0018\u00010ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u001e\u0010ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u001f\u0010ù\u0001\u001a\n\u0012\u0005\u0012\u00030÷\u00010ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010õ\u0001R!\u0010û\u0001\u001a\n\u0012\u0005\u0012\u00030÷\u00010ó\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bú\u0001\u0010õ\u0001R\u001f\u0010ý\u0001\u001a\n\u0012\u0005\u0012\u00030÷\u00010ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010õ\u0001R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u0019\u0010\u0082\u0002\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R!\u0010\u0087\u0002\u001a\u00030\u0083\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010ë\u0001\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R!\u0010\u008c\u0002\u001a\u00030\u0088\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0002\u0010ë\u0001\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R!\u0010\u0091\u0002\u001a\u00030\u008d\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0002\u0010ë\u0001\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0019\u0010\u0093\u0002\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0081\u0002R\u0018\u0010\u0097\u0002\u001a\u00030\u0094\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002¨\u0006¨\u0002²\u0006\u000e\u0010\u009b\u0002\u001a\u00030\u009a\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u009d\u0002\u001a\u00030\u009c\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u009f\u0002\u001a\u00030\u009e\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010¡\u0002\u001a\u00030 \u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010£\u0002\u001a\u00030¢\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010¥\u0002\u001a\u00030¤\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010§\u0002\u001a\u00030¦\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/home/ux/HomeComposeActivity;", "Landroidx/fragment/app/FragmentActivity;", "Ltp/c$a;", "LLr/d;", "<init>", "()V", "Lg/a;", "result", "", "p2", "(Lg/a;)V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "", "shouldNavigate", "R2", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcs/a;", "action", "G2", "(Lcs/a;)V", "uri", "carouselTitle", "Lhi/h;", "previousTrackAction", "isFromSeeMoreItems", "I2", "(Ljava/lang/String;Ljava/lang/String;Lhi/h;Z)V", "Lmk/f;", "productId", "v2", "(Lmk/f;Ljava/lang/String;)V", "deeplink", "analytics", "name", "isFromViewAll", "s2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lem/j;", "B2", "(Lem/j;)V", "url", "K2", "(Ljava/lang/String;)V", "campaignIdValue", "r2", "(Ljava/lang/String;Ljava/lang/String;)V", "Lsr/a;", "A2", "(Lsr/a;)V", "Les/f;", "F2", "(Les/f;)V", "orderNumber", "Lvo/b;", "substitutionScreenType", "", "Lvo/a;", "listSubstitutedItems", "isOnMyWayClicked", "orderType", "pickupPersonName", "Luo/a;", "listOutOfStockItems", "t2", "(Ljava/lang/String;Lvo/b;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Lem/b;", "z2", "(Lem/b;)V", "LWl/a;", "request", "D2", "(LWl/a;)V", "Lxr/a;", "chip", "x2", "(Lxr/a;)V", "L2", "Lhi/f;", "trackingData", "Q2", "(Lhi/f;)V", "n2", "H2", "", "points", "fromCloseButton", "isClaimPointsNowButton", "O2", "(IZZ)V", "q2", "V1", "(Ljava/lang/String;)Ljava/lang/String;", "N2", "openMeijerPlayStorePage", "checkForAppUpdate", "enabled", "updateNotificationPreference", "(Z)V", "requestNotificationPermission", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "onPause", "Ltp/b;", "builder", "Ltp/a;", "flowType", "onUpdateRateAndTip", "(Ltp/b;Ltp/a;)V", "onRateAppNow", "onRateAppRemindLater", "onRateAppNoThanksCurrentVersion", "onRateAppNoThanks", "onRateAppSendEmail", "LAl/g;", "v", "LAl/g;", "c2", "()LAl/g;", "setFeatureEntryPoint$ux_playstoreRelease", "(LAl/g;)V", "featureEntryPoint", "LCl/e;", "w", "LCl/e;", "g2", "()LCl/e;", "setMeijerIntent$ux_playstoreRelease", "(LCl/e;)V", "meijerIntent", "Lgi/a;", "x", "Lgi/a;", "a2", "()Lgi/a;", "setAnalyticsEngine$ux_playstoreRelease", "(Lgi/a;)V", "analyticsEngine", "Lyl/k;", "y", "Lyl/k;", "d2", "()Lyl/k;", "setFeatureManager$ux_playstoreRelease", "(Lyl/k;)V", "featureManager", "LTq/j;", "z", "LTq/j;", "l2", "()LTq/j;", "setStoreProvider$ux_playstoreRelease", "(LTq/j;)V", "storeProvider", "Lyo/k;", "A", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lwm/h;", "B", "Lwm/h;", "getNotificationManager", "()Lwm/h;", "setNotificationManager", "(Lwm/h;)V", "notificationManager", "LJk/a;", "C", "LJk/a;", "b2", "()LJk/a;", "setAppVersion", "(LJk/a;)V", "appVersion", "Lum/b;", "D", "Lum/b;", "getAppBackgroundManager", "()Lum/b;", "setAppBackgroundManager", "(Lum/b;)V", "appBackgroundManager", "Lyo/a;", "E", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "appPrefManager", "Lyl/b;", "F", "Lyl/b;", "getAppUpdateConfigManager", "()Lyl/b;", "setAppUpdateConfigManager", "(Lyl/b;)V", "appUpdateConfigManager", "Ltp/c;", "G", "Ltp/c;", "k2", "()Ltp/c;", "setRateAndTipUpdater", "(Ltp/c;)V", "rateAndTipUpdater", "LFh/b;", "H", "LFh/b;", "f2", "()LFh/b;", "setInboxManager$ux_playstoreRelease", "(LFh/b;)V", "inboxManager", "LBh/d;", "I", "LBh/d;", "j2", "()LBh/d;", "setPreferencesRepository$ux_playstoreRelease", "(LBh/d;)V", "preferencesRepository", "Lps/g;", "J", "Lkotlin/Lazy;", "i2", "()Lps/g;", "navigationHelper", "Landroidx/appcompat/app/c;", "K", "Landroidx/appcompat/app/c;", "notificationDialog", "Lg/c;", "L", "Lg/c;", "requestPermissionLauncher", "Landroid/content/Intent;", "M", "mPerksRewardsResultLauncher", "N", "startForResult", "O", "substitutionResultLauncher", "P", "Ljava/lang/String;", "Q", "Z", "leavingHomeScreen", "Lps/L;", "R", "h2", "()Lps/L;", "navigationDrawerViewModel", "LHl/b;", "S", "getFulfillmentBarViewModel", "()LHl/b;", "fulfillmentBarViewModel", "Lcom/meijer/mobile/home/ux/k0;", "T", "e2", "()Lcom/meijer/mobile/home/ux/k0;", "homeViewModel", "U", "isShowingUpdatePrompt", "Lyo/c;", "m2", "()Lyo/c;", "user", "V", "a", "Lps/F;", "drawerHeader", "Lps/t;", "drawerDecorator", "Lcom/meijer/mobile/home/ux/k0$m;", "viewState", "LHl/a;", "fulfillmentBar", "Lcom/meijer/mobile/home/ux/k0$h;", "bottomSheetContentState", "Lcom/meijer/mobile/home/ux/k0$j;", "dialogState", "Lx0/c1;", "scaffoldState", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class HomeComposeActivity extends Hilt_HomeComposeActivity implements C17129c.a, Lr.d {

    /* renamed from: W, reason: collision with root package name */
    public static final int f97830W = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public C17838h notificationManager;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public C17279b appBackgroundManager;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public C18264a appPrefManager;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public C18223b appUpdateConfigManager;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public C17129c rateAndTipUpdater;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public Fh.b inboxManager;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public Bh.d preferencesRepository;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private androidx.appcompat.app.c notificationDialog;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private AbstractC14147c<Intent> startForResult;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private String previousTrackAction;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean leavingHomeScreen;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean isShowingUpdatePrompt;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.home.ux.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeComposeActivity.w2(this.f97973a);
        }
    });

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<String> requestPermissionLauncher = registerForActivityResult(new h.h(), new InterfaceC14146b() { // from class: com.meijer.mobile.home.ux.c
        @Override // g.InterfaceC14146b
        public final void a(Object obj) {
            HomeComposeActivity.M2(this.f97974a, ((Boolean) obj).booleanValue());
        }
    });

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> mPerksRewardsResultLauncher = registerForActivityResult(new h.i(), new b());

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new m());

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new androidx.view.e0(Reflection.b(C16382L.class), new e(this), new d(this), new f(null, this));

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Hl.b.class), new h(this), new g(this), new i(null, this));

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final Lazy homeViewModel = new androidx.view.e0(Reflection.b(k0.class), new k(this), new j(this), new l(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b implements InterfaceC14146b, FunctionAdapter {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, HomeComposeActivity.this, HomeComposeActivity.class, "handleMPerksRewardsActivityResult", "handleMPerksRewardsActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            HomeComposeActivity.this.p2(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$1$1", f = "HomeComposeActivity.kt", l = {357, 361}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97859a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f97860b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<k0.AbstractC11649h> f97861c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f97860b, this.f97861c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(C17893M0 c17893m0, z1<? extends k0.AbstractC11649h> z1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f97860b = c17893m0;
                this.f97861c = z1Var;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r5.l(r4) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
            
                if (r5.i(r4) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r4.f97859a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.ResultKt.b(r5)
                    goto L46
                L1b:
                    kotlin.ResultKt.b(r5)
                    androidx.compose.runtime.z1<com.meijer.mobile.home.ux.k0$h> r5 = r4.f97861c
                    com.meijer.mobile.home.ux.k0$h r5 = com.meijer.mobile.home.ux.HomeComposeActivity.c.f(r5)
                    boolean r1 = r5 instanceof com.meijer.mobile.home.ux.k0.AbstractC11649h.MperksPointsExpiryBottomSheet
                    if (r1 == 0) goto L33
                    x0.M0 r5 = r4.f97860b
                    r4.f97859a = r3
                    java.lang.Object r5 = r5.l(r4)
                    if (r5 != r0) goto L46
                    goto L45
                L33:
                    com.meijer.mobile.home.ux.k0$h$b r1 = com.meijer.mobile.home.ux.k0.AbstractC11649h.b.f98202a
                    boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r1)
                    if (r5 == 0) goto L49
                    x0.M0 r5 = r4.f97860b
                    r4.f97859a = r2
                    java.lang.Object r5 = r5.i(r4)
                    if (r5 != r0) goto L46
                L45:
                    return r0
                L46:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                L49:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.HomeComposeActivity.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$2$1", f = "HomeComposeActivity.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f97862a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f97863b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HomeComposeActivity f97864c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<k0.AbstractC11649h> f97865d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f97863b, this.f97864c, this.f97865d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(C17893M0 c17893m0, HomeComposeActivity homeComposeActivity, z1<? extends k0.AbstractC11649h> z1Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f97863b = c17893m0;
                this.f97864c = homeComposeActivity;
                this.f97865d = z1Var;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f97862a == 0) {
                    ResultKt.b(obj);
                    if (!this.f97863b.k() && !(c.t(this.f97865d) instanceof k0.AbstractC11649h.b)) {
                        this.f97864c.e2().I0(k0.AbstractC11653l.b.f98291a);
                    }
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c, reason: collision with other inner class name */
        static final class C1389c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17893M0 f97866a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeComposeActivity f97867b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<k0.AbstractC11649h> f97868c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<C17927c1> f97869d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<k0.ViewState> f97870e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<FulfillmentBarDecorator> f97871f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ z1<HeaderDecorator> f97872g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ z1<DrawerLayoutDecorator> f97873h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ A0.g f97874i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ z1<k0.AbstractC11651j> f97875j;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$a */
            static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<k0.AbstractC11649h> f97876a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97877b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f97878c;

                /* JADX WARN: Multi-variable type inference failed */
                a(z1<? extends k0.AbstractC11649h> z1Var, LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity) {
                    this.f97876a = z1Var;
                    this.f97877b = localThemeScope;
                    this.f97878c = homeComposeActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(HomeComposeActivity homeComposeActivity, k0.AbstractC11649h abstractC11649h, boolean z10) {
                    HomeComposeActivity.P2(homeComposeActivity, ((k0.AbstractC11649h.MperksPointsExpiryBottomSheet) abstractC11649h).getExpiringPoints(), z10, false, 4, null);
                    return Unit.f142422a;
                }

                public final void c(InterfaceC14814f AcresBottomSheet, Composer composer, int i10) {
                    Composer composer2;
                    Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-482324377, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:380)");
                    }
                    final k0.AbstractC11649h abstractC11649hT = c.t(this.f97876a);
                    LocalThemeScope localThemeScope = this.f97877b;
                    final HomeComposeActivity homeComposeActivity = this.f97878c;
                    composer.startReplaceGroup(342746875);
                    if (abstractC11649hT instanceof k0.AbstractC11649h.MperksPointsExpiryBottomSheet) {
                        Modifier modifierK = androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 1, null);
                        k0.AbstractC11649h.MperksPointsExpiryBottomSheet aVar = (k0.AbstractC11649h.MperksPointsExpiryBottomSheet) abstractC11649hT;
                        int iC = aVar.getExpiringPoints();
                        AbstractC5607a abstractC5607aB = aVar.getExpirationDate();
                        AbstractC5607a abstractC5607aA = aVar.getDaysLeftForPointsToExpire();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.D(homeComposeActivity) | composer.V(abstractC11649hT);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.home.ux.D
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HomeComposeActivity.c.C1389c.a.d(homeComposeActivity, abstractC11649hT);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD2 = composer.D(homeComposeActivity) | composer.V(abstractC11649hT);
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function1() { // from class: com.meijer.mobile.home.ux.E
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1389c.a.e(homeComposeActivity, abstractC11649hT, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        int i11 = LocalThemeScope.f15770g;
                        int i12 = AbstractC5607a.f45514b;
                        composer2 = composer;
                        os.n0.g(localThemeScope, iC, abstractC5607aB, abstractC5607aA, modifierK, null, function0, (Function1) objB2, composer2, i11 | (i12 << 6) | (i12 << 9), 16);
                    } else {
                        composer2 = composer;
                        if (!Intrinsics.e(abstractC11649hT, k0.AbstractC11649h.b.f98202a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    composer2.P();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    c(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(HomeComposeActivity homeComposeActivity, k0.AbstractC11649h abstractC11649h) {
                    homeComposeActivity.H2();
                    homeComposeActivity.O2(((k0.AbstractC11649h.MperksPointsExpiryBottomSheet) abstractC11649h).getExpiringPoints(), false, true);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<C17927c1> f97879a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97880b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f97881c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<k0.ViewState> f97882d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ z1<FulfillmentBarDecorator> f97883e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f97884f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f97885g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ A0.g f97886h;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$a */
                static final class a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97887a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f97888b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<k0.ViewState> f97889c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<FulfillmentBarDecorator> f97890d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$a$a, reason: collision with other inner class name */
                    /* synthetic */ class C1390a extends FunctionReferenceImpl implements Function1<Wl.a, Unit> {
                        C1390a(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/home/models/navigation/HomeNavigationRequest;)V", 0);
                        }

                        public final void a(Wl.a p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).D2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Wl.a aVar) {
                            a(aVar);
                            return Unit.f142422a;
                        }
                    }

                    a(LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity, z1<k0.ViewState> z1Var, z1<FulfillmentBarDecorator> z1Var2) {
                        this.f97887a = localThemeScope;
                        this.f97888b = homeComposeActivity;
                        this.f97889c = z1Var;
                        this.f97890d = z1Var2;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(172799537, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:418)");
                        }
                        LocalThemeScope localThemeScope = this.f97887a;
                        AbstractC5607a abstractC5607aL = c.r(this.f97889c).getGreeting();
                        int i11 = AbstractC5607a.f45514b;
                        String strA = C6408b.a(abstractC5607aL, composer, i11);
                        int iC = c.r(this.f97889c).getCartItemCount();
                        FulfillmentBarDecorator fulfillmentBarDecoratorS = c.s(this.f97890d);
                        AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(ps.j0.f156554d, new Object[0]);
                        AppVersion appVersionB2 = this.f97888b.b2();
                        HomeComposeActivity homeComposeActivity = this.f97888b;
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(homeComposeActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1390a(homeComposeActivity);
                            composer.t(objB);
                        }
                        composer.P();
                        L0.j(localThemeScope, null, strA, iC, fulfillmentBarDecoratorS, abstractC5607aD, appVersionB2, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | (FulfillmentBarDecorator.f12698m << 12) | (i11 << 15), 1);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        a(composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$b, reason: collision with other inner class name */
                static final class C1391b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97891a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f97892b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<k0.ViewState> f97893c;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$b$a */
                    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Wl.a, Unit> {
                        a(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/home/models/navigation/HomeNavigationRequest;)V", 0);
                        }

                        public final void a(Wl.a p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).D2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Wl.a aVar) {
                            a(aVar);
                            return Unit.f142422a;
                        }
                    }

                    C1391b(LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity, z1<k0.ViewState> z1Var) {
                        this.f97891a = localThemeScope;
                        this.f97892b = homeComposeActivity;
                        this.f97893c = z1Var;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1373940880, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:438)");
                        }
                        if (!c.r(this.f97893c).getUser().getIsLoggedIn()) {
                            LocalThemeScope localThemeScope = this.f97891a;
                            HomeComposeActivity homeComposeActivity = this.f97892b;
                            composer.startReplaceGroup(5004770);
                            boolean zD = composer.D(homeComposeActivity);
                            Object objB = composer.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new a(homeComposeActivity);
                                composer.t(objB);
                            }
                            composer.P();
                            C15011a0.b(localThemeScope, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g, 1);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        a(composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$c, reason: collision with other inner class name */
                static final class C1392c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f97894a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97895b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<HeaderDecorator> f97896c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<DrawerLayoutDecorator> f97897d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$c$a */
                    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC16373C, Unit> {
                        a(Object obj) {
                            super(1, obj, C16395g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                        }

                        public final void a(AbstractC16373C p02) {
                            Intrinsics.j(p02, "p0");
                            ((C16395g) this.receiver).h(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC16373C abstractC16373C) {
                            a(abstractC16373C);
                            return Unit.f142422a;
                        }
                    }

                    C1392c(HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2) {
                        this.f97894a = homeComposeActivity;
                        this.f97895b = localThemeScope;
                        this.f97896c = z1Var;
                        this.f97897d = z1Var2;
                    }

                    public final void a(InterfaceC14814f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                        Intrinsics.j(Scaffold, "$this$Scaffold");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1415598811, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:430)");
                        }
                        HeaderDecorator headerDecoratorO = c.o(this.f97896c);
                        DrawerLayoutDecorator drawerLayoutDecoratorP = c.p(this.f97897d);
                        C16395g c16395gI2 = this.f97894a.i2();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(c16395gI2);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new a(c16395gI2);
                            composer.t(objB);
                        }
                        composer.P();
                        AppVersion appVersionB2 = this.f97894a.b2();
                        C16372B.h(this.f97895b, headerDecoratorO, drawerLayoutDecoratorP, appVersionB2, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | (HeaderDecorator.f156340i << 3) | (DrawerLayoutDecorator.f156604h << 6), 8);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                        a(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d */
                static final class d implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ A0.g f97898a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f97899b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97900c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<k0.ViewState> f97901d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d$a */
                    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC17021a, Unit> {
                        a(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onGoogleAdViewActions", "onGoogleAdViewActions(Lcom/meijer/mobile/ui/advertising/GoogleAdViewAction;)V", 0);
                        }

                        public final void a(AbstractC17021a p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).A2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC17021a abstractC17021a) {
                            a(abstractC17021a);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d$b, reason: collision with other inner class name */
                    /* synthetic */ class C1393b extends FunctionReferenceImpl implements Function1<AbstractC13696j, Unit> {
                        C1393b(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onMarketingBannerAction", "onMarketingBannerAction(Lcom/meijer/mobile/home/ux/actions/MarketingBannerAction;)V", 0);
                        }

                        public final void a(AbstractC13696j p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).B2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC13696j abstractC13696j) {
                            a(abstractC13696j);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d$c, reason: collision with other inner class name */
                    /* synthetic */ class C1394c extends FunctionReferenceImpl implements Function1<AbstractC13688b, Unit> {
                        C1394c(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onFeatureEntryPointAction", "onFeatureEntryPointAction(Lcom/meijer/mobile/home/ux/actions/FeatureEntryPointAction;)V", 0);
                        }

                        public final void a(AbstractC13688b p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).z2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC13688b abstractC13688b) {
                            a(abstractC13688b);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d$d, reason: collision with other inner class name */
                    /* synthetic */ class C1395d extends FunctionReferenceImpl implements Function1<AbstractC13422a, Unit> {
                        C1395d(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onProductCarouselAction", "onProductCarouselAction(Lcom/meijer/mobile/ui/homescreen/carousel/action/ProductCarouselAction;)V", 0);
                        }

                        public final void a(AbstractC13422a p02) throws NumberFormatException {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).G2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC13422a abstractC13422a) throws NumberFormatException {
                            a(abstractC13422a);
                            return Unit.f142422a;
                        }
                    }

                    d(A0.g gVar, HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, z1<k0.ViewState> z1Var) {
                        this.f97898a = gVar;
                        this.f97899b = homeComposeActivity;
                        this.f97900c = localThemeScope;
                        this.f97901d = z1Var;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(HomeComposeActivity homeComposeActivity, AbstractC13697k it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(HomeComposeActivity homeComposeActivity, Pk.a it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit q(HomeComposeActivity homeComposeActivity, AbstractC13689c it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit r(HomeComposeActivity homeComposeActivity, AbstractC13687a it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit s(HomeComposeActivity homeComposeActivity, AbstractC13947a it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit t(HomeComposeActivity homeComposeActivity, InterfaceC18086a it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.x2(it);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit u(HomeComposeActivity homeComposeActivity, AbstractC13761f it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.F2(it);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit v(HomeComposeActivity homeComposeActivity, AbstractC13565b it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f142422a;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                        l(interfaceC14794C, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    public final void l(InterfaceC14794C paddingValues, Composer composer, int i10) {
                        int i11;
                        Intrinsics.j(paddingValues, "paddingValues");
                        if ((i10 & 6) == 0) {
                            i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-2015205992, i11, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:443)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), paddingValues);
                        A0.g gVar = this.f97898a;
                        final HomeComposeActivity homeComposeActivity = this.f97899b;
                        LocalThemeScope localThemeScope = this.f97900c;
                        z1<k0.ViewState> z1Var = this.f97901d;
                        e.Companion companion2 = P0.e.INSTANCE;
                        MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                        InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion3.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.getInserting()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyG, companion3.e());
                        D1.c(composerA, interfaceC5742sR, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        C5664j c5664j = C5664j.f48612a;
                        Modifier modifierD = A0.e.d(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), gVar, false, 2, null);
                        boolean zE = homeComposeActivity.d2().e(AbstractC18227f.J.f170549h);
                        k0.ViewState c11654mR = c.r(z1Var);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(homeComposeActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new a(homeComposeActivity);
                            composer.t(objB);
                        }
                        KFunction kFunction = (KFunction) objB;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(homeComposeActivity);
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new C1393b(homeComposeActivity);
                            composer.t(objB2);
                        }
                        KFunction kFunction2 = (KFunction) objB2;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD3 = composer.D(homeComposeActivity);
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new C1394c(homeComposeActivity);
                            composer.t(objB3);
                        }
                        KFunction kFunction3 = (KFunction) objB3;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD4 = composer.D(homeComposeActivity);
                        Object objB4 = composer.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new C1395d(homeComposeActivity);
                            composer.t(objB4);
                        }
                        KFunction kFunction4 = (KFunction) objB4;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD5 = composer.D(homeComposeActivity);
                        Object objB5 = composer.B();
                        if (zD5 || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function1() { // from class: com.meijer.mobile.home.ux.F
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1389c.b.d.t(homeComposeActivity, (InterfaceC18086a) obj);
                                }
                            };
                            composer.t(objB5);
                        }
                        Function1 function1 = (Function1) objB5;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD6 = composer.D(homeComposeActivity);
                        Object objB6 = composer.B();
                        if (zD6 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function1() { // from class: com.meijer.mobile.home.ux.G
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1389c.b.d.u(homeComposeActivity, (AbstractC13761f) obj);
                                }
                            };
                            composer.t(objB6);
                        }
                        Function1 function12 = (Function1) objB6;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD7 = composer.D(homeComposeActivity);
                        Object objB7 = composer.B();
                        if (zD7 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function1() { // from class: com.meijer.mobile.home.ux.H
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1389c.b.d.v(homeComposeActivity, (AbstractC13565b) obj);
                                }
                            };
                            composer.t(objB7);
                        }
                        Function1 function13 = (Function1) objB7;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD8 = composer.D(homeComposeActivity);
                        Object objB8 = composer.B();
                        if (zD8 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function1() { // from class: com.meijer.mobile.home.ux.I
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1389c.b.d.o(homeComposeActivity, (AbstractC13697k) obj);
                                }
                            };
                            composer.t(objB8);
                        }
                        Function1 function14 = (Function1) objB8;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD9 = composer.D(homeComposeActivity);
                        Object objB9 = composer.B();
                        if (zD9 || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new Function1() { // from class: com.meijer.mobile.home.ux.J
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1389c.b.d.p(homeComposeActivity, (Pk.a) obj);
                                }
                            };
                            composer.t(objB9);
                        }
                        Function1 function15 = (Function1) objB9;
                        composer.P();
                        Function1 function16 = (Function1) kFunction;
                        Function1 function17 = (Function1) kFunction2;
                        Function1 function18 = (Function1) kFunction3;
                        composer.startReplaceGroup(5004770);
                        boolean zD10 = composer.D(homeComposeActivity);
                        Object objB10 = composer.B();
                        if (zD10 || objB10 == Composer.INSTANCE.a()) {
                            objB10 = new Function1() { // from class: com.meijer.mobile.home.ux.K
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1389c.b.d.q(homeComposeActivity, (AbstractC13689c) obj);
                                }
                            };
                            composer.t(objB10);
                        }
                        Function1 function19 = (Function1) objB10;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD11 = composer.D(homeComposeActivity);
                        Object objB11 = composer.B();
                        if (zD11 || objB11 == Composer.INSTANCE.a()) {
                            objB11 = new Function1() { // from class: com.meijer.mobile.home.ux.L
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1389c.b.d.r(homeComposeActivity, (AbstractC13687a) obj);
                                }
                            };
                            composer.t(objB11);
                        }
                        Function1 function110 = (Function1) objB11;
                        composer.P();
                        Function1 function111 = (Function1) kFunction4;
                        composer.startReplaceGroup(5004770);
                        boolean zD12 = composer.D(homeComposeActivity);
                        Object objB12 = composer.B();
                        if (zD12 || objB12 == Composer.INSTANCE.a()) {
                            objB12 = new Function1() { // from class: com.meijer.mobile.home.ux.M
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1389c.b.d.s(homeComposeActivity, (AbstractC13947a) obj);
                                }
                            };
                            composer.t(objB12);
                        }
                        composer.P();
                        C15021f0.d(localThemeScope, c11654mR, zE, modifierD, function1, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111, (Function1) objB12, composer, LocalThemeScope.f15770g, 0, 0);
                        A0.c.d(c.r(z1Var).getIsRefreshing(), gVar, c5664j.g(companion, companion2.m()), 0L, 0L, false, composer, A0.g.f55j << 3, 56);
                        composer.v();
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }
                }

                b(InterfaceC5730l0<C17927c1> interfaceC5730l0, LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity, z1<k0.ViewState> z1Var, z1<FulfillmentBarDecorator> z1Var2, z1<HeaderDecorator> z1Var3, z1<DrawerLayoutDecorator> z1Var4, A0.g gVar) {
                    this.f97879a = interfaceC5730l0;
                    this.f97880b = localThemeScope;
                    this.f97881c = homeComposeActivity;
                    this.f97882d = z1Var;
                    this.f97883e = z1Var2;
                    this.f97884f = z1Var3;
                    this.f97885g = z1Var4;
                    this.f97886h = gVar;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-878822634, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:412)");
                    }
                    C17921a1.a(C18299z.b(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), true), c.v(this.f97879a), ComposableLambdaKt.c(172799537, true, new a(this.f97880b, this.f97881c, this.f97882d, this.f97883e), composer, 54), ComposableLambdaKt.c(1373940880, true, new C1391b(this.f97880b, this.f97881c, this.f97882d), composer, 54), null, null, 0, false, ComposableLambdaKt.c(1415598811, true, new C1392c(this.f97881c, this.f97880b, this.f97884f, this.f97885g), composer, 54), false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-2015205992, true, new d(this.f97886h, this.f97881c, this.f97880b, this.f97882d), composer, 54), composer, 100666752, 12582912, 130800);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$3$3$1", f = "HomeComposeActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$c, reason: collision with other inner class name */
            static final class C1396c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f97902a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f97903b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97904c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/home/ux/k0$k;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$3$3$1$1", f = "HomeComposeActivity.kt", l = {534, 534, 541, 541, 570, 570, 587, 587}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$c$a */
                static final class a extends SuspendLambda implements Function2<k0.AbstractC11652k, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f97905a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f97906b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f97907c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97908d;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        a aVar = new a(this.f97907c, this.f97908d, continuation);
                        aVar.f97906b = obj;
                        return aVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(k0.AbstractC11652k abstractC11652k, Continuation<? super Unit> continuation) {
                        return ((a) create(abstractC11652k, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f97907c = homeComposeActivity;
                        this.f97908d = localThemeScope;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:45:0x0193, code lost:
                    
                        if (Gi.i.i((Gi.i) r2, r3, null, null, false, r5, null, null, null, r17, 238, null) != r12) goto L81;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:68:0x0263, code lost:
                    
                        if (Gi.i.i((Gi.i) r2, r3, null, r3, false, r5, null, null, null, r17, 234, null) != r12) goto L81;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c0, code lost:
                    
                        if (Gi.i.i((Gi.i) r2, r3, null, r3, false, r5, null, null, null, r17, 234, null) != r12) goto L81;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x01ea  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x01f3  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                        /*
                            Method dump skipped, instructions count: 738
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.HomeComposeActivity.c.C1389c.C1396c.a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final boolean k(HomeComposeActivity homeComposeActivity) {
                        homeComposeActivity.startActivity(homeComposeActivity.c2().d());
                        return true;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1396c(this.f97903b, this.f97904c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1396c(HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, Continuation<? super C1396c> continuation) {
                    super(2, continuation);
                    this.f97903b = homeComposeActivity;
                    this.f97904c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1396c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f97902a == 0) {
                        ResultKt.b(obj);
                        C17154h.J(C17154h.O(this.f97903b.e2().C0(), new a(this.f97903b, this.f97904c, null)), C6031t.a(this.f97903b));
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$3$4$1", f = "HomeComposeActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f97909a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f97910b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97911c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTl/e;", "toastData", "", "<anonymous>", "(LTl/e;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$3$4$1$1", f = "HomeComposeActivity.kt", l = {602, 602}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$d$a */
                static final class a extends SuspendLambda implements Function2<ToastMessageData, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    Object f97912a;

                    /* renamed from: b, reason: collision with root package name */
                    int f97913b;

                    /* renamed from: c, reason: collision with root package name */
                    int f97914c;

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f97915d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97916e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        a aVar = new a(this.f97916e, continuation);
                        aVar.f97915d = obj;
                        return aVar;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(LocalThemeScope localThemeScope, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f97916e = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(ToastMessageData toastMessageData, Continuation<? super Unit> continuation) {
                        return ((a) create(toastMessageData, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
                    
                        if (Gi.i.i((Gi.i) r2, r3, null, null, false, null, null, null, null, r13, 254, null) == r12) goto L16;
                     */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                        /*
                            r13 = this;
                            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                            int r0 = r13.f97914c
                            r1 = 2
                            r2 = 1
                            if (r0 == 0) goto L34
                            if (r0 == r2) goto L23
                            if (r0 != r1) goto L1b
                            java.lang.Object r0 = r13.f97912a
                            java.lang.String r0 = (java.lang.String) r0
                            java.lang.Object r0 = r13.f97915d
                            Tl.e r0 = (Tl.ToastMessageData) r0
                            kotlin.ResultKt.b(r14)
                            goto L8c
                        L1b:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                            r0.<init>(r1)
                            throw r0
                        L23:
                            int r0 = r13.f97913b
                            java.lang.Object r2 = r13.f97912a
                            java.lang.String r2 = (java.lang.String) r2
                            java.lang.Object r3 = r13.f97915d
                            Tl.e r3 = (Tl.ToastMessageData) r3
                            kotlin.ResultKt.b(r14)
                            r4 = r3
                            r3 = r2
                            r2 = r14
                            goto L6e
                        L34:
                            kotlin.ResultKt.b(r14)
                            java.lang.Object r0 = r13.f97915d
                            r3 = r0
                            Tl.e r3 = (Tl.ToastMessageData) r3
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r4 = r3.getMessage()
                            r0.append(r4)
                            mk.c r4 = r3.getProduct()
                            java.lang.String r4 = Tl.d.a(r4)
                            r0.append(r4)
                            java.lang.String r0 = r0.toString()
                            Ji.M r4 = r13.f97916e
                            r13.f97915d = r3
                            r13.f97912a = r0
                            r5 = 0
                            r13.f97913b = r5
                            r13.f97914c = r2
                            r6 = 0
                            r7 = 0
                            java.lang.Object r2 = Ji.LocalThemeScope.g(r4, r6, r13, r2, r7)
                            if (r2 != r12) goto L6b
                            goto L8b
                        L6b:
                            r4 = r3
                            r3 = r0
                            r0 = r5
                        L6e:
                            Gi.i r2 = (Gi.i) r2
                            r13.f97915d = r4
                            r13.f97912a = r3
                            r13.f97913b = r0
                            r13.f97914c = r1
                            r0 = r2
                            r2 = 0
                            r1 = r3
                            r3 = 0
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            r10 = 254(0xfe, float:3.56E-43)
                            r11 = 0
                            r9 = r13
                            java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                            if (r0 != r12) goto L8c
                        L8b:
                            return r12
                        L8c:
                            kotlin.Unit r0 = kotlin.Unit.f142422a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.HomeComposeActivity.c.C1389c.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f97910b, this.f97911c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f97910b = homeComposeActivity;
                    this.f97911c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f97909a == 0) {
                        ResultKt.b(obj);
                        C17154h.J(C17154h.O(this.f97910b.e2().getToastMessageData(), new a(this.f97911c, null)), C6031t.a(this.f97910b));
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$e */
            static final class e implements Function3<R0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f97917a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f97918b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ k0.AbstractC11651j f97919c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$e$a */
                static final class a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ k0.AbstractC11651j f97920a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f97921b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f97922c;

                    a(k0.AbstractC11651j abstractC11651j, LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity) {
                        this.f97920a = abstractC11651j;
                        this.f97921b = localThemeScope;
                        this.f97922c = homeComposeActivity;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit e(HomeComposeActivity homeComposeActivity, k0.AbstractC11651j abstractC11651j) {
                        k0.AbstractC11651j.RateAndTipAlert hVar = (k0.AbstractC11651j.RateAndTipAlert) abstractC11651j;
                        homeComposeActivity.R2(hVar.getOrderId(), hVar.getExternalShopperId(), true);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit f(HomeComposeActivity homeComposeActivity, k0.AbstractC11651j abstractC11651j) {
                        k0.AbstractC11651j.RateAndTipAlert hVar = (k0.AbstractC11651j.RateAndTipAlert) abstractC11651j;
                        HomeComposeActivity.S2(homeComposeActivity, hVar.getOrderId(), hVar.getExternalShopperId(), false, 4, null);
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit g(HomeComposeActivity homeComposeActivity, k0.AbstractC11651j abstractC11651j) {
                        k0.AbstractC11651j.RateAndTipAlert hVar = (k0.AbstractC11651j.RateAndTipAlert) abstractC11651j;
                        HomeComposeActivity.S2(homeComposeActivity, hVar.getOrderId(), hVar.getExternalShopperId(), false, 4, null);
                        return Unit.f142422a;
                    }

                    public final void d(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(551157558, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:691)");
                        }
                        AbstractC5607a abstractC5607aC = ((k0.AbstractC11651j.RateAndTipAlert) this.f97920a).getTitle();
                        LocalThemeScope localThemeScope = this.f97921b;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.D(this.f97922c) | composer.V(this.f97920a);
                        final HomeComposeActivity homeComposeActivity = this.f97922c;
                        final k0.AbstractC11651j abstractC11651j = this.f97920a;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.home.ux.P
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HomeComposeActivity.c.C1389c.e.a.e(homeComposeActivity, abstractC11651j);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD2 = composer.D(this.f97922c) | composer.V(this.f97920a);
                        final HomeComposeActivity homeComposeActivity2 = this.f97922c;
                        final k0.AbstractC11651j abstractC11651j2 = this.f97920a;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.home.ux.Q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HomeComposeActivity.c.C1389c.e.a.f(homeComposeActivity2, abstractC11651j2);
                                }
                            };
                            composer.t(objB2);
                        }
                        Function0 function02 = (Function0) objB2;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD3 = composer.D(this.f97922c) | composer.V(this.f97920a);
                        final HomeComposeActivity homeComposeActivity3 = this.f97922c;
                        final k0.AbstractC11651j abstractC11651j3 = this.f97920a;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.home.ux.S
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HomeComposeActivity.c.C1389c.e.a.g(homeComposeActivity3, abstractC11651j3);
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        C15194s.e(localThemeScope, abstractC5607aC, null, function0, function02, (Function0) objB3, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 2);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        d(composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                e(LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity, k0.AbstractC11651j abstractC11651j) {
                    this.f97917a = localThemeScope;
                    this.f97918b = homeComposeActivity;
                    this.f97919c = abstractC11651j;
                }

                public final void b(R0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1363979145, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:685)");
                    }
                    LocalThemeScope localThemeScope = this.f97917a;
                    q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f97918b);
                    final HomeComposeActivity homeComposeActivity = this.f97918b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.home.ux.O
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.e.c(homeComposeActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C16977b.b(localThemeScope, modalTemplate, (Function0) objB, null, ComposableLambdaKt.c(551157558, true, new a(this.f97919c, this.f97917a, this.f97918b), composer, 54), composer, LocalThemeScope.f15770g | 24576 | (q1.ModalTemplate.f140108d << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
                    b(r02, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(HomeComposeActivity homeComposeActivity) {
                    homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1389c(C17893M0 c17893m0, HomeComposeActivity homeComposeActivity, z1<? extends k0.AbstractC11649h> z1Var, InterfaceC5730l0<C17927c1> interfaceC5730l0, z1<k0.ViewState> z1Var2, z1<FulfillmentBarDecorator> z1Var3, z1<HeaderDecorator> z1Var4, z1<DrawerLayoutDecorator> z1Var5, A0.g gVar, z1<? extends k0.AbstractC11651j> z1Var6) {
                this.f97866a = c17893m0;
                this.f97867b = homeComposeActivity;
                this.f97868c = z1Var;
                this.f97869d = interfaceC5730l0;
                this.f97870e = z1Var2;
                this.f97871f = z1Var3;
                this.f97872g = z1Var4;
                this.f97873h = z1Var5;
                this.f97874i = gVar;
                this.f97875j = z1Var6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.D2(a.b.f38712a);
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit C(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.D2(a.j.f38720a);
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit E(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.D2(a.b.f38712a);
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit F(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.D2(a.j.f38720a);
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit H(HomeComposeActivity homeComposeActivity) {
                if (Build.VERSION.SDK_INT >= 33) {
                    homeComposeActivity.requestPermissionLauncher.a("android.permission.POST_NOTIFICATIONS");
                } else {
                    homeComposeActivity.updateNotificationPreference(true);
                }
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit I(HomeComposeActivity homeComposeActivity) {
                if (Build.VERSION.SDK_INT < 33) {
                    homeComposeActivity.updateNotificationPreference(false);
                } else {
                    Fh.b.c(homeComposeActivity.f2(), 0L, 1, null);
                }
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                x(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            public final void x(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(669168574, i11, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous> (HomeComposeActivity.kt:376)");
                }
                C17893M0 c17893m0 = this.f97866a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-482324377, true, new a(this.f97868c, AdsTheme, this.f97867b), composer, 54);
                ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(-878822634, true, new b(this.f97869d, AdsTheme, this.f97867b, this.f97870e, this.f97871f, this.f97872g, this.f97873h, this.f97874i), composer, 54);
                int i12 = LocalThemeScope.f15770g;
                int i13 = i11 & 14;
                C15417h.h(AdsTheme, null, c17893m0, false, false, composableLambdaC, composableLambdaC2, composer, 1794048 | i12 | i13 | (C17893M0.f167209e << 6), 5);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f97867b) | (i13 == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme)));
                HomeComposeActivity homeComposeActivity = this.f97867b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1396c(homeComposeActivity, AdsTheme, null);
                    composer.t(objB);
                }
                composer.P();
                androidx.compose.runtime.J.g("HomeComposeActivity:Effects", (Function2) objB, composer, 6);
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(this.f97867b) | (i13 == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme)));
                HomeComposeActivity homeComposeActivity2 = this.f97867b;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new d(homeComposeActivity2, AdsTheme, null);
                    composer.t(objB2);
                }
                composer.P();
                androidx.compose.runtime.J.g("HomeComposeActivity:Toast", (Function2) objB2, composer, 6);
                boolean zK = this.f97866a.k();
                composer.startReplaceGroup(5004770);
                boolean zD3 = composer.D(this.f97867b);
                final HomeComposeActivity homeComposeActivity3 = this.f97867b;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.home.ux.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeComposeActivity.c.C1389c.y(homeComposeActivity3);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C13588d.a(zK, (Function0) objB3, composer, 0, 0);
                final k0.AbstractC11651j abstractC11651jU = c.u(this.f97875j);
                final HomeComposeActivity homeComposeActivity4 = this.f97867b;
                if (abstractC11651jU instanceof k0.AbstractC11651j.ClipCouponFailedAlert) {
                    composer.startReplaceGroup(1932396609);
                    k0.AbstractC11651j.ClipCouponFailedAlert cVar = (k0.AbstractC11651j.ClipCouponFailedAlert) abstractC11651jU;
                    String strC = C16193g.c(cVar.getTitleResId(), composer, 0);
                    String strC2 = C16193g.c(cVar.getMessageResId(), composer, 0);
                    String strC3 = C16193g.c(cVar.getPositiveButtonResId(), composer, 0);
                    String strC4 = C16193g.c(cVar.getNegativeButtonResId(), composer, 0);
                    composer.startReplaceGroup(5004770);
                    boolean zD4 = composer.D(homeComposeActivity4);
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function0() { // from class: com.meijer.mobile.home.ux.C
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.N(homeComposeActivity4);
                            }
                        };
                        composer.t(objB4);
                    }
                    Function0 function0 = (Function0) objB4;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD5 = composer.D(homeComposeActivity4) | composer.V(abstractC11651jU);
                    Object objB5 = composer.B();
                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new Function0() { // from class: com.meijer.mobile.home.ux.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.O(homeComposeActivity4, abstractC11651jU);
                            }
                        };
                        composer.t(objB5);
                    }
                    composer.P();
                    C15184i.b(AdsTheme, strC, strC2, strC3, strC4, null, function0, (Function0) objB5, composer, i12 | i13, 16);
                    composer.P();
                } else if (abstractC11651jU instanceof k0.AbstractC11651j.NoStoreAlert) {
                    composer.startReplaceGroup(1933417005);
                    String strC5 = C16193g.c(Bj.o.f2991P0, composer, 0);
                    String strC6 = C16193g.c(Bj.o.f3039r, composer, 0);
                    Locale locale = Locale.ROOT;
                    String upperCase = strC6.toUpperCase(locale);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    String upperCase2 = C16193g.c(Bj.o.f3041s, composer, 0).toUpperCase(locale);
                    Intrinsics.i(upperCase2, "toUpperCase(...)");
                    composer.startReplaceGroup(-1633490746);
                    boolean zD6 = composer.D(homeComposeActivity4) | composer.V(abstractC11651jU);
                    Object objB6 = composer.B();
                    if (zD6 || objB6 == Composer.INSTANCE.a()) {
                        objB6 = new Function0() { // from class: com.meijer.mobile.home.ux.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.P(homeComposeActivity4, abstractC11651jU);
                            }
                        };
                        composer.t(objB6);
                    }
                    Function0 function02 = (Function0) objB6;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD7 = composer.D(homeComposeActivity4);
                    Object objB7 = composer.B();
                    if (zD7 || objB7 == Composer.INSTANCE.a()) {
                        objB7 = new Function0() { // from class: com.meijer.mobile.home.ux.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.z(homeComposeActivity4);
                            }
                        };
                        composer.t(objB7);
                    }
                    Function0 function03 = (Function0) objB7;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD8 = composer.D(homeComposeActivity4);
                    Object objB8 = composer.B();
                    if (zD8 || objB8 == Composer.INSTANCE.a()) {
                        objB8 = new Function0() { // from class: com.meijer.mobile.home.ux.p
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.A(homeComposeActivity4);
                            }
                        };
                        composer.t(objB8);
                    }
                    composer.P();
                    C15177b.b(AdsTheme, strC5, upperCase, upperCase2, null, function02, function03, (Function0) objB8, composer, i12 | i13, 8);
                    composer.P();
                } else if (abstractC11651jU instanceof k0.AbstractC11651j.LoginAlert) {
                    composer.startReplaceGroup(1934663887);
                    String strC7 = C16193g.c(((k0.AbstractC11651j.LoginAlert) abstractC11651jU).getMessageResId(), composer, 0);
                    String strC8 = C16193g.c(Bj.o.f3045u, composer, 0);
                    Locale locale2 = Locale.ROOT;
                    String upperCase3 = strC8.toUpperCase(locale2);
                    Intrinsics.i(upperCase3, "toUpperCase(...)");
                    String upperCase4 = C16193g.c(Bj.o.f2971F0, composer, 0).toUpperCase(locale2);
                    Intrinsics.i(upperCase4, "toUpperCase(...)");
                    composer.startReplaceGroup(5004770);
                    boolean zD9 = composer.D(homeComposeActivity4);
                    Object objB9 = composer.B();
                    if (zD9 || objB9 == Composer.INSTANCE.a()) {
                        objB9 = new Function0() { // from class: com.meijer.mobile.home.ux.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.B(homeComposeActivity4);
                            }
                        };
                        composer.t(objB9);
                    }
                    Function0 function04 = (Function0) objB9;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD10 = composer.D(homeComposeActivity4);
                    Object objB10 = composer.B();
                    if (zD10 || objB10 == Composer.INSTANCE.a()) {
                        objB10 = new Function0() { // from class: com.meijer.mobile.home.ux.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.C(homeComposeActivity4);
                            }
                        };
                        composer.t(objB10);
                    }
                    Function0 function05 = (Function0) objB10;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD11 = composer.D(homeComposeActivity4);
                    Object objB11 = composer.B();
                    if (zD11 || objB11 == Composer.INSTANCE.a()) {
                        objB11 = new Function0() { // from class: com.meijer.mobile.home.ux.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.D(homeComposeActivity4);
                            }
                        };
                        composer.t(objB11);
                    }
                    composer.P();
                    C15177b.b(AdsTheme, strC7, upperCase3, upperCase4, null, function04, function05, (Function0) objB11, composer, i12 | i13, 8);
                    composer.P();
                } else if (Intrinsics.e(abstractC11651jU, k0.AbstractC11651j.C1397j.f98240a)) {
                    composer.startReplaceGroup(1935734007);
                    String strC9 = C16193g.c(r0.f98509z, composer, 0);
                    String strC10 = C16193g.c(Bj.o.f3045u, composer, 0);
                    Locale locale3 = Locale.ROOT;
                    String upperCase5 = strC10.toUpperCase(locale3);
                    Intrinsics.i(upperCase5, "toUpperCase(...)");
                    String upperCase6 = C16193g.c(Bj.o.f3055z, composer, 0).toUpperCase(locale3);
                    Intrinsics.i(upperCase6, "toUpperCase(...)");
                    composer.startReplaceGroup(5004770);
                    boolean zD12 = composer.D(homeComposeActivity4);
                    Object objB12 = composer.B();
                    if (zD12 || objB12 == Composer.INSTANCE.a()) {
                        objB12 = new Function0() { // from class: com.meijer.mobile.home.ux.t
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.E(homeComposeActivity4);
                            }
                        };
                        composer.t(objB12);
                    }
                    Function0 function06 = (Function0) objB12;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD13 = composer.D(homeComposeActivity4);
                    Object objB13 = composer.B();
                    if (zD13 || objB13 == Composer.INSTANCE.a()) {
                        objB13 = new Function0() { // from class: com.meijer.mobile.home.ux.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.F(homeComposeActivity4);
                            }
                        };
                        composer.t(objB13);
                    }
                    Function0 function07 = (Function0) objB13;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD14 = composer.D(homeComposeActivity4);
                    Object objB14 = composer.B();
                    if (zD14 || objB14 == Composer.INSTANCE.a()) {
                        objB14 = new Function0() { // from class: com.meijer.mobile.home.ux.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.G(homeComposeActivity4);
                            }
                        };
                        composer.t(objB14);
                    }
                    composer.P();
                    C15177b.b(AdsTheme, strC9, upperCase5, upperCase6, null, function06, function07, (Function0) objB14, composer, i12 | i13, 8);
                    composer.P();
                } else if (abstractC11651jU instanceof k0.AbstractC11651j.RateAndTipAlert) {
                    composer.startReplaceGroup(1936849759);
                    Ji.Q.e(AdsTheme, C14924a0.f139754a, ComposableLambdaKt.c(1363979145, true, new e(AdsTheme, homeComposeActivity4, abstractC11651jU), composer, 54), composer, i12 | 384 | i13 | (C14924a0.f139755b << 3));
                    composer.P();
                } else if (Intrinsics.e(abstractC11651jU, k0.AbstractC11651j.i.f98239a)) {
                    composer.startReplaceGroup(1938782020);
                    composer.startReplaceGroup(5004770);
                    boolean zD15 = composer.D(homeComposeActivity4);
                    Object objB15 = composer.B();
                    if (zD15 || objB15 == Composer.INSTANCE.a()) {
                        objB15 = new Function0() { // from class: com.meijer.mobile.home.ux.w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.H(homeComposeActivity4);
                            }
                        };
                        composer.t(objB15);
                    }
                    Function0 function08 = (Function0) objB15;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD16 = composer.D(homeComposeActivity4);
                    Object objB16 = composer.B();
                    if (zD16 || objB16 == Composer.INSTANCE.a()) {
                        objB16 = new Function0() { // from class: com.meijer.mobile.home.ux.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.I(homeComposeActivity4);
                            }
                        };
                        composer.t(objB16);
                    }
                    composer.P();
                    C15189n.b(AdsTheme, null, function08, (Function0) objB16, composer, i12 | i13, 1);
                    composer.P();
                } else if (Intrinsics.e(abstractC11651jU, k0.AbstractC11651j.g.f98234a)) {
                    composer.startReplaceGroup(1940000041);
                    composer.startReplaceGroup(5004770);
                    boolean zD17 = composer.D(homeComposeActivity4);
                    Object objB17 = composer.B();
                    if (zD17 || objB17 == Composer.INSTANCE.a()) {
                        objB17 = new Function0() { // from class: com.meijer.mobile.home.ux.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.J(homeComposeActivity4);
                            }
                        };
                        composer.t(objB17);
                    }
                    composer.P();
                    C15186k.b(AdsTheme, null, (Function0) objB17, composer, i12 | i13, 1);
                    composer.P();
                } else if (abstractC11651jU instanceof k0.AbstractC11651j.CartLoadFailedAlert) {
                    composer.startReplaceGroup(1940383542);
                    k0.AbstractC11651j.CartLoadFailedAlert aVar = (k0.AbstractC11651j.CartLoadFailedAlert) abstractC11651jU;
                    String strC11 = C16193g.c(aVar.getTitle(), composer, 0);
                    String strC12 = C16193g.c(aVar.getMessage(), composer, 0);
                    String strC13 = C16193g.c(aVar.getPositiveButtonText(), composer, 0);
                    composer.startReplaceGroup(5004770);
                    boolean zD18 = composer.D(homeComposeActivity4);
                    Object objB18 = composer.B();
                    if (zD18 || objB18 == Composer.INSTANCE.a()) {
                        objB18 = new Function0() { // from class: com.meijer.mobile.home.ux.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.K(homeComposeActivity4);
                            }
                        };
                        composer.t(objB18);
                    }
                    composer.P();
                    C15179d.b(AdsTheme, strC11, strC12, strC13, null, (Function0) objB18, composer, i12 | i13, 8);
                    composer.P();
                } else if (abstractC11651jU instanceof k0.AbstractC11651j.ChokeWarningAlert) {
                    composer.startReplaceGroup(1940991421);
                    k0.AbstractC11651j.ChokeWarningAlert bVar = (k0.AbstractC11651j.ChokeWarningAlert) abstractC11651jU;
                    String strC14 = C16193g.c(bVar.a().getTitle(), composer, 0);
                    String strC15 = C16193g.c(bVar.a().getBody(), composer, 0);
                    String strC16 = C16193g.c(bVar.a().getNegativeButtonText(), composer, 0);
                    String strC17 = C16193g.c(bVar.a().getPositiveButtonText(), composer, 0);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD19 = composer.D(homeComposeActivity4) | composer.V(abstractC11651jU);
                    Object objB19 = composer.B();
                    if (zD19 || objB19 == Composer.INSTANCE.a()) {
                        objB19 = new Function0() { // from class: com.meijer.mobile.home.ux.A
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.L(homeComposeActivity4, abstractC11651jU);
                            }
                        };
                        composer.t(objB19);
                    }
                    Function0 function09 = (Function0) objB19;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD20 = composer.D(homeComposeActivity4) | composer.V(abstractC11651jU);
                    Object objB20 = composer.B();
                    if (zD20 || objB20 == Composer.INSTANCE.a()) {
                        objB20 = new Function0() { // from class: com.meijer.mobile.home.ux.B
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1389c.M(homeComposeActivity4, abstractC11651jU);
                            }
                        };
                        composer.t(objB20);
                    }
                    composer.P();
                    C15182g.b(AdsTheme, strC14, strC15, strC16, strC17, null, function09, (Function0) objB20, composer, i12 | i13, 16);
                    composer.P();
                } else {
                    if (!Intrinsics.e(abstractC11651jU, k0.AbstractC11651j.f.f98233a)) {
                        composer.startReplaceGroup(-1461678919);
                        composer.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(1942277084);
                    composer.P();
                }
                Unit unit = Unit.f142422a;
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit A(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit D(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit G(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit J(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit K(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit L(HomeComposeActivity homeComposeActivity, k0.AbstractC11651j abstractC11651j) {
                homeComposeActivity.e2().I0(new k0.AbstractC11653l.ResetStepperState(((k0.AbstractC11651j.ChokeWarningAlert) abstractC11651j).a().b().getProductCode()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit M(HomeComposeActivity homeComposeActivity, k0.AbstractC11651j abstractC11651j) {
                homeComposeActivity.e2().I0(new k0.AbstractC11653l.AcceptAddToCartChallenge(((k0.AbstractC11651j.ChokeWarningAlert) abstractC11651j).a().b()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit N(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit O(HomeComposeActivity homeComposeActivity, k0.AbstractC11651j abstractC11651j) {
                k0.AbstractC11651j.ClipCouponFailedAlert cVar = (k0.AbstractC11651j.ClipCouponFailedAlert) abstractC11651j;
                homeComposeActivity.e2().onAction(new a.Clip(cVar.getCoupon(), cVar.getTrackingData()));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit P(HomeComposeActivity homeComposeActivity, k0.AbstractC11651j abstractC11651j) {
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                homeComposeActivity.startActivity(Al.s.f(homeComposeActivity, null, null, false, false, ((k0.AbstractC11651j.NoStoreAlert) abstractC11651j).getDeeplinkCode(), null, false, 222, null));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().I0(k0.AbstractC11653l.b.f98291a);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11651j.f.f98233a);
                return Unit.f142422a;
            }
        }

        c() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            l(composer, num.intValue());
            return Unit.f142422a;
        }

        public final void l(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1508783469, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous> (HomeComposeActivity.kt:317)");
            }
            z1 z1VarC = S2.a.c(HomeComposeActivity.this.h2().u(), null, null, null, composer, 0, 7);
            z1 z1VarC2 = S2.a.c(HomeComposeActivity.this.h2().v(), null, null, null, composer, 0, 7);
            z1 z1VarC3 = S2.a.c(HomeComposeActivity.this.e2().F0(), null, null, null, composer, 0, 7);
            z1 z1VarC4 = S2.a.c(HomeComposeActivity.this.getFulfillmentBarViewModel().n(), null, null, null, composer, 0, 7);
            z1 z1VarC5 = S2.a.c(HomeComposeActivity.this.e2().x0(), null, null, null, composer, 0, 7);
            z1 z1VarA = o1.a(HomeComposeActivity.this.e2().B0(), k0.AbstractC11651j.f.f98233a, null, composer, 48, 2);
            HomeComposeActivity.this.i2().k(0);
            C17932e0 c17932e0J = C17929d0.j(EnumC17935f0.f167889a, null, composer, 6, 2);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C17963o1();
                composer.t(objB);
            }
            C17963o1 c17963o1 = (C17963o1) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB2);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB2;
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(new C17927c1(c17932e0J, c17963o1), null, 2, null);
                composer.t(objB3);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB3;
            composer.P();
            boolean z10 = r(z1VarC3).getIsRefreshing();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(HomeComposeActivity.this);
            final HomeComposeActivity homeComposeActivity = HomeComposeActivity.this;
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.home.ux.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeComposeActivity.c.q(homeComposeActivity);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            A0.g gVarA = A0.h.a(z10, (Function0) objB4, 0.0f, 0.0f, composer, 0, 12);
            C17893M0 c17893m0J = C17891L0.j(EnumC17895N0.f167226a, null, null, true, composer, 3078, 6);
            k0.AbstractC11649h abstractC11649hT = t(z1VarC5);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(z1VarC5) | composer.D(c17893m0J);
            Object objB5 = composer.B();
            if (zV || objB5 == companion.a()) {
                objB5 = new a(c17893m0J, z1VarC5, null);
                composer.t(objB5);
            }
            composer.P();
            androidx.compose.runtime.J.g(abstractC11649hT, (Function2) objB5, composer, 0);
            Boolean boolValueOf = Boolean.valueOf(!c17893m0J.k());
            composer.startReplaceGroup(-1746271574);
            boolean zD2 = composer.D(c17893m0J) | composer.V(z1VarC5) | composer.D(HomeComposeActivity.this);
            HomeComposeActivity homeComposeActivity2 = HomeComposeActivity.this;
            Object objB6 = composer.B();
            if (zD2 || objB6 == companion.a()) {
                objB6 = new b(c17893m0J, homeComposeActivity2, z1VarC5, null);
                composer.t(objB6);
            }
            composer.P();
            androidx.compose.runtime.J.g(boolValueOf, (Function2) objB6, composer, 0);
            C16381K.b(HomeComposeActivity.this.i2(), c17932e0J, interfaceC16622O, composer, C16395g.f156492l);
            Ji.K.b(null, ComposableLambdaKt.c(669168574, true, new C1389c(c17893m0J, HomeComposeActivity.this, z1VarC5, interfaceC5730l0, z1VarC3, z1VarC4, z1VarC, z1VarC2, gVarA, z1VarA), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HeaderDecorator o(z1<HeaderDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DrawerLayoutDecorator p(z1<DrawerLayoutDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(HomeComposeActivity homeComposeActivity) {
            homeComposeActivity.e2().W0();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k0.ViewState r(z1<k0.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FulfillmentBarDecorator s(z1<FulfillmentBarDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k0.AbstractC11649h t(z1<? extends k0.AbstractC11649h> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k0.AbstractC11651j u(z1<? extends k0.AbstractC11651j> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17927c1 v(InterfaceC5730l0<C17927c1> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97923f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f97923f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f97923f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97924f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f97924f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f97924f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f97925f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97926g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f97925f = function0;
            this.f97926g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f97925f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f97926g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97927f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f97927f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f97927f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97928f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f97928f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f97928f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f97929f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97930g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f97929f = function0;
            this.f97930g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f97929f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f97930g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97931f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f97931f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f97931f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97932f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f97932f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f97932f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f97933f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f97934g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f97933f = function0;
            this.f97934g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f97933f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f97934g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class m implements InterfaceC14146b, FunctionAdapter {
        m() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, HomeComposeActivity.this, HomeComposeActivity.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            HomeComposeActivity.this.q2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$updateNotificationPreference$1", f = "HomeComposeActivity.kt", l = {1460}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97936a;

        /* renamed from: b, reason: collision with root package name */
        Object f97937b;

        /* renamed from: c, reason: collision with root package name */
        Object f97938c;

        /* renamed from: d, reason: collision with root package name */
        Object f97939d;

        /* renamed from: e, reason: collision with root package name */
        int f97940e;

        /* renamed from: f, reason: collision with root package name */
        int f97941f;

        /* renamed from: g, reason: collision with root package name */
        int f97942g;

        /* renamed from: h, reason: collision with root package name */
        int f97943h;

        /* renamed from: i, reason: collision with root package name */
        int f97944i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f97945j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f97947l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f97947l = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = HomeComposeActivity.this.new n(this.f97947l, continuation);
            nVar.f97945j = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f97944i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f97945j;
                    HomeComposeActivity homeComposeActivity = HomeComposeActivity.this;
                    boolean z10 = this.f97947l;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.d dVarJ2 = homeComposeActivity.j2();
                    this.f97945j = interfaceC16622O;
                    this.f97936a = interfaceC16622O;
                    this.f97937b = this;
                    this.f97938c = this;
                    this.f97939d = interfaceC16622O;
                    this.f97940e = 0;
                    this.f97941f = 0;
                    this.f97942g = 0;
                    this.f97943h = 0;
                    this.f97944i = 1;
                    obj = dVarJ2.g(z10, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                Result.b(ResultKt.a(e10));
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(final HomeComposeActivity homeComposeActivity) {
        homeComposeActivity.isShowingUpdatePrompt = true;
        new Pj.j(homeComposeActivity, r0.f98484a, new Object[0]).n().r(r0.f98485b, new Object[0]).o(r0.f98483C, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.home.ux.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HomeComposeActivity.X1(this.f97977a, dialogInterface, i10);
            }
        }).q(new DialogInterface.OnDismissListener() { // from class: com.meijer.mobile.home.ux.g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                HomeComposeActivity.Y1(this.f97979a, dialogInterface);
            }
        }).g();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y1(HomeComposeActivity homeComposeActivity, DialogInterface dialogInterface) {
        homeComposeActivity.isShowingUpdatePrompt = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2(AbstractC17021a action) {
        if (!(action instanceof AbstractC17021a.GoogleAdViewClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        a2().e(C13902c.b(((AbstractC17021a.GoogleAdViewClicked) action).getAdAnalytics(), "home"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(final AbstractC13696j action) {
        Object next;
        if (!(action instanceof AbstractC13696j.BannerClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC13696j.BannerClicked bannerClicked = (AbstractC13696j.BannerClicked) action;
        List<AbstractC14482i.Extra> listD = bannerClicked.getMarketingBanner().d();
        final String value = null;
        if (listD != null) {
            Iterator<T> it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.e(((AbstractC14482i.Extra) next).getKey(), "campaignId")) {
                        break;
                    }
                }
            }
            AbstractC14482i.Extra extra = (AbstractC14482i.Extra) next;
            if (extra != null) {
                value = extra.getValue();
            }
        }
        String linkURL = bannerClicked.getMarketingBanner().getLinkURL();
        if (linkURL != null && !StringsKt.r0(linkURL)) {
            if (g2().b0(linkURL)) {
                r2(linkURL, value == null ? "" : value);
            } else {
                K2(linkURL);
            }
        }
        a2().h(C14476c.a("event: featured clicked"), new Function1() { // from class: com.meijer.mobile.home.ux.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeComposeActivity.C2(value, action, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C2(String str, AbstractC13696j abstractC13696j, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("home");
        track.n("home");
        track.h("screenName", "New home screen");
        track.h("campaignId", str);
        List<AbstractC14482i.Extra> listD = ((AbstractC13696j.BannerClicked) abstractC13696j).getMarketingBanner().d();
        if (listD == null) {
            listD = CollectionsKt.m();
        }
        track.d(listD);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2(Wl.a request) {
        if (Intrinsics.e(request, a.d.f38714a)) {
            i2().j();
            return;
        }
        if (Intrinsics.e(request, a.C0832a.f38711a)) {
            n2();
            return;
        }
        if (Intrinsics.e(request, a.e.f38715a)) {
            if (m2().getIsLoggedIn()) {
                startActivity(Al.l.f673a.c(this));
                return;
            } else {
                e2().n0(new k0.AbstractC11651j.LoginAlert(C18570a.f173237e));
                return;
            }
        }
        if (Intrinsics.e(request, a.f.f38716a)) {
            if (!l2().d()) {
                e2().n0(new k0.AbstractC11651j.NoStoreAlert(536873012));
                return;
            } else if (d2().e(AbstractC18227f.t0.f170605h)) {
                startActivity(Al.h.d(this, true));
                return;
            } else {
                startActivity(Al.h.h(this, true));
                return;
            }
        }
        if (Intrinsics.e(request, a.g.f38717a)) {
            if (!l2().d()) {
                e2().n0(new k0.AbstractC11651j.NoStoreAlert(536872912));
                return;
            }
            if (d2().e(AbstractC18227f.t0.f170605h)) {
                startActivity(Al.h.c(this, Pp.b.f28356a, null, null, false, null, 60, null));
            } else {
                startActivity(Al.h.g(this, Pp.b.f28356a, null, null, false, null, 60, null));
            }
            a2().i(C14476c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.home.ux.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeComposeActivity.E2((TrackingData) obj);
                }
            });
            return;
        }
        if (Intrinsics.e(request, a.h.f38718a)) {
            startActivity(g2().D(this, d2().e(AbstractC18227f.O.f170554h)));
            return;
        }
        if (Intrinsics.e(request, a.i.f38719a)) {
            startActivity(Cl.e.t(g2(), this, 268437856, null, 4, null));
            return;
        }
        if (Intrinsics.e(request, a.b.f38712a)) {
            i2().f();
        } else if (Intrinsics.e(request, a.j.f38720a)) {
            i2().i();
        } else {
            if (!Intrinsics.e(request, a.c.f38713a)) {
                throw new NoWhenBranchMatchedException();
            }
            startActivity(c2().i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchLocation", "event: home search");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2(AbstractC13761f action) {
        if (action instanceof AbstractC13761f.Dismiss) {
            e2().onAction(action);
            return;
        }
        if (action instanceof AbstractC13761f.RateAndTip) {
            AbstractC13761f.RateAndTip rateAndTip = (AbstractC13761f.RateAndTip) action;
            startActivity(c2().v(rateAndTip.getRateAndTipBuilder(), rateAndTip.getFlowType()));
            return;
        }
        AbstractC14147c<Intent> abstractC14147c = null;
        if (action instanceof AbstractC13761f.ViewDeclinedPayment) {
            this.leavingHomeScreen = true;
            AbstractC14147c<Intent> abstractC14147c2 = this.startForResult;
            if (abstractC14147c2 == null) {
                Intrinsics.y("startForResult");
            } else {
                abstractC14147c = abstractC14147c2;
            }
            AbstractC13761f.ViewDeclinedPayment viewDeclinedPayment = (AbstractC13761f.ViewDeclinedPayment) action;
            abstractC14147c.a(Al.l.b(Al.l.f673a, this, viewDeclinedPayment.getOrderNumber(), viewDeclinedPayment.getPreviousTrackAction() + ": New home screen", null, 8, null));
            return;
        }
        if (action instanceof AbstractC13761f.ViewOrderDetail) {
            AbstractC14147c<Intent> abstractC14147c3 = this.startForResult;
            if (abstractC14147c3 == null) {
                Intrinsics.y("startForResult");
            } else {
                abstractC14147c = abstractC14147c3;
            }
            AbstractC13761f.ViewOrderDetail viewOrderDetail = (AbstractC13761f.ViewOrderDetail) action;
            abstractC14147c.a(Al.l.b(Al.l.f673a, this, viewOrderDetail.getOrderNumber(), viewOrderDetail.getPreviousTrackAction() + ": New home screen", null, 8, null));
            return;
        }
        if (!(action instanceof AbstractC13761f.ViewSubstitutions)) {
            if (!(action instanceof AbstractC13761f.OrderRatedAndTipped)) {
                throw new NoWhenBranchMatchedException();
            }
            e2().onAction(action);
            return;
        }
        AbstractC13761f.ViewSubstitutions viewSubstitutions = (AbstractC13761f.ViewSubstitutions) action;
        vo.b substitutionScreenType = viewSubstitutions.getSubstitutionScreenType();
        vo.b bVar = vo.b.f164895g;
        if (substitutionScreenType == bVar) {
            String orderNumber = viewSubstitutions.getOrderNumber();
            List<OrderSubstitutionItem> listF = viewSubstitutions.f();
            if (listF == null) {
                listF = CollectionsKt.m();
            }
            List<OrderSubstitutionItem> list = listF;
            String pickupPersonName = viewSubstitutions.getPickupPersonName();
            List<OrderOutOfStockItem> listE = viewSubstitutions.e();
            if (listE == null) {
                listE = CollectionsKt.m();
            }
            u2(this, orderNumber, bVar, list, false, null, pickupPersonName, listE, 16, null);
            return;
        }
        String orderNumber2 = viewSubstitutions.getOrderNumber();
        vo.b bVar2 = vo.b.f164896h;
        List<OrderSubstitutionItem> listF2 = viewSubstitutions.f();
        if (listF2 == null) {
            listF2 = CollectionsKt.m();
        }
        List<OrderSubstitutionItem> list2 = listF2;
        String pickupPersonName2 = viewSubstitutions.getPickupPersonName();
        List<OrderOutOfStockItem> listE2 = viewSubstitutions.e();
        if (listE2 == null) {
            listE2 = CollectionsKt.m();
        }
        u2(this, orderNumber2, bVar2, list2, false, null, pickupPersonName2, listE2, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G2(AbstractC13422a action) throws NumberFormatException {
        if (action instanceof AbstractC13422a.ProductClicked) {
            AbstractC13422a.ProductClicked productClicked = (AbstractC13422a.ProductClicked) action;
            v2(productClicked.getProduct(), productClicked.getPreviousTrackActionString());
            if (productClicked.getProduct().getIsSponsoredCriteo()) {
                e2().onAction(new AbstractC13947a.OnClickBeacon(productClicked.getProduct().getBeaconInfo().e(), productClicked.getProduct(), false, productClicked.getCarouselType(), 4, null));
                return;
            }
            return;
        }
        if (action instanceof AbstractC13422a.ViewAll) {
            AbstractC13422a.ViewAll viewAll = (AbstractC13422a.ViewAll) action;
            J2(this, viewAll.getUri(), viewAll.getCarouselTitle(), viewAll.b(), false, 8, null);
        } else {
            if (!(action instanceof AbstractC13422a.ProductCouponClicked) && !(action instanceof AbstractC13422a.UpdateProductEntry) && !(action instanceof AbstractC13422a.ProductClickedPosition) && !(action instanceof AbstractC13422a.Retry)) {
                throw new NoWhenBranchMatchedException();
            }
            e2().J0(action);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I2(java.lang.String r8, java.lang.String r9, hi.AbstractC14481h r10, boolean r11) throws java.lang.NumberFormatException {
        /*
            r7 = this;
            if (r8 == 0) goto L8
            android.net.Uri r8 = android.net.Uri.parse(r8)
            if (r8 != 0) goto La
        L8:
            android.net.Uri r8 = android.net.Uri.EMPTY
        La:
            Cl.e r0 = r7.g2()
            if (r8 != 0) goto L13
            android.net.Uri r1 = android.net.Uri.EMPTY
            goto L14
        L13:
            r1 = r8
        L14:
            kotlin.jvm.internal.Intrinsics.g(r1)
            int r0 = r0.O(r1)
            Cl.e r1 = r7.g2()
            if (r8 != 0) goto L23
            android.net.Uri r8 = android.net.Uri.EMPTY
        L23:
            kotlin.jvm.internal.Intrinsics.g(r8)
            java.lang.String r2 = ""
            if (r9 != 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r9
        L2d:
            android.content.Intent r8 = r1.R(r7, r8, r0, r3)
            if (r8 == 0) goto Lae
            r0 = 0
            if (r9 == 0) goto L3b
            java.lang.String r1 = r7.V1(r9)
            goto L3c
        L3b:
            r1 = r0
        L3c:
            if (r1 != 0) goto L3f
            goto L40
        L3f:
            r2 = r1
        L40:
            java.lang.String r1 = "homePageCarouselAnalytics"
            r8.putExtra(r1, r2)
            java.lang.String r1 = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT"
            boolean r2 = r8.hasExtra(r1)
            java.lang.String r3 = "com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"
            java.lang.Class<Qo.l> r4 = Qo.l.class
            r5 = 33
            if (r2 == 0) goto L77
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L5e
            java.lang.Object r2 = ta.d.a(r8, r1, r4)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            goto L69
        L5e:
            android.os.Parcelable r2 = r8.getParcelableExtra(r1)
            boolean r6 = r2 instanceof Qo.l
            if (r6 != 0) goto L67
            r2 = r0
        L67:
            Qo.l r2 = (Qo.l) r2
        L69:
            boolean r2 = r2 instanceof Qo.l.Department
            if (r2 == 0) goto L77
            if (r10 == 0) goto L73
            java.lang.String r0 = r10.getValue()
        L73:
            r8.putExtra(r3, r0)
            goto Lab
        L77:
            boolean r2 = r8.hasExtra(r1)
            if (r2 == 0) goto La2
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L88
            java.lang.Object r1 = ta.d.a(r8, r1, r4)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L93
        L88:
            android.os.Parcelable r1 = r8.getParcelableExtra(r1)
            boolean r2 = r1 instanceof Qo.l
            if (r2 != 0) goto L91
            r1 = r0
        L91:
            Qo.l r1 = (Qo.l) r1
        L93:
            boolean r1 = r1 instanceof Qo.l.BrowseCollection
            if (r1 == 0) goto La2
            java.lang.String r10 = "KEY_CURATED_CAROUSEL"
            r8.putExtra(r10, r9)
            java.lang.String r9 = "SEE_MORE_ITEMS"
            r8.putExtra(r9, r11)
            goto Lab
        La2:
            if (r10 == 0) goto La8
            java.lang.String r0 = r10.getValue()
        La8:
            r8.putExtra(r3, r0)
        Lab:
            r7.startActivity(r8)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.HomeComposeActivity.I2(java.lang.String, java.lang.String, hi.h, boolean):void");
    }

    static /* synthetic */ void J2(HomeComposeActivity homeComposeActivity, String str, String str2, AbstractC14481h abstractC14481h, boolean z10, int i10, Object obj) throws NumberFormatException {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        homeComposeActivity.I2(str, str2, abstractC14481h, z10);
    }

    private final void K2(String url) {
        if (url == null) {
            return;
        }
        Intent intentR = g2().r(url);
        if (intentR.resolveActivity(getPackageManager()) != null) {
            startActivity(intentR);
            return;
        }
        uw.a.INSTANCE.d("Could not open browser from HomeActivity for url: " + url, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(HomeComposeActivity homeComposeActivity, boolean z10) {
        if (z10) {
            homeComposeActivity.updateNotificationPreference(true);
        } else {
            homeComposeActivity.updateNotificationPreference(false);
            homeComposeActivity.e2().n0(k0.AbstractC11651j.g.f98234a);
        }
    }

    static /* synthetic */ void P2(HomeComposeActivity homeComposeActivity, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        homeComposeActivity.O2(i10, z10, z11);
    }

    private final void Q2(TrackingData trackingData) {
        if (trackingData != null) {
            trackingData.n("home");
            trackingData.v("dashboard");
            trackingData.h("screenName", "New home screen");
        } else {
            trackingData = null;
        }
        a2().e(trackingData);
    }

    static /* synthetic */ void S2(HomeComposeActivity homeComposeActivity, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        homeComposeActivity.R2(str, str2, z10);
    }

    private final String V1(String str) {
        return str + ":View All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(HomeComposeActivity homeComposeActivity, C17589b config) {
        Intrinsics.j(config, "config");
        yo.k.b0(homeComposeActivity.getUserManager(), 0L, 1, null);
        homeComposeActivity.getNotificationManager().s(config.getUpdateAppMessageTitle(), config.getUpdateAppMessage(), homeComposeActivity);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 e2() {
        return (k0) this.homeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hl.b getFulfillmentBarViewModel() {
        return (Hl.b) this.fulfillmentBarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16382L h2() {
        return (C16382L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16395g i2() {
        return (C16395g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("home page");
        track.v("header");
        return Unit.f142422a;
    }

    private final void requestNotificationPermission() {
        if (Z1.b.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            updateNotificationPreference(true);
            return;
        }
        if (shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
            e2().n0(k0.AbstractC11651j.i.f98239a);
        } else if (f2().g() && Fh.b.f(f2(), 0L, 1, null)) {
            e2().n0(k0.AbstractC11651j.i.f98239a);
        }
    }

    private final void t2(String orderNumber, vo.b substitutionScreenType, List<OrderSubstitutionItem> listSubstitutedItems, boolean isOnMyWayClicked, String orderType, String pickupPersonName, List<OrderOutOfStockItem> listOutOfStockItems) {
        startActivity(Al.l.f673a.d(this, listSubstitutedItems, orderNumber, substitutionScreenType, isOnMyWayClicked, orderType, pickupPersonName, listOutOfStockItems));
    }

    static /* synthetic */ void u2(HomeComposeActivity homeComposeActivity, String str, vo.b bVar, List list, boolean z10, String str2, String str3, List list2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            str3 = null;
        }
        homeComposeActivity.t2(str, bVar, list, z10, str2, str3, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16395g w2(HomeComposeActivity homeComposeActivity) {
        return new C16395g(homeComposeActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(InterfaceC18086a chip) {
        if (chip instanceof AbstractC14275b) {
            AbstractC14275b abstractC14275b = (AbstractC14275b) chip;
            Q2(abstractC14275b.getTrackingData());
            if (abstractC14275b instanceof AbstractC14275b.e) {
                Intent intentT = Cl.e.t(g2(), this, 1700, null, 4, null);
                if (intentT != null) {
                    startActivity(intentT);
                    return;
                }
                return;
            }
            if (abstractC14275b instanceof AbstractC14275b.MPerks) {
                startActivity(getUserManager().b() ? Al.p.f690a.d(this, false) : Al.p.f690a.a(this));
                return;
            }
            if (Intrinsics.e(abstractC14275b, AbstractC14275b.a.f133807e)) {
                Intent intentT2 = Cl.e.t(g2(), this, 536871032, null, 4, null);
                if (intentT2 != null) {
                    startActivity(intentT2);
                    return;
                }
                return;
            }
            if (Intrinsics.e(abstractC14275b, AbstractC14275b.f.f133816e)) {
                if (!getUserManager().b()) {
                    e2().n0(new k0.AbstractC11651j.LoginAlert(r0.f98507x));
                    return;
                }
                Intent intentT3 = Cl.e.t(g2(), this, 268437756, null, 4, null);
                if (intentT3 != null) {
                    startActivity(intentT3);
                    return;
                }
                return;
            }
            if (Intrinsics.e(abstractC14275b, AbstractC14275b.d.f133812e)) {
                if (getUserManager().b()) {
                    startActivity(c2().r());
                    return;
                } else {
                    e2().n0(new k0.AbstractC11651j.LoginAlert(r0.f98498o));
                    return;
                }
            }
            if (!Intrinsics.e(abstractC14275b, AbstractC14275b.g.f133818e)) {
                if (!Intrinsics.e(abstractC14275b, AbstractC14275b.C2103b.f133809e)) {
                    throw new NoWhenBranchMatchedException();
                }
                startActivity(Al.i.f671a.a(this));
            } else if (l2().d()) {
                startActivity(Al.g.G(c2(), 0, 0, 3, null));
            } else {
                e2().n0(new k0.AbstractC11651j.NoStoreAlert(536871412));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y2(HomeComposeActivity homeComposeActivity, C14145a result) {
        Intent data;
        Intrinsics.j(result, "result");
        if (result.getResultCode() != -1 || (data = result.getData()) == null) {
            return;
        }
        if (data.getStringExtra(HomeFragment.ORDER_DETAILS_BACK) != null) {
            homeComposeActivity.leavingHomeScreen = false;
            Intent data2 = result.getData();
            homeComposeActivity.previousTrackAction = data2 != null ? data2.getStringExtra(HomeFragment.ORDER_DETAILS_BACK) : null;
        }
        if (data.getStringExtra("orderID") != null) {
            String stringExtra = data.getStringExtra("orderID");
            Intrinsics.g(stringExtra);
            homeComposeActivity.F2(new AbstractC13761f.Dismiss(stringExtra, null, 2, null));
            homeComposeActivity.F2(new AbstractC13761f.OrderRatedAndTipped(stringExtra));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2(AbstractC13688b action) {
        if (!(action instanceof AbstractC13688b.NavigateToTeachersList)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!getUserManager().b()) {
            e2().n0(k0.AbstractC11651j.C1397j.f98240a);
            return;
        }
        String deeplink = ((AbstractC13688b.NavigateToTeachersList) action).getDeeplink();
        if (deeplink != null) {
            e2().K0(action);
            Intent intentN = g2().n(this, deeplink);
            if (intentN != null) {
                startActivity(intentN);
            }
        }
    }

    public final InterfaceC14261a a2() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final AppVersion b2() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.y("appVersion");
        return null;
    }

    public final Al.g c2() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final yl.k d2() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final Fh.b f2() {
        Fh.b bVar = this.inboxManager;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("inboxManager");
        return null;
    }

    public final Cl.e g2() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    public final C17279b getAppBackgroundManager() {
        C17279b c17279b = this.appBackgroundManager;
        if (c17279b != null) {
            return c17279b;
        }
        Intrinsics.y("appBackgroundManager");
        return null;
    }

    public final C18264a getAppPrefManager() {
        C18264a c18264a = this.appPrefManager;
        if (c18264a != null) {
            return c18264a;
        }
        Intrinsics.y("appPrefManager");
        return null;
    }

    public final C18223b getAppUpdateConfigManager() {
        C18223b c18223b = this.appUpdateConfigManager;
        if (c18223b != null) {
            return c18223b;
        }
        Intrinsics.y("appUpdateConfigManager");
        return null;
    }

    public final C17838h getNotificationManager() {
        C17838h c17838h = this.notificationManager;
        if (c17838h != null) {
            return c17838h;
        }
        Intrinsics.y("notificationManager");
        return null;
    }

    public final yo.k getUserManager() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    public final Bh.d j2() {
        Bh.d dVar = this.preferencesRepository;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.y("preferencesRepository");
        return null;
    }

    public final C17129c k2() {
        C17129c c17129c = this.rateAndTipUpdater;
        if (c17129c != null) {
            return c17129c;
        }
        Intrinsics.y("rateAndTipUpdater");
        return null;
    }

    public final Tq.j l2() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.y("storeProvider");
        return null;
    }

    @Override // tp.C17129c.a
    public void onUpdateRateAndTip(Builder builder, EnumC17127a flowType) {
        Intrinsics.j(builder, "builder");
        Intrinsics.j(flowType, "flowType");
        e2().updateRatedAndTippedOrder(builder, flowType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2() {
        e2().I0(k0.AbstractC11653l.b.f98291a);
        startActivity(Al.p.f(Al.p.f690a, this, false, true, false, false, 26, null));
    }

    private final void L2() {
        e2().W0();
    }

    private final void N2() {
        if (!getAppBackgroundManager().getAppWasInBackground() && m2().getIsLoggedIn() && Bk.a.f3135a.a(getAppPrefManager().p(), getAppPrefManager().k(), getAppPrefManager().i(), getAppPrefManager().g(), getAppPrefManager().l(), getAppPrefManager().j(), getAppPrefManager().h(), b2().getVersionCode())) {
            new com.meijer.mobile.ui.common.rateapp.a(this, this, a2()).f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(int points, boolean fromCloseButton, boolean isClaimPointsNowButton) {
        AbstractC14482i.Extra extraB;
        e2().I0(k0.AbstractC11653l.b.f98291a);
        InterfaceC14261a interfaceC14261aA2 = a2();
        AbstractC14481h.Action actionA = C14476c.a("mPerks points expiry drawer");
        AbstractC14482i.Page pageC = C14476c.c("Meijer:Home Page");
        AbstractC14482i.PageType pageTypeD = C14476c.d("index");
        AbstractC14482i.Section sectionG = C14476c.g("mPerks 4.0");
        AbstractC14482i.Extra extraB2 = C14476c.b("mperksPoints", String.valueOf(points));
        if (fromCloseButton) {
            extraB = C14476c.b("drawerClosed", "true");
        } else if (isClaimPointsNowButton) {
            extraB = C14476c.b("claimPointsNow", "true");
        } else {
            extraB = C14476c.b("claimPointsLater", "true");
        }
        interfaceC14261aA2.b(actionA, pageC, pageTypeD, sectionG, extraB2, extraB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2(String orderId, String externalShopperId, boolean shouldNavigate) {
        e2().H0(new k0.AbstractC11648g.UpdateRateAndTipNotification(orderId, externalShopperId, shouldNavigate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(HomeComposeActivity homeComposeActivity, DialogInterface dialogInterface, int i10) {
        homeComposeActivity.openMeijerPlayStorePage();
    }

    private final void checkForAppUpdate() {
        getAppUpdateConfigManager().h(new Function0() { // from class: com.meijer.mobile.home.ux.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeComposeActivity.W1(this.f97975a);
            }
        }, new Function1() { // from class: com.meijer.mobile.home.ux.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeComposeActivity.Z1(this.f97976a, (C17589b) obj);
            }
        });
    }

    private final MeijerUser m2() {
        return e2().F0().getValue().getUser();
    }

    private final void n2() {
        if (m2().getIsLoggedIn()) {
            a2().h(C14476c.a("event: header manage account"), new Function1() { // from class: com.meijer.mobile.home.ux.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeComposeActivity.o2((TrackingData) obj);
                }
            });
            startActivity(Al.a.f661a.h(this, d2().e(AbstractC18227f.C18228a.f170566h)));
        } else if (d2().e(AbstractC18227f.h0.f170581h)) {
            startActivity(Al.u.f695a.a(this));
        } else {
            startActivity(Al.k.b(this, false, null, null, null, null, null, 126, null));
        }
    }

    private final void openMeijerPlayStorePage() {
        try {
            startActivity(g2().W(this));
        } catch (ActivityNotFoundException e10) {
            uw.a.INSTANCE.f(e10, "Play Store not found, opening browser link", new Object[0]);
            startActivity(g2().X(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p2(C14145a result) {
        if (result.getResultCode() == 223418) {
            e2().t0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(C14145a result) {
        int i10;
        switch (result.getResultCode()) {
            case 867530912:
                i10 = C17135b.f162021g;
                break;
            case 867530913:
                i10 = C17135b.f162019f;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 != 0) {
            e2().I0(new k0.AbstractC11653l.DisplaySubstitutionToast(i10));
        }
    }

    private final void r2(String url, String campaignIdValue) {
        Intent intentN = g2().n(this, url);
        if (intentN != null) {
            intentN.addFlags(536870912);
            intentN.putExtra("com.meijer.intent.extra.DASHBOARD_LINK", true);
            intentN.putExtra("campaignIdValue", campaignIdValue);
            startActivity(intentN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2(String deeplink, String analytics, String name, boolean isFromViewAll) {
        int iP = g2().P(deeplink);
        if (iP != 4000) {
            if (iP != 4100) {
                Intent intentN = g2().n(this, deeplink);
                if (intentN != null) {
                    if (analytics != null) {
                        intentN.putExtra("broseDepartmentCarouselAnalytics", analytics);
                        if (isFromViewAll) {
                            intentN.putExtra("homePageCarouselAnalytics", V1(name) + ':');
                        }
                    }
                    startActivity(intentN);
                    return;
                }
                return;
            }
            Intent intentY = g2().Y(Uri.parse(deeplink), this, 4100);
            if (intentY != null) {
                if (analytics != null) {
                    intentY.putExtra("broseDepartmentCarouselAnalytics", analytics);
                    if (isFromViewAll) {
                        intentY.putExtra("homePageCarouselAnalytics", V1(name));
                    }
                }
                startActivity(intentY.putExtra("KEY_CURATED_CAROUSEL", name));
                return;
            }
            return;
        }
        Intent intentZ = g2().Z(Uri.parse(deeplink), name);
        if (intentZ != null) {
            if (analytics != null) {
                intentZ.putExtra("broseDepartmentCarouselAnalytics", analytics);
                intentZ.putExtra("homePageCarouselAnalytics", V1(name));
            }
            startActivity(intentZ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNotificationPreference(boolean enabled) {
        f2().a();
        f2().d(enabled, getUserManager().b());
        getUserManager().R(enabled);
        C16648k.d(C6031t.a(this), null, null, new n(enabled, null), 3, null);
    }

    private final void v2(mk.f productId, String previousTrackAction) {
        startActivity(c2().s(productId, false, true, previousTrackAction));
    }

    @Override // com.meijer.mobile.home.ux.Hilt_HomeComposeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.startForResult = registerForActivityResult(new h.i(), new InterfaceC14146b() { // from class: com.meijer.mobile.home.ux.a
            @Override // g.InterfaceC14146b
            public final void a(Object obj) {
                HomeComposeActivity.y2(this.f97971a, (C14145a) obj);
            }
        });
        h2().w(0);
        L2();
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1508783469, true, new c()), 1, null);
        if (Build.VERSION.SDK_INT >= 33) {
            requestNotificationPermission();
        } else if (f2().g()) {
            e2().n0(k0.AbstractC11651j.i.f98239a);
        }
    }

    @Override // com.meijer.mobile.home.ux.Hilt_HomeComposeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        k2().c("HomeActivity");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        androidx.appcompat.app.c cVar = this.notificationDialog;
        if (cVar != null) {
            if (!cVar.isShowing()) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.dismiss();
            }
        }
    }

    @Override // Lr.d
    public void onRateAppNoThanks() {
        C18264a.B(getAppPrefManager(), 0L, 1, null);
    }

    @Override // Lr.d
    public void onRateAppNoThanksCurrentVersion() {
        getAppPrefManager().y(b2().getVersionCode());
    }

    @Override // Lr.d
    public void onRateAppNow() {
        getAppPrefManager().C(b2().getVersionCode());
        openMeijerPlayStorePage();
    }

    @Override // Lr.d
    public void onRateAppRemindLater() {
        C18264a.E(getAppPrefManager(), 0L, 1, null);
    }

    @Override // Lr.d
    public void onRateAppSendEmail() {
        getAppPrefManager().z(b2().getVersionCode());
        try {
            startActivity(g2().B(this));
        } catch (ActivityNotFoundException unused) {
            new Pj.j(this, r0.f98488e, new Object[0]).g();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Meijer Home Page").start();
        e2().G0();
        k2().a("HomeActivity", this);
        N2();
        if (!this.isShowingUpdatePrompt) {
            checkForAppUpdate();
        }
    }
}
