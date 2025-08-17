package com.meijer.mobile.meijer.activity.find.viewmodel;

import Ao.C2930u;
import Ao.W;
import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import Kp.ProductReviewFullDetails;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import cl.C6412d;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.find.productdetail.AbstractC12120f;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailFeatureFlags;
import com.meijer.mobile.meijer.activity.find.productdetail.SuggestedProductCarouselDecorator;
import com.meijer.mobile.meijer.activity.find.productdetail.a2;
import com.meijer.mobile.meijer.activity.find.productdetail.m2;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12200a;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12300x;
import com.meijer.mobile.meijer.activity.find.viewmodel.G0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ej.Entry;
import ej.EntryChange;
import ej.ShoppingCart;
import fi.C13902c;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import iv.C14764a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kk.AbstractC15172a;
import kk.AbstractC15173b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qp.C16594b;
import qv.AbstractC16618K;
import qv.C16648k;
import qv.InterfaceC16622O;
import sp.C16992a;
import sp.ProductState;
import tk.AbstractC17116a;
import tk.c;
import tr.C17135b;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import ur.AbstractC17302a;
import uw.a;
import vl.CartEntry;
import vr.AbstractC17604a;
import wr.InterfaceC17847a;
import yl.AbstractC18227f;
import zs.C18570a;

@Metadata(d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u0085\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0004¤\u0001¦\u0001B£\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\b\b\u0001\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J)\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020\u00032\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u0002012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u0002012\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000201H\u0014¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u0002012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u0002012\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u0002012\u0006\u0010C\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u0002012\u0006\u0010C\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u0002012\u0006\u0010C\u001a\u00020L¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u0002012\u0006\u0010C\u001a\u00020O¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u0002012\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u000201H\u0002¢\u0006\u0004\bV\u0010=J+\u0010X\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.2\u0012\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-H\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u000201H\u0002¢\u0006\u0004\bZ\u0010=J\u000f\u0010[\u001a\u000201H\u0002¢\u0006\u0004\b[\u0010=J\u0011\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\b]\u0010^J/\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0_H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u000201H\u0002¢\u0006\u0004\bb\u0010=J\u000f\u0010c\u001a\u000201H\u0002¢\u0006\u0004\bc\u0010=J\u0017\u0010d\u001a\u0002012\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bd\u00107J\u0018\u0010e\u001a\u0002012\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\be\u0010fJ\u0018\u0010h\u001a\u0002012\u0006\u0010g\u001a\u00020/H\u0082@¢\u0006\u0004\bh\u0010iJ\u0017\u0010l\u001a\u0002012\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bl\u0010mJ\u001f\u0010q\u001a\u0002012\u0006\u0010n\u001a\u00020j2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u0002012\u0006\u0010s\u001a\u00020/H\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010x\u001a\u0002012\u0006\u0010w\u001a\u00020vH\u0002¢\u0006\u0004\bx\u0010yJ\u001f\u0010~\u001a\u0002012\u0006\u0010{\u001a\u00020z2\u0006\u0010}\u001a\u00020|H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001e\u0010\u0082\u0001\u001a\u00030\u0081\u00012\t\b\u0001\u0010\u0080\u0001\u001a\u00020>H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J\u001d\u0010\u0089\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0082@¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001b\u0010\u008b\u0001\u001a\u0002012\u0007\u0010\u0085\u0001\u001a\u000204H\u0082@¢\u0006\u0005\b\u008b\u0001\u0010fJ\u001d\u0010\u008c\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0082@¢\u0006\u0006\b\u008c\u0001\u0010\u008a\u0001J\u001d\u0010\u008d\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0082@¢\u0006\u0006\b\u008d\u0001\u0010\u008a\u0001J+\u0010\u0090\u0001\u001a\u0002012\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020/0-2\b\u0010\u008f\u0001\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J!\u0010\u0093\u0001\u001a\u0002012\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020j0-H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J,\u0010\u0099\u0001\u001a\u0002012\u0007\u0010C\u001a\u00030\u0095\u00012\u000f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J#\u0010\u009c\u0001\u001a\u0002012\u000f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J#\u0010\u009e\u0001\u001a\u0002012\u000f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001J#\u0010\u009f\u0001\u001a\u0002012\u000f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u009f\u0001\u0010\u009d\u0001J%\u0010 \u0001\u001a\u0004\u0018\u00010j2\u000f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0012\u0010¢\u0001\u001a\u00020jH\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Í\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020|0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R#\u0010×\u0001\u001a\t\u0012\u0004\u0012\u00020|0Ò\u00018\u0006¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001f\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R$\u0010â\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ý\u00018\u0006¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R\u001f\u0010å\u0001\u001a\n\u0012\u0005\u0012\u00030ã\u00010Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010Û\u0001R$\u0010è\u0001\u001a\n\u0012\u0005\u0012\u00030ã\u00010Ý\u00018\u0006¢\u0006\u0010\n\u0006\bæ\u0001\u0010ß\u0001\u001a\u0006\bç\u0001\u0010á\u0001R\u001e\u0010ì\u0001\u001a\u00070jj\u0003`é\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0017\u0010ï\u0001\u001a\u00020>8\u0002X\u0082D¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R*\u0010ó\u0001\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bð\u0001\u0010ë\u0001\u001a\u0006\bñ\u0001\u0010£\u0001\"\u0005\bò\u0001\u0010mR*\u0010÷\u0001\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bô\u0001\u0010ë\u0001\u001a\u0006\bõ\u0001\u0010£\u0001\"\u0005\bö\u0001\u0010mR\u001a\u0010ú\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R*\u0010\u0080\u0002\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bû\u0001\u0010ù\u0001\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R1\u0010\u0084\u0002\u001a\u001c\u0012\u0017\u0012\u0015\u0012\t\u0012\u00070jj\u0003`\u0082\u0002\u0012\u0005\u0012\u00030\u0095\u00010\u0081\u00020Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010Û\u0001¨\u0006\u0086\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/c1;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "LRo/c;", "productsRepository", "Lhl/m;", "cartRepository", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "LEq/a;", "favoritesListRepository", "LEq/b;", "shoppingListRepository", "Lwr/f;", "cartInteractor", "Lcom/google/firebase/crashlytics/a;", "firebaseCrashlytics", "Lyl/k;", "featureManager", "Lgi/a;", "analyticsEngine", "Lqp/b;", "beaconClient", "Lsp/Y;", "productStateRepository", "Lsp/a;", "multiChannelProductsStateRepository", "Lpp/g;", "suggestionsRepository", "Lpp/e;", "sponsorshipsDataStore", "Lpp/d;", "productMetadataStore", "LKp/g;", "bazaarVoiceManager", "Lcl/d;", "couponsRepository", "Lqv/K;", "ioDispatcher", "<init>", "(LRo/c;Lhl/m;LTq/j;Lyo/k;LEq/a;LEq/b;Lwr/f;Lcom/google/firebase/crashlytics/a;Lyl/k;Lgi/a;Lqp/b;Lsp/Y;Lsp/a;Lpp/g;Lpp/e;Lpp/d;LKp/g;Lcl/d;Lqv/K;)V", "key", "", "Lsp/b;", "LCo/h;", "productState", "", "Z0", "(Ljava/lang/Object;Ljava/util/List;)V", "Lmk/f;", "productIdentity", "h1", "(Lmk/f;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "onCleared", "()V", "", "count", "V0", "(I)V", "Lkk/b;", "action", "U0", "(Lkk/b;)V", "Lkk/a;", "T0", "(Lkk/a;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "S0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "R0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Q0", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/m2;", "result", "Y0", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/m2;)V", "K0", "productStates", "X0", "(Ljava/util/List;)Lsp/b;", "P0", "d1", "LAo/W$a;", "z0", "()LAo/W$a;", "", "J0", "(Ljava/util/List;)Ljava/util/List;", "q0", "L0", "u0", "I0", "(Lmk/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productFullDetails", "v0", "(LCo/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "productCode", "p0", "(Ljava/lang/String;)V", "reviewId", "LKp/a;", "reviewFeedbackVote", "t0", "(Ljava/lang/String;LKp/a;)V", "productDetails", "o1", "(LCo/h;)V", "", "quantityToUpdate", "r1", "(D)V", "", "throwable", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "event", "a1", "(Ljava/lang/Throwable;Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;)V", "errorMessageId", "", "s1", "(I)Z", "Lmk/c;", "product", "u1", "(Lmk/c;)V", "t1", "k0", "(Lmk/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c1", "j0", "b1", "productList", "isFrequentlyBoughtTogetherImpression", "o0", "(Ljava/util/List;Z)V", "beacon", "e1", "(Ljava/util/List;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/f$a;", "Ltk/c;", "Lej/j;", "entryChange", "W0", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/f$a;Ltk/c;)V", "changeRes", "H0", "(Ltk/c;)V", "G0", "D0", "y0", "(Ltk/c;)Ljava/lang/String;", "B0", "()Ljava/lang/String;", "a", "LRo/c;", "b", "Lhl/m;", "c", "LTq/j;", "d", "Lyo/k;", "e", "LEq/a;", "f", "LEq/b;", "g", "Lwr/f;", "h", "Lcom/google/firebase/crashlytics/a;", "i", "Lyl/k;", "j", "Lgi/a;", "k", "Lqp/b;", "l", "Lsp/Y;", "m", "Lsp/a;", "n", "Lpp/g;", "o", "Lpp/e;", "p", "Lpp/d;", "q", "LKp/g;", "r", "Lcl/d;", "s", "Lqv/K;", "LNu/a;", "t", "LNu/a;", "disposables", "Ltv/A;", "u", "Ltv/A;", "_eventFlow", "Ltv/F;", "v", "Ltv/F;", "A0", "()Ltv/F;", "eventFlow", "Ltv/B;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "w", "Ltv/B;", "_featureFlags", "Ltv/P;", "x", "Ltv/P;", "getFeatureFlags", "()Ltv/P;", "featureFlags", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/j1;", "y", "_detailsFlow", "z", "C0", "productDetailFlow", "Lcom/meijer/mobile/core/model/common/ResourceId;", "A", "Ljava/lang/String;", "cartId", "B", "I", "limitReviews", "C", "getPreviousTrackAction", "g1", "previousTrackAction", "D", "x0", "f1", "campaignIdValue", "E", "Z", "quantityChangeForFBT", "F", "getCarouselIsVisibleEncountered", "()Z", "setCarouselIsVisibleEncountered", "(Z)V", "carouselIsVisibleEncountered", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "G", "actionsFlow", "H", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12208c1 extends androidx.view.c0 implements InterfaceC6015f {

    /* renamed from: I, reason: collision with root package name */
    public static final int f108149I = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int limitReviews;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private String previousTrackAction;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private String campaignIdValue;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean quantityChangeForFBT;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean carouselIsVisibleEncountered;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Map<String, AbstractC12120f.Update>> actionsFlow;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Eq.a favoritesListRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final com.google.firebase.crashlytics.a firebaseCrashlytics;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C16594b beaconClient;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final sp.Y productStateRepository;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C16992a multiChannelProductsStateRepository;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final pp.g suggestionsRepository;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final pp.e sponsorshipsDataStore;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final pp.d productMetadataStore;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Kp.g bazaarVoiceManager;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C6412d couponsRepository;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<G0> _eventFlow;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<G0> eventFlow;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProductDetailFeatureFlags> _featureFlags;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ProductDetailFeatureFlags> featureFlags;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProductDetailsState> _detailsFlow;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ProductDetailsState> productDetailFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$4", f = "ProductDetailViewModel.kt", l = {1048}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$A */
    static final class A extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108183a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15172a f108185c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new A(this.f108185c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(AbstractC15172a abstractC15172a, Continuation<? super A> continuation) {
            super(2, continuation);
            this.f108185c = abstractC15172a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108183a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12208c1 c12208c1 = C12208c1.this;
                mk.c product = ((AbstractC15172a.Remove) this.f108185c).getProduct();
                this.f108183a = 1;
                if (c12208c1.b1(product, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$6", f = "ProductDetailViewModel.kt", l = {1075}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$B */
    static final class B extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108186a;

        B(Continuation<? super B> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new B(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108186a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.RequireLogin requireLogin = new G0.RequireLogin(Bj.o.f3011d);
                this.f108186a = 1;
                if (interfaceC17139A.emit(requireLogin, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$8", f = "ProductDetailViewModel.kt", l = {1100}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$C */
    static final class C extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108188a;

        C(Continuation<? super C> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108188a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.j jVar = G0.j.f107905a;
                this.f108188a = 1;
                if (interfaceC17139A.emit(jVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onSubstitutionResult$1", f = "ProductDetailViewModel.kt", l = {1599, 1600}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$D */
    static final class D extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108190a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m2 f108191b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12208c1 f108192c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(m2 m2Var, C12208c1 c12208c1, Continuation<? super D> continuation) {
            super(2, continuation);
            this.f108191b = m2Var;
            this.f108192c = c12208c1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new D(this.f108191b, this.f108192c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
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
                int r1 = r4.f108190a
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
                goto L52
            L1b:
                kotlin.ResultKt.b(r5)
                com.meijer.mobile.meijer.activity.find.productdetail.m2 r5 = r4.f108191b
                com.meijer.mobile.meijer.activity.find.productdetail.m2$a r1 = com.meijer.mobile.meijer.activity.find.productdetail.m2.a.f107651a
                boolean r1 = kotlin.jvm.internal.Intrinsics.e(r5, r1)
                if (r1 == 0) goto L39
                com.meijer.mobile.meijer.activity.find.viewmodel.c1 r5 = r4.f108192c
                tv.A r5 = com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.c0(r5)
                com.meijer.mobile.meijer.activity.find.viewmodel.G0$e r1 = com.meijer.mobile.meijer.activity.find.viewmodel.G0.e.f107899a
                r4.f108190a = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L52
                goto L51
            L39:
                com.meijer.mobile.meijer.activity.find.productdetail.m2$b r1 = com.meijer.mobile.meijer.activity.find.productdetail.m2.b.f107652a
                boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r1)
                if (r5 == 0) goto L55
                com.meijer.mobile.meijer.activity.find.viewmodel.c1 r5 = r4.f108192c
                tv.A r5 = com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.c0(r5)
                com.meijer.mobile.meijer.activity.find.viewmodel.G0$f r1 = com.meijer.mobile.meijer.activity.find.viewmodel.G0.f.f107900a
                r4.f108190a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L52
            L51:
                return r0
            L52:
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            L55:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.D.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$postError$1", f = "ProductDetailViewModel.kt", l = {899}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$E */
    static final class E extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108193a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G0 f108195c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(G0 g02, Continuation<? super E> continuation) {
            super(2, continuation);
            this.f108195c = g02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new E(this.f108195c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((E) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108193a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0 g02 = this.f108195c;
                this.f108193a = 1;
                if (interfaceC17139A.emit(g02, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {1005}, m = "removeFromFavoriteList")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$F */
    static final class F extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108196a;

        /* renamed from: b, reason: collision with root package name */
        Object f108197b;

        /* renamed from: c, reason: collision with root package name */
        Object f108198c;

        /* renamed from: d, reason: collision with root package name */
        Object f108199d;

        /* renamed from: e, reason: collision with root package name */
        Object f108200e;

        /* renamed from: f, reason: collision with root package name */
        int f108201f;

        /* renamed from: g, reason: collision with root package name */
        int f108202g;

        /* renamed from: h, reason: collision with root package name */
        int f108203h;

        /* renamed from: i, reason: collision with root package name */
        int f108204i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f108205j;

        /* renamed from: l, reason: collision with root package name */
        int f108207l;

        F(Continuation<? super F> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108205j = obj;
            this.f108207l |= Integer.MIN_VALUE;
            return C12208c1.this.b1(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$removeFromFavoriteList$5$1", f = "ProductDetailViewModel.kt", l = {1011}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$G */
    static final class G extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108208a;

        G(Continuation<? super G> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new G(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108208a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = new G0.UpdateShoppingOrFavoriteListFailed(C18570a.f173240h, C18570a.f173242j);
                this.f108208a = 1;
                if (interfaceC17139A.emit(updateShoppingOrFavoriteListFailed, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {969}, m = "removeFromShoppingList")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$H */
    static final class H extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108210a;

        /* renamed from: b, reason: collision with root package name */
        Object f108211b;

        /* renamed from: c, reason: collision with root package name */
        Object f108212c;

        /* renamed from: d, reason: collision with root package name */
        Object f108213d;

        /* renamed from: e, reason: collision with root package name */
        Object f108214e;

        /* renamed from: f, reason: collision with root package name */
        int f108215f;

        /* renamed from: g, reason: collision with root package name */
        int f108216g;

        /* renamed from: h, reason: collision with root package name */
        int f108217h;

        /* renamed from: i, reason: collision with root package name */
        int f108218i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f108219j;

        /* renamed from: l, reason: collision with root package name */
        int f108221l;

        H(Continuation<? super H> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108219j = obj;
            this.f108221l |= Integer.MIN_VALUE;
            return C12208c1.this.c1(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$removeFromShoppingList$5$1", f = "ProductDetailViewModel.kt", l = {975}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$I */
    static final class I extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108222a;

        I(Continuation<? super I> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new I(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((I) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108222a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = new G0.UpdateShoppingOrFavoriteListFailed(C18570a.f173241i, C18570a.f173242j);
                this.f108222a = 1;
                if (interfaceC17139A.emit(updateShoppingOrFavoriteListFailed, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$resetQuantitySteppers$1", f = "ProductDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$J */
    static final class J extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108224a;

        J(Continuation<? super J> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new J(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((J) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ProductDetailsState productDetailsState;
            ArrayList arrayList;
            IntrinsicsKt.f();
            if (this.f108224a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = C12208c1.this._detailsFlow;
            do {
                value = interfaceC17140B.getValue();
                productDetailsState = (ProductDetailsState) value;
                List<SuggestedProductCarouselDecorator> listS = productDetailsState.s();
                if (listS != null) {
                    List<SuggestedProductCarouselDecorator> list = listS;
                    arrayList = new ArrayList(CollectionsKt.x(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(SuggestedProductCarouselDecorator.v((SuggestedProductCarouselDecorator) it.next(), null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, true, null, null, null, false, null, 1023999, null));
                    }
                } else {
                    arrayList = null;
                }
            } while (!interfaceC17140B.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, arrayList, null, null, null, null, 8126463, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$sendCriteoBeacon$1", f = "ProductDetailViewModel.kt", l = {1248}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$K */
    static final class K extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108226a;

        /* renamed from: b, reason: collision with root package name */
        Object f108227b;

        /* renamed from: c, reason: collision with root package name */
        Object f108228c;

        /* renamed from: d, reason: collision with root package name */
        Object f108229d;

        /* renamed from: e, reason: collision with root package name */
        Object f108230e;

        /* renamed from: f, reason: collision with root package name */
        Object f108231f;

        /* renamed from: g, reason: collision with root package name */
        int f108232g;

        /* renamed from: h, reason: collision with root package name */
        int f108233h;

        /* renamed from: i, reason: collision with root package name */
        int f108234i;

        /* renamed from: j, reason: collision with root package name */
        int f108235j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f108236k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<String> f108237l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C12208c1 f108238m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        K(List<String> list, C12208c1 c12208c1, Continuation<? super K> continuation) {
            super(2, continuation);
            this.f108237l = list;
            this.f108238m = c12208c1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            K k10 = new K(this.f108237l, this.f108238m, continuation);
            k10.f108236k = obj;
            return k10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((K) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            InterfaceC16622O interfaceC16622O;
            Iterable iterable;
            C12208c1 c12208c1;
            int i10;
            Iterator it;
            InterfaceC16622O interfaceC16622O2;
            int i11;
            Object objF = IntrinsicsKt.f();
            int i12 = this.f108235j;
            try {
                if (i12 != 0) {
                    if (i12 == 1) {
                        i10 = this.f108233h;
                        i11 = this.f108232g;
                        it = (Iterator) this.f108229d;
                        iterable = (Iterable) this.f108228c;
                        interfaceC16622O2 = (InterfaceC16622O) this.f108227b;
                        c12208c1 = (C12208c1) this.f108226a;
                        interfaceC16622O = (InterfaceC16622O) this.f108236k;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    interfaceC16622O = (InterfaceC16622O) this.f108236k;
                    List<String> list = this.f108237l;
                    C12208c1 c12208c12 = this.f108238m;
                    Result.Companion companion = Result.INSTANCE;
                    List<String> list2 = list;
                    iterable = list2;
                    c12208c1 = c12208c12;
                    i10 = 0;
                    it = list2.iterator();
                    interfaceC16622O2 = interfaceC16622O;
                    i11 = 0;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    String str = (String) next;
                    C16594b c16594b = c12208c1.beaconClient;
                    String strF = Ak.b.f(str);
                    this.f108236k = interfaceC16622O;
                    this.f108226a = c12208c1;
                    this.f108227b = interfaceC16622O2;
                    this.f108228c = iterable;
                    this.f108229d = it;
                    this.f108230e = next;
                    this.f108231f = str;
                    this.f108232g = i11;
                    this.f108233h = i10;
                    this.f108234i = 0;
                    this.f108235j = 1;
                    if (c16594b.a(strF, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qv.E0.i(interfaceC16622O.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    uw.a.INSTANCE.f(thE, "Error sending Criteo beacon", new Object[0]);
                } else {
                    throw thE;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$L */
    /* synthetic */ class L extends AdaptedFunctionReference implements Function1<List<? extends ProductState<ProductFullDetails>>, Unit> {
        L(Object obj) {
            super(1, obj, C12208c1.class, "onProductState", "onProductState(Ljava/util/List;)Lcom/meijer/mobile/product/state/ProductState;", 8);
        }

        public final void a(List<ProductState<ProductFullDetails>> p02) {
            Intrinsics.j(p02, "p0");
            ((C12208c1) this.f142801a).X0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductState<ProductFullDetails>> list) {
            a(list);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$M */
    /* synthetic */ class M extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        M(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$N */
    /* synthetic */ class N extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        N(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$setProduct$5", f = "ProductDetailViewModel.kt", l = {677}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$O */
    static final class O extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108239a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f108241c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new O(this.f108241c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        O(ProductFullDetails productFullDetails, Continuation<? super O> continuation) {
            super(2, continuation);
            this.f108241c = productFullDetails;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((O) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108239a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12208c1 c12208c1 = C12208c1.this;
                ProductFullDetails productFullDetails = this.f108241c;
                this.f108239a = 1;
                if (c12208c1.v0(productFullDetails, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$trackProductAnalytics$1$1$1", f = "ProductDetailViewModel.kt", l = {851}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$P */
    static final class P extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108242a;

        /* renamed from: b, reason: collision with root package name */
        Object f108243b;

        /* renamed from: c, reason: collision with root package name */
        Object f108244c;

        /* renamed from: d, reason: collision with root package name */
        Object f108245d;

        /* renamed from: e, reason: collision with root package name */
        Object f108246e;

        /* renamed from: f, reason: collision with root package name */
        int f108247f;

        /* renamed from: g, reason: collision with root package name */
        int f108248g;

        /* renamed from: h, reason: collision with root package name */
        int f108249h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f108250i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C12208c1 f108251j;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new P(this.f108250i, this.f108251j, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        P(ProductFullDetails productFullDetails, C12208c1 c12208c1, Continuation<? super P> continuation) {
            super(2, continuation);
            this.f108250i = productFullDetails;
            this.f108251j = c12208c1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((P) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Iterable iterable;
            C12208c1 c12208c1;
            int i10;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f108249h;
            if (i11 != 0) {
                if (i11 == 1) {
                    i10 = this.f108247f;
                    it = (Iterator) this.f108244c;
                    c12208c1 = (C12208c1) this.f108243b;
                    iterable = (Iterable) this.f108242a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                List<String> listE = this.f108250i.getBeaconInfo().e();
                C12208c1 c12208c12 = this.f108251j;
                it = listE.iterator();
                iterable = listE;
                c12208c1 = c12208c12;
                i10 = 0;
            }
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                C16594b c16594b = c12208c1.beaconClient;
                String strF = Ak.b.f(str);
                this.f108242a = iterable;
                this.f108243b = c12208c1;
                this.f108244c = it;
                this.f108245d = next;
                this.f108246e = str;
                this.f108247f = i10;
                this.f108248g = 0;
                this.f108249h = 1;
                if (c16594b.a(strF, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$updateCart$1", f = "ProductDetailViewModel.kt", l = {886}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$Q */
    static final class Q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108252a;

        Q(Continuation<? super Q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new Q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((Q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108252a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.RefreshCartOnListPageEvent refreshCartOnListPageEvent = new G0.RefreshCartOnListPageEvent(true);
                this.f108252a = 1;
                if (interfaceC17139A.emit(refreshCartOnListPageEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$validateAccountAccess$1", f = "ProductDetailViewModel.kt", l = {909}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$R */
    static final class R extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108254a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f108256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        R(int i10, Continuation<? super R> continuation) {
            super(2, continuation);
            this.f108256c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new R(this.f108256c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((R) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108254a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.RequireLogin requireLogin = new G0.RequireLogin(this.f108256c);
                this.f108254a = 1;
                if (interfaceC17139A.emit(requireLogin, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$viewInFavoriteList$1", f = "ProductDetailViewModel.kt", l = {924}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$S */
    static final class S extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108257a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mk.c f108259c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new S(this.f108259c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        S(mk.c cVar, Continuation<? super S> continuation) {
            super(2, continuation);
            this.f108259c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((S) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108257a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.ViewOnFavoriteList viewOnFavoriteList = new G0.ViewOnFavoriteList(this.f108259c);
                this.f108257a = 1;
                if (interfaceC17139A.emit(viewOnFavoriteList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$viewInShoppingList$1", f = "ProductDetailViewModel.kt", l = {916}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$T */
    static final class T extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108260a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mk.c f108262c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new T(this.f108262c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        T(mk.c cVar, Continuation<? super T> continuation) {
            super(2, continuation);
            this.f108262c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((T) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108260a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.ViewOnShoppingList viewOnShoppingList = new G0.ViewOnShoppingList(this.f108262c);
                this.f108260a = 1;
                if (interfaceC17139A.emit(viewOnShoppingList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/c1$a;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/c1;)V", "Ltk/c;", "Lej/j;", "changeRes", "", "i", "(Ltk/c;)V", "entryChange", "h", "e", "", "c", "(Ltk/c;)Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lej/C;", "cartResource", "observeCart", "LNu/a;", "getDisposable", "()LNu/a;", "Lur/a;", "processedRequest", "(Lur/a;Ltk/c;)V", "T", "Ltk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Ltk/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a, reason: case insensitive filesystem */
    public final class C12209a implements InterfaceC17847a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1636a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f128931b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f128933d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f128932c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryChange.c.f128934e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartAddition$2", f = "ProductDetailViewModel.kt", l = {447}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108264a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108265b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C12208c1 c12208c1, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f108265b = c12208c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f108265b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108264a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f108265b._eventFlow;
                    G0.ShowError showError = new G0.ShowError(yr.Q.f170963F, yr.Q.f170962E, yr.Q.f170986b);
                    this.f108264a = 1;
                    if (interfaceC17139A.emit(showError, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartAddition$4", f = "ProductDetailViewModel.kt", l = {464, 468}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$c */
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f108266a;

            /* renamed from: b, reason: collision with root package name */
            int f108267b;

            /* renamed from: c, reason: collision with root package name */
            int f108268c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f108269d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108270e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C12208c1 c12208c1, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f108270e = c12208c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f108270e, continuation);
                cVar.f108269d = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
            
                if (wr.f.n(r5, false, false, r11, 3, null) == r0) goto L21;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v13, types: [qv.O] */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v18 */
            /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r11.f108268c
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L27
                    if (r1 != r3) goto L1f
                    java.lang.Object r0 = r11.f108266a
                    qv.O r0 = (qv.InterfaceC16622O) r0
                    java.lang.Object r0 = r11.f108269d
                    r1 = r0
                    qv.O r1 = (qv.InterfaceC16622O) r1
                    kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L1c
                    goto L6b
                L1c:
                    r0 = move-exception
                    r12 = r0
                    goto L72
                L1f:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L27:
                    java.lang.Object r1 = r11.f108269d
                    qv.O r1 = (qv.InterfaceC16622O) r1
                    kotlin.ResultKt.b(r12)
                    goto L4f
                L2f:
                    kotlin.ResultKt.b(r12)
                    java.lang.Object r12 = r11.f108269d
                    qv.O r12 = (qv.InterfaceC16622O) r12
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1 r1 = r11.f108270e
                    tv.A r1 = com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.c0(r1)
                    com.meijer.mobile.meijer.activity.find.viewmodel.G0$n r5 = new com.meijer.mobile.meijer.activity.find.viewmodel.G0$n
                    int r6 = tr.C17135b.f161993P0
                    r5.<init>(r6)
                    r11.f108269d = r12
                    r11.f108268c = r4
                    java.lang.Object r1 = r1.emit(r5, r11)
                    if (r1 != r0) goto L4e
                    goto L6a
                L4e:
                    r1 = r12
                L4f:
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1 r12 = r11.f108270e
                    kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L1c
                    wr.f r5 = com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.O(r12)     // Catch: java.lang.Throwable -> L1c
                    r11.f108269d = r1     // Catch: java.lang.Throwable -> L1c
                    r11.f108266a = r1     // Catch: java.lang.Throwable -> L1c
                    r11.f108267b = r2     // Catch: java.lang.Throwable -> L1c
                    r11.f108268c = r3     // Catch: java.lang.Throwable -> L1c
                    r6 = 0
                    r7 = 0
                    r9 = 3
                    r10 = 0
                    r8 = r11
                    java.lang.Object r12 = wr.f.n(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1c
                    if (r12 != r0) goto L6b
                L6a:
                    return r0
                L6b:
                    kotlin.Unit r12 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L1c
                    java.lang.Object r12 = kotlin.Result.b(r12)     // Catch: java.lang.Throwable -> L1c
                    goto L7c
                L72:
                    kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                    java.lang.Object r12 = kotlin.ResultKt.a(r12)
                    java.lang.Object r12 = kotlin.Result.b(r12)
                L7c:
                    java.lang.Throwable r12 = kotlin.Result.e(r12)
                    if (r12 == 0) goto L98
                    kotlin.coroutines.CoroutineContext r0 = r1.getCoroutineContext()
                    qv.E0.i(r0)
                    boolean r0 = r12 instanceof java.lang.Error
                    if (r0 != 0) goto L97
                    uw.a$a r0 = uw.a.INSTANCE
                    java.lang.String r1 = "fetchLatestCart failed in ProductDetailViewModel"
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r0.l(r12, r1, r2)
                    goto L98
                L97:
                    throw r12
                L98:
                    kotlin.Unit r12 = kotlin.Unit.f142422a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12209a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartAddition$6", f = "ProductDetailViewModel.kt", l = {513}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$d */
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108271a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108272b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ tk.c<EntryChange> f108273c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f108272b, this.f108273c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C12208c1 c12208c1, tk.c<EntryChange> cVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f108272b = c12208c1;
                this.f108273c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108271a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f108272b._eventFlow;
                    int i11 = C17135b.f162019f;
                    int i12 = C17135b.f162001T0;
                    EntryChange entryChange = (EntryChange) ((c.Success) this.f108273c).a();
                    if (entryChange != null) {
                        entry = entryChange.getEntry();
                    } else {
                        entry = null;
                    }
                    G0.AddToCartSuccessEvent addToCartSuccessEvent = new G0.AddToCartSuccessEvent(i11, i12, entry);
                    this.f108271a = 1;
                    if (interfaceC17139A.emit(addToCartSuccessEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartChange$1", f = "ProductDetailViewModel.kt", l = {369}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$e */
        static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108275b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(C12208c1 c12208c1, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f108275b = c12208c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new e(this.f108275b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108274a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f108275b._eventFlow;
                    G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17135b.f161993P0);
                    this.f108274a = 1;
                    if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartChange$2$1", f = "ProductDetailViewModel.kt", l = {HttpResponseStatus.ERROR_EXPECTATION_FAILED}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$f */
        static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108276a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108277b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(C12208c1 c12208c1, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f108277b = c12208c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f108277b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108276a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f108277b._eventFlow;
                    G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17135b.f161993P0);
                    this.f108276a = 1;
                    if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartRemoval$1", f = "ProductDetailViewModel.kt", l = {359}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$g */
        static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108278a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108279b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(C12208c1 c12208c1, Continuation<? super g> continuation) {
                super(2, continuation);
                this.f108279b = c12208c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new g(this.f108279b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108278a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f108279b._eventFlow;
                    G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17135b.f161993P0);
                    this.f108278a = 1;
                    if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$observeCart$1", f = "ProductDetailViewModel.kt", l = {295}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$h */
        static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108280a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108281b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(C12208c1 c12208c1, Continuation<? super h> continuation) {
                super(2, continuation);
                this.f108281b = c12208c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new h(this.f108281b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108280a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f108281b._eventFlow;
                    G0.RefreshCartOnListPageEvent refreshCartOnListPageEvent = new G0.RefreshCartOnListPageEvent(false);
                    this.f108280a = 1;
                    if (interfaceC17139A.emit(refreshCartOnListPageEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$processedRequest$1", f = "ProductDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$i */
        static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108282a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108283b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17302a f108284c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new i(this.f108283b, this.f108284c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(C12208c1 c12208c1, AbstractC17302a abstractC17302a, Continuation<? super i> continuation) {
                super(2, continuation);
                this.f108283b = c12208c1;
                this.f108284c = abstractC17302a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ProductDetailsState productDetailsState;
                ArrayList arrayList;
                IntrinsicsKt.f();
                if (this.f108282a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = this.f108283b._detailsFlow;
                AbstractC17302a abstractC17302a = this.f108284c;
                do {
                    value = interfaceC17140B.getValue();
                    productDetailsState = (ProductDetailsState) value;
                    List<SuggestedProductCarouselDecorator> listS = productDetailsState.s();
                    if (listS != null) {
                        List<SuggestedProductCarouselDecorator> list = listS;
                        arrayList = new ArrayList(CollectionsKt.x(list, 10));
                        for (SuggestedProductCarouselDecorator suggestedProductCarouselDecoratorV : list) {
                            if (Intrinsics.e(suggestedProductCarouselDecoratorV.getProduct().getCode(), abstractC17302a.getProductCode())) {
                                suggestedProductCarouselDecoratorV = SuggestedProductCarouselDecorator.v(suggestedProductCarouselDecoratorV, null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, false, null, null, null, false, null, 1040383, null);
                            }
                            arrayList.add(suggestedProductCarouselDecoratorV);
                        }
                    } else {
                        arrayList = null;
                    }
                } while (!interfaceC17140B.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, arrayList, null, null, null, null, 8126463, null)));
                return Unit.f142422a;
            }
        }

        public C12209a() {
        }

        private final String c(tk.c<EntryChange> entryChange) {
            List<SuggestedProductCarouselDecorator> listS;
            Entry entry;
            ProductFullDetails productFullDetailsM;
            if (C12208c1.this.quantityChangeForFBT && (listS = ((ProductDetailsState) C12208c1.this._detailsFlow.getValue()).s()) != null) {
                Iterator<SuggestedProductCarouselDecorator> it = listS.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    String code = it.next().getProduct().getCode();
                    EntryChange entryChangeA = entryChange.a();
                    if (Intrinsics.e(code, (entryChangeA == null || (entry = entryChangeA.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode())) {
                        break;
                    }
                    i10++;
                }
                Integer numValueOf = Integer.valueOf(i10);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return Integer.valueOf(numValueOf.intValue() + 1).toString();
                }
            }
            return null;
        }

        private final String d() {
            return C12208c1.this.quantityChangeForFBT ? "edaa - Frequently Bought Together" : "product details page";
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void e(tk.c<ej.EntryChange> r81) {
            /*
                Method dump skipped, instructions count: 531
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12209a.e(tk.c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(TrackingData track) {
            Intrinsics.j(track, "$this$track");
            track.h("errorMessage", "add to cart error");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(TrackingData track) {
            Intrinsics.j(track, "$this$track");
            track.h("errorMessage", "add to cart error");
            return Unit.f142422a;
        }

        private final void h(tk.c<EntryChange> entryChange) {
            Entry entry;
            ProductFullDetails productFullDetailsM;
            ProductFullDetails productFullDetailsM2;
            ProductSponsorship productSponsorshipA = null;
            if (entryChange instanceof c.Failure) {
                C16648k.d(androidx.view.d0.a(C12208c1.this), null, null, new e(C12208c1.this, null), 3, null);
            }
            W.ComplexPromo complexPromoZ0 = C12208c1.this.z0();
            EntryChange entryChangeA = entryChange.a();
            if (entryChangeA != null) {
                C12208c1 c12208c1 = C12208c1.this;
                pp.d dVar = c12208c1.productMetadataStore;
                Entry entry2 = entryChangeA.getEntry();
                boolean zC = dVar.c((entry2 == null || (productFullDetailsM2 = entry2.m()) == null) ? null : productFullDetailsM2.getCode());
                int i10 = C1636a.$EnumSwitchMapping$0[entryChangeA.getStatusCode().ordinal()];
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    C16648k.d(androidx.view.d0.a(c12208c1), null, null, new f(c12208c1, null), 3, null);
                } else if (entryChangeA.getExpectedQuantityChange() >= 0.0d) {
                    if (entryChangeA.getExpectedQuantityChange() > 0.0d) {
                        c12208c1.analyticsEngine.e(C2930u.f1407a.Y(c12208c1.cartId, c12208c1.getCampaignIdValue(), entryChangeA, c(entryChange), entryChange, c12208c1.sponsorshipsDataStore, d(), complexPromoZ0, zC));
                    }
                } else {
                    EntryChange entryChangeA2 = entryChange.a();
                    if (entryChangeA2 != null && (entry = entryChangeA2.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                        productSponsorshipA = c12208c1.sponsorshipsDataStore.a(productFullDetailsM.getCode());
                    }
                    c12208c1.analyticsEngine.e(C2930u.f1407a.a0(c12208c1.cartId, entryChangeA, zC, c(entryChange), productSponsorshipA, d()));
                }
            }
        }

        @Override // wr.InterfaceC17847a
        /* renamed from: getDisposable */
        public Nu.a getCompositeDisposable() {
            return C12208c1.this.disposables;
        }

        @Override // wr.InterfaceC17847a
        public void observeCart(tk.c<ShoppingCart> cartResource) {
            if (Intrinsics.e(((ProductDetailsState) C12208c1.this._detailsFlow.getValue()).getProduct(), new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null))) {
                C16648k.d(androidx.view.d0.a(C12208c1.this), null, null, new h(C12208c1.this, null), 3, null);
            }
        }

        @Override // wr.InterfaceC17847a
        public void processedRequest(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (entryChange instanceof c.Failure) {
                C12208c1.this.d1();
            } else if (entryChange instanceof c.Success) {
                C16648k.d(androidx.view.d0.a(C12208c1.this), null, null, new i(C12208c1.this, processedRequest, null), 3, null);
            }
            if (processedRequest instanceof AbstractC17302a.Add) {
                e(entryChange);
                return;
            }
            if (processedRequest instanceof AbstractC17302a.Update) {
                h(entryChange);
            } else if (processedRequest instanceof AbstractC17302a.Remove) {
                i(entryChange);
            } else if (!Intrinsics.e(processedRequest, AbstractC17302a.b.f163256b)) {
                throw new NoWhenBranchMatchedException();
            }
        }

        @Override // wr.InterfaceC17847a
        public <T> void throwChallenge(AbstractC17116a<AbstractC17604a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17604a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17604a abstractC17604aF = challenge.f();
            Intrinsics.h(abstractC17604aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            wr.f.B(C12208c1.this.cartInteractor, new AbstractC17116a.Accept(((AbstractC17604a.ChokingHazardChallenge) abstractC17604aF).a().b(), null, null, 4, null), false, null, 6, null);
        }

        private final void i(tk.c<EntryChange> changeRes) {
            ProductSponsorship productSponsorshipA;
            Entry entry;
            ProductFullDetails productFullDetailsM;
            Entry entry2;
            ProductFullDetails productFullDetailsM2;
            EntryChange entryChangeA = changeRes.a();
            String code = null;
            if (entryChangeA == null || !entryChangeA.h()) {
                C16648k.d(androidx.view.d0.a(C12208c1.this), null, null, new g(C12208c1.this, null), 3, null);
                return;
            }
            EntryChange entryChangeA2 = changeRes.a();
            if (entryChangeA2 != null && (entry2 = entryChangeA2.getEntry()) != null && (productFullDetailsM2 = entry2.m()) != null) {
                productSponsorshipA = C12208c1.this.sponsorshipsDataStore.a(productFullDetailsM2.getCode());
            } else {
                productSponsorshipA = null;
            }
            InterfaceC14261a interfaceC14261a = C12208c1.this.analyticsEngine;
            C2930u c2930u = C2930u.f1407a;
            String str = C12208c1.this.cartId;
            pp.d dVar = C12208c1.this.productMetadataStore;
            EntryChange entryChangeA3 = changeRes.a();
            if (entryChangeA3 != null && (entry = entryChangeA3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                code = productFullDetailsM.getCode();
            }
            interfaceC14261a.e(c2930u.c0(str, dVar.c(code), changeRes.a(), c(changeRes), productSponsorshipA, d()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$c, reason: case insensitive filesystem */
    public /* synthetic */ class C12211c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EntryChange.c.values().length];
            try {
                iArr[EntryChange.c.f128931b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntryChange.c.f128933d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntryChange.c.f128932c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EntryChange.c.f128934e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {986}, m = "addToFavoriteList")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$d, reason: case insensitive filesystem */
    static final class C12212d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108285a;

        /* renamed from: b, reason: collision with root package name */
        Object f108286b;

        /* renamed from: c, reason: collision with root package name */
        Object f108287c;

        /* renamed from: d, reason: collision with root package name */
        Object f108288d;

        /* renamed from: e, reason: collision with root package name */
        Object f108289e;

        /* renamed from: f, reason: collision with root package name */
        int f108290f;

        /* renamed from: g, reason: collision with root package name */
        int f108291g;

        /* renamed from: h, reason: collision with root package name */
        int f108292h;

        /* renamed from: i, reason: collision with root package name */
        int f108293i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f108294j;

        /* renamed from: l, reason: collision with root package name */
        int f108296l;

        C12212d(Continuation<? super C12212d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108294j = obj;
            this.f108296l |= Integer.MIN_VALUE;
            return C12208c1.this.j0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$addToFavoriteList$4$1", f = "ProductDetailViewModel.kt", l = {989}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$e, reason: case insensitive filesystem */
    static final class C12213e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108297a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mk.c f108299c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C12213e(this.f108299c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12213e(mk.c cVar, Continuation<? super C12213e> continuation) {
            super(2, continuation);
            this.f108299c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12213e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108297a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.FavoriteListItemAdded favoriteListItemAdded = new G0.FavoriteListItemAdded(this.f108299c);
                this.f108297a = 1;
                if (interfaceC17139A.emit(favoriteListItemAdded, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$addToFavoriteList$5$1", f = "ProductDetailViewModel.kt", l = {994}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$f, reason: case insensitive filesystem */
    static final class C12214f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108300a;

        C12214f(Continuation<? super C12214f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C12214f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12214f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108300a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = new G0.UpdateShoppingOrFavoriteListFailed(C18570a.f173233a, C18570a.f173236d);
                this.f108300a = 1;
                if (interfaceC17139A.emit(updateShoppingOrFavoriteListFailed, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {932}, m = "addToShoppingList")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$g, reason: case insensitive filesystem */
    static final class C12215g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108302a;

        /* renamed from: b, reason: collision with root package name */
        Object f108303b;

        /* renamed from: c, reason: collision with root package name */
        Object f108304c;

        /* renamed from: d, reason: collision with root package name */
        Object f108305d;

        /* renamed from: e, reason: collision with root package name */
        Object f108306e;

        /* renamed from: f, reason: collision with root package name */
        int f108307f;

        /* renamed from: g, reason: collision with root package name */
        int f108308g;

        /* renamed from: h, reason: collision with root package name */
        int f108309h;

        /* renamed from: i, reason: collision with root package name */
        int f108310i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f108311j;

        /* renamed from: l, reason: collision with root package name */
        int f108313l;

        C12215g(Continuation<? super C12215g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108311j = obj;
            this.f108313l |= Integer.MIN_VALUE;
            return C12208c1.this.k0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$addToShoppingList$4$1", f = "ProductDetailViewModel.kt", l = {936}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$h, reason: case insensitive filesystem */
    static final class C12216h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108314a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mk.c f108316c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C12216h(this.f108316c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12216h(mk.c cVar, Continuation<? super C12216h> continuation) {
            super(2, continuation);
            this.f108316c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12216h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108314a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.ShoppingListItemAdded shoppingListItemAdded = new G0.ShoppingListItemAdded(this.f108316c);
                this.f108314a = 1;
                if (interfaceC17139A.emit(shoppingListItemAdded, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$addToShoppingList$5$1", f = "ProductDetailViewModel.kt", l = {948}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$i, reason: case insensitive filesystem */
    static final class C12217i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108317a;

        C12217i(Continuation<? super C12217i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C12217i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12217i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108317a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = new G0.UpdateShoppingOrFavoriteListFailed(C18570a.f173235c, C18570a.f173236d);
                this.f108317a = 1;
                if (interfaceC17139A.emit(updateShoppingOrFavoriteListFailed, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$fetchBazaarVoiceReviews$1", f = "ProductDetailViewModel.kt", l = {796}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$j, reason: case insensitive filesystem */
    static final class C12218j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108319a;

        /* renamed from: b, reason: collision with root package name */
        int f108320b;

        /* renamed from: c, reason: collision with root package name */
        int f108321c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f108322d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f108324f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12218j(String str, Continuation<? super C12218j> continuation) {
            super(2, continuation);
            this.f108324f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12218j c12218j = C12208c1.this.new C12218j(this.f108324f, continuation);
            c12218j.f108322d = obj;
            return c12218j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12218j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object value3;
            Object objC;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108321c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC16622O) this.f108322d;
                    InterfaceC17140B interfaceC17140B = C12208c1.this._detailsFlow;
                    do {
                        value3 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value3, ProductDetailsState.d((ProductDetailsState) value3, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, r.f108962c, null, null, null, 7864319, null)));
                    C12208c1 c12208c1 = C12208c1.this;
                    String str = this.f108324f;
                    Result.Companion companion = Result.INSTANCE;
                    Kp.g gVar = c12208c1.bazaarVoiceManager;
                    int i11 = c12208c1.limitReviews;
                    this.f108322d = r23;
                    this.f108319a = r23;
                    this.f108320b = 0;
                    this.f108321c = 1;
                    objC = gVar.c(str, i11, this);
                    i10 = r23;
                    if (objC == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC16622O) this.f108322d;
                    ResultKt.b(obj);
                    objC = obj;
                    i10 = r24;
                }
                objB = Result.b((ProductReviewFullDetails) objC);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            C12208c1 c12208c12 = C12208c1.this;
            if (Result.h(objB)) {
                ProductReviewFullDetails productReviewFullDetails = (ProductReviewFullDetails) objB;
                InterfaceC17140B interfaceC17140B2 = c12208c12._detailsFlow;
                do {
                    value2 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value2, ProductDetailsState.d((ProductDetailsState) value2, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, r.f108960a, productReviewFullDetails, null, null, 6815743, null)));
            }
            C12208c1 c12208c13 = C12208c1.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qv.E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                InterfaceC17140B interfaceC17140B3 = c12208c13._detailsFlow;
                do {
                    value = interfaceC17140B3.getValue();
                } while (!interfaceC17140B3.e(value, ProductDetailsState.d((ProductDetailsState) value, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, r.f108961b, null, null, null, 7864319, null)));
                uw.a.INSTANCE.f(thE, "ProductDisplayPage: Failed to get bulk ratings", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$fetchFeedbackSubmission$1", f = "ProductDetailViewModel.kt", l = {818}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$k, reason: case insensitive filesystem */
    static final class C12219k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108325a;

        /* renamed from: b, reason: collision with root package name */
        int f108326b;

        /* renamed from: c, reason: collision with root package name */
        int f108327c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f108328d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f108330f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Kp.a f108331g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$fetchFeedbackSubmission$1$3$1", f = "ProductDetailViewModel.kt", l = {829}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$k$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108332a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108333b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Kp.a f108334c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f108333b, this.f108334c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12208c1 c12208c1, Kp.a aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f108333b = c12208c1;
                this.f108334c = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108332a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f108333b._eventFlow;
                    G0.FeedbackSubmissionEvent feedbackSubmissionEvent = new G0.FeedbackSubmissionEvent(true, this.f108334c);
                    this.f108332a = 1;
                    if (interfaceC17139A.emit(feedbackSubmissionEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12219k c12219k = C12208c1.this.new C12219k(this.f108330f, this.f108331g, continuation);
            c12219k.f108328d = obj;
            return c12219k;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12219k(String str, Kp.a aVar, Continuation<? super C12219k> continuation) {
            super(2, continuation);
            this.f108330f = str;
            this.f108331g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12219k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108327c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC16622O) this.f108328d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC16622O) this.f108328d;
                    C12208c1 c12208c1 = C12208c1.this;
                    String str = this.f108330f;
                    Kp.a aVar = this.f108331g;
                    Result.Companion companion = Result.INSTANCE;
                    Kp.g gVar = c12208c1.bazaarVoiceManager;
                    this.f108328d = r14;
                    this.f108325a = r14;
                    this.f108326b = 0;
                    this.f108327c = 1;
                    i10 = r14;
                    if (gVar.d(str, aVar, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qv.E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    uw.a.INSTANCE.f(thE, "submitFeedback: Failed to get submitFeedback", new Object[0]);
                } else {
                    throw thE;
                }
            }
            C12208c1 c12208c12 = C12208c1.this;
            Kp.a aVar2 = this.f108331g;
            if (Result.h(objB)) {
                C16648k.d(androidx.view.d0.a(c12208c12), null, null, new a(c12208c12, aVar2, null), 3, null);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$fetchFrequentlyBoughtTogetherProducts$2", f = "ProductDetailViewModel.kt", l = {726, 730}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$l, reason: case insensitive filesystem */
    static final class C12220l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108335a;

        /* renamed from: b, reason: collision with root package name */
        Object f108336b;

        /* renamed from: c, reason: collision with root package name */
        Object f108337c;

        /* renamed from: d, reason: collision with root package name */
        Object f108338d;

        /* renamed from: e, reason: collision with root package name */
        int f108339e;

        /* renamed from: f, reason: collision with root package name */
        int f108340f;

        /* renamed from: g, reason: collision with root package name */
        int f108341g;

        /* renamed from: h, reason: collision with root package name */
        int f108342h;

        /* renamed from: i, reason: collision with root package name */
        int f108343i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f108344j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ mk.f f108346l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12220l c12220l = C12208c1.this.new C12220l(this.f108346l, continuation);
            c12220l.f108344j = obj;
            return c12220l;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12220l(mk.f fVar, Continuation<? super C12220l> continuation) {
            super(2, continuation);
            this.f108346l = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12220l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
        
            if (r2 == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instructions count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12220l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {779}, m = "fetchProduct")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$m, reason: case insensitive filesystem */
    static final class C12221m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108347a;

        /* renamed from: b, reason: collision with root package name */
        Object f108348b;

        /* renamed from: c, reason: collision with root package name */
        int f108349c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f108350d;

        /* renamed from: f, reason: collision with root package name */
        int f108352f;

        C12221m(Continuation<? super C12221m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108350d = obj;
            this.f108352f |= Integer.MIN_VALUE;
            return C12208c1.this.v0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartAddition$2", f = "ProductDetailViewModel.kt", l = {1481}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$n, reason: case insensitive filesystem */
    static final class C12222n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108353a;

        C12222n(Continuation<? super C12222n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C12222n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12222n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108353a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.ShowError showError = new G0.ShowError(yr.Q.f170963F, yr.Q.f170962E, yr.Q.f170986b);
                this.f108353a = 1;
                if (interfaceC17139A.emit(showError, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartAddition$4", f = "ProductDetailViewModel.kt", l = {1498, 1502}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$o, reason: case insensitive filesystem */
    static final class C12223o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108355a;

        /* renamed from: b, reason: collision with root package name */
        int f108356b;

        /* renamed from: c, reason: collision with root package name */
        int f108357c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f108358d;

        C12223o(Continuation<? super C12223o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12223o c12223o = C12208c1.this.new C12223o(continuation);
            c12223o.f108358d = obj;
            return c12223o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12223o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        
            if (wr.f.n(r5, false, false, r11, 3, null) == r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f108357c
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 != r3) goto L1f
                java.lang.Object r0 = r11.f108355a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r11.f108358d
                r1 = r0
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L1c
                goto L6b
            L1c:
                r0 = move-exception
                r12 = r0
                goto L72
            L1f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L27:
                java.lang.Object r1 = r11.f108358d
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r12)
                goto L4f
            L2f:
                kotlin.ResultKt.b(r12)
                java.lang.Object r12 = r11.f108358d
                qv.O r12 = (qv.InterfaceC16622O) r12
                com.meijer.mobile.meijer.activity.find.viewmodel.c1 r1 = com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.this
                tv.A r1 = com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.c0(r1)
                com.meijer.mobile.meijer.activity.find.viewmodel.G0$n r5 = new com.meijer.mobile.meijer.activity.find.viewmodel.G0$n
                int r6 = tr.C17135b.f161993P0
                r5.<init>(r6)
                r11.f108358d = r12
                r11.f108357c = r4
                java.lang.Object r1 = r1.emit(r5, r11)
                if (r1 != r0) goto L4e
                goto L6a
            L4e:
                r1 = r12
            L4f:
                com.meijer.mobile.meijer.activity.find.viewmodel.c1 r12 = com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L1c
                wr.f r5 = com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.O(r12)     // Catch: java.lang.Throwable -> L1c
                r11.f108358d = r1     // Catch: java.lang.Throwable -> L1c
                r11.f108355a = r1     // Catch: java.lang.Throwable -> L1c
                r11.f108356b = r2     // Catch: java.lang.Throwable -> L1c
                r11.f108357c = r3     // Catch: java.lang.Throwable -> L1c
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = wr.f.n(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1c
                if (r12 != r0) goto L6b
            L6a:
                return r0
            L6b:
                kotlin.Unit r12 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r12 = kotlin.Result.b(r12)     // Catch: java.lang.Throwable -> L1c
                goto L7c
            L72:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r12 = kotlin.ResultKt.a(r12)
                java.lang.Object r12 = kotlin.Result.b(r12)
            L7c:
                java.lang.Throwable r12 = kotlin.Result.e(r12)
                if (r12 == 0) goto L98
                kotlin.coroutines.CoroutineContext r0 = r1.getCoroutineContext()
                qv.E0.i(r0)
                boolean r0 = r12 instanceof java.lang.Error
                if (r0 != 0) goto L97
                uw.a$a r0 = uw.a.INSTANCE
                java.lang.String r1 = "fetchLatestCart failed in ProductDetailViewModel"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.l(r12, r1, r2)
                goto L98
            L97:
                throw r12
            L98:
                kotlin.Unit r12 = kotlin.Unit.f142422a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12223o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartAddition$6", f = "ProductDetailViewModel.kt", l = {1547}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$p, reason: case insensitive filesystem */
    static final class C12224p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108360a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ tk.c<EntryChange> f108362c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C12224p(this.f108362c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12224p(tk.c<EntryChange> cVar, Continuation<? super C12224p> continuation) {
            super(2, continuation);
            this.f108362c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12224p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Entry entry;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108360a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                int i11 = C17135b.f162019f;
                int i12 = C17135b.f162001T0;
                EntryChange entryChange = (EntryChange) ((c.Success) this.f108362c).a();
                if (entryChange != null) {
                    entry = entryChange.getEntry();
                } else {
                    entry = null;
                }
                G0.AddToCartSuccessEvent addToCartSuccessEvent = new G0.AddToCartSuccessEvent(i11, i12, entry);
                this.f108360a = 1;
                if (interfaceC17139A.emit(addToCartSuccessEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartChange$1", f = "ProductDetailViewModel.kt", l = {1404}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$q, reason: case insensitive filesystem */
    static final class C12225q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108363a;

        C12225q(Continuation<? super C12225q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C12225q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12225q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108363a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17135b.f161993P0);
                this.f108363a = 1;
                if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartChange$2$1", f = "ProductDetailViewModel.kt", l = {1451}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$r, reason: case insensitive filesystem */
    static final class C12226r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108365a;

        C12226r(Continuation<? super C12226r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C12226r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12226r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108365a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17135b.f161993P0);
                this.f108365a = 1;
                if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartRemoval$1", f = "ProductDetailViewModel.kt", l = {1394}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$s, reason: case insensitive filesystem */
    static final class C12227s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108367a;

        C12227s(Continuation<? super C12227s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new C12227s(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12227s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108367a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C12208c1.this._eventFlow;
                G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17135b.f161993P0);
                this.f108367a = 1;
                if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$t, reason: case insensitive filesystem */
    public static final class C12228t implements InterfaceC17152f<ProductDetailsState> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f108369a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f108370a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$loadSponsoredProducts$$inlined$filter$1$2", f = "ProductDetailViewModel.kt", l = {50}, m = "emit")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a, reason: collision with other inner class name */
            public static final class C1637a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f108371a;

                /* renamed from: b, reason: collision with root package name */
                int f108372b;

                /* renamed from: c, reason: collision with root package name */
                Object f108373c;

                /* renamed from: d, reason: collision with root package name */
                Object f108374d;

                /* renamed from: f, reason: collision with root package name */
                Object f108376f;

                /* renamed from: g, reason: collision with root package name */
                Object f108377g;

                /* renamed from: h, reason: collision with root package name */
                int f108378h;

                public C1637a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f108371a = obj;
                    this.f108372b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f108370a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12228t.a.C1637a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12228t.a.C1637a) r0
                    int r1 = r0.f108372b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f108372b = r1
                    goto L18
                L13:
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f108371a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f108372b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f108377g
                    tv.g r5 = (tv.InterfaceC17153g) r5
                    java.lang.Object r5 = r0.f108374d
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12228t.a.C1637a) r5
                    kotlin.ResultKt.b(r6)
                    goto L63
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    tv.g r6 = r4.f108370a
                    r2 = r5
                    com.meijer.mobile.meijer.activity.find.viewmodel.j1 r2 = (com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsState) r2
                    Co.h r2 = r2.getProduct()
                    java.lang.String r2 = r2.getDepartment()
                    int r2 = r2.length()
                    if (r2 <= 0) goto L63
                    r0.f108373c = r5
                    r0.f108374d = r0
                    r0.f108376f = r5
                    r0.f108377g = r6
                    r2 = 0
                    r0.f108378h = r2
                    r0.f108372b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L63
                    return r1
                L63:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12228t.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C12228t(InterfaceC17152f interfaceC17152f) {
            this.f108369a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super ProductDetailsState> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f108369a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {752, 755}, m = "loadSponsoredProducts")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$u */
    static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108379a;

        /* renamed from: b, reason: collision with root package name */
        Object f108380b;

        /* renamed from: c, reason: collision with root package name */
        Object f108381c;

        /* renamed from: d, reason: collision with root package name */
        Object f108382d;

        /* renamed from: e, reason: collision with root package name */
        Object f108383e;

        /* renamed from: f, reason: collision with root package name */
        Object f108384f;

        /* renamed from: g, reason: collision with root package name */
        int f108385g;

        /* renamed from: h, reason: collision with root package name */
        int f108386h;

        /* renamed from: i, reason: collision with root package name */
        int f108387i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f108388j;

        /* renamed from: l, reason: collision with root package name */
        int f108390l;

        u(Continuation<? super u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108388j = obj;
            this.f108390l |= Integer.MIN_VALUE;
            return C12208c1.this.I0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$observeCartChangeUpdates$1", f = "ProductDetailViewModel.kt", l = {242}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$v */
    static final class v extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108391a;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ltk/c;", "Lej/j;", "entry", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/f$a;", "actions", "Lkotlin/Pair;", "<anonymous>", "(Ltk/c;Ljava/util/Map;)Lkotlin/Pair;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$observeCartChangeUpdates$1$1", f = "ProductDetailViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$v$a */
        static final class a extends SuspendLambda implements Function3<tk.c<EntryChange>, Map<String, ? extends AbstractC12120f.Update>, Continuation<? super Pair<? extends tk.c<EntryChange>, ? extends AbstractC12120f.Update>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108393a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f108394b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f108395c;

            a(Continuation<? super a> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(tk.c<EntryChange> cVar, Map<String, AbstractC12120f.Update> map, Continuation<? super Pair<? extends tk.c<EntryChange>, AbstractC12120f.Update>> continuation) {
                a aVar = new a(continuation);
                aVar.f108394b = cVar;
                aVar.f108395c = map;
                return aVar.invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String strH2;
                mk.i productQuantity;
                IntrinsicsKt.f();
                if (this.f108393a == 0) {
                    ResultKt.b(obj);
                    tk.c cVar = (tk.c) this.f108394b;
                    Map map = (Map) this.f108395c;
                    EntryChange entryChange = (EntryChange) cVar.a();
                    if (entryChange != null && (productQuantity = entryChange.getProductQuantity()) != null) {
                        strH2 = productQuantity.h2();
                    } else {
                        strH2 = null;
                    }
                    return TuplesKt.a(cVar, map.get(strH2));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new v(continuation);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$v$b */
        static final class b<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12208c1 f108396a;

            b(C12208c1 c12208c1) {
                this.f108396a = c12208c1;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair<? extends tk.c<EntryChange>, AbstractC12120f.Update> pair, Continuation<? super Unit> continuation) {
                Double dB;
                mk.i productQuantity;
                tk.c<EntryChange> cVarA = pair.a();
                AbstractC12120f.Update updateB = pair.b();
                if (updateB != null) {
                    double quantity = updateB.getNewProductQuantity().getQuantity();
                    EntryChange entryChangeA = cVarA.a();
                    if (entryChangeA != null && (productQuantity = entryChangeA.getProductQuantity()) != null) {
                        dB = Boxing.b(productQuantity.getQuantity());
                    } else {
                        dB = null;
                    }
                    if (Intrinsics.a(quantity, dB)) {
                        this.f108396a.W0(updateB, cVarA);
                    }
                }
                return Unit.f142422a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108391a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fF = C17154h.F(C12208c1.this.cartRepository.O(), C12208c1.this.actionsFlow, new a(null));
                b bVar = new b(C12208c1.this);
                this.f108391a = 1;
                if (interfaceC17152fF.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$w */
    /* synthetic */ class w extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        w(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$1", f = "ProductDetailViewModel.kt", l = {1029}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$x */
    static final class x extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108397a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15173b f108399c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new x(this.f108399c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(AbstractC15173b abstractC15173b, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f108399c = abstractC15173b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108397a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12208c1 c12208c1 = C12208c1.this;
                mk.c product = ((AbstractC15173b.Add) this.f108399c).getProduct();
                this.f108397a = 1;
                if (c12208c1.k0(product, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$2", f = "ProductDetailViewModel.kt", l = {1035}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$y */
    static final class y extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108400a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15173b f108402c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new y(this.f108402c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(AbstractC15173b abstractC15173b, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f108402c = abstractC15173b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108400a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12208c1 c12208c1 = C12208c1.this;
                mk.c product = ((AbstractC15173b.Remove) this.f108402c).getProduct();
                this.f108400a = 1;
                if (c12208c1.c1(product, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$3", f = "ProductDetailViewModel.kt", l = {1045}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$z */
    static final class z extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108403a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15172a f108405c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12208c1.this.new z(this.f108405c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(AbstractC15172a abstractC15172a, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f108405c = abstractC15172a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108403a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12208c1 c12208c1 = C12208c1.this;
                mk.c product = ((AbstractC15172a.Add) this.f108405c).getProduct();
                this.f108403a = 1;
                if (c12208c1.j0(product, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public C12208c1(Ro.c productsRepository, hl.m cartRepository, Tq.j storeProvider, yo.k userManager, Eq.a favoritesListRepository, Eq.b shoppingListRepository, wr.f cartInteractor, com.google.firebase.crashlytics.a firebaseCrashlytics, yl.k featureManager, InterfaceC14261a analyticsEngine, C16594b beaconClient, sp.Y productStateRepository, C16992a multiChannelProductsStateRepository, pp.g suggestionsRepository, pp.e sponsorshipsDataStore, pp.d productMetadataStore, Kp.g bazaarVoiceManager, C6412d couponsRepository, AbstractC16618K ioDispatcher) {
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(favoritesListRepository, "favoritesListRepository");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(firebaseCrashlytics, "firebaseCrashlytics");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(beaconClient, "beaconClient");
        Intrinsics.j(productStateRepository, "productStateRepository");
        Intrinsics.j(multiChannelProductsStateRepository, "multiChannelProductsStateRepository");
        Intrinsics.j(suggestionsRepository, "suggestionsRepository");
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(productMetadataStore, "productMetadataStore");
        Intrinsics.j(bazaarVoiceManager, "bazaarVoiceManager");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.productsRepository = productsRepository;
        this.cartRepository = cartRepository;
        this.storeProvider = storeProvider;
        this.userManager = userManager;
        this.favoritesListRepository = favoritesListRepository;
        this.shoppingListRepository = shoppingListRepository;
        this.cartInteractor = cartInteractor;
        this.firebaseCrashlytics = firebaseCrashlytics;
        this.featureManager = featureManager;
        this.analyticsEngine = analyticsEngine;
        this.beaconClient = beaconClient;
        this.productStateRepository = productStateRepository;
        this.multiChannelProductsStateRepository = multiChannelProductsStateRepository;
        this.suggestionsRepository = suggestionsRepository;
        this.sponsorshipsDataStore = sponsorshipsDataStore;
        this.productMetadataStore = productMetadataStore;
        this.bazaarVoiceManager = bazaarVoiceManager;
        this.couponsRepository = couponsRepository;
        this.ioDispatcher = ioDispatcher;
        this.disposables = new Nu.a();
        InterfaceC17139A<G0> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC17139AB;
        this.eventFlow = C17154h.b(interfaceC17139AB);
        InterfaceC17140B<ProductDetailFeatureFlags> interfaceC17140BA = tv.S.a(new ProductDetailFeatureFlags(false, false, false, false, false, false, false, false, l3.f92484c, null));
        this._featureFlags = interfaceC17140BA;
        this.featureFlags = C17154h.c(interfaceC17140BA);
        ProductFullDetails productFullDetails = new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null);
        InterfaceC17140B<ProductDetailsState> interfaceC17140BA2 = tv.S.a(new ProductDetailsState(productFullDetails, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, null, null, 8388606, null));
        this._detailsFlow = interfaceC17140BA2;
        this.productDetailFlow = C17154h.c(interfaceC17140BA2);
        this.cartId = "-1";
        this.limitReviews = 5;
        this.actionsFlow = tv.S.a(MapsKt.k());
        P0();
        K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ProductState<ProductFullDetails>> J0(List<ProductState<ProductFullDetails>> productState) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : productState) {
            if (((ProductFullDetails) ((ProductState) obj).g()).F()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return productState;
        }
        productState.removeAll(arrayList);
        List listB1 = CollectionsKt.b1(arrayList, 2);
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            R0(new AbstractC12200a.OnLoadCriteoBeacon((ProductFullDetails) ((ProductState) it.next()).g()));
        }
        List listP = CollectionsKt.p(1, 4);
        int size = listB1.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (i10 < listP.size()) {
                int iIntValue = ((Number) listP.get(i10)).intValue();
                if (iIntValue > productState.size()) {
                    productState.addAll(listB1.subList(i10, listB1.size()));
                    break;
                }
                productState.add(iIntValue, listB1.get(i10));
            }
            i10++;
        }
        return CollectionsKt.j1(productState);
    }

    private final String B0() {
        return this.quantityChangeForFBT ? "edaa - Frequently Bought Together" : "product details page";
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void D0(tk.c<ej.EntryChange> r81) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.D0(tk.c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("errorMessage", "add to cart error");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("errorMessage", "add to cart error");
        return Unit.f142422a;
    }

    private final void G0(tk.c<EntryChange> entryChange) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        ProductFullDetails productFullDetailsM2;
        ProductSponsorship productSponsorshipA = null;
        if (entryChange instanceof c.Failure) {
            C16648k.d(androidx.view.d0.a(this), null, null, new C12225q(null), 3, null);
        }
        W.ComplexPromo complexPromoZ0 = z0();
        EntryChange entryChangeA = entryChange.a();
        if (entryChangeA != null) {
            pp.d dVar = this.productMetadataStore;
            Entry entry2 = entryChangeA.getEntry();
            boolean zC = dVar.c((entry2 == null || (productFullDetailsM2 = entry2.m()) == null) ? null : productFullDetailsM2.getCode());
            int i10 = C12211c.$EnumSwitchMapping$0[entryChangeA.getStatusCode().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                C16648k.d(androidx.view.d0.a(this), null, null, new C12226r(null), 3, null);
            } else if (entryChangeA.getExpectedQuantityChange() >= 0.0d) {
                if (entryChangeA.getExpectedQuantityChange() > 0.0d) {
                    this.analyticsEngine.e(C2930u.f1407a.Y(this.cartId, this.campaignIdValue, entryChangeA, y0(entryChange), entryChange, this.sponsorshipsDataStore, B0(), complexPromoZ0, zC));
                }
            } else {
                EntryChange entryChangeA2 = entryChange.a();
                if (entryChangeA2 != null && (entry = entryChangeA2.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                    productSponsorshipA = this.sponsorshipsDataStore.a(productFullDetailsM.getCode());
                }
                this.analyticsEngine.e(C2930u.f1407a.a0(this.cartId, entryChangeA, zC, y0(entryChange), productSponsorshipA, B0()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r13 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(mk.f r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.I0(mk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void L0() {
        io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().subscribeOn(C14764a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.T0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12208c1.M0(this.f108102a, (Integer) obj);
            }
        };
        Pu.g<? super Integer> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.U0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12208c1.N0(function1, obj);
            }
        };
        final w wVar = new w(uw.a.INSTANCE);
        Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.V0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12208c1.O0(wVar, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M0(C12208c1 c12208c1, Integer num) {
        ProductDetailsState value;
        InterfaceC17140B<ProductDetailsState> interfaceC17140B = c12208c1._detailsFlow;
        do {
            value = interfaceC17140B.getValue();
            Intrinsics.g(num);
        } while (!interfaceC17140B.e(value, ProductDetailsState.d(value, null, null, null, null, null, 0, null, false, null, null, null, num.intValue(), null, null, null, false, false, null, null, null, null, null, null, 8386559, null)));
        return Unit.f142422a;
    }

    private final void P0() {
        if (this.userManager.b()) {
            this.cartInteractor.q(false, new C12209a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sp.ProductState<Co.ProductFullDetails> X0(java.util.List<sp.ProductState<Co.ProductFullDetails>> r32) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.X0(java.util.List):sp.b");
    }

    private final void a1(Throwable throwable, G0 event) {
        uw.a.INSTANCE.e(throwable);
        C16648k.d(androidx.view.d0.a(this), null, null, new E(event, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b1(mk.c r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.b1(mk.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c1(mk.f r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.c1(mk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(mk.c r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.j0(mk.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(mk.c r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.k0(mk.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(final C12208c1 c12208c1, final Object key, sp.Y repo) {
        Intrinsics.j(key, "key");
        Intrinsics.j(repo, "repo");
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = repo.Y0().subscribeOn(C14764a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.I0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12208c1.l1(this.f107924a, key, (List) obj);
            }
        };
        Pu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.J0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12208c1.m1(function1, obj);
            }
        };
        final N n10 = new N(uw.a.INSTANCE);
        Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.K0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12208c1.n1(n10, obj);
            }
        }), c12208c1.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(mk.c cVar, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("productID", cVar.getCode());
        track.n("product detail page");
        track.v("shopping list");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("product detail page");
        track.v("mperks");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("errorMessage", "add to shopping list error");
        return Unit.f142422a;
    }

    private final void o0(List<ProductFullDetails> productList, boolean isFrequentlyBoughtTogetherImpression) {
        ProductDetailsState value;
        ProductDetailsState productDetailsState;
        C12203b criteoBeaconTracker;
        ArrayList arrayList = new ArrayList();
        for (Object obj : productList) {
            ProductFullDetails productFullDetails = (ProductFullDetails) obj;
            if (productFullDetails.F() && !this.productDetailFlow.getValue().getCriteoBeaconTracker().a().contains(productFullDetails.getCode())) {
                arrayList.add(obj);
            }
        }
        List<ProductFullDetails> listM1 = CollectionsKt.m1(arrayList);
        if (listM1.isEmpty()) {
            return;
        }
        InterfaceC17140B<ProductDetailsState> interfaceC17140B = this._detailsFlow;
        do {
            value = interfaceC17140B.getValue();
            productDetailsState = value;
            criteoBeaconTracker = productDetailsState.getCriteoBeaconTracker();
            List<String> listA = criteoBeaconTracker.a();
            List<ProductFullDetails> list = listM1;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ProductFullDetails) it.next()).getCode());
            }
            listA.addAll(arrayList2);
            Unit unit = Unit.f142422a;
        } while (!interfaceC17140B.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, criteoBeaconTracker, null, 6291455, null)));
        this.analyticsEngine.e(Ao.M.f1171a.b(isFrequentlyBoughtTogetherImpression, this.cartId, listM1));
    }

    private final void o1(final ProductFullDetails productDetails) {
        String str = this.previousTrackAction;
        if (str == null || str.length() == 0) {
            this.analyticsEngine.f(C14476c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Y0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12208c1.p1(productDetails, this, (TrackingData) obj);
                }
            });
        } else {
            this.analyticsEngine.h(C14476c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12208c1.q1(productDetails, this, (TrackingData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p1(ProductFullDetails productFullDetails, C12208c1 c12208c1, TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.c(Ao.W.f1200a.h(productFullDetails));
        submitEvent.h("pageName", "Meijer:Search Results Page: Product Details Page");
        ProductSponsorship productSponsorshipA = c12208c1.sponsorshipsDataStore.a(productFullDetails.getCode());
        if (productSponsorshipA != null) {
            Ao.e0.a(productSponsorshipA, submitEvent);
            if (productSponsorshipA.getSponsorSource() == Ho.b.f13065c) {
                C16648k.d(androidx.view.d0.a(c12208c1), c12208c1.ioDispatcher, null, new P(productFullDetails, c12208c1, null), 2, null);
            }
        }
        submitEvent.h("isProductOutOfStock", productFullDetails.getStockInfo().e() ? "true" : "false");
        return Unit.f142422a;
    }

    private final void q0() {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C14764a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.W0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12208c1.r0(this.f108123a, (String) obj);
            }
        };
        Ck.a.a(lVarSubscribeOn.subscribe(new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.X0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12208c1.s0(function1, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q1(ProductFullDetails productFullDetails, C12208c1 c12208c1, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.c(Ao.W.f1200a.h(productFullDetails));
        track.h("pageName", "Meijer:Search Results Page: Product Details Page");
        track.h("isProductOutOfStock", productFullDetails.getStockInfo().e() ? "true" : "false");
        Ao.e0.a(c12208c1.sponsorshipsDataStore.a(productFullDetails.getCode()), track);
        track.p(c12208c1.previousTrackAction);
        return Unit.f142422a;
    }

    private final boolean s1(int errorMessageId) {
        if (this.userManager.b()) {
            return true;
        }
        C16648k.d(androidx.view.d0.a(this), null, null, new R(errorMessageId, null), 3, null);
        return false;
    }

    private final void u0(mk.f productIdentity) {
        ProductDetailsState value;
        if (this.featureManager.e(AbstractC18227f.X.f170563h)) {
            InterfaceC17140B<ProductDetailsState> interfaceC17140B = this._detailsFlow;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ProductDetailsState.d(value, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, r.f108962c, null, null, null, null, null, 8257535, null)));
            C16648k.d(androidx.view.d0.a(this), null, null, new C12220l(productIdentity, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(Co.ProductFullDetails r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12221m
            if (r0 == 0) goto L13
            r0 = r7
            com.meijer.mobile.meijer.activity.find.viewmodel.c1$m r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.C12221m) r0
            int r1 = r0.f108352f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108352f = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.c1$m r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.c1$m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f108350d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f108352f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f108348b
            com.meijer.mobile.meijer.activity.find.viewmodel.c1 r6 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1) r6
            java.lang.Object r6 = r0.f108347a
            Co.h r6 = (Co.ProductFullDetails) r6
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L56
        L31:
            r7 = move-exception
            goto L5d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.b(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L31
            Ro.c r7 = r5.productsRepository     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r6.getCode()     // Catch: java.lang.Throwable -> L31
            r0.f108347a = r6     // Catch: java.lang.Throwable -> L31
            r0.f108348b = r5     // Catch: java.lang.Throwable -> L31
            r4 = 0
            r0.f108349c = r4     // Catch: java.lang.Throwable -> L31
            r0.f108352f = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r7.l(r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r7 != r1) goto L56
            return r1
        L56:
            Co.h r7 = (Co.ProductFullDetails) r7     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L67
        L5d:
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L67:
            boolean r1 = kotlin.Result.h(r7)
            if (r1 == 0) goto L7c
            r1 = r7
            Co.h r1 = (Co.ProductFullDetails) r1
            sp.Y r2 = r5.productStateRepository
            java.util.List r3 = kotlin.collections.CollectionsKt.e(r1)
            r2.m1(r3)
            r5.o1(r1)
        L7c:
            java.lang.Throwable r7 = kotlin.Result.e(r7)
            if (r7 == 0) goto L99
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            boolean r0 = r7 instanceof java.lang.Error
            if (r0 != 0) goto L98
            com.meijer.mobile.meijer.activity.find.viewmodel.G0$g r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.G0$g
            int r1 = com.meijer.mobile.meijer.Y.f99733Oc
            r0.<init>(r6, r1)
            r5.a1(r7, r0)
            goto L99
        L98:
            throw r7
        L99:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1.v0(Co.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("product detail page");
        track.v("mperks");
        return Unit.f142422a;
    }

    private final String y0(tk.c<EntryChange> entryChange) {
        List<SuggestedProductCarouselDecorator> listS;
        Entry entry;
        ProductFullDetails productFullDetailsM;
        if (this.quantityChangeForFBT && (listS = this._detailsFlow.getValue().s()) != null) {
            Iterator<SuggestedProductCarouselDecorator> it = listS.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                String code = it.next().getProduct().getCode();
                EntryChange entryChangeA = entryChange.a();
                if (Intrinsics.e(code, (entryChangeA == null || (entry = entryChangeA.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode())) {
                    break;
                }
                i10++;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return Integer.valueOf(numValueOf.intValue() + 1).toString();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W.ComplexPromo z0() {
        if (this.quantityChangeForFBT) {
            return null;
        }
        ProductDetailsState value = this._detailsFlow.getValue();
        String complexPromoString = value.getComplexPromoString();
        if (complexPromoString == null || StringsKt.r0(complexPromoString)) {
            value = null;
        }
        ProductDetailsState productDetailsState = value;
        if (productDetailsState != null) {
            return new W.ComplexPromo(productDetailsState.getComplexPromoId(), productDetailsState.getComplexPromoString());
        }
        return null;
    }

    public final InterfaceC17144F<G0> A0() {
        return this.eventFlow;
    }

    public final tv.P<ProductDetailsState> C0() {
        return this.productDetailFlow;
    }

    public final void Q0(a2 action) {
        Intrinsics.j(action, "action");
        if ((action instanceof a2.ReadMore) || (action instanceof a2.ShowReviewGallery) || (action instanceof a2.WriteReview) || (action instanceof a2.SeeAll)) {
            return;
        }
        if (action instanceof a2.Report) {
            t0(((a2.Report) action).getReviewDetails().getReviewId(), Kp.a.f17434a);
        } else if (action instanceof a2.VotePositive) {
            t0(((a2.VotePositive) action).getReviewDetails().getReviewId(), Kp.a.f17435b);
        } else {
            if (!(action instanceof a2.VoteNegative)) {
                throw new NoWhenBranchMatchedException();
            }
            t0(((a2.VoteNegative) action).getReviewDetails().getReviewId(), Kp.a.f17436c);
        }
    }

    public final void R0(AbstractC12200a action) {
        ProductDetailsState value;
        ProductDetailsState productDetailsState;
        C12203b criteoBeaconTracker;
        ProductDetailsState value2;
        ProductDetailsState productDetailsState2;
        C12203b criteoBeaconTracker2;
        ProductDetailsState value3;
        ProductDetailsState productDetailsState3;
        C12203b criteoBeaconTracker3;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12200a.CarouselIsVisible) {
            if (this.carouselIsVisibleEncountered) {
                return;
            }
            o0(((AbstractC12200a.CarouselIsVisible) action).a(), true);
            this.carouselIsVisibleEncountered = true;
            return;
        }
        if (action instanceof AbstractC12200a.NewItemScrolling) {
            o0(((AbstractC12200a.NewItemScrolling) action).a(), false);
            return;
        }
        if (action instanceof AbstractC12200a.OnViewCriteoBeacon) {
            AbstractC12200a.OnViewCriteoBeacon onViewCriteoBeacon = (AbstractC12200a.OnViewCriteoBeacon) action;
            if (this.productDetailFlow.getValue().getCriteoBeaconTracker().d().containsAll(onViewCriteoBeacon.getProductList().getBeaconInfo().g())) {
                return;
            }
            e1(onViewCriteoBeacon.getProductList().getBeaconInfo().g());
            e1(CollectionsKt.e(onViewCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnViewBeacon()));
            InterfaceC17140B<ProductDetailsState> interfaceC17140B = this._detailsFlow;
            do {
                value3 = interfaceC17140B.getValue();
                productDetailsState3 = value3;
                criteoBeaconTracker3 = productDetailsState3.getCriteoBeaconTracker();
                criteoBeaconTracker3.d().addAll(CollectionsKt.Q0(onViewCriteoBeacon.getProductList().getBeaconInfo().g(), onViewCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnViewBeacon()));
                Unit unit = Unit.f142422a;
            } while (!interfaceC17140B.e(value3, ProductDetailsState.d(productDetailsState3, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, criteoBeaconTracker3, null, 6291455, null)));
            return;
        }
        if (action instanceof AbstractC12200a.OnClickCriteoBeacon) {
            AbstractC12200a.OnClickCriteoBeacon onClickCriteoBeacon = (AbstractC12200a.OnClickCriteoBeacon) action;
            if (this.productDetailFlow.getValue().getCriteoBeaconTracker().b().containsAll(onClickCriteoBeacon.getProductList().getBeaconInfo().e())) {
                return;
            }
            e1(onClickCriteoBeacon.getProductList().getBeaconInfo().e());
            e1(CollectionsKt.e(onClickCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnClickBeacon()));
            InterfaceC17140B<ProductDetailsState> interfaceC17140B2 = this._detailsFlow;
            do {
                value2 = interfaceC17140B2.getValue();
                productDetailsState2 = value2;
                criteoBeaconTracker2 = productDetailsState2.getCriteoBeaconTracker();
                criteoBeaconTracker2.b().addAll(CollectionsKt.Q0(onClickCriteoBeacon.getProductList().getBeaconInfo().e(), onClickCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnClickBeacon()));
                Unit unit2 = Unit.f142422a;
            } while (!interfaceC17140B2.e(value2, ProductDetailsState.d(productDetailsState2, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, criteoBeaconTracker2, null, 6291455, null)));
            return;
        }
        if (!(action instanceof AbstractC12200a.OnLoadCriteoBeacon)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC12200a.OnLoadCriteoBeacon onLoadCriteoBeacon = (AbstractC12200a.OnLoadCriteoBeacon) action;
        if (this.productDetailFlow.getValue().getCriteoBeaconTracker().c().contains(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon())) {
            return;
        }
        e1(CollectionsKt.e(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon()));
        e1(CollectionsKt.e(onLoadCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnLoadBeacon()));
        InterfaceC17140B<ProductDetailsState> interfaceC17140B3 = this._detailsFlow;
        do {
            value = interfaceC17140B3.getValue();
            productDetailsState = value;
            criteoBeaconTracker = productDetailsState.getCriteoBeaconTracker();
            criteoBeaconTracker.c().addAll(CollectionsKt.p(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon(), onLoadCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnLoadBeacon()));
            Unit unit3 = Unit.f142422a;
        } while (!interfaceC17140B3.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, criteoBeaconTracker, null, 6291455, null)));
    }

    public final void S0(AbstractC12300x action) {
        ProductDetailsState value;
        ProductDetailsState productDetailsState;
        ArrayList arrayList;
        ProductDetailsState value2;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12300x.UpdateEntry) {
            if (s1(Bj.o.f3011d)) {
                if (this.quantityChangeForFBT) {
                    this.quantityChangeForFBT = false;
                }
                r1(((AbstractC12300x.UpdateEntry) action).getQuantityRequested());
                return;
            }
            return;
        }
        if (action instanceof AbstractC12300x.IsFromCLP) {
            InterfaceC17140B<ProductDetailsState> interfaceC17140B = this._detailsFlow;
            do {
                value2 = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value2, ProductDetailsState.d(value2, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, ((AbstractC12300x.IsFromCLP) action).getIsFromCLP(), false, null, null, null, null, null, null, 8355839, null)));
            return;
        }
        if (action instanceof AbstractC12300x.GetFrequentlyBoughtTogetherProducts) {
            u0(((AbstractC12300x.GetFrequentlyBoughtTogetherProducts) action).getProductIdentity());
            return;
        }
        if (!(action instanceof AbstractC12300x.UpdateCarouselProductEntry)) {
            if (action instanceof AbstractC12300x.GetBazaarVoiceReviews) {
                p0(((AbstractC12300x.GetBazaarVoiceReviews) action).getProductIdentity().getCode());
                return;
            } else if (action instanceof AbstractC12300x.e) {
                C16648k.d(androidx.view.d0.a(this), null, null, new C(null), 3, null);
                return;
            } else {
                if (!(action instanceof AbstractC12300x.GoogleAdClicked)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.analyticsEngine.e(C13902c.b(((AbstractC12300x.GoogleAdClicked) action).getAnalytics(), "product details page"));
                return;
            }
        }
        if (!this.userManager.b()) {
            d1();
            C16648k.d(androidx.view.d0.a(this), null, null, new B(null), 3, null);
            return;
        }
        InterfaceC17140B<ProductDetailsState> interfaceC17140B2 = this._detailsFlow;
        do {
            value = interfaceC17140B2.getValue();
            productDetailsState = value;
            List<SuggestedProductCarouselDecorator> listS = productDetailsState.s();
            if (listS != null) {
                List<SuggestedProductCarouselDecorator> list = listS;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                for (SuggestedProductCarouselDecorator suggestedProductCarouselDecoratorV : list) {
                    if (suggestedProductCarouselDecoratorV.getResetStepperState()) {
                        suggestedProductCarouselDecoratorV = SuggestedProductCarouselDecorator.v(suggestedProductCarouselDecoratorV, null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, false, null, null, null, false, null, 1032191, null);
                    }
                    arrayList2.add(suggestedProductCarouselDecoratorV);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
        } while (!interfaceC17140B2.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, arrayList, null, null, null, null, 8126463, null)));
        if (!this.quantityChangeForFBT) {
            this.quantityChangeForFBT = true;
        }
        AbstractC12300x.UpdateCarouselProductEntry updateCarouselProductEntry = (AbstractC12300x.UpdateCarouselProductEntry) action;
        wr.f.M(this.cartInteractor, updateCarouselProductEntry.getProduct(), updateCarouselProductEntry.getQuantityToUpdate(), false, null, 12, null);
    }

    public void T0(AbstractC15172a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC15172a.Add) {
            if (s1(C18570a.f173237e)) {
                C16648k.d(androidx.view.d0.a(this), null, null, new z(action, null), 3, null);
            }
        } else if (action instanceof AbstractC15172a.Remove) {
            C16648k.d(androidx.view.d0.a(this), null, null, new A(action, null), 3, null);
        } else {
            if (!(action instanceof AbstractC15172a.View)) {
                throw new NoWhenBranchMatchedException();
            }
            t1(((AbstractC15172a.View) action).getProduct());
        }
    }

    public void U0(AbstractC15173b action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC15173b.Add) {
            if (s1(C18570a.f173237e)) {
                C16648k.d(androidx.view.d0.a(this), null, null, new x(action, null), 3, null);
            }
        } else {
            if (action instanceof AbstractC15173b.View) {
                u1(((AbstractC15173b.View) action).getProduct());
                return;
            }
            if (action instanceof AbstractC15173b.Remove) {
                C16648k.d(androidx.view.d0.a(this), null, null, new y(action, null), 3, null);
                return;
            }
            throw new NotImplementedError(Reflection.b(C12208c1.class).u() + " does not handle " + Reflection.b(action.getClass()).u());
        }
    }

    public final void V0(int count) {
        ProductDetailsState value;
        InterfaceC17140B<ProductDetailsState> interfaceC17140B = this._detailsFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ProductDetailsState.d(value, null, null, null, null, null, count, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, null, null, 8388575, null)));
    }

    public final void Y0(m2 result) {
        Intrinsics.j(result, "result");
        C16648k.d(androidx.view.d0.a(this), null, null, new D(result, this, null), 3, null);
    }

    public final void Z0(Object key, List<ProductState<ProductFullDetails>> productState) {
        ProductDetailsState value;
        ProductDetailsState productDetailsState;
        ArrayList arrayList;
        Intrinsics.j(key, "key");
        Intrinsics.j(productState, "productState");
        if (Intrinsics.e(key, "frequently bought together")) {
            InterfaceC17140B<ProductDetailsState> interfaceC17140B = this._detailsFlow;
            do {
                value = interfaceC17140B.getValue();
                productDetailsState = value;
                List<ProductState<ProductFullDetails>> listJ0 = J0(CollectionsKt.m1(productState));
                arrayList = new ArrayList(CollectionsKt.x(listJ0, 10));
                Iterator<T> it = listJ0.iterator();
                while (it.hasNext()) {
                    arrayList.add(SuggestedProductCarouselDecorator.INSTANCE.a((ProductState) it.next()));
                }
            } while (!interfaceC17140B.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, arrayList, null, null, null, null, 8126463, null)));
        }
    }

    public final void f1(String str) {
        this.campaignIdValue = str;
    }

    public final void g1(String str) {
        this.previousTrackAction = str;
    }

    public final void h1(mk.f productIdentity) {
        ProductFullDetails productFullDetails;
        Intrinsics.j(productIdentity, "productIdentity");
        this.firebaseCrashlytics.h("PRODUCT_ID", productIdentity.getCode());
        this.firebaseCrashlytics.g("STORE_ID", this.storeProvider.g());
        ProductFullDetails productFullDetails2 = productIdentity instanceof ProductFullDetails ? (ProductFullDetails) productIdentity : null;
        ProductFullDetails productFullDetails3 = productFullDetails2 == null ? new ProductFullDetails(productIdentity.getCode(), null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -2, 268435455, null) : productFullDetails2;
        InterfaceC17140B<ProductDetailsState> interfaceC17140B = this._detailsFlow;
        while (true) {
            productFullDetails = productFullDetails3;
            if (interfaceC17140B.e(interfaceC17140B.getValue(), new ProductDetailsState(productFullDetails, null, null, this.storeProvider.a(), null, 0, null, false, null, null, new CartEntry(0, 0.0d, productFullDetails, null, 0.0d, 0.0d, 59, null), 0, null, null, null, false, this.productMetadataStore.c(productFullDetails.getCode()), null, null, null, null, null, null, 8322038, null))) {
                break;
            } else {
                productFullDetails3 = productFullDetails;
            }
        }
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarDistinctUntilChanged = this.productStateRepository.Y0().distinctUntilChanged();
        final L l10 = new L(this);
        Pu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.H0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12208c1.i1(l10, obj);
            }
        };
        final M m10 = new M(uw.a.INSTANCE);
        Ck.a.a(lVarDistinctUntilChanged.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.R0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12208c1.j1(m10, obj);
            }
        }), this.disposables);
        this.multiChannelProductsStateRepository.b(new C16992a.InterfaceC2509a() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.S0
            @Override // sp.C16992a.InterfaceC2509a
            public final void a(Object obj, sp.Y y10) {
                C12208c1.k1(this.f108099a, obj, y10);
            }
        });
        Ck.a.a(this.productStateRepository.q0(), this.disposables);
        this.productStateRepository.j1(CollectionsKt.e(productFullDetails));
        C16648k.d(androidx.view.d0.a(this), null, null, new O(productFullDetails, null), 3, null);
        if (this.userManager.b()) {
            this.cartInteractor.p();
            L0();
            q0();
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        P0();
        InterfaceC17140B<ProductDetailFeatureFlags> interfaceC17140B = this._featureFlags;
        do {
        } while (!interfaceC17140B.e(interfaceC17140B.getValue(), new ProductDetailFeatureFlags(this.featureManager.e(AbstractC18227f.C2748f.f170576h), this.featureManager.e(AbstractC18227f.A.f170542h), this.featureManager.e(AbstractC18227f.O.f170554h), false, this.featureManager.e(AbstractC18227f.V.f170561h), this.featureManager.e(AbstractC18227f.W.f170562h), this.featureManager.e(AbstractC18227f.C18246t.f170604h), false, 136, null)));
    }

    /* renamed from: x0, reason: from getter */
    public final String getCampaignIdValue() {
        return this.campaignIdValue;
    }

    private final void H0(tk.c<EntryChange> changeRes) {
        ProductSponsorship productSponsorshipA;
        Entry entry;
        ProductFullDetails productFullDetailsM;
        Entry entry2;
        ProductFullDetails productFullDetailsM2;
        EntryChange entryChangeA = changeRes.a();
        String code = null;
        if (entryChangeA == null || !entryChangeA.h()) {
            C16648k.d(androidx.view.d0.a(this), null, null, new C12227s(null), 3, null);
            return;
        }
        EntryChange entryChangeA2 = changeRes.a();
        if (entryChangeA2 != null && (entry2 = entryChangeA2.getEntry()) != null && (productFullDetailsM2 = entry2.m()) != null) {
            productSponsorshipA = this.sponsorshipsDataStore.a(productFullDetailsM2.getCode());
        } else {
            productSponsorshipA = null;
        }
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        C2930u c2930u = C2930u.f1407a;
        String str = this.cartId;
        pp.d dVar = this.productMetadataStore;
        EntryChange entryChangeA3 = changeRes.a();
        if (entryChangeA3 != null && (entry = entryChangeA3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
            code = productFullDetailsM.getCode();
        }
        interfaceC14261a.e(c2930u.c0(str, dVar.c(code), changeRes.a(), y0(changeRes), productSponsorshipA, B0()));
    }

    private final void K0() {
        C16648k.d(androidx.view.d0.a(this), null, null, new v(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0(AbstractC12120f.Update action, tk.c<EntryChange> entryChange) {
        Map<String, AbstractC12120f.Update> value;
        AbstractC12120f.Update.AbstractC1631a updateType = action.getUpdateType();
        if (Intrinsics.e(updateType, AbstractC12120f.Update.AbstractC1631a.C1632a.f107571a)) {
            D0(entryChange);
        } else if (!Intrinsics.e(updateType, AbstractC12120f.Update.AbstractC1631a.c.f107573a) && !Intrinsics.e(updateType, AbstractC12120f.Update.AbstractC1631a.b.f107572a)) {
            if (Intrinsics.e(updateType, AbstractC12120f.Update.AbstractC1631a.d.f107574a)) {
                H0(entryChange);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            G0(entryChange);
        }
        InterfaceC17140B<Map<String, AbstractC12120f.Update>> interfaceC17140B = this.actionsFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, MapsKt.q(value, action.getProduct().getCode())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1() {
        C16648k.d(androidx.view.d0.a(this), null, null, new J(null), 3, null);
    }

    private final void e1(List<String> beacon) {
        C16648k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new K(beacon, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l1(C12208c1 c12208c1, Object obj, List list) {
        Intrinsics.g(list);
        c12208c1.Z0(obj, list);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void p0(String productCode) {
        C16648k.d(androidx.view.d0.a(this), null, null, new C12218j(productCode, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(C12208c1 c12208c1, String str) {
        Intrinsics.g(str);
        c12208c1.cartId = str;
        return Unit.f142422a;
    }

    private final void r1(double quantityToUpdate) {
        C16648k.d(androidx.view.d0.a(this), null, null, new Q(null), 3, null);
        ProductDetailsState value = this._detailsFlow.getValue();
        wr.f.M(this.cartInteractor, value.getProduct(), quantityToUpdate, value.getIsFromCLP(), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void t0(String reviewId, Kp.a reviewFeedbackVote) {
        C16648k.d(androidx.view.d0.a(this), null, null, new C12219k(reviewId, reviewFeedbackVote, null), 3, null);
    }

    private final void t1(mk.c product) {
        C16648k.d(androidx.view.d0.a(this), null, null, new S(product, null), 3, null);
    }

    private final void u1(mk.c product) {
        C16648k.d(androidx.view.d0.a(this), null, null, new T(product, null), 3, null);
        this.analyticsEngine.h(C14476c.a("event: products: view on shopping list"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.L0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12208c1.v1((TrackingData) obj);
            }
        });
    }
}
