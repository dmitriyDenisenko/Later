package ru.practicum.item;

import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public ItemDto toDto(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setUserId(item.getUserId());
        itemDto.setUrl(item.getUrl());
        itemDto.setTags(item.getTags());
        return itemDto;
    }

    public Item toItem(ItemDto itemDto) {
        Item item = new Item();
        item.setId(itemDto.getId());
        item.setUserId(itemDto.getUserId());
        item.setUrl(itemDto.getUrl());
        item.setTags(itemDto.getTags());
        return item;
    }
}
