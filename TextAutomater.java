public class Main {
  public static void main(String[] args) {
    WriteDatabase(21,72);
}

public static void WriteHeals(int start, int end)
{
    for(int i = start;i<end;i++){
    System.out.print("<<set $DevozSlot"+i+".hp to $DevozSlot"+i+".maxhp>><<set $DevozSlot"+i+".move1.uses to $DevozSlot"+i+".move1.maxuses>><<set $DevozSlot"+i+".move2.uses to $DevozSlot"+i+".move2.maxuses>><<set $DevozSlot"+i+".move3.uses to $DevozSlot"+i+".move3.maxuses>><<set $DevozSlot"+i+".move4.uses to $DevozSlot"+i+".move4.maxuses>>");
  }
}

public static void WriteCatched(int start, int end)
{
    for(int i = start;i<end;i++){
    System.out.println("<<elseif $devozId is "+i + ">><<set $DevozSlot"+i+ "to $opposing1>>");
  }
}

public static void WriteStorage(int start, int end)
{
    for(int i = start;i<end;i++){
    System.out.println(i + ": <<if $DevozSlot"+i+".name is not \"empty slot\" $DevozSlot"+i+".name $DevozSlot"+i+".level $DevozSlot"+i+".exp $DevozSlot"+i+".hp $DevozSlot"+i+".maxhp>><<else>>Empty slot<</if>>");
  }
}

public static void WriteStoragehelper(int start, int end)
{
    for(int i = start;i<end;i++){
    System.out.println("<<elseif $storagehelper is "+i+">><<set $storagehelper to $DevozSlot"+i+">>");
  }
    System.out.println();
    System.out.println();
    for(int i = start;i<end;i++){
    System.out.println("<<elseif _storage is "+i+">><<set $DevozSlot"+i+" to $teamhelper>>");
    }
}

public static void WriteDatabase(int start, int end)
{
    for(int i = start;i<end;i++){
    System.out.println("<<set $DevozSlot"+i+" to $emptyDevozSlot>>");
  }
}
}
