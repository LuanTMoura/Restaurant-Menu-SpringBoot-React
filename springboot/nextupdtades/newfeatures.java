/*
    @GetMapping("/menu/{id}")
    public ResponseEntity<Object> getOneFoods (@PathVariable(value="id") Long id) {
        Optional<FoodModel> foodO = foodRepository.findById(id);
        if(foodO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food not found.");
        }

        foodO.get().add(linkTo(methodOn(FoodController.class).getAllFoods()).withRel("Foods List"));

        return ResponseEntity.status(HttpStatus.OK).body(foodO.get());
    }

    @PutMapping("/menu/{id}")
    public ResponseEntity<Object> updateFood(@PathVariable(value="id") Long id,
                                                @RequestBody @Valid FoodResponseDto foodResponseDto) {

        Optional<FoodModel> foodO = foodRepository.findById(id);
        if(foodO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("food not found.");
        }

        var foodModel = foodO.get();
        BeanUtils.copyProperties (foodResponseDto, foodModel);
        return ResponseEntity.status(HttpStatus.OK).body (foodRepository.save(foodModel));
    }

    @DeleteMapping("/foods/{id}")
    public ResponseEntity<Object> deleteFood (@PathVariable(value="id") Long id) {
        Optional <FoodModel> foodO = foodRepository.findById(id);
        if(foodO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food not found.");
        }
        foodRepository.delete(foodO.get());
        return ResponseEntity.status(HttpStatus.OK).body ("Food deleted successfully.");


 */