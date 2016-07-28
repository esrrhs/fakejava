package fakescript;

public class command
{
	public static final long EMPTY_CMD = -1;

	public static int command_help = 0;
	public static final int COMMAND_OPCODE = command_help++;
	public static final int COMMAND_ADDR = command_help++;
	public static final int COMMAND_POS = command_help++;

	public static int opcode_help = 0;
	public static final int OPCODE_ASSIGN = opcode_help++;
	public static final int OPCODE_PLUS = opcode_help++;
	public static final int OPCODE_MINUS = opcode_help++;
	public static final int OPCODE_MULTIPLY = opcode_help++;
	public static final int OPCODE_DIVIDE = opcode_help++;
	public static final int OPCODE_DIVIDE_MOD = opcode_help++;
	public static final int OPCODE_STRING_CAT = opcode_help++;
	public static final int OPCODE_PLUS_ASSIGN = opcode_help++;
	public static final int OPCODE_MINUS_ASSIGN = opcode_help++;
	public static final int OPCODE_MULTIPLY_ASSIGN = opcode_help++;
	public static final int OPCODE_DIVIDE_ASSIGN = opcode_help++;
	public static final int OPCODE_DIVIDE_MOD_ASSIGN = opcode_help++;
	public static final int OPCODE_RETURN = opcode_help++;
	public static final int OPCODE_JNE = opcode_help++;
	public static final int OPCODE_JMP = opcode_help++;
	public static final int OPCODE_FORBEGIN = opcode_help++;
	public static final int OPCODE_FORLOOP = opcode_help++;
	public static final int OPCODE_AND = opcode_help++;
	public static final int OPCODE_OR = opcode_help++;
	public static final int OPCODE_LESS = opcode_help++;
	public static final int OPCODE_MORE = opcode_help++;
	public static final int OPCODE_EQUAL = opcode_help++;
	public static final int OPCODE_MOREEQUAL = opcode_help++;
	public static final int OPCODE_LESSEQUAL = opcode_help++;
	public static final int OPCODE_NOTEQUAL = opcode_help++;
	public static final int OPCODE_NOT = opcode_help++;
	public static final int OPCODE_AND_JNE = opcode_help++;
	public static final int OPCODE_OR_JNE = opcode_help++;
	public static final int OPCODE_LESS_JNE = opcode_help++;
	public static final int OPCODE_MORE_JNE = opcode_help++;
	public static final int OPCODE_EQUAL_JNE = opcode_help++;
	public static final int OPCODE_MOREEQUAL_JNE = opcode_help++;
	public static final int OPCODE_LESSEQUAL_JNE = opcode_help++;
	public static final int OPCODE_NOTEQUAL_JNE = opcode_help++;
	public static final int OPCODE_NOT_JNE = opcode_help++;
	public static final int OPCODE_CALL = opcode_help++;
	public static final int OPCODE_SLEEP = opcode_help++;
	public static final int OPCODE_YIELD = opcode_help++;
	public static final int OPCODE_MAX = opcode_help++;

	public static long MAKE_COMMAND(int type, int code)
	{
		return ((long) ((code) | ((long) (type)) << 32));
	}

	public static long MAKE_OPCODE(int op)
	{
		return MAKE_COMMAND(COMMAND_OPCODE, op);
	}

	public static long MAKE_POS(int pos)
	{
		return MAKE_COMMAND(COMMAND_POS, pos);
	}

}
