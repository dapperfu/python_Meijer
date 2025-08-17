package kw;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import fsimpl.C14045dq;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001`B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0011H\u0087\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010$J\u000f\u00102\u001a\u00020+H\u0016¢\u0006\u0004\b2\u0010-J\u000f\u00103\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u0010$J\u000f\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u0010$J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010$J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020.2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\u0006\u0010@\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020F2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020FH\u0016¢\u0006\u0004\bQ\u0010HJ\u0017\u0010S\u001a\u00020F2\u0006\u0010R\u001a\u00020\u0011H\u0016¢\u0006\u0004\bS\u0010JJ\u000f\u0010T\u001a\u00020.H\u0016¢\u0006\u0004\bT\u00100J\u000f\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020U2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00132\u0006\u0010@\u001a\u00020UH\u0016¢\u0006\u0004\bZ\u0010[J'\u0010\\\u001a\u00020.2\u0006\u0010@\u001a\u00020U2\u0006\u0010\u001e\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010\\\u001a\u00020.2\u0006\u0010@\u001a\u00020^H\u0016¢\u0006\u0004\b\\\u0010_J\r\u0010`\u001a\u00020\u0013¢\u0006\u0004\b`\u0010\u0006J\u0017\u0010a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\ba\u0010\u0015J\u0017\u0010c\u001a\u00020\u00002\u0006\u0010b\u001a\u000207H\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00002\u0006\u0010e\u001a\u00020FH\u0016¢\u0006\u0004\bf\u0010gJ'\u0010j\u001a\u00020\u00002\u0006\u0010e\u001a\u00020F2\u0006\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020.H\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00002\u0006\u0010l\u001a\u00020.H\u0016¢\u0006\u0004\bm\u0010nJ\u001f\u0010o\u001a\u00020\u00002\u0006\u0010e\u001a\u00020F2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bo\u0010pJ/\u0010q\u001a\u00020\u00002\u0006\u0010e\u001a\u00020F2\u0006\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020.2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\u00002\u0006\u0010s\u001a\u00020UH\u0016¢\u0006\u0004\bt\u0010uJ'\u0010v\u001a\u00020\u00002\u0006\u0010s\u001a\u00020U2\u0006\u0010\u001e\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020.2\u0006\u0010s\u001a\u00020^H\u0016¢\u0006\u0004\bx\u0010_J\u0017\u0010z\u001a\u00020\u00112\u0006\u0010s\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u00002\u0006\u0010|\u001a\u00020.H\u0016¢\u0006\u0004\b}\u0010nJ\u0017\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020.H\u0016¢\u0006\u0004\b\u007f\u0010nJ\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020.H\u0016¢\u0006\u0005\b\u0080\u0001\u0010nJ\u0019\u0010\u0081\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020.H\u0016¢\u0006\u0005\b\u0081\u0001\u0010nJ\u001b\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001b\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0084\u0001J\u001b\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0084\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0084\u0001J\u001c\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u0088\u0001\u001a\u00020.H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J!\u0010\u008c\u0001\u001a\u00020\u00132\u0006\u0010s\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u008c\u0001\u0010BJ \u0010\\\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\\\u0010\u008d\u0001J,\u0010\u0090\u0001\u001a\u00020\u00112\u0006\u0010|\u001a\u00020%2\u0007\u0010\u008e\u0001\u001a\u00020\u00112\u0007\u0010\u008f\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J$\u0010\u0095\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u0002072\u0007\u0010\u008e\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J-\u0010\u0097\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u0002072\u0007\u0010\u008e\u0001\u001a\u00020\u00112\u0007\u0010\u008f\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0094\u0001J$\u0010\u009b\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u0002072\u0007\u0010\u008e\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u0096\u0001J#\u0010\u009c\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J4\u0010\u009f\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u0002072\u0007\u0010\u009e\u0001\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0006J\u0011\u0010¢\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¢\u0001\u0010\u0010J\u0011\u0010£\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b£\u0001\u0010\u0006J\u0013\u0010¥\u0001\u001a\u00030¤\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001f\u0010©\u0001\u001a\u00020\u000e2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0096\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b«\u0001\u00100J\u0011\u0010¬\u0001\u001a\u00020FH\u0016¢\u0006\u0005\b¬\u0001\u0010HJ\u000f\u0010\u00ad\u0001\u001a\u00020\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\bJ\u000f\u0010|\u001a\u00020\u0000H\u0016¢\u0006\u0004\b|\u0010\bJ\u000f\u0010®\u0001\u001a\u000207¢\u0006\u0005\b®\u0001\u00109J\u0018\u0010¯\u0001\u001a\u0002072\u0006\u0010\u0012\u001a\u00020.¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001f\u0010³\u0001\u001a\u00030±\u00012\n\b\u0002\u0010²\u0001\u001a\u00030±\u0001H\u0007¢\u0006\u0006\b³\u0001\u0010´\u0001R\u001b\u0010¶\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0007\n\u0005\b`\u0010µ\u0001R.\u0010¸\u0001\u001a\u00020\u00112\u0007\u0010·\u0001\u001a\u00020\u00118G@@X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010O\u001a\u0005\b¸\u0001\u0010$\"\u0005\b¹\u0001\u0010\u0015R\u0016\u0010»\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\b¨\u0006¼\u0001"}, d2 = {"Lkw/e;", "Lkw/g;", "Lkw/f;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "P", "()Lkw/e;", "Ljava/io/OutputStream;", "Q3", "()Ljava/io/OutputStream;", "j", "i", "", "j2", "()Z", "", "byteCount", "", "B1", "(J)V", "t", "(J)Z", "peek", "()Lkw/g;", "Ljava/io/InputStream;", "T3", "()Ljava/io/InputStream;", "out", "offset", "g", "(Lkw/e;JJ)Lkw/e;", "N0", "(Ljava/io/OutputStream;J)Lkw/e;", "c", "()J", "", "readByte", "()B", "pos", "l", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "n1", "f3", "s1", "r2", "R3", "Lkw/h;", "Q2", "()Lkw/h;", "O1", "(J)Lkw/h;", "Lkw/z;", "options", "U2", "(Lkw/z;)I", "sink", "z3", "(Lkw/e;J)V", "Lkw/I;", "Z1", "(Lkw/I;)J", "", "n3", "()Ljava/lang/String;", "K1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "H2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "J", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "h1", "limit", "y0", "L2", "", "e2", "()[B", "H", "(J)[B", "readFully", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "a", "skip", "byteString", "e0", "(Lkw/h;)Lkw/e;", "string", "S0", "(Ljava/lang/String;)Lkw/e;", "beginIndex", "endIndex", "U0", "(Ljava/lang/String;II)Lkw/e;", "codePoint", "V0", "(I)Lkw/e;", "L0", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lkw/e;", "J0", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lkw/e;", "source", "h0", "([B)Lkw/e;", "i0", "([BII)Lkw/e;", "write", "Lkw/J;", "G0", "(Lkw/J;)J", "b", "j0", "s", "F0", "n0", "r0", "v", "v0", "(J)Lkw/e;", "z0", "l0", "m0", "minimumCapacity", "Lkw/F;", "Z", "(I)Lkw/F;", "M1", "(Lkw/e;J)J", "fromIndex", "toIndex", "m", "(BJJ)J", "bytes", "x0", "(Lkw/h;)J", "p", "(Lkw/h;J)J", "u", "(Lkw/h;JJ)J", "targetBytes", "e3", "w", "Y", "(JLkw/h;)Z", "bytesOffset", "z", "(JLkw/h;II)Z", "flush", "isOpen", "close", "Lkw/K;", "timeout", "()Lkw/K;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "d", "O", "R", "(I)Lkw/h;", "Lkw/e$a;", "unsafeCursor", "A", "(Lkw/e$a;)Lkw/e$a;", "Lkw/F;", "head", "value", "size", "K", "e", "buffer", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kw.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15328e implements InterfaceC15330g, InterfaceC15329f, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public F head;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long size;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#¨\u0006&"}, d2 = {"Lkw/e$a;", "Ljava/io/Closeable;", "<init>", "()V", "", "b", "()I", "", "offset", "d", "(J)I", "newSize", "c", "(J)J", "", "close", "Lkw/e;", "a", "Lkw/e;", "buffer", "", "Z", "readWrite", "Lkw/F;", "Lkw/F;", "()Lkw/F;", "g", "(Lkw/F;)V", "segment", "J", "", "e", "[B", "data", "f", "I", "start", "end", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kw.e$a */
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public C15328e buffer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public boolean readWrite;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private F segment;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public byte[] data;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public long offset = -1;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int start = -1;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int end = -1;

        /* renamed from: a, reason: from getter */
        public final F getSegment() {
            return this.segment;
        }

        public final int b() {
            long j10 = this.offset;
            C15328e c15328e = this.buffer;
            Intrinsics.g(c15328e);
            if (j10 == c15328e.getSize()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.offset;
            return d(j11 == -1 ? 0L : j11 + (this.end - this.start));
        }

        public final long c(long newSize) {
            C15328e c15328e = this.buffer;
            if (c15328e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c15328e.getSize();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + newSize).toString());
                }
                long j10 = size - newSize;
                while (true) {
                    if (j10 <= 0) {
                        break;
                    }
                    F f10 = c15328e.head;
                    Intrinsics.g(f10);
                    F f11 = f10.prev;
                    Intrinsics.g(f11);
                    int i10 = f11.limit;
                    long j11 = i10 - f11.pos;
                    if (j11 > j10) {
                        f11.limit = i10 - ((int) j10);
                        break;
                    }
                    c15328e.head = f11.b();
                    G.b(f11);
                    j10 -= j11;
                }
                g(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j12 = newSize - size;
                boolean z10 = true;
                while (j12 > 0) {
                    F fZ = c15328e.Z(1);
                    int iMin = (int) Math.min(j12, 8192 - fZ.limit);
                    fZ.limit += iMin;
                    j12 -= iMin;
                    if (z10) {
                        g(fZ);
                        this.offset = size;
                        this.data = fZ.data;
                        int i11 = fZ.limit;
                        this.start = i11 - iMin;
                        this.end = i11;
                        z10 = false;
                    }
                }
            }
            c15328e.K(newSize);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            g(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final int d(long offset) {
            F fC;
            C15328e c15328e = this.buffer;
            if (c15328e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (offset < -1 || offset > c15328e.getSize()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + c15328e.getSize());
            }
            if (offset == -1 || offset == c15328e.getSize()) {
                g(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = c15328e.getSize();
            F segment = c15328e.head;
            long j10 = 0;
            if (getSegment() != null) {
                long j11 = this.offset;
                int i10 = this.start;
                Intrinsics.g(getSegment());
                long j12 = j11 - (i10 - r9.pos);
                if (j12 > offset) {
                    fC = segment;
                    segment = getSegment();
                    size = j12;
                } else {
                    fC = getSegment();
                    j10 = j12;
                }
            } else {
                fC = segment;
            }
            if (size - offset > offset - j10) {
                while (true) {
                    Intrinsics.g(fC);
                    int i11 = fC.limit;
                    int i12 = fC.pos;
                    if (offset < (i11 - i12) + j10) {
                        break;
                    }
                    j10 += i11 - i12;
                    fC = fC.next;
                }
            } else {
                while (size > offset) {
                    Intrinsics.g(segment);
                    segment = segment.prev;
                    Intrinsics.g(segment);
                    size -= segment.limit - segment.pos;
                }
                j10 = size;
                fC = segment;
            }
            if (this.readWrite) {
                Intrinsics.g(fC);
                if (fC.shared) {
                    F f10 = fC.f();
                    if (c15328e.head == fC) {
                        c15328e.head = f10;
                    }
                    fC = fC.c(f10);
                    F f11 = fC.prev;
                    Intrinsics.g(f11);
                    f11.b();
                }
            }
            g(fC);
            this.offset = offset;
            Intrinsics.g(fC);
            this.data = fC.data;
            int i13 = fC.pos + ((int) (offset - j10));
            this.start = i13;
            int i14 = fC.limit;
            this.end = i14;
            return i14 - i13;
        }

        public final void g(F f10) {
            this.segment = f10;
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"kw/e$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kw.e$b */
    public static final class b extends InputStream implements InputStreamRetargetInterface {
        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C15328e.this.getSize() > 0) {
                return C15328e.this.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C15328e.this.getSize(), a.e.API_PRIORITY_OTHER);
        }

        public String toString() {
            return C15328e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            Intrinsics.j(sink, "sink");
            return C15328e.this.read(sink, offset, byteCount);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"kw/e$c", "Ljava/io/OutputStream;", "", "b", "", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kw.e$c */
    public static final class c extends OutputStream {
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.OutputStream
        public void write(int b10) {
            C15328e.this.writeByte(b10);
        }

        c() {
        }

        public String toString() {
            return C15328e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) {
            Intrinsics.j(data, "data");
            C15328e.this.write(data, offset, byteCount);
        }
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public C15328e writeShort(int s10) {
        F fZ = Z(2);
        byte[] bArr = fZ.data;
        int i10 = fZ.limit;
        bArr[i10] = (byte) ((s10 >>> 8) & l3.f92484c);
        bArr[i10 + 1] = (byte) (s10 & l3.f92484c);
        fZ.limit = i10 + 2;
        K(getSize() + 2);
        return this;
    }

    @Override // kw.InterfaceC15330g
    public C15328e P() {
        return this;
    }

    public final F Z(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        F f10 = this.head;
        if (f10 != null) {
            Intrinsics.g(f10);
            F f11 = f10.prev;
            Intrinsics.g(f11);
            return (f11.limit + minimumCapacity > 8192 || !f11.owner) ? f11.c(G.c()) : f11;
        }
        F fC = G.c();
        this.head = fC;
        fC.prev = fC;
        fC.next = fC;
        return fC;
    }

    @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // kw.InterfaceC15330g
    public C15328e e() {
        return this;
    }

    @Override // kw.InterfaceC15329f, kw.I, java.io.Flushable
    public void flush() {
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C15328e X() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C15328e s0() {
        return this;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C15328e writeByte(int b10) {
        F fZ = Z(1);
        byte[] bArr = fZ.data;
        int i10 = fZ.limit;
        fZ.limit = i10 + 1;
        bArr[i10] = (byte) b10;
        K(getSize() + 1);
        return this;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C15328e writeInt(int i10) {
        F fZ = Z(4);
        byte[] bArr = fZ.data;
        int i11 = fZ.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & l3.f92484c);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & l3.f92484c);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & l3.f92484c);
        bArr[i11 + 3] = (byte) (i10 & l3.f92484c);
        fZ.limit = i11 + 4;
        K(getSize() + 4);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        Intrinsics.j(sink, "sink");
        F f10 = this.head;
        if (f10 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), f10.limit - f10.pos);
        sink.put(f10.data, f10.pos, iMin);
        int i10 = f10.pos + iMin;
        f10.pos = i10;
        this.size -= iMin;
        if (i10 == f10.limit) {
            this.head = f10.b();
            G.b(f10);
        }
        return iMin;
    }

    public static /* synthetic */ a D(C15328e c15328e, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = C15325b.d();
        }
        return c15328e.A(aVar);
    }

    public static /* synthetic */ C15328e R0(C15328e c15328e, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = c15328e.size;
        }
        return c15328e.N0(outputStream, j10);
    }

    @JvmOverloads
    public final a A(a unsafeCursor) {
        Intrinsics.j(unsafeCursor, "unsafeCursor");
        return lw.a.d(this, unsafeCursor);
    }

    @Override // kw.InterfaceC15330g
    public void B1(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // kw.InterfaceC15329f
    public long G0(J source) throws IOException {
        Intrinsics.j(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public byte[] H(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // kw.InterfaceC15330g
    public String H2(Charset charset) {
        Intrinsics.j(charset, "charset");
        return J(this.size, charset);
    }

    public String J(long byteCount, Charset charset) throws EOFException {
        Intrinsics.j(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        F f10 = this.head;
        Intrinsics.g(f10);
        int i10 = f10.pos;
        if (i10 + byteCount > f10.limit) {
            return new String(H(byteCount), charset);
        }
        int i11 = (int) byteCount;
        String str = new String(f10.data, i10, i11, charset);
        int i12 = f10.pos + i11;
        f10.pos = i12;
        this.size -= byteCount;
        if (i12 == f10.limit) {
            this.head = f10.b();
            G.b(f10);
        }
        return str;
    }

    public C15328e J0(String string, int beginIndex, int endIndex, Charset charset) {
        Intrinsics.j(string, "string");
        Intrinsics.j(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        if (Intrinsics.e(charset, Charsets.UTF_8)) {
            return Q0(string, beginIndex, endIndex);
        }
        String strSubstring = string.substring(beginIndex, endIndex);
        Intrinsics.i(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.i(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    public final void K(long j10) {
        this.size = j10;
    }

    @Override // kw.InterfaceC15330g
    public String K1(long byteCount) throws EOFException {
        return J(byteCount, Charsets.UTF_8);
    }

    public C15328e L0(String string, Charset charset) {
        Intrinsics.j(string, "string");
        Intrinsics.j(charset, "charset");
        return J0(string, 0, string.length(), charset);
    }

    @Override // kw.I
    public void M1(C15328e source, long byteCount) {
        F f10;
        Intrinsics.j(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        C15325b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            F f11 = source.head;
            Intrinsics.g(f11);
            int i10 = f11.limit;
            Intrinsics.g(source.head);
            if (byteCount < i10 - r1.pos) {
                F f12 = this.head;
                if (f12 != null) {
                    Intrinsics.g(f12);
                    f10 = f12.prev;
                } else {
                    f10 = null;
                }
                if (f10 != null && f10.owner) {
                    if ((f10.limit + byteCount) - (f10.shared ? 0 : f10.pos) <= 8192) {
                        F f13 = source.head;
                        Intrinsics.g(f13);
                        f13.g(f10, (int) byteCount);
                        source.K(source.getSize() - byteCount);
                        K(getSize() + byteCount);
                        return;
                    }
                }
                F f14 = source.head;
                Intrinsics.g(f14);
                source.head = f14.e((int) byteCount);
            }
            F f15 = source.head;
            Intrinsics.g(f15);
            long j10 = f15.limit - f15.pos;
            source.head = f15.b();
            F f16 = this.head;
            if (f16 == null) {
                this.head = f15;
                f15.prev = f15;
                f15.next = f15;
            } else {
                Intrinsics.g(f16);
                F f17 = f16.prev;
                Intrinsics.g(f17);
                f17.c(f15).a();
            }
            source.K(source.getSize() - j10);
            K(getSize() + j10);
            byteCount -= j10;
        }
    }

    @JvmOverloads
    public final C15328e N0(OutputStream out, long byteCount) throws IOException {
        Intrinsics.j(out, "out");
        C15325b.b(this.size, 0L, byteCount);
        F f10 = this.head;
        long j10 = byteCount;
        while (j10 > 0) {
            Intrinsics.g(f10);
            int iMin = (int) Math.min(j10, f10.limit - f10.pos);
            out.write(f10.data, f10.pos, iMin);
            int i10 = f10.pos + iMin;
            f10.pos = i10;
            long j11 = iMin;
            this.size -= j11;
            j10 -= j11;
            if (i10 == f10.limit) {
                F fB = f10.b();
                this.head = fB;
                G.b(f10);
                f10 = fB;
            }
        }
        return this;
    }

    @Override // kw.InterfaceC15330g
    public C15331h O1(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new C15331h(H(byteCount));
        }
        C15331h c15331hR = R((int) byteCount);
        skip(byteCount);
        return c15331hR;
    }

    @Override // kw.InterfaceC15329f
    public OutputStream Q3() {
        return new c();
    }

    public final C15331h R(int byteCount) {
        if (byteCount == 0) {
            return C15331h.f148095e;
        }
        C15325b.b(getSize(), 0L, byteCount);
        F f10 = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < byteCount) {
            Intrinsics.g(f10);
            int i13 = f10.limit;
            int i14 = f10.pos;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            f10 = f10.next;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        F f11 = this.head;
        int i15 = 0;
        while (i10 < byteCount) {
            Intrinsics.g(f11);
            bArr[i15] = f11.data;
            i10 += f11.limit - f11.pos;
            iArr[i15] = Math.min(i10, byteCount);
            iArr[i15 + i12] = f11.pos;
            f11.shared = true;
            i15++;
            f11 = f11.next;
        }
        return new H(bArr, iArr);
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C15328e I0(String string) {
        Intrinsics.j(string, "string");
        return Q0(string, 0, string.length());
    }

    @Override // kw.InterfaceC15330g
    public InputStream T3() {
        return new b();
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C15328e Q0(String string, int beginIndex, int endIndex) {
        char cCharAt;
        Intrinsics.j(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char cCharAt2 = string.charAt(beginIndex);
            if (cCharAt2 < 128) {
                F fZ = Z(1);
                byte[] bArr = fZ.data;
                int i10 = fZ.limit - beginIndex;
                int iMin = Math.min(endIndex, 8192 - i10);
                int i11 = beginIndex + 1;
                bArr[beginIndex + i10] = (byte) cCharAt2;
                while (true) {
                    beginIndex = i11;
                    if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i11 = beginIndex + 1;
                    bArr[beginIndex + i10] = (byte) cCharAt;
                }
                int i12 = fZ.limit;
                int i13 = (i10 + beginIndex) - i12;
                fZ.limit = i12 + i13;
                K(getSize() + i13);
            } else {
                if (cCharAt2 < 2048) {
                    F fZ2 = Z(2);
                    byte[] bArr2 = fZ2.data;
                    int i14 = fZ2.limit;
                    bArr2[i14] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    fZ2.limit = i14 + 2;
                    K(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    F fZ3 = Z(3);
                    byte[] bArr3 = fZ3.data;
                    int i15 = fZ3.limit;
                    bArr3[i15] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    fZ3.limit = i15 + 3;
                    K(getSize() + 3);
                } else {
                    int i16 = beginIndex + 1;
                    char cCharAt3 = i16 < endIndex ? string.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        beginIndex = i16;
                    } else {
                        int i17 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        F fZ4 = Z(4);
                        byte[] bArr4 = fZ4.data;
                        int i18 = fZ4.limit;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        fZ4.limit = i18 + 4;
                        K(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // kw.InterfaceC15330g
    public int U2(z options) throws EOFException {
        Intrinsics.j(options, "options");
        int iJ = lw.a.j(this, options, false, 2, null);
        if (iJ == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iJ].V());
        return iJ;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C15328e a0(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            F fZ = Z(2);
            byte[] bArr = fZ.data;
            int i10 = fZ.limit;
            bArr[i10] = (byte) ((codePoint >> 6) | 192);
            bArr[i10 + 1] = (byte) ((codePoint & 63) | 128);
            fZ.limit = i10 + 2;
            K(getSize() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            F fZ2 = Z(3);
            byte[] bArr2 = fZ2.data;
            int i11 = fZ2.limit;
            bArr2[i11] = (byte) ((codePoint >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((codePoint & 63) | 128);
            fZ2.limit = i11 + 3;
            K(getSize() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C15325b.l(codePoint));
        }
        F fZ3 = Z(4);
        byte[] bArr3 = fZ3.data;
        int i12 = fZ3.limit;
        bArr3[i12] = (byte) ((codePoint >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((codePoint & 63) | 128);
        fZ3.limit = i12 + 4;
        K(getSize() + 4);
        return this;
    }

    @Override // kw.InterfaceC15330g
    public boolean Y(long offset, C15331h bytes) {
        Intrinsics.j(bytes, "bytes");
        return z(offset, bytes, 0, bytes.V());
    }

    @Override // kw.InterfaceC15330g
    public long Z1(I sink) throws IOException {
        Intrinsics.j(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.M1(this, size);
        }
        return size;
    }

    public final C15328e d() {
        C15328e c15328e = new C15328e();
        if (getSize() == 0) {
            return c15328e;
        }
        F f10 = this.head;
        Intrinsics.g(f10);
        F fD = f10.d();
        c15328e.head = fD;
        fD.prev = fD;
        fD.next = fD;
        for (F f11 = f10.next; f11 != f10; f11 = f11.next) {
            F f12 = fD.prev;
            Intrinsics.g(f12);
            Intrinsics.g(f11);
            f12.c(f11.d());
        }
        c15328e.K(getSize());
        return c15328e;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C15328e Z2(C15331h byteString) {
        Intrinsics.j(byteString, "byteString");
        byteString.d0(this, 0, byteString.V());
        return this;
    }

    @Override // kw.InterfaceC15330g
    public long e3(C15331h targetBytes) {
        Intrinsics.j(targetBytes, "targetBytes");
        return w(targetBytes, 0L);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15328e)) {
            return false;
        }
        C15328e c15328e = (C15328e) other;
        if (getSize() != c15328e.getSize()) {
            return false;
        }
        if (getSize() == 0) {
            return true;
        }
        F f10 = this.head;
        Intrinsics.g(f10);
        F f11 = c15328e.head;
        Intrinsics.g(f11);
        int i10 = f10.pos;
        int i11 = f11.pos;
        long j10 = 0;
        while (j10 < getSize()) {
            long jMin = Math.min(f10.limit - i10, f11.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (f10.data[i10] != f11.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == f10.limit) {
                f10 = f10.next;
                Intrinsics.g(f10);
                i10 = f10.pos;
            }
            if (i11 == f11.limit) {
                f11 = f11.next;
                Intrinsics.g(f11);
                i11 = f11.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    public final C15328e g(C15328e out, long offset, long byteCount) {
        Intrinsics.j(out, "out");
        long j10 = offset;
        C15325b.b(getSize(), j10, byteCount);
        if (byteCount != 0) {
            out.K(out.getSize() + byteCount);
            F f10 = this.head;
            while (true) {
                Intrinsics.g(f10);
                int i10 = f10.limit;
                int i11 = f10.pos;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                f10 = f10.next;
            }
            F f11 = f10;
            long j11 = byteCount;
            while (j11 > 0) {
                Intrinsics.g(f11);
                F fD = f11.d();
                int i12 = fD.pos + ((int) j10);
                fD.pos = i12;
                fD.limit = Math.min(i12 + ((int) j11), fD.limit);
                F f12 = out.head;
                if (f12 == null) {
                    fD.prev = fD;
                    fD.next = fD;
                    out.head = fD;
                } else {
                    Intrinsics.g(f12);
                    F f13 = f12.prev;
                    Intrinsics.g(f13);
                    f13.c(fD);
                }
                j11 -= fD.limit - fD.pos;
                f11 = f11.next;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C15328e write(byte[] source) {
        Intrinsics.j(source, "source");
        return write(source, 0, source.length);
    }

    public int hashCode() {
        F f10 = this.head;
        if (f10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = f10.limit;
            for (int i12 = f10.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + f10.data[i12];
            }
            f10 = f10.next;
            Intrinsics.g(f10);
        } while (f10 != this.head);
        return i10;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public C15328e write(byte[] source, int offset, int byteCount) {
        Intrinsics.j(source, "source");
        long j10 = byteCount;
        C15325b.b(source.length, offset, j10);
        int i10 = byteCount + offset;
        while (offset < i10) {
            F fZ = Z(1);
            int iMin = Math.min(i10 - offset, 8192 - fZ.limit);
            int i11 = offset + iMin;
            ArraysKt.j(source, fZ.data, fZ.limit, offset, i11);
            fZ.limit += iMin;
            offset = i11;
        }
        K(getSize() + j10);
        return this;
    }

    @Override // kw.InterfaceC15330g
    public boolean j2() {
        return this.size == 0;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C15328e E1(long v10) {
        boolean z10;
        if (v10 == 0) {
            return writeByte(48);
        }
        if (v10 < 0) {
            v10 = -v10;
            if (v10 < 0) {
                return I0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iE = lw.a.e(v10);
        if (z10) {
            iE++;
        }
        F fZ = Z(iE);
        byte[] bArr = fZ.data;
        int i10 = fZ.limit + iE;
        while (v10 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = lw.a.f()[(int) (v10 % j10)];
            v10 /= j10;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        fZ.limit += iE;
        K(getSize() + iE);
        return this;
    }

    public long m(byte b10, long fromIndex, long toIndex) {
        F f10;
        int i10;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (f10 = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                f10 = f10.prev;
                Intrinsics.g(f10);
                size -= f10.limit - f10.pos;
            }
            while (size < toIndex) {
                byte[] bArr = f10.data;
                int iMin = (int) Math.min(f10.limit, (f10.pos + toIndex) - size);
                i10 = (int) ((f10.pos + fromIndex) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += f10.limit - f10.pos;
                f10 = f10.next;
                Intrinsics.g(f10);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = (f10.limit - f10.pos) + size;
            if (j10 > fromIndex) {
                break;
            }
            f10 = f10.next;
            Intrinsics.g(f10);
            size = j10;
        }
        while (size < toIndex) {
            byte[] bArr2 = f10.data;
            int iMin2 = (int) Math.min(f10.limit, (f10.pos + toIndex) - size);
            i10 = (int) ((f10.pos + fromIndex) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += f10.limit - f10.pos;
            f10 = f10.next;
            Intrinsics.g(f10);
            fromIndex = size;
        }
        return -1L;
        return (i10 - f10.pos) + size;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C15328e N2(long v10) {
        if (v10 == 0) {
            return writeByte(48);
        }
        long j10 = (v10 >>> 1) | v10;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        F fZ = Z(i10);
        byte[] bArr = fZ.data;
        int i11 = fZ.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = lw.a.f()[(int) (15 & v10)];
            v10 >>>= 4;
        }
        fZ.limit += i10;
        K(getSize() + i10);
        return this;
    }

    @Override // kw.InterfaceC15330g
    public String n3() {
        return J(this.size, Charsets.UTF_8);
    }

    public long p(C15331h bytes, long fromIndex) throws IOException {
        Intrinsics.j(bytes, "bytes");
        return u(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // kw.InterfaceC15330g
    public InterfaceC15330g peek() {
        return w.d(new C(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new kw.C15328e().l0(r8).j0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.n3());
     */
    @Override // kw.InterfaceC15330g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long r2() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kw.C15328e.r2():long");
    }

    @Override // kw.InterfaceC15330g
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.j(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @JvmName
    /* renamed from: size, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // kw.InterfaceC15330g
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            F f10 = this.head;
            if (f10 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, f10.limit - f10.pos);
            long j10 = iMin;
            K(getSize() - j10);
            byteCount -= j10;
            int i10 = f10.pos + iMin;
            f10.pos = i10;
            if (i10 == f10.limit) {
                this.head = f10.b();
                G.b(f10);
            }
        }
    }

    @Override // kw.InterfaceC15330g
    public boolean t(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // kw.J
    /* renamed from: timeout */
    public K getF148081a() {
        return K.f148056e;
    }

    public long u(C15331h bytes, long fromIndex, long toIndex) throws IOException {
        Intrinsics.j(bytes, "bytes");
        return lw.a.c(this, bytes, fromIndex, toIndex, 0, 0, 24, null);
    }

    public C15328e v0(long v10) {
        F fZ = Z(8);
        byte[] bArr = fZ.data;
        int i10 = fZ.limit;
        bArr[i10] = (byte) ((v10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((v10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((v10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((v10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((v10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((v10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((v10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (v10 & 255);
        fZ.limit = i10 + 8;
        K(getSize() + 8);
        return this;
    }

    public long w(C15331h targetBytes, long fromIndex) {
        int i10;
        int i11;
        Intrinsics.j(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        F f10 = this.head;
        if (f10 == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                f10 = f10.prev;
                Intrinsics.g(f10);
                size -= f10.limit - f10.pos;
            }
            if (targetBytes.V() == 2) {
                byte bU = targetBytes.u(0);
                byte bU2 = targetBytes.u(1);
                while (size < getSize()) {
                    byte[] bArr = f10.data;
                    i10 = (int) ((f10.pos + fromIndex) - size);
                    int i12 = f10.limit;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bU || b10 == bU2) {
                            i11 = f10.pos;
                        } else {
                            i10++;
                        }
                    }
                    size += f10.limit - f10.pos;
                    f10 = f10.next;
                    Intrinsics.g(f10);
                    fromIndex = size;
                }
            } else {
                byte[] bArrI = targetBytes.I();
                while (size < getSize()) {
                    byte[] bArr2 = f10.data;
                    i10 = (int) ((f10.pos + fromIndex) - size);
                    int i13 = f10.limit;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : bArrI) {
                            if (b11 == b12) {
                                i11 = f10.pos;
                            }
                        }
                        i10++;
                    }
                    size += f10.limit - f10.pos;
                    f10 = f10.next;
                    Intrinsics.g(f10);
                    fromIndex = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = (f10.limit - f10.pos) + size;
            if (j10 > fromIndex) {
                break;
            }
            f10 = f10.next;
            Intrinsics.g(f10);
            size = j10;
        }
        if (targetBytes.V() == 2) {
            byte bU3 = targetBytes.u(0);
            byte bU4 = targetBytes.u(1);
            while (size < getSize()) {
                byte[] bArr3 = f10.data;
                i10 = (int) ((f10.pos + fromIndex) - size);
                int i14 = f10.limit;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bU3 || b13 == bU4) {
                        i11 = f10.pos;
                    } else {
                        i10++;
                    }
                }
                size += f10.limit - f10.pos;
                f10 = f10.next;
                Intrinsics.g(f10);
                fromIndex = size;
            }
        } else {
            byte[] bArrI2 = targetBytes.I();
            while (size < getSize()) {
                byte[] bArr4 = f10.data;
                i10 = (int) ((f10.pos + fromIndex) - size);
                int i15 = f10.limit;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : bArrI2) {
                        if (b14 == b15) {
                            i11 = f10.pos;
                        }
                    }
                    i10++;
                }
                size += f10.limit - f10.pos;
                f10 = f10.next;
                Intrinsics.g(f10);
                fromIndex = size;
            }
        }
        return -1L;
        return (i10 - i11) + size;
    }

    @Override // kw.InterfaceC15330g
    public long x0(C15331h bytes) throws IOException {
        Intrinsics.j(bytes, "bytes");
        return p(bytes, 0L);
    }

    @Override // kw.InterfaceC15330g
    public String y0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jM = m((byte) 10, 0L, j10);
        if (jM != -1) {
            return lw.a.h(this, jM);
        }
        if (j10 < getSize() && l(j10 - 1) == 13 && l(j10) == 10) {
            return lw.a.h(this, j10);
        }
        C15328e c15328e = new C15328e();
        g(c15328e, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + c15328e.Q2().E() + (char) 8230);
    }

    public boolean z(long offset, C15331h bytes, int bytesOffset, int byteCount) {
        Intrinsics.j(bytes, "bytes");
        return byteCount >= 0 && offset >= 0 && ((long) byteCount) + offset <= getSize() && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.V() && (byteCount == 0 || lw.a.b(this, bytes, offset, offset + 1, bytesOffset, byteCount) != -1);
    }

    @Override // kw.InterfaceC15330g
    public void z3(C15328e sink, long byteCount) throws EOFException {
        Intrinsics.j(sink, "sink");
        if (getSize() >= byteCount) {
            sink.M1(this, byteCount);
        } else {
            sink.M1(this, getSize());
            throw new EOFException();
        }
    }

    @Override // kw.InterfaceC15330g
    public int L2() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (getSize() != 0) {
            byte bL = l(0L);
            if ((bL & 128) == 0) {
                i10 = bL & Byte.MAX_VALUE;
                i12 = 0;
                i11 = 1;
            } else if ((bL & 224) == 192) {
                i10 = bL & 31;
                i11 = 2;
                i12 = 128;
            } else if ((bL & 240) == 224) {
                i10 = bL & C14045dq.MULTIPLY;
                i11 = 3;
                i12 = RecyclerView.m.FLAG_MOVED;
            } else if ((bL & 248) == 240) {
                i10 = bL & 7;
                i11 = 4;
                i12 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j10 = i11;
            if (getSize() >= j10) {
                for (int i13 = 1; i13 < i11; i13++) {
                    long j11 = i13;
                    byte bL2 = l(j11);
                    if ((bL2 & 192) == 128) {
                        i10 = (i10 << 6) | (bL2 & 63);
                    } else {
                        skip(j11);
                        return 65533;
                    }
                }
                skip(j10);
                if (i10 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i10 && i10 < 57344) || i10 < i12) {
                    return 65533;
                }
                return i10;
            }
            throw new EOFException("size < " + i11 + ": " + getSize() + " (to read code point prefixed 0x" + C15325b.k(bL) + ')');
        }
        throw new EOFException();
    }

    public final C15331h O() {
        if (getSize() <= 2147483647L) {
            return R((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    @Override // kw.InterfaceC15330g
    public C15331h Q2() {
        return O1(getSize());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // kw.InterfaceC15330g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long R3() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.getSize()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            kw.F r6 = r14.head
            kotlin.jvm.internal.Intrinsics.g(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            kw.e r0 = new kw.e
            r0.<init>()
            kw.e r0 = r0.N2(r4)
            kw.e r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.n3()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = kw.C15325b.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            kw.F r7 = r6.b()
            r14.head = r7
            kw.G.b(r6)
            goto La1
        L9f:
            r6.pos = r8
        La1:
            if (r1 != 0) goto La7
            kw.F r6 = r14.head
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.getSize()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.K(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kw.C15328e.R3():long");
    }

    public final void a() throws EOFException {
        skip(getSize());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15328e clone() {
        return d();
    }

    public final long c() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        F f10 = this.head;
        Intrinsics.g(f10);
        F f11 = f10.prev;
        Intrinsics.g(f11);
        if (f11.limit < 8192 && f11.owner) {
            return size - (r3 - f11.pos);
        }
        return size;
    }

    @Override // kw.InterfaceC15330g
    public byte[] e2() {
        return H(getSize());
    }

    @Override // kw.InterfaceC15330g
    public int f3() throws EOFException {
        return C15325b.h(readInt());
    }

    @JvmName
    public final byte l(long pos) {
        C15325b.b(getSize(), pos, 1L);
        F f10 = this.head;
        if (f10 != null) {
            if (getSize() - pos < pos) {
                long size = getSize();
                while (size > pos) {
                    f10 = f10.prev;
                    Intrinsics.g(f10);
                    size -= f10.limit - f10.pos;
                }
                Intrinsics.g(f10);
                return f10.data[(int) ((f10.pos + pos) - size)];
            }
            long j10 = 0;
            while (true) {
                long j11 = (f10.limit - f10.pos) + j10;
                if (j11 <= pos) {
                    f10 = f10.next;
                    Intrinsics.g(f10);
                    j10 = j11;
                } else {
                    Intrinsics.g(f10);
                    return f10.data[(int) ((f10.pos + pos) - j10)];
                }
            }
        } else {
            Intrinsics.g(null);
            throw null;
        }
    }

    @Override // kw.InterfaceC15330g
    public short n1() throws EOFException {
        return C15325b.j(readShort());
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C15328e i2(int i10) {
        return writeInt(C15325b.h(i10));
    }

    @Override // kw.InterfaceC15330g
    public byte readByte() throws EOFException {
        if (getSize() != 0) {
            F f10 = this.head;
            Intrinsics.g(f10);
            int i10 = f10.pos;
            int i11 = f10.limit;
            int i12 = i10 + 1;
            byte b10 = f10.data[i10];
            K(getSize() - 1);
            if (i12 == i11) {
                this.head = f10.b();
                G.b(f10);
                return b10;
            }
            f10.pos = i12;
            return b10;
        }
        throw new EOFException();
    }

    @Override // kw.InterfaceC15330g
    public int readInt() throws EOFException {
        if (getSize() >= 4) {
            F f10 = this.head;
            Intrinsics.g(f10);
            int i10 = f10.pos;
            int i11 = f10.limit;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = f10.data;
            int i12 = i10 + 3;
            int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
            int i14 = i10 + 4;
            int i15 = (bArr[i12] & 255) | i13;
            K(getSize() - 4);
            if (i14 == i11) {
                this.head = f10.b();
                G.b(f10);
                return i15;
            }
            f10.pos = i14;
            return i15;
        }
        throw new EOFException();
    }

    @Override // kw.InterfaceC15330g
    public long readLong() throws EOFException {
        if (getSize() >= 8) {
            F f10 = this.head;
            Intrinsics.g(f10);
            int i10 = f10.pos;
            int i11 = f10.limit;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = f10.data;
            int i12 = i10 + 7;
            long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
            int i13 = i10 + 8;
            long j11 = j10 | (bArr[i12] & 255);
            K(getSize() - 8);
            if (i13 == i11) {
                this.head = f10.b();
                G.b(f10);
                return j11;
            }
            f10.pos = i13;
            return j11;
        }
        throw new EOFException();
    }

    @Override // kw.InterfaceC15330g
    public short readShort() throws EOFException {
        if (getSize() >= 2) {
            F f10 = this.head;
            Intrinsics.g(f10);
            int i10 = f10.pos;
            int i11 = f10.limit;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = f10.data;
            int i12 = i10 + 1;
            int i13 = (bArr[i10] & 255) << 8;
            int i14 = i10 + 2;
            int i15 = (bArr[i12] & 255) | i13;
            K(getSize() - 2);
            if (i14 == i11) {
                this.head = f10.b();
                G.b(f10);
            } else {
                f10.pos = i14;
            }
            return (short) i15;
        }
        throw new EOFException();
    }

    @Override // kw.InterfaceC15330g
    public long s1() throws EOFException {
        return C15325b.i(readLong());
    }

    public String toString() {
        return O().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        Intrinsics.j(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            F fZ = Z(1);
            int iMin = Math.min(i10, 8192 - fZ.limit);
            source.get(fZ.data, fZ.limit, iMin);
            i10 -= iMin;
            fZ.limit += iMin;
        }
        this.size += iRemaining;
        return iRemaining;
    }

    @Override // kw.InterfaceC15329f
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C15328e f0(long v10) {
        return v0(C15325b.i(v10));
    }

    @Override // kw.InterfaceC15330g
    public String h1() throws EOFException {
        return y0(Long.MAX_VALUE);
    }

    public int read(byte[] sink, int offset, int byteCount) {
        Intrinsics.j(sink, "sink");
        C15325b.b(sink.length, offset, byteCount);
        F f10 = this.head;
        if (f10 == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, f10.limit - f10.pos);
        byte[] bArr = f10.data;
        int i10 = f10.pos;
        ArraysKt.j(bArr, sink, offset, i10, i10 + iMin);
        f10.pos += iMin;
        K(getSize() - iMin);
        if (f10.pos == f10.limit) {
            this.head = f10.b();
            G.b(f10);
        }
        return iMin;
    }

    @Override // kw.J
    public long read(C15328e sink, long byteCount) {
        Intrinsics.j(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (byteCount > getSize()) {
            byteCount = getSize();
        }
        sink.M1(this, byteCount);
        return byteCount;
    }
}
